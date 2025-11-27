package com.ismaildrs.testing;

public class WavAudioAdapter implements AudioPlayer {

    WavSoundSystem wavSoundSystem;

    public WavAudioAdapter(WavSoundSystem wavSoundSystem) {
        this.wavSoundSystem = wavSoundSystem;
    }


    @Override
    public void playMp3(String filename) {
        System.out.println("Playing mp3 file: " + filename);
        wavSoundSystem.playWavFile(filename);
    }

    private class Test{
        private WavSoundSystem wavSoundSystem;
        public void test(){

            WavAudioAdapter.this.wavSoundSystem.playWavFile("Ismail");
        }
    }

}
