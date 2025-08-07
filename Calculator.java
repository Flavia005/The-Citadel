import java.util.*;
public static AshmitaP1{
  public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter first no.:");
          double a = sc.nextDouble();
          System.out.println("Enter operator(+,-,*,/):");
          char op = sc.next().CharAt(0);
          System.out.println("Enter second no.:");
          double b = sc.nextDouble();
          double result;
          switch(op){
                          case'+': result = a+b;
                          break;
                          case'-': result = a-b;
                          break;
                          case'*': result = a*b;
                          break;
                          case'/': result = (b!=0)?a/b: Double.NaN;
                          break;
                  default: System.out.println("Invalid Operator");
                          return}
  }
        System.out.println("Result:"+result);
        sc.close();
}
}
