package minitest_week3;

public class FictionBook extends Book{
    String catrgory;

    public FictionBook() {
    }

    public FictionBook(String bookCode, String name, int price, String author, String catrgory) {
        super(bookCode, name, price, author);
        this.catrgory = catrgory;
    }

    public String getCatrgory() {
        return catrgory;
    }



    public void setCatrgory(String catrgory) {
        this.catrgory = catrgory;
    }

    @Override
    public String toString() {
        return "FictionBook{" +
                "catrgory='" + catrgory + '\'' +
                '}';
    }
}
