package peshin.kirill.gbqsandroid;

public class GameManager {
    private MainCircle mainCircle;
    private CanvasView canvasView;
    private static int widht;
    private static int height;

    public GameManager(CanvasView canvasView, int w, int h) {
        this.canvasView = canvasView;
        widht = w;
        height = h;
        initMainCircle();
    }

    private void initMainCircle() {
        mainCircle = new MainCircle(widht /2, height / 2);
    }

    public void onDraw() {
        canvasView.drawCircle(mainCircle);
    }
}