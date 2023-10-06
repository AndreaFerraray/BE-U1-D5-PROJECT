package MediaInfo;

class AudioRecording extends Media implements Reproducible {
    private int volume;
    private int duration;

    public AudioRecording(String title, int volume, int luminosity, int duration) {
        super(title, luminosity);
        this.volume = volume;
        this.duration = duration;
    };

    @Override
    public boolean isReproducible() {
        return true;
    }

    @Override
    public int getDuration() {
        return duration;
    }

    public void abbassaVolume() {
        if (volume > 0) {
            volume--;
        }
    }

    public void alzaVolume() {
        volume++;
    }

    @Override
    public void play() {
        for (int i = 0; i < duration; i++) {
            System.out.println(title + " " + "!".repeat(volume));
        }
    }

    @Override
    public void show() {

    }
}