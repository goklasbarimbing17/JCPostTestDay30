import LogicApp.LoopingTriangle;
import LogicApp.Multiple;

public class MainApp {
    public static void main(String[] args) {

        Multiple multiple = new Multiple();
        LoopingTriangle looping = new LoopingTriangle();

        multiple.multipleApp();
        looping.loopingApp();
    }
}