package spaceinvaders.core;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Array;

public class BulletHandler
{
    private final static int MAX_BULLETS = 5;
    private final static float MAX_LIVE_TIME = 5;

    private Vector2 bulletSpeed;

    private Array<Bullet> bullets;

    public BulletHandler(){
        bullets = new Array<Bullet>();
    }

    public void update(float timeStep){
        for (Bullet bullet : bullets){
            bullet.update(timeStep);
        }

        manageBullets();
    }

    public void draw(SpriteBatch sb){
        for (Bullet bullet : bullets){
            bullet.draw(sb);
        }
    }

    public void addBullet(Bullet bullet){
        bullets.add(bullet);
        manageBullets();
    }

    public void manageBullets(){
        if (bullets.size > MAX_BULLETS){
            bullets.removeIndex(0);
        }

        Array<Bullet> bulletsToRemove = new Array<Bullet>();

        for (Bullet bullet : bullets){
            if (bullet.getLiveTime() >= MAX_LIVE_TIME || bullet.getMask() != 0){
                bulletsToRemove.add(bullet);
            }
        }

        bullets.removeAll(bulletsToRemove, true);
    }
}