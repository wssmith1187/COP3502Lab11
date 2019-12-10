
public class Dragon extends Cow {
	//Constructor
    public Dragon(String name, String image) {
        super(name);
        this.image = image;
    }

    public boolean canBreatheFire() {
        return true;
    }
}
