package edu.unisabana.dyas.patterns;
import edu.unisabana.dyas.patterns.utils.AdvancedAudioPlayerAdapater;

// Cliente que utiliza directamente AdvancedAudioPlayer sin conocer la interfaz AudioPlayer
public class Client {
    public static void main(String[] args) {
        AdvancedAudioPlayerAdapater advancedPlayerAdapter = new AdvancedAudioPlayerAdapater();
        advancedPlayerAdapter.play("Mp4", "Cry");
        advancedPlayerAdapter.stop();
    }
}