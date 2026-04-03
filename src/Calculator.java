import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("Unesi prvi broj: ");
        double broj1 = input.nextDouble();

        System.out.print("Odaberi operaciju: ");
        char operacija = input.next().charAt(0);

        System.out.print("Unesi drugi broj: ");
        double broj2 = input.nextDouble();

        double rezultat = 0;

       switch (operacija) {
           case '+' :
               rezultat = broj1 + broj2;
               break;
           case '-':
               rezultat = broj1 - broj2;
               break;
           case '*':
               rezultat = broj1 * broj2;
               break;
           case '/':
               if(broj2 !=0){
                   rezultat = broj1 / broj2;

               }else{
                   System.out.println("Ne može dijeljenje sa nulom!");
                   return;
               }
               break;
           default:
               System.out.println("Nepoznata operacija");
               return;
       }
       System.out.println("Rezultat je: " + rezultat);
    }
}