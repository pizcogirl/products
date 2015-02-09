public class Test
{
    public void stest1()
    {
        StockManager stock = new StockManager();
        stock.addProduct(new Product(1, "a"));
        stock.addProduct(new Product(2, "b"));
        stock.addProduct(new Product(3, "c"));
        stock.printProductDetails();
    }
}