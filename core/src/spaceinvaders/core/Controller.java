package spaceinvaders.core;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.math.Vector2;

public class Controller
{
    private Entity entity;

    public Controller(Entity entity)
    {
        this.entity = entity;
    }

    public void update()
    {

    }

    public void handleInput()
    {
        Vector2 dir = new Vector2().setZero();

        if (Gdx.input.isKeyPressed(Input.Keys.LEFT))
        {
            dir.x -= 1;
        }
        if (Gdx.input.isKeyPressed(Input.Keys.RIGHT))
        {
            dir.x += 1;
        }

        if (Gdx.input.isKeyPressed(Input.Keys.SPACE))
        {
            entity.mainAction();
        }
        else if (Gdx.input.isKeyPressed(Input.Keys.CONTROL_LEFT) || Gdx.input.isKeyPressed(Input.Keys.CONTROL_RIGHT))
        {
            entity.specialAction();
        }

        entity.move(dir);
    }
}
