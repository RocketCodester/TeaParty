
import org.lgna.story.resources.prop.ChairResource;
import org.lgna.story.*;
import org.lgna.common.EachInTogetherRunnable;
import static org.lgna.common.ThreadUtilities.doTogether;
import static org.lgna.common.ThreadUtilities.eachInTogether;

public class Chair extends Prop {

    public Chair(final ChairResource resource) {
        super(resource);
    }

    public void setChairResource(final ChairResource chairResource) {
        this.setJointedModelResource(chairResource);
    }
}
