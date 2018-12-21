
import org.lgna.story.resources.prop.TeapotResource;
import org.lgna.story.*;
import org.lgna.common.EachInTogetherRunnable;
import static org.lgna.common.ThreadUtilities.doTogether;
import static org.lgna.common.ThreadUtilities.eachInTogether;

public class Teapot extends Prop {

    public Teapot() {
        super(TeapotResource.DEFAULT);
    }
}
