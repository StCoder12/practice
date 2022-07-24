import java.util.Scanner;

class Main{
    public static void main(String[] args) {
      Integer input = 0;
      do{
      Scanner sc = new Scanner(System.in);
      input = sc.nextInt();
      }while(input <1 || input >8);
      for(int i = 1;i <= input; i++){
          for(int k = input-1; k>=i; k--){
                  System.out.print(" ");      
            }  
          for(int j = 1; j<= (2*i)-1; j++){
              System.out.print("#");
            }
          for(int l = input-1; l>=i; l--){
                  System.out.print(" ");      
            }  
          System.out.print("\n");
      }
    System.out.println("Hello world!");
  }
}
