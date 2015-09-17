package _351;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequencer;

public class MusicTest1 {

    public void play() throws SomethingWrong {

        if(true) { throw new SomethingWrong(); }

        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            System.out.println("Successfully got a sequencer");
        } catch (MidiUnavailableException e) {
            e.getMessage();
        }

    }

    public static void main(String[] args) {

        MusicTest1 mt1 = new MusicTest1();
        try {
            mt1.play();
            System.out.println("Lol!");
        } catch (SomethingWrong somethingWrong) {
            System.out.println("Yeah, something went wrong :/");
            somethingWrong.printStackTrace();
        }
        finally {
            System.out.println("But there is something more here!");
        }
        System.out.println("And there is more here!");

    }

}
