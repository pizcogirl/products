import java.util.ArrayList;

/**
 * Manage the stock in a business.
 * The stock is described by zero or more Products.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StockManager
{
    // A list of the products.
    private ArrayList<Product> stock;

    /**
     * Initialise the stock manager.
     */
    public StockManager()
    {
        stock = new ArrayList<Product>();
    }

    /**
     * Add a product to the list.
     * @param item The item to be added.
     */
    public void addProduct(Product item)
    {
        // Usando el metodo findProduct comprobamos si el ID existe ya
        int id = item.getID();
        Product temp = findProduct(id);
        // Si no existe lo añadimos a la lista
        if (temp == null)
        {
            stock.add(item);
        }
        else
        {
            System.out.println("La ID introducida ya existe en el stock");
        }
    }
    
     /**
     * Receive a delivery of a particular product.
     * Increase the quantity of the product by the given amount.
     * @param id The ID of the product.
     * @param amount The amount to increase the quantity by.
     */
    public void delivery(int id, int amount)
    {
        // En este caso usaremos el metodo findProduct para su uso
        Product temp = findProduct(id);
        // Si el objeto existe, le añadimos la cantidad introducida
        // sino imprime un mensaje de error
        if (temp != null)
        {
            temp.increaseQuantity(amount);
        }
        else
        {
            System.out.println("El ID introducido no existe");
        }
    }

    /**
     * Try to find a product in the stock with the given id.
     * @return The identified product, or null if there is none
     *         with a matching ID.
     */
    public Product findProduct(int id)
    {
        // Usamos un bucle while para que exista una condicion de salida
        // Creamos un index y un boolean para el while, y un objeto product para devolver
        int i = 0;
        boolean found = false;
        Product product = null;
        while (i < stock.size() && !(found))
        {
            Product temp = stock.get(i);
            if (temp.getID() == id)
            {
                product = temp;
                found = true;
            }
            i++;
        }

        return product;
    }
    
    /**
     * Try to find a product in the stock with the given name.
     * @return The identidied product, or null if there is none with
     *         a matching name.
     */
    public Product findProduct(String name)
    {
         // Usamos un bucle while para que exista una condicion de salida
        // Creamos un index y un boolean para el while, y un objeto product para devolver
        int i = 0;
        boolean found = false;
        Product product = null;
        while (i < stock.size() && !(found))
        {
            Product temp = stock.get(i);
            if (temp.getName() == name)
            {
                product = temp;
                found = true;
            }
            i++;
        }
        return product;
    }

    /**
     * Locate a product with the given ID, and return how
     * many of this item are in stock. If the ID does not
     * match any product, return zero.
     * @param id The ID of the product.
     * @return The quantity of the given product in stock.
     */
    public int numberInStock(int id)
    {
       // En este caso usaremos el metodo findProduct
        Product temp = findProduct(id);
        int quantity = 0;
        // Si el objeto existe, devolveremos esa cantidad,
        // sino devolveremos 0
        if (temp != null)
        {
            quantity = temp.getQuantity();
        }
        else
        {
            System.out.println("El ID introducido no existe");
        }
        return quantity;
    }

    /**
     * Print details of all the products.
     */
    public void printProductDetails()
    {
        for (int i = 0; i < stock.size(); i++)
        {
            System.out.println(stock.get(i).toString());
        }
    }

    /**
     * Print details of all the products below te given
     * number of stock
     * @param amount The sotck below the one you want to check
     */
    public void printProductDetailsBellowStock(int amount)
    {
        // Creamos un objeto producto para guardar los productos temporalmente
        Product temp = null;
        for (int i = 0; i < stock.size(); i++)
        {
            temp = stock.get(i);
            // Si el stock de ese producto es menor, lo imprime por pantalla
            if (temp.getQuantity() < amount)
            {
                System.out.println(temp.toString());
            }
        }
    }
}
