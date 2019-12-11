//You have been changed.
public class Cow {
    protected String name;
    protected String image;
    
    //Constructor
    public Cow(String name) {
        this.name = name;
    }
    //Returns name of this cow object
    public String getName() {
        return name;
    }
    //Return image for this cow object
    public String getImage() {
        return image;
    }
    //Sets the image for this cow object to image
    public void setImage(String _image) {
        image = _image;
    }
}
