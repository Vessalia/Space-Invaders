package spaceinvaders.core;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class Game1 extends ApplicationAdapter
{
    SpriteBatch batch;
    Texture img;

    private Entity ship;
    private Controller controller;

    @Override
    public void create()
    {
        batch = new SpriteBatch();
        img = new Texture("download.jfif");
        ship = new Ship();
        controller = new Controller(ship);
    }

    private void handleInput(){
        controller.handleInput();
    }

    @Override
    public void render()
    {
        float dt = Gdx.graphics.getDeltaTime();
        handleInput();
        //Updates
        ship.update(dt);
        draw();
    }

    private void draw(){
        ScreenUtils.clear(1, 0, 0, 1);
        batch.begin();
        //Drawing
        ship.draw(batch);
        batch.end();
    }

    @Override
    public void dispose()
    {
        batch.dispose();
        img.dispose();
    }
}
