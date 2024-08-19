package edu.unisabana.dyas.patterns.utils;

import edu.unisabana.dyas.patterns.utils.AudioPlayer;

public class AdvancedAudioPlayerAdapater implements AudioPlayer{
    private final AdvancedAudioPlayer audio;
    
    public AdvancedAudioPlayerAdapater(){
            System.out.println("Creando el adaptador de Advanced Audio Player");
            this.audio = new AdvancedAudioPlayer();
    }
    
    @Override
    public void play(String audioType, String fileName) {
        System.out.println("Musica Sonando");
        if (audioType.equals("Mp4")){
            this.audio.playMp4(fileName);  
        } else if (audioType.equals("VLC")){
            this.audio.playVlc(fileName);
        }
    }

    @Override
    public void stop() {
        System.out.println("Musica Detenida");
        this.audio.stop();
    }
    
}
