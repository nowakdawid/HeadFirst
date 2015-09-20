package _422;

import javax.sound.midi.*;

public class MiniMusicPlayer1 {

    public static void main(String[] args) {

        try {

            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();
            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();

            for (int i = 40; i < 90; i += 4) {

                track.add(makeEvent(144, 1, i, 50, i));
                track.add(makeEvent(128, 1, i, 50, i + 2));

            } // end loop

            sequencer.setSequence(seq);
            sequencer.setTempoInBPM(220);
            sequencer.start();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    } // close main

    public static MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {

        MidiEvent event = null;

        try {

            ShortMessage a = new ShortMessage();
            a.setMessage(comd, chan, one, two);
            event = new MidiEvent(a, tick);

        } catch (Exception e) {
        }

        return event;

    }

}
