package org.example.creational.tp;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration {
    private static Configuration instance;

    private final Properties settings = new Properties();

    private Configuration() {
        String customPath = "src/main/java/org/example/creational/tp/config.properties";
        loadDefaults(customPath);
    }

    public static synchronized Configuration getInstance() {
        if (instance == null) {
            instance = new Configuration();
        }
        return instance;
    }

    private void loadDefaults(String filePath) {
        try (FileInputStream fis = new FileInputStream(filePath)) {
            //System.out.println("Chargement du fichier : " + filePath);
            settings.load(fis);
        } catch (IOException e) {
            System.out.println("Erreur avec config.properties -> utilisation des valeurs par défaut");
            settings.setProperty("db.url", "jdbc:mysql://localhost:3306/default_db");
            settings.setProperty("env", "development");
            settings.setProperty("api.key", "default-key");
        }
    }

    public String getSetting(String key) {
        return settings.getProperty(key);
    }

    public void setSetting(String key, String value) {
        settings.setProperty(key, value);
    }

    public static void main(String[] args) {
        Configuration config = Configuration.getInstance();
        System.out.println("Valeur initiale de 'env': " + config.getSetting("env"));

        config.setSetting("env", "production");
        System.out.println("Nouvelle valeur de 'env': " + config.getSetting("env"));

        Configuration anotherConfig = Configuration.getInstance();
        System.out.println("Valeur partagée de 'env': " + anotherConfig.getSetting("env"));
    }
}