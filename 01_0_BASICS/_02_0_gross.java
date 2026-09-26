import java.util.Scanner;
class _02_0_gross {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double ba, da, sa, gross = 0;
        System.out.print("Enter Basic Salary: ");
        ba = sc.nextDouble();
        if(ba <= 10000){
            da = ba * 15 / 100;
            sa = ba * 5 / 100;
            gross = ba + da + sa;
        }if(ba > 10000 && ba <= 20000){
            da = ba * 20 / 100;
            sa = ba * 8 / 100;
            gross = ba + da + sa;
        }if(ba > 20000 && ba <= 30000){
            da = ba * 25 / 100;
            sa = ba * 10 / 100;
            gross = ba + da + sa;
        }if(ba > 30000){
            da = ba * 30 / 100;
            sa = ba * 12 / 100;
            gross = ba + da + sa;
        }
        System.out.println("Gross Salary = " + gross);
        sc.close();
    }
}
