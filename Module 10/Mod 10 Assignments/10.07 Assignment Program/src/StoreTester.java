/**
 * Purpose: Sort all of the products in the store.
 *
 * @version 4/18/2022
 * @ Manit Mishra
 */

public class StoreTester {
    public static void main(String[] args) {
        Product[] products = new Product[10];

        products[0] = new Product("Chewbacca Mask", 1281, 19.99, 24);
        products[1] = new Product("Pencil", 103, 2.99, 1999);
        products[2] = new Product("Apple", 1098, 5.00, 500);
        products[3] = new Product("Rubber Duck", 1921, 9.99, 100);
        products[4] = new Product("Cheese", 800, 6.99, 50);
        products[5] = new Product("Ball", 492, 10.00, 24);
        products[6] = new Product("Mask", 238, 14.99, 7000);
        products[7] = new Product("Tiles", 784, 3.99, 20394);
        products[8] = new Product("Piano", 5093, 199.99, 10);
        products[9] = new Product("Chair", 2670, 29.99, 899);

        System.out.println("Regular List\n");
        printAllItems(products);

        System.out.println("\nSorting with Selection Sort, Sorting by Product Number, Descending\n");
        sortProductNumberWithSelectionDescending(products);
        printAllItems(products);

        System.out.println("\nSorting with Selection Sort, Sorting by Product Number, Ascending\n");
        sortProductNumberWithSelectionAscending(products);
        printAllItems(products);

        System.out.println("\nSorting with Insertion Sort, Sorting by Product Name, Descending\n");
        printAllItems(sortProductWithInsertionDescending(products));

        System.out.println("\nSorting with Insertion Sort, Sorting by Product Name, Ascending\n");
        printAllItems(sortProductWithInsertionAscending(products));

        int low = 0;
        int high = products.length -1;

        System.out.println("\nSort with Merge Sort, Sorting by Price, Ascending\n");
        mergeSort(products, low, high);
        printAllItems(products);

        System.out.println("\nSort with Merge Sort, Sorting by Price, Descending\n");
        mergeSortDescending(products, low, high);
        printAllItems(products);

        System.out.println("\nSort with Selection Sort, Sorting by Quantity, Ascending\n");
        sortQuantityWithSelectionAscending(products);
        printAllItems(products);


        System.out.println("\nSort with Selection Sort, Sorting by Quantity, Descending\n");
        sortQuantityWithSelectionDescending(products);
        printAllItems(products);
    }

    public static void printAllItems(Product[] products){
        for (int i = 0; i < products.length; i++){
            System.out.println(products[i]);
        }
    }

    public static void sortProductNumberWithSelectionDescending(Product[] products) {
        int n = products.length;
        int k;
        int smallestIntegerIndex;
        int temp;

        for (int i = 0; i < n - 1; i++) {
            smallestIntegerIndex = i;

            for (k = i + 1; k < n; k++) {
                if (products[k].getProductNumber() > products[smallestIntegerIndex].getProductNumber()) {
                    smallestIntegerIndex = k;
                }
            }

            temp = products[i].getProductNumber();
            products[i].setProductNumber(products[smallestIntegerIndex].getProductNumber());
            products[smallestIntegerIndex].setProductNumber(temp);
        }
    }

    public static void sortProductNumberWithSelectionAscending(Product[] products) {
        int n = products.length;
        int k;
        int smallestIntegerIndex;
        int temp;

        for (int i = 0; i < n - 1; i++) {
            smallestIntegerIndex = i;

            for (k = i + 1; k < n; k++) {
                if (products[k].getProductNumber() < products[smallestIntegerIndex].getProductNumber()) {
                    smallestIntegerIndex = k;
                }
            }

            temp = products[i].getProductNumber();
            products[i].setProductNumber(products[smallestIntegerIndex].getProductNumber());
            products[smallestIntegerIndex].setProductNumber(temp);
        }
    }

    public static Product[] sortProductWithInsertionDescending(Product[] products){
        Product[] dest = new Product[products.length];

        for (int i = 0; i < products.length; i++){
            Product next = products[i];
            int insertindex = 0;
            int k = i;

            while (k > 0 && insertindex == 0){
                if (next.getName().compareTo(dest[k-1].getName()) < 0){
                    insertindex = k;
                }
                else{
                    dest[k] = dest[k-1];
                }
                k--;
            }
            dest[insertindex] = next;
        }
        return dest;
    }

    public static Product[] sortProductWithInsertionAscending(Product[] products){
        Product[] dest = new Product[products.length];

        for (int i = 0; i < products.length; i++){
            Product next = products[i];
            int insertindex = 0;
            int k = i;

            while (k > 0 && insertindex == 0){
                if (next.getName().compareTo(dest[k-1].getName()) > 0){
                    insertindex = k;
                }
                else{
                    dest[k] = dest[k-1];
                }
                k--;
            }
            dest[insertindex] = next;
        }
        return dest;
    }

    public static void mergeSort(Product[] products, int low, int high){

        if (low == high){return;}

        int mid = (high + low) / 2;

        mergeSort(products, low, mid);
        mergeSort(products, mid + 1, high);

        merge(products, low, mid, high);
    }

    public static void merge(Product[] products, int low, int mid, int high){
        Product[] temp = new Product[high-low + 1];

        int i = low;
        int j = mid + 1;
        int n = 0;

        while (i <= mid && j <= high){
            if (products[i].getPrice() < products[j].getPrice()){
                temp[n] = products[i];
                i++;
            }
            else{
                temp[n] = products[j];
                j++;
            }
            n++;
        }
        while (i <= mid){
            temp[n] = products[i];
            i++;
            n++;
        }
        while (j <= high){
            temp[n] = products[j];
            j++;
            n++;
        }

        for (int p = low; p <= high; p++){
            products[p] = temp[p-low];
        }
    }

    public static void mergeSortDescending(Product[] products, int low, int high){

        if (low == high){return;}

        int mid = (high + low) / 2;

        mergeSortDescending(products, low, mid);
        mergeSortDescending(products, mid + 1, high);

        mergeDescending(products, low, mid, high);
    }

    public static void mergeDescending(Product[] products, int low, int mid, int high){
        Product[] temp = new Product[high-low + 1];

        int i = low;
        int j = mid + 1;
        int n = 0;

        while (i <= mid && j <= high){
            double price1 = products[i].getPrice();
            double price2 = products[j].getPrice();

            if (price1 > price2){
                temp[n] = products[i];
                i++;
            }
            else{
                temp[n] = products[j];
                j++;
            }
            n++;
        }
        while (i <= mid){
            temp[n] = products[i];
            i++;
            n++;
        }
        while (j <= high){
            temp[n] = products[j];
            j++;
            n++;
        }

        for (int p = low; p <= high; p++){
            products[p] = temp[p-low];
        }
    }

    public static void sortQuantityWithSelectionAscending(Product[] products) {
        int n = products.length;
        int k;
        int smallestIntegerIndex;
        int temp;

        for (int i = 0; i < n - 1; i++) {
            smallestIntegerIndex = i;

            for (k = i + 1; k < n; k++) {
                if (products[k].getQuantity() < products[smallestIntegerIndex].getQuantity()) {
                    smallestIntegerIndex = k;
                }
            }

            temp = products[i].getQuantity();
            products[i].setQuantity(products[smallestIntegerIndex].getQuantity());
            products[smallestIntegerIndex].setQuantity(temp);
        }
    }

    public static void sortQuantityWithSelectionDescending(Product[] products) {
        int n = products.length;
        int k;
        int smallestIntegerIndex;
        int temp;

        for (int i = 0; i < n - 1; i++) {
            smallestIntegerIndex = i;

            for (k = i + 1; k < n; k++) {
                if (products[k].getQuantity() > products[smallestIntegerIndex].getQuantity()) {
                    smallestIntegerIndex = k;
                }
            }

            temp = products[i].getQuantity();
            products[i].setQuantity(products[smallestIntegerIndex].getQuantity());
            products[smallestIntegerIndex].setQuantity(temp);
        }
    }
}