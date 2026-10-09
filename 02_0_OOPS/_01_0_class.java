
class Calculator{
    public int add(int n, int k){
              return n + k;
    }
}
class _01_0_class{
    public static void main(String[] args) {
       int num = 1;
       int kum = 2;
       Calculator calc = new Calculator();
       int res = calc.add(num, kum);
       System.out.println(res);
    }
}