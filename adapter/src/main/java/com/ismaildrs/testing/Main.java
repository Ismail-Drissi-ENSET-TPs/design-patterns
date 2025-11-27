package com.ismaildrs.testing;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        AudioPlayer audioPlayer = new WavAudioAdapter(new WavSoundSystem());
        audioPlayer.playMp3("Ismail");

    }
}
