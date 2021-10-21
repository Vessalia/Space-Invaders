package spaceinvaders.core;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Array;

public class Ship extends Entity
{
    private Vector2 pos;
    private Vector2 initialPos;

    private Vector2 speed;
    private Vector2 dir;

    private Texture img;

    public Ship()
    {
        super();
        initialPos = new Vector2((Constants.Screen.x - img.getWidth()) / 2, 0);
        pos = initialPos.cpy();

        speed = new Vector2(100,  0);
    }

    @Override
    public void update(float timeStep)
    {
        pos.add( dir.x * speed.x * timeStep, dir.y * speed.y * timeStep);
    }

    @Override
    public void draw(SpriteBatch sb)
    {
        sb.draw(img, pos.x, pos.y);
    }

    @Override
    public void move(Vector2 dir)
    {
        this.dir = dir.cpy();
    }

    @Override
    public void mainAction() { }

    @Override
    public void specialAction()
    {

    }
}
