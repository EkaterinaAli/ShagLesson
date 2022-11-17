package lesson32;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main_Sort {
    public static void sortProducts (List<Product> products, int choice, boolean revers){
        switch (choice){
            case 1:
                //компоратор по названию(алфавитный порядок)
                Comparator <Product> compByName = (o1,o2) -> o1.getName().compareTo(o2.getName());
                // сортировка по названию
                Collections.sort(products,compByName);
                break;

            case 2:
                // коморатор по цене по возрастанию
                Comparator <Product> compByPrice = ((o1, o2) -> ((Double)(o1.getPrice())).compareTo((Double) (o2.getPrice())));
                if (!revers){
                // сортировка по цене по возрастанию
                Collections.sort(products, compByPrice);}
                else {// сортировка по цене по убыванию
                    Collections.sort(products, Collections.reverseOrder(compByPrice));
                }
                break;
        }
    }

    public static void main(String[] args) {
        //сортировка товаров по разным полям
        Product[] productArray = {
                new Product("Fork",1.25,5),
                new Product("Spoon",1.05,4),
                new Product("Pan",10.99,3),
                new Product("Knife",1.43,5),
                new Product("Knife",5.12,2),
                new Product("Spatula",2.12,4),
                new Product("Plate",3.70,4)
        };
        List<Product> products = Arrays.asList(productArray);
        System.out.println("Сортировка по имени ");
        /*Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
                 */
        //компоратор по названию(алфавитный порядок)
        /*Comparator <Product> compByName = (o1,o2) -> o1.getName().compareTo(o2.getName());
        Collections.sort(products,compByName);
        System.out.println(products);

        // сортировка по цене по возрастанию
        Comparator <Product> compByPrice = ((o1, o2) -> ((Double)(o1.getPrice())).compareTo((Double) (o2.getPrice())));
        Collections.sort(products, compByPrice);
        System.out.println(products);

        // сортировка по цене по убыванию
        Collections.sort(products, Collections.reverseOrder(compByPrice));
        System.out.println(products);

         */
        sortProducts(products,2,false);
        System.out.println(products);
        sortProducts(products,2,true);
        System.out.println(products);



    }
}