package ru.aleksey.rgbcircles;

/**
 * Created by Aleksey on 09.07.2017.
 */

public interface ICanvasView {
    void drawCircle(SimpleCircle circle);

    void redraw();

    void showMessage(String result);

    //void redraw();
}
