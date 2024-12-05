package com.jonas;

import java.sql.*;

public class Crearbdd {
    public static void main(String[] args) {
        ResultSet resultSet = null;

    try (Connection con = DriverManager.getConnection("jdbc:sqlite:src/main/resources/datos.sql")){
        String sql = "CREATE TABLE IF NOT EXISTS AFC_Equipos (\n" +
                "    team VARCHAR(100) NOT NULL,\n" +
                "    city VARCHAR(100) NOT NULL,\n" +
                "    img TEXT NOT NULL\n" +
                ");";
            PreparedStatement ps1 = con.prepareStatement(sql);
            ps1.executeUpdate();

        String sql2 = "CREATE TABLE IF NOT EXISTS NFC_Equipos (\n" +
                "    team VARCHAR(100) NOT NULL,\n" +
                "    city VARCHAR(100) NOT NULL,\n" +
                "    img TEXT NOT NULL\n" +
                ");";
            ps1 = con.prepareStatement(sql2);
            ps1.executeUpdate();

            String insert1="INSERT INTO AFC_Equipos (team, city, img) VALUES\n" +
                    "('Buffalo Bills', 'Buffalo', 'https://cdn.freebiesupply.com/images/large/2x/buffalo-bills-football-logo.png'),\n" +
                    "('Miami Dolphins', 'Miami', 'https://e7.pngegg.com/pngimages/982/491/png-clipart-miami-dolphins-logo-miami-dolphins-logo-sports-nfl-football.png'),\n" +
                    "('New England Patriots', 'Foxborough', 'https://banner2.cleanpng.com/20180430/ssw/avdi6rs9i.webp'),\n" +
                    "('New York Jets', 'East Rutherford', 'https://logos-world.net/wp-content/uploads/2020/05/New-York-Jets-Logo-2019-Present.png'),\n" +
                    "('Baltimore Ravens', 'Baltimore', 'https://e7.pngegg.com/pngimages/458/141/png-clipart-baltimore-ravens-logo-baltimore-ravens-solo-logo-sports-nfl-football.png'),\n" +
                    "('Cincinnati Bengals', 'Cincinnati', 'https://upload.wikimedia.org/wikipedia/commons/thumb/8/81/Cincinnati_Bengals_logo.svg/2560px-Cincinnati_Bengals_logo.svg.png'),\n" +
                    "('Cleveland Browns', 'Cleveland', 'https://wp.usatodaysports.com/wp-content/uploads/sites/90/2015/02/helmet_top_center1.png'),\n" +
                    "('Pittsburgh Steelers', 'Pittsburgh', 'https://upload.wikimedia.org/wikipedia/commons/thumb/d/de/Pittsburgh_Steelers_logo.svg/2048px-Pittsburgh_Steelers_logo.svg.png'),\n" +
                    "('Houston Texans', 'Houston', 'https://logos-world.net/wp-content/uploads/2020/05/Houston-Texans-logo.png'),\n" +
                    "('Indianapolis Colts', 'Indianapolis', 'https://logos-world.net/wp-content/uploads/2020/05/Indianapolis-Colts-Logo.png'),\n" +
                    "('Jacksonville Jaguars', 'Jacksonville', 'https://e7.pngegg.com/pngimages/445/392/png-clipart-jacksonville-jaguars-logo-jacksonville-jaguars-nfl-tampa-bay-buccaneers-logo-cheetah-mammal-animals-thumbnail.png'),\n" +
                    "('Tennessee Titans', 'Nashville', 'https://1000logos.net/wp-content/uploads/2018/07/Tennessee-Titans-Logo.png'),\n" +
                    "('Denver Broncos', 'Denver', 'https://logos-world.net/wp-content/uploads/2020/05/Denver-Broncos-logo.png'),\n" +
                    "('Kansas City Chiefs', 'Kansas City', 'https://imagenes.20minutos.es/files/image_1920_1080/uploads/imagenes/2024/04/01/kansas-city-chiefs.jpeg'),\n" +
                    "('Las Vegas Raiders', 'Las Vegas', 'https://cdn.inspireuplift.com/uploads/images/seller_products/1699530395_8-01.png'),\n" +
                    "('Los Angeles Chargers', 'Los Angeles', 'https://upload.wikimedia.org/wikipedia/commons/thumb/a/a6/Los_Angeles_Chargers_logo.svg/2560px-Los_Angeles_Chargers_logo.svg.png');\n";

            ps1 = con.prepareStatement(insert1);
            ps1.executeUpdate();

            String insert2 = "INSERT INTO NFC_Equipos (team, city, img) VALUES\n" +
                    "('Dallas Cowboys', 'Dallas', 'https://upload.wikimedia.org/wikipedia/commons/thumb/1/15/Dallas_Cowboys.svg/1200px-Dallas_Cowboys.svg.png'),\n" +
                    "('New York Giants', 'East Rutherford', 'https://upload.wikimedia.org/wikipedia/commons/thumb/6/60/New_York_Giants_logo.svg/1200px-New_York_Giants_logo.svg.png'),\n" +
                    "('Philadelphia Eagles', 'Philadelphia', 'https://e7.pngegg.com/pngimages/341/478/png-clipart-philadelphia-eagles-nfl-new-england-patriots-super-bowl-philadelphia-eagles-logo-vertebrate.png'),\n" +
                    "('Washington Commanders', 'Landover', 'https://upload.wikimedia.org/wikipedia/commons/thumb/0/0c/Washington_Commanders_logo.svg/1024px-Washington_Commanders_logo.svg.png'),\n" +
                    "('Chicago Bears', 'Chicago', 'https://i.pinimg.com/736x/89/b2/03/89b2034542640a7163e19b10feae7d8c.jpg'),\n" +
                    "('Detroit Lions', 'Detroit', 'https://i.pinimg.com/originals/ca/03/a5/ca03a5a1b7cad4487bdcb9562742c0ee.png'),\n" +
                    "('Green Bay Packers', 'Green Bay', 'https://upload.wikimedia.org/wikipedia/commons/thumb/5/50/Green_Bay_Packers_logo.svg/1280px-Green_Bay_Packers_logo.svg.png'),\n" +
                    "('Minnesota Vikings', 'Minneapolis', 'https://logos-world.net/wp-content/uploads/2020/05/Minnesota-Vikings-Logo.png'),\n" +
                    "('Atlanta Falcons', 'Atlanta', 'https://logos-world.net/wp-content/uploads/2020/05/Atlanta-Falcons-logo.png'),\n" +
                    "('Carolina Panthers', 'Charlotte', 'https://logos-world.net/wp-content/uploads/2020/05/Carolina-Panthers-logo.png'),\n" +
                    "('New Orleans Saints', 'New Orleans', 'https://upload.wikimedia.org/wikipedia/commons/thumb/5/50/New_Orleans_Saints_logo.svg/1200px-New_Orleans_Saints_logo.svg.png'),\n" +
                    "('Tampa Bay Buccaneers', 'Tampa', 'https://logos-world.net/wp-content/uploads/2020/07/Tampa-Bay-Buccaneers-Logo.png'),\n" +
                    "('Arizona Cardinals', 'Glendale', 'https://logos-world.net/wp-content/uploads/2020/05/Arizona-Cardinals-Logo.png'),\n" +
                    "('Los Angeles Rams', 'Los Angeles', 'https://1000marcas.net/wp-content/uploads/2020/10/Los-Angeles-Rams-logo.png'),\n" +
                    "('San Francisco 49ers', 'San Francisco', 'https://upload.wikimedia.org/wikipedia/commons/thumb/3/3a/San_Francisco_49ers_logo.svg/1280px-San_Francisco_49ers_logo.svg.png'),\n" +
                    "('Seattle Seahawks', 'Seattle', 'https://i.pinimg.com/736x/45/48/d8/4548d8d1730bb10dc163d375cc953dfc.jpg');\n";

            ps1= con.prepareStatement(insert2);
            ps1.executeUpdate();


            //Primera consulta
        System.out.println("Comprovador de que funciona la BDD");
            String comprueba = "SELECT * FROM NFC_Equipos";
            ps1= con.prepareStatement(comprueba);
            resultSet=ps1.executeQuery();

        while (resultSet.next()) {
            String nombre = resultSet.getString("team");
            String city = resultSet.getString("city");
            String img = resultSet.getString("img");

            System.out.println(nombre + " " + city + " " + img);
        }

        //Segunda consulta
        System.out.println();
        System.out.println("Sacamos los equipos que empiecen por la letra M");
        System.out.println();

        String equipoM = "SELECT * FROM AFC_Equipos WHERE team LIKE 'M%';";
        ps1= con.prepareStatement(equipoM);
        resultSet=ps1.executeQuery();

        while (resultSet.next()) {
            String nombre = resultSet.getString("team");
            String city = resultSet.getString("city");
            String img = resultSet.getString("img");
            System.out.println(nombre + " " + city + " " + img);
        }

        //Tercera consulta
        String equipoM2 = "SELECT * FROM NFC_Equipos WHERE team LIKE 'M%';";
        ps1= con.prepareStatement(equipoM2);
        resultSet=ps1.executeQuery();
        while (resultSet.next()) {
            String nombre = resultSet.getString("team");
            String city = resultSet.getString("city");
            String img = resultSet.getString("img");
            System.out.println(nombre + " " + city + " " + img);
        }

        // Cuatro consulta
        System.out.println();
        System.out.println("Equipos culla ciudad sea Atlanta");
        System.out.println();
        String atlanta = "SELECT * FROM NFC_Equipos WHERE city = 'Atlanta';";
        ps1= con.prepareStatement(atlanta);
        resultSet=ps1.executeQuery();
        while (resultSet.next()) {
            String nombre = resultSet.getString("team");
            String city = resultSet.getString("city");
            String img = resultSet.getString("img");
            System.out.println(nombre + " " + city + " " + img);
        }

        System.out.println();
        System.out.println("Primeros 5 equipos de la AFC");
        System.out.println();

        // CInco consultas
        String primeros5 = "SELECT * FROM AFC_Equipos LIMIT 5;";
        ps1= con.prepareStatement(primeros5);
        resultSet=ps1.executeQuery();
        while (resultSet.next()) {
            String nombre = resultSet.getString("team");
            String city = resultSet.getString("city");
            String img = resultSet.getString("img");
            System.out.println(nombre + " " + city + " " + img);
        }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
