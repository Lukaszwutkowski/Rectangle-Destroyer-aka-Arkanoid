import com.badlogic.gdx.Game;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;

public class Launcher
{
    public static void main (String[] args)
    {
        Game myGame = new RactangleGame();
        LwjglApplication launcher = new LwjglApplication( myGame, "Rectangle Game", 800, 600 );
    }
}