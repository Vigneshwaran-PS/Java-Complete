package Control_Statement;

public class for_Loop_with_Label {

    public static void main(String[] args) {

        for(int i=1;i<=5;i++){
            for (int j = 1; j <= 5; j++) {
                if(i==2 && j==2){
                    break;
                }
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\n\n-----------------------------------------------------------");


        outer:
        for(int i=1;i<=5;i++){
            inner:
            for (int j = 1; j <= 5; j++) {
                if(i==2 && j==2){
                    break outer;
                }
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\n\n-----------------------------------------------------------");


        outer:
        for(int i=1;i<=5;i++){
            inner:
            for (int j = 1; j <= 5; j++) {
                if(i==2 && j==2){
                    break inner;
                }
                System.out.print("* ");
            }
            System.out.println();
        }


        System.out.println("\n\n-----------------------------------------------------------");


        for(int i=1;i<=5;i++){
            for (int j = 1; j <= 5; j++) {
                if(i==2 && j==2){
                    continue;
                }
                System.out.print("* ");
            }
            System.out.println();
        }


        System.out.println("\n\n-----------------------------------------------------------");


        outer:
        for(int i=1;i<=5;i++){
            inner:
            for (int j = 1; j <= 5; j++) {
                if(i==2 && j==2){
                    continue outer;
                }
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\n\n-----------------------------------------------------------");


        outer:
        for(int i=1;i<=5;i++){
            inner:
            for (int j = 1; j <= 5; j++) {
                if(i==2 && j==2){
                    continue inner;
                }
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
