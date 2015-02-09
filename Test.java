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
        stock.delivery(4, 2);
        return stock.numberInStock(4);
    }
    
    
    
        public int test5()
    {
        StockManager stock = new StockManager();
        stock.addProduct(new Product(1, "a"));
        stock.addProduct(new Product(2, "b"));
        stock.addProduct(new Product(3, "c"));
        stock.delivery(2, 4);
        return stock.numberInStock(2);
    }
    
     public void test6()
    {
        StockManager stock = new StockManager();
        stock.addProduct(new Product(1, "a"));
        stock.addProduct(new Product(2, "b"));
        stock.addProduct(new Product(3, "c"));
        stock.delivery(2, 4);
        stock.printProductDetailsBellowStock(3);
    }
    
    public void test7()
    {
        StockManager stock = new StockManager();
        stock.addProduct(new Product(1, "a"));
        stock.addProduct(new Product(2, "b"));
        stock.addProduct(new Product(3, "c"));
        stock.delivery(2, 4);
        stock.addProduct(new Product(3, "d"));
    }
    
        public Product test8()
    {
        StockManager stock = new StockManager();
        stock.addProduct(new Product(1, "a"));
        stock.addProduct(new Product(2, "b"));
        stock.addProduct(new Product(3, "c"));
         return stock.findProduct("b");
    }

    public Product test9()
    {
        StockManager stock = new StockManager();
        stock.addProduct(new Product(1, "a"));
        stock.addProduct(new Product(2, "b"));
        stock.addProduct(new Product(3, "c"));
        return stock.findProduct("d");
    }
    
     public void test10()
    {
        StockManager stock = new StockManager();
        stock.addProduct(new Product(1, "a"));
        stock.addProduct(new Product(2, "b"));
        stock.addProduct(new Product(3, "c"));
        stock.delivery(1, 3);
        stock.delivery(2, 4);
        stock.delivery(3, 2);
        stock.printProductDetails2();
    }
}