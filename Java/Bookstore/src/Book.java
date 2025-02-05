public class Book {
    //Declare variable
    private int id;
    private String title;
    private String author;
    private String category;
    private Double price;

    //Constructor
    public Book(int id, String title, String author, String category, Double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.category = category;
        this.price = price;
    }

    //Getter and Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}//class
