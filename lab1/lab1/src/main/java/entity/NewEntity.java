package entity;

public class NewEntity {

    private int id;
    private String name;
    private int size;
    private String img;

    public NewEntity(int id, String name, int size, String img) {
        this.id = id;
        this.name = name;
        this.size = size;
        this.img = img;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

}
