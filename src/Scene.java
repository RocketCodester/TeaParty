
import org.lgna.story.resources.prop.CakeResource;
import org.lgna.story.event.SceneActivationEvent;
import org.lgna.story.resources.sims2.FemaleChildHairBraidsUp;
import org.lgna.story.resources.sims2.BaseEyeColor;
import org.lgna.story.resources.sims2.Gender;
import org.lgna.story.event.SceneActivationListener;
import org.lgna.story.resources.prop.TeacupResource;
import org.lgna.story.resources.sims2.ChildPersonResource;
import org.lgna.story.resources.sims2.BaseFace;
import org.lgna.story.resources.prop.ChairResource;
import org.lgna.story.resources.sims2.FemaleChildFullBodyOutfitDressAboveKneeCollar;
import org.lgna.story.*;
import org.lgna.common.EachInTogetherRunnable;
import static org.lgna.common.ThreadUtilities.doTogether;
import static org.lgna.common.ThreadUtilities.eachInTogether;

public class Scene extends SScene {

    public Scene() {
        super();
    }

    private void performCustomSetup() {
    }

    private void performGeneratedSetUp() {
        this.setAtmosphereColor(new Color(0.0, 0.0941, 0.294));
        this.setFromAboveLightColor(Color.WHITE);
        this.setFromBelowLightColor(new Color(0.098, 0.0, 0.0));
        this.setFogDensity(0.0);
        this.setName("myScene");
        this.ground.setPaint(SGround.SurfaceAppearance.DARK_GRASS);
        this.ground.setOpacity(1.0);
        this.ground.setName("ground");
        this.ground.setVehicle(this);
        this.camera.setName("camera");
        this.camera.setVehicle(this);
        this.camera.setOrientationRelativeToVehicle(new Orientation(-0.00114772, 0.995117, 0.0980077, 0.0116331));
        this.camera.setPositionRelativeToVehicle(new Position(0.425, 1.56, -8.91));
        this.teaTable.setPaint(Color.WHITE);
        this.teaTable.setOpacity(1.0);
        this.teaTable.setName("teaTable");
        this.teaTable.setVehicle(this);
        this.teaTable.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.teaTable.setPositionRelativeToVehicle(new Position(0.0, 0.0, 0.0));
        this.teaTable.setSize(new Size(3.77, 0.724, 1.27));
        this.chair.setPaint(Color.WHITE);
        this.chair.setOpacity(1.0);
        this.chair.setName("chair");
        this.chair.setVehicle(this);
        this.chair.setOrientationRelativeToVehicle(new Orientation(0.0, -0.660997, 0.0, 0.750389));
        this.chair.setPositionRelativeToVehicle(new Position(-2.48, 0.0, 0.164));
        this.chair.setSize(new Size(0.542, 0.966, 0.554));
        this.chair2.setPaint(Color.WHITE);
        this.chair2.setOpacity(1.0);
        this.chair2.setName("chair2");
        this.chair2.setVehicle(this);
        this.chair2.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.chair2.setPositionRelativeToVehicle(new Position(-0.5, 0.0, 1.06));
        this.chair2.setSize(new Size(0.482, 1.01, 0.54));
        this.chair3.setPaint(Color.WHITE);
        this.chair3.setOpacity(1.0);
        this.chair3.setName("chair3");
        this.chair3.setVehicle(this);
        this.chair3.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.chair3.setPositionRelativeToVehicle(new Position(1.07, 0.0, 0.868));
        this.chair3.setSize(new Size(0.488, 1.0, 0.55));
        this.chair4.setPaint(Color.WHITE);
        this.chair4.setOpacity(1.0);
        this.chair4.setName("chair4");
        this.chair4.setVehicle(this);
        this.chair4.setOrientationRelativeToVehicle(new Orientation(0.0, 0.771358, 0.0, 0.636401));
        this.chair4.setPositionRelativeToVehicle(new Position(2.25, 0.0, -0.0336));
        this.chair4.setSize(new Size(0.542, 0.966, 0.554));
        this.teapot.setPaint(Color.WHITE);
        this.teapot.setOpacity(1.0);
        this.teapot.setName("teapot");
        this.teapot.setVehicle(this);
        this.teapot.setOrientationRelativeToVehicle(new Orientation(0.0, 0.688347, 0.0, 0.725382));
        this.teapot.setPositionRelativeToVehicle(new Position(-0.586, 0.724, 0.0));
        this.teapot.setSize(new Size(0.247, 0.229, 0.397));
        this.teacup.setPaint(Color.WHITE);
        this.teacup.setOpacity(1.0);
        this.teacup.setName("teacup");
        this.teacup.setVehicle(this);
        this.teacup.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.teacup.setPositionRelativeToVehicle(new Position(1.42, 0.723, 0.0));
        this.teacup.setSize(new Size(0.205, 0.138, 0.261));
        this.teacup2.setPaint(Color.WHITE);
        this.teacup2.setOpacity(1.0);
        this.teacup2.setName("teacup2");
        this.teacup2.setVehicle(this);
        this.teacup2.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.teacup2.setPositionRelativeToVehicle(new Position(0.811, 0.723, 0.0));
        this.teacup2.setSize(new Size(0.205, 0.138, 0.261));
        this.teacup3.setPaint(Color.WHITE);
        this.teacup3.setOpacity(1.0);
        this.teacup3.setName("teacup3");
        this.teacup3.setVehicle(this);
        this.teacup3.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.teacup3.setPositionRelativeToVehicle(new Position(0.0, 0.723, 0.0));
        this.teacup3.setSize(new Size(0.205, 0.138, 0.261));
        this.cake.setPaint(Color.WHITE);
        this.cake.setOpacity(1.0);
        this.cake.setName("cake");
        this.cake.setVehicle(this);
        this.cake.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.cake.setPositionRelativeToVehicle(new Position(-1.36, 0.724, 0.0));
        this.cake.setSize(new Size(0.672, 0.286, 0.71));
        this.marchHare.setPaint(Color.WHITE);
        this.marchHare.setOpacity(1.0);
        this.marchHare.setName("marchHare");
        this.marchHare.setVehicle(this);
        this.marchHare.setOrientationRelativeToVehicle(new Orientation(0.0, -0.641982, 0.0, 0.76672));
        this.marchHare.setPositionRelativeToVehicle(new Position(-2.27, 0.0, 0.163));
        this.marchHare.setSize(new Size(0.736, 1.69, 0.727));
        this.marchHare.getRightHip().setOrientationRelativeToVehicle(new Orientation(0.741324, 0.0, 0.0, 0.671147));
        this.marchHare.getRightKnee().setOrientationRelativeToVehicle(new Orientation(-0.781501, 0.0, 0.0, 0.623904));
        this.marchHare.getLeftHip().setOrientationRelativeToVehicle(new Orientation(0.741324, 0.0, 0.0, 0.671147));
        this.marchHare.getLeftKnee().setOrientationRelativeToVehicle(new Orientation(-0.781499, 0.0, 0.0, 0.623906));
        this.madHatter.setPaint(Color.WHITE);
        this.madHatter.setOpacity(1.0);
        this.madHatter.setName("madHatter");
        this.madHatter.setVehicle(this);
        this.madHatter.setOrientationRelativeToVehicle(new Orientation(0.0, -0.202099, 0.0, 0.979365));
        this.madHatter.setPositionRelativeToVehicle(new Position(-2.49, 0.0, 3.24));
        this.madHatter.setSize(new Size(0.604, 1.93, 0.838));
        this.alice.setPaint(Color.WHITE);
        this.alice.setOpacity(1.0);
        this.alice.setName("alice");
        this.alice.setVehicle(this);
        this.alice.setOrientationRelativeToVehicle(new Orientation(0.0, 0.91811, 0.0, 0.396326));
        this.alice.setPositionRelativeToVehicle(new Position(1.74, 0.0, -4.08));
        this.alice.setSize(new Size(0.291, 1.2, 0.209));
    }

    private void initializeEventListeners() {
        this.addSceneActivationListener(new SceneActivationListener() {
            public void sceneActivated(final SceneActivationEvent e) {
                Scene.this.myFirstMethod();
            }
        });
    }

    protected void handleActiveChanged(final Boolean isActive, final Integer activationCount) {
        if (isActive) {
            if (activationCount == 1) {
                this.performGeneratedSetUp();
                this.performCustomSetup();
                this.initializeEventListeners();
            } else {
                this.restoreStateAndEventListeners();
            }
        } else {
            this.preserveStateAndEventListeners();
        }
    }

    public void myFirstMethod() {
        {
            this.playAudio(new AudioSource(Resources.UnbirthdaySong_wav));
            this.alice.moveToward(this.marchHare, 3.0);
            this.alice.say("I enjoyed your singing!", Say.duration(0.5));
            this.madHatter.say("We never get compliments, you must have a cup of tea.");
            this.alice.say("Sorry for interrupting your birthday party.");
            this.marchHare.say("This is not a birthday party, this is an unbirthday.");
            this.alice.say("Unbirthday?", Say.duration(1.0));
            this.madHatter.say("Statistics prove, prove that you've got one birthday.  One birthday every year, but there are 364 unbirthdays.  That's exactly why we are gathered here to cheer.", Say.duration(3.0));
            this.alice.say("Well I guess it's my unbirthday too!", Say.duration(1.0));
            this.alice.move(MoveDirection.UP, 0.5, Move.duration(0.5));
            this.alice.move(MoveDirection.DOWN, 0.5, Move.duration(0.5));
            this.alice.move(MoveDirection.UP, 0.5, Move.duration(0.5));
            this.alice.move(MoveDirection.DOWN, 0.5, Move.duration(0.5));
            this.marchHare.say("The End");
        }
    }

    public SGround getGround() {
        return this.ground;
    }

    public SCamera getCamera() {
        return this.camera;
    }

    public TeaTable getTeaTable() {
        return this.teaTable;
    }

    public Chair getChair() {
        return this.chair;
    }

    public Chair getChair2() {
        return this.chair2;
    }

    public Chair getChair3() {
        return this.chair3;
    }

    public Chair getChair4() {
        return this.chair4;
    }

    public Teapot getTeapot() {
        return this.teapot;
    }

    public Teacup getTeacup() {
        return this.teacup;
    }

    public Teacup getTeacup2() {
        return this.teacup2;
    }

    public Teacup getTeacup3() {
        return this.teacup3;
    }

    public Cake getCake() {
        return this.cake;
    }

    public MarchHare getMarchHare() {
        return this.marchHare;
    }

    public MadHatter getMadHatter() {
        return this.madHatter;
    }

    public ChildPerson getAlice() {
        return this.alice;
    }
    private final SGround ground = new SGround();
    private final SCamera camera = new SCamera();
    private final TeaTable teaTable = new TeaTable();
    private final Chair chair = new Chair(ChairResource.ART_NOUVEAU_DARK_WOOD);
    private final Chair chair2 = new Chair(ChairResource.CLUB_DARK_GREEN);
    private final Chair chair3 = new Chair(ChairResource.COLONIAL_RED_STRIPES);
    private final Chair chair4 = new Chair(ChairResource.ART_NOUVEAU_WOOD);
    private final Teapot teapot = new Teapot();
    private final Teacup teacup = new Teacup(TeacupResource.CHESHIRE_CAT);
    private final Teacup teacup2 = new Teacup(TeacupResource.MAD_HATTER);
    private final Teacup teacup3 = new Teacup(TeacupResource.WHITE_RABBIT);
    private final Cake cake = new Cake(CakeResource.BIRTHDAY);
    private final MarchHare marchHare = new MarchHare();
    private final MadHatter madHatter = new MadHatter();
    private final ChildPerson alice = new ChildPerson(new ChildPersonResource(Gender.FEMALE, new Color(0.886, 0.639, 0.498), BaseEyeColor.LIGHT_BLUE, FemaleChildHairBraidsUp.BLOND, 0.21474, FemaleChildFullBodyOutfitDressAboveKneeCollar.SKY, BaseFace.HUMAN_01));
}
