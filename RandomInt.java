public class RandomInt {
    public static void main(String[] args) {

        int[] values = { 32, 54, 67, 29, 35, 80, 115, 44, 100, 65 };
        System.out.print("Even Index are:");
        for(int i=0;i<values.length;i++){
            if(i%2==0){

                System.out.print(values[i] );
                System.out.print(" ");
            }

        }
        System.out.println();
        System.out.print("Even number are:");
        for(int i=0;i<values.length;i++){
            if(values[i]%2==0){

                System.out.print(values[i] );
                System.out.print(" ");
            }

        }
        System.out.println();
        System.out.print("Reverse element are:");
        for(int i=values.length-1;i>=0;i--){

                System.out.print(values[i] );
                System.out.print(" ");


        }
        System.out.println();
        System.out.print("First and Last element are:");

        System.out.print(values[0]);
        System.out.print(" ");
        System.out.print(values[values.length-1]);


    }
}
