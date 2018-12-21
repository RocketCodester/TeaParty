
import org.lgna.story.resources.biped.MadHatterResource;
import org.lgna.story.*;
import org.lgna.common.EachInTogetherRunnable;
import static org.lgna.common.ThreadUtilities.doTogether;
import static org.lgna.common.ThreadUtilities.eachInTogether;

public class MadHatter extends Biped {

    public MadHatter() {
        super(MadHatterResource.DEFAULT);
    }
}
