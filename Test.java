public class Test
{
    public void test1()
    {
        StockManager stock = new StockManager();
        stock.addProduct(new Product(1, "a"));
        stock.addProduct(new Product(2, "b"));
        stock.addProduct(new Product(3, "c"));
        stock.printProductDetails();
    }

    public Product test2()
    {
        StockManager stock = new StockManager();
        stock.addProduct(new Product(1, "a"));
        stock.addProduct(new Product(2, "b"));
        stock.addProduct(new Product(3, "c"));
         return stock.findProduct(2);
    }

    public Product test3()
    {
        StockManager stock = new StockManager();
        stock.addProduct(new Product(1, "a"));
        stock.addProduct(new Product(2, "b"));
        stock.addProduct(new Product(3, "c"));
        return stock.findProduct(4);
    }
    
        public int test4()
    {
        StockManager stock = new StockManager();
        stock.addProduct(new Product(1, "a"));
        stock.addProduct(new Product(2, "b"));
        stock.addProduct(new Product(3, "c"));
        return stock.numberInStock(4);
    }
    
    
    
        public int test5()
    {
        StockManager stock = new StockManager();
        stock.addProduct(new Product(1, "a"));
        stock.addProduct(new Product(2, "b"));
        stock.addProduct(new Product(3, "c"));
        return stock.numberInStock(2);
    }
}