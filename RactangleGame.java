public class RactangleGame extends BaseGame
{
    public void create() 
    {        
        super.create();
        setActiveScreen( new LevelScreen() );
    }
}