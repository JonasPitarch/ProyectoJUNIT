package com.jonas;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TemplateEngine templateEngine = plantillaconf();
        String mijson = "src/main/resources/json/nfl.json";
        String salida = "src/main/resources/fitxersWEB";
        List<Equipo> equipos = equiposJson(mijson);
        if (equipos.isEmpty()) {
            System.out.println("No se encontraron equipos en el archivo JSON.");
            return;
        }
        crearCarpeta(salida);
        for (Equipo equipo : equipos) {
            generarHTML(equipo, templateEngine, salida);
        }
    }

    public static TemplateEngine plantillaconf() {
        ClassLoaderTemplateResolver resolver = new ClassLoaderTemplateResolver();
        resolver.setPrefix("templates/");
        resolver.setSuffix(".html");
        resolver.setTemplateMode("HTML5");
        TemplateEngine engine = new TemplateEngine();
        engine.setTemplateResolver(resolver);
        return engine;
    }

    public static List<Equipo> equiposJson(String rutaArchivo) {
        List<Equipo> equipos = new ArrayList<>();
        try (Reader reader = new FileReader(rutaArchivo)) {
            JsonObject jsonObject = JsonParser.parseReader(reader).getAsJsonObject();
            Gson gson = new Gson();
            agregarEquipos(jsonObject.getAsJsonObject("AFC").getAsJsonArray("teams"), equipos, gson);
            agregarEquipos(jsonObject.getAsJsonObject("NFC").getAsJsonArray("teams"), equipos, gson);
            System.out.println("Equipos cargados: " + equipos.size());
        } catch (Exception e) {
            System.out.println("Error leyendo el archivo JSON: " + rutaArchivo);
            e.printStackTrace();
        }
        return equipos;
    }

    public static void agregarEquipos(JsonArray equipitos, List<Equipo> equipos, Gson gson) {
        for (int i = 0; i < equipitos.size(); i++) {
            JsonObject equip = equipitos.get(i).getAsJsonObject();
            Equipo equipo = gson.fromJson(equip, Equipo.class);
            equipos.add(equipo);
        }
    }

    public static void crearCarpeta(String rutaCarpeta) {
        try {
            Files.createDirectories(Paths.get(rutaCarpeta));
            System.out.println("Carpeta creada: " + rutaCarpeta);
        } catch (IOException e) {
            System.out.println("Error creando la carpeta: " + rutaCarpeta);
            e.printStackTrace();
        }
    }

    public static void generarHTML(Equipo equipo, TemplateEngine engine, String rutaSalida) {
        Context context = new Context();
        context.setVariable("equipo", equipo);

        String html = engine.process("plantilla1", context);
        String nombreArchivo = rutaSalida + "/" + equipo.getTeam().replace(" ", "_") + ".html";

        try {
            Files.writeString(Path.of(nombreArchivo), html);
            System.out.println("Archivo HTML creado: " + nombreArchivo);
        } catch (IOException e) {
            System.err.println("No se pudo crear el archivo HTML: " + nombreArchivo);
            //adada
        }
    }
}
