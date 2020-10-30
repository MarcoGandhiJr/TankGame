package xavierdufour;

import xavierdufour.engine.Buffer;
import xavierdufour.engine.Game;

public class TankGame extends Game {

    private Tank tank;
    private GamePad gamePad;

    public TankGame() {
        gamePad = new GamePad();
        tank = new Tank(gamePad);
        super.addKeyListener(gamePad);
    }

    @Override
    public void initialize() {

    }

    @Override
    public void update() {
        tank.update();
        if (gamePad.isQuitPressed()) {
            super.stop();
        }
    }

    @Override
    public void draw(Buffer buffer) {
        tank.draw(buffer);
    }

    @Override
    public void conclude() {

    }
}
