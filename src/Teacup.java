
import org.lgna.story.resources.prop.TeacupResource;
import org.lgna.story.*;
import org.lgna.common.EachInTogetherRunnable;
import static org.lgna.common.ThreadUtilities.doTogether;
import static org.lgna.common.ThreadUtilities.eachInTogether;

public class Teacup extends Prop {

    public Teacup(final TeacupResource resource) {
        super(resource);
    }

    public void setTeacupResource(final TeacupResource teacupResource) {
        this.setJointedModelResource(teacupResource);
    }
}
