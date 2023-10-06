
package MediaInfo;
class Video extends Media implements Reproducible {
    public int volume;
    public int duration;

    public Video(String title, int volume, int luminosity, int duration) {
        super(title, luminosity);
        this.volume = volume;
        this.duration = duration;
    }
    @Override
    public boolean isReproducible() {
        return true;
    }

    @Override
    public int getDuration() {
        return duration;
    }

    public void aumentaLuminosita() {
        luminosity++;
    }

    public void diminuisciLuminosita() {
        if (luminosity > 0) {
            luminosity--;
        }
    }

    @Override
    public void play() {
        for (int i = 0; i < duration; i++) {
            System.out.println(title + " " + "!".repeat(volume));
            System.out.println("*".repeat(luminosity));
        }
    }

    @Override
    public void show() {
        // Non fa nulla
    }

}