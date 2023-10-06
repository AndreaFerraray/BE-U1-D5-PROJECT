package MediaInfo;
class Image extends Media {
    public Image(String title, int luminosity) {
        super(title, luminosity);
    };

    @Override
    public void show() {
        System.out.println(title + " " + "*".repeat(luminosity));
    }
}

