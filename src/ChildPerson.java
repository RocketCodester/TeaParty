
import org.lgna.story.resources.sims2.ChildPersonResource;
import org.lgna.story.*;
import org.lgna.common.EachInTogetherRunnable;
import static org.lgna.common.ThreadUtilities.doTogether;
import static org.lgna.common.ThreadUtilities.eachInTogether;

public class ChildPerson extends Person {

    public ChildPerson(final ChildPersonResource resource) {
        super(resource);
    }

    public void setChildPersonResource(final ChildPersonResource childPersonResource) {
        this.setJointedModelResource(childPersonResource);
    }
}
