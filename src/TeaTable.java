
import org.lgna.story.resources.prop.TeaTableResource;
import org.lgna.story.*;
import org.lgna.common.EachInTogetherRunnable;
import static org.lgna.common.ThreadUtilities.doTogether;
import static org.lgna.common.ThreadUtilities.eachInTogether;

public class TeaTable extends Prop {

    public TeaTable() {
        super(TeaTableResource.DEFAULT);
    }
}
