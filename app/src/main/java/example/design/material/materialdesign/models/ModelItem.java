package example.design.material.materialdesign.models;

/**
 * Created by Gulzar on 3/1/16.
 */
public class ModelItem {
    private String text;
    private String image;

    public ModelItem() {

    }

    public ModelItem(String image, String text) {
        this.image = image;
        this.text = text;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
