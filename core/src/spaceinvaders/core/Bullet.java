package spaceinvaders.core;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class Bullet extends Entity
{
    private Vector2 pos;

    private Vector2 speed;
    private Vector2 dir;

    private Texture img;

    private float liveTime = 0;

    private int mask = 0;

    public Bullet(Vector2 pos, Vector2 speed){
        super();

        img = new Texture("download.jfif");
        this.pos = pos.cpy();
        this.speed = speed.cpy();

        dir = new Vector2(0, 1);
    }

    @Override
    public void update(float timeStep)
    {
        pos.add( dir.x * speed.x * timeStep, dir.y * speed.y * timeStep);
        liveTime += timeStep;
    }

    @Override
    public void draw(SpriteBatch sb)
    {
        sb.draw(img, pos.x, pos.y);
    }

    @Override
    public void move(Vector2 dir)
    {

    }

    @Override
    public void mainAction()
    {

    }

    @Override
    public void specialAction()
    {
        setMask(Constants.ENEMY_MASK | Constants.WALL_MASK);
    }

    public void setMask(int nextMask){
        mask = nextMask;
    }

    public float getLiveTime(){
        return liveTime;
    }

    public int getMask(){
        return mask;
    }
}
