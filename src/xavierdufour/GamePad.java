package xavierdufour;

import xavierdufour.engine.controls.MovementController;

import java.awt.event.KeyEvent;

public class GamePad extends MovementController {

    private int quitKey = KeyEvent.VK_Q;
    private int fireKey = KeyEvent.VK_SPACE;

    public GamePad() {
        super.bindKey(quitKey);
        super.bindKey(fireKey);
    }

    public boolean isFirePressed() {
        return super.isKeyPressed(fireKey);
    }

    public boolean isQuitPressed() {
        return super.isKeyPressed(quitKey);
    }
}
