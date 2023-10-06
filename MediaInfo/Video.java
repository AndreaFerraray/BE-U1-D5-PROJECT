class Video extends Media implements Reproducible {
    private int volume;
    private int duration;

    public Video(String title, int volume, int luminosity, int duration) {
        super(title, luminosity);
        this.volume = volume;
        this.duration = duration;
    }