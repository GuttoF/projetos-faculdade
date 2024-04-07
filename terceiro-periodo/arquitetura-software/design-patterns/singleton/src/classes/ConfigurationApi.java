package classes;

import java.util.Objects;

public class ConfigurationApi {

    private static ConfigurationApi instance;

    private ConfigurationApi() {
    }

    /**
     * Obtém a instância única da ConfigurationApi.
     * 
     * @return A instância única da ConfigurationApi.
     */
    public static ConfigurationApi getInstance() {
        if (Objects.isNull(instance)) {
        synchronized (ConfigurationApi.class) {
            if (Objects.isNull(instance)) {
                instance = new ConfigurationApi();
                }
            }    
        }

        return instance;
    }
}