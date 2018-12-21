
import org.lgna.story.resources.biped.MarchHareResource;
import org.lgna.story.*;
import org.lgna.common.EachInTogetherRunnable;
import static org.lgna.common.ThreadUtilities.doTogether;
import static org.lgna.common.ThreadUtilities.eachInTogether;

public class MarchHare extends Biped {

    public MarchHare() {
        super(MarchHareResource.DEFAULT);
    }

    public SJoint getLeftEar() {
        return this.getJoint(MarchHareResource.LEFT_EAR);
    }

    public SJoint getLeftEarTip() {
        return this.getJoint(MarchHareResource.LEFT_EAR_TIP);
    }

    public SJoint getRightEar() {
        return this.getJoint(MarchHareResource.RIGHT_EAR);
    }

    public SJoint getRightEarTip() {
        return this.getJoint(MarchHareResource.RIGHT_EAR_TIP);
    }
}
