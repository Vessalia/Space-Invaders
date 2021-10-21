package spaceinvaders.core;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Vector2;

public class Constants
{
        private final static int Width = Gdx.graphics.getWidth();
        private final static int Height = Gdx.graphics.getHeight();

        public final static String highscorePath = "Highscores/Highscores.gold";
        public final static String configPath = "Config/Settings.gold";

        public final static Vector2 Screen = new Vector2(Width, Height);

        public final static int ENEMY_MASK = 1;
        public final static int PLAYER_MASK = ENEMY_MASK << 1;
        public final static int WALL_MASK = PLAYER_MASK << 1;
        public final static int BLOCK_MASK = WALL_MASK << 1;
}
