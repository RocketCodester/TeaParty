
import org.lgna.story.resources.prop.CakeResource;
import org.lgna.story.*;
import org.lgna.common.EachInTogetherRunnable;
import static org.lgna.common.ThreadUtilities.doTogether;
import static org.lgna.common.ThreadUtilities.eachInTogether;

public class Cake extends Prop {

    public Cake(final CakeResource resource) {
        super(resource);
    }

    public void setCakeResource(final CakeResource cakeResource) {
        this.setJointedModelResource(cakeResource);
    }
}
