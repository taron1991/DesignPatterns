package strategy;

public class Main {
    public static void main(String[] args) {
        Context context = new Context(new DownloadWindownsStrategy());
        context.download("file.txt");
        context = new Context(new DownloadLinuxStrategy());
        context.download("file.txt");
    }
}
