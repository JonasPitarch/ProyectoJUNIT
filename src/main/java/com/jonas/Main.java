package com.jonas;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ClassLoaderTemplateResolver templateResolver = new ClassLoaderTemplateResolver();
        templateResolver.setPrefix("templates/");
        templateResolver.setSuffix(".html");
        templateResolver.setTemplateMode("HTML5");

        TemplateEngine templateEngine = new TemplateEngine();
        templateEngine.setTemplateResolver(templateResolver);

        String jsonFilePath = "src/main/resources/json/nfl.json";
        List<Equipo> equipos = cargarEquiposDesdeJSON(jsonFilePath);

        String outputDir = "src/main/resources/fitxersWEB";
        crearDirectorio(outputDir);

        for (Equipo equipo : equipos) {
            Context context = new Context();
            context.setVariable("equipo", equipo);
            String htmlContent = templateEngine.process("plantilla1", context);

            String fileName = outputDir + "/" + equipo.getTeam().replaceAll(" ", "_") + ".html";
            escriuhtml(htmlContent, fileName);

            System.out.println("Archivo generado: " + fileName);
        }
    }

    public static void escriuhtml(String continguthtml, String nomFitxer) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nomFitxer))) {
            bw.write(continguthtml);
        } catch (IOException e) {
            System.err.println("Error escribiendo el archivo: " + nomFitxer);
            e.printStackTrace();
        }
    }

    public static List<Equipo> cargarEquiposDesdeJSON(String filePath) {
        List<Equipo> equipos = new ArrayList<>();
        try (Reader reader = new FileReader(filePath)) {
            JsonObject jsonObject = JsonParser.parseReader(reader).getAsJsonObject();
            Gson gson = new Gson();
            jsonObject.getAsJsonObject("AFC").getAsJsonArray("teams").forEach(teamJson ->
                    equipos.add(gson.fromJson(teamJson, Equipo.class)));
            jsonObject.getAsJsonObject("NFC").getAsJsonArray("teams").forEach(teamJson ->
                    equipos.add(gson.fromJson(teamJson, Equipo.class)));

        } catch (FileNotFoundException e) {
            System.err.println("Archivo JSON no encontrado: " + filePath);
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("Error leyendo el archivo JSON: " + filePath);
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("Error procesando el JSON: " + filePath);
            e.printStackTrace();
        }
        return equipos;
    }

    public static void crearDirectorio(String directorio) {
        try {
            Files.createDirectories(Paths.get(directorio));
            System.out.println("Directorio creado/existente: " + directorio);
        } catch (IOException e) {
            System.err.println("Error creando el directorio: " + directorio);
            e.printStackTrace();
        }
    }
}
