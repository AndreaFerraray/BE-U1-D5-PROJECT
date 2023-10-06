package MediaInfo;
class Image extends Media implements Reproducible {
    public Image(String title, int luminosity) {
        super(title, luminosity);
    }

    @Override
    public void show() {
        System.out.println(title + " " + "*".repeat(luminosity));
    }

    @Override
    public boolean isReproducible() {

        return false;
    }

    @Override
    public int getDuration() {

        return 0;
    }

    @Override
    public void play() {

    }


}

