package spaceinvaders.core;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public abstract class Entity
{
    private Vector2 pos;
    private Vector2 initialPos;

    public abstract void update(float timeStep);

    public abstract void draw(SpriteBatch sb);

    public abstract void move(Vector2 dir);

    public abstract void mainAction();

    public abstract void specialAction();
}
