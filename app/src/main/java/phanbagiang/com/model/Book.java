package phanbagiang.com.model;

public class Book {
    private int imgae;
    private String title;
    private String description;

    public Book() {
    }

    public Book(int imgae, String title, String description) {
        this.imgae = imgae;
        this.title = title;
        this.description = description;
    }

    public int getImgae() {
        return imgae;
    }

    public void setImgae(int imgae) {
        this.imgae = imgae;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
