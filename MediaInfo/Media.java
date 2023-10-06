package MediaInfo;

abstract class Media {
    protected String title;
    protected int luminosity;

    public Media(String title, int luminosity) {
        this.title = title;
        this.luminosity = luminosity;
    }

    public abstract void show();
}
