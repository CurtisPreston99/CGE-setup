
package game;

import engine.scene;
import engine.window;
import engine.ui.text;

public class App extends window{

    public static void main(String[] args) {
        window.main("game.App", args);
    }

    @Override
    public void keyUpdate() {

    }

    @Override
    public void mouseClick() {

    }

    @Override
    public void mouseWheel() {
    }

    @Override
    public void settings() {
        size(900,800);
        addScene(new scene(this, "start"));
        selectScene("start");
        getScene("start").addEntity(new text(400,400,100,100,getScene("start"),this,"CGE"), "title");

    }

    @Override
    public void setup() {
        
    }

    @Override
    public void update() {

    }
}
