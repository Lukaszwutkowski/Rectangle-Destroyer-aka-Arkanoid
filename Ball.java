import com.badlogic.gdx.math.Vector;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Stage;

public class Ball extends BaseActor {

    public boolean paused;

    public Ball(float x, float y, Stage s) {
        super(x, y, s);
        loadTexture("assets/ball.png");
        setSpeed(400);
        setMotionAngle(90);
        setBoundaryPolygon(12);
        setPaused(true);
    }

    public boolean isPaused(){
        return paused;
    }

    public void setPaused(boolean b){
        paused = b;
    }

    public void act(float dt){
        super.act(dt);

        if (!isPaused()){
            // TODO: Simulate gravity:
            setAcceleration(10);
            accelerateAtAngle(270);
            applyPhysics(dt);
        }
    }

    public void bounceOff(BaseActor other){
        Vector2 v = this.preventOverlap(other);
        if (Math.abs(v.x) >= Math.abs(v.y)){
            // Horizontal bounce
            this.velocityVec.x *= -1;
        }
        else{
            // Vertical bounce
            this.velocityVec.y *= -1;
        }
    }
}
