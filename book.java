public class book {
    private String bookId;
    private String title;
    private double price;
    private double discount;

    public book(String bookId, String title) {
        this.bookId = bookId;
        this.title = title;
    }

    public book(String bookId, String title, double price, double discount) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
        this.discount = discount;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getFinalPrice() {
        return price - (price * discount / 100);
    }

    public void displayBookInfo() {
        System.out.println("Mã sách: " + bookId);
        System.out.println("Tên sách: " + title);
        System.out.println("Giá gốc: " + price);
        System.out.println("Giảm giá: " + discount + "%");
        System.out.println("Giá cuối cùng: " + getFinalPrice());
    }
}