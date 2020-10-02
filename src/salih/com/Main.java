
package salih.com;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SaleItem saleItem = new SaleItem();

        System.out.println("-----------PRODUCT INFORMATION-----------");

        System.out.print("enter the product name : ");
        saleItem.setName(scanner.nextLine());

        System.out.print("enter the unit purchase price(TL) : ");
        saleItem.setUnitPrice(scanner.nextDouble());

        System.out.print("enter the amount(if product is numerable, enter the number ) : ");
        saleItem.setAmount(scanner.nextDouble());

        System.out.print("----------PRODUCT COSTS----------");

        System.out.print("enter the workmanship(TL) and total packing coast(TL) : ");
        saleItem.productCost(scanner.nextDouble(), scanner.nextDouble());

        System.out.print("enter the oil(litre) : ");
        saleItem.logistics(scanner.nextDouble());

        System.out.println("----------EXPENSES----------");

        System.out.print("enter the rent(TL),electric(TL),gas(TL),water(TL) : ");
        saleItem.overheads(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());

        System.out.print("products sale Price :  " + saleItem.salePrice());

        System.out.println("total expences : " + saleItem.totalOverheads);


    }
}
