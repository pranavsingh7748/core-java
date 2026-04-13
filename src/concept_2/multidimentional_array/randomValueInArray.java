package concept_2.multidimentional_array;

public class randomValueInArray {
    public static void main(String[] args) {
        int num[][]=new int[3][4];

        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                num[i][j]=(int)(Math.random()*10); // Math.random() always gives Double values so using type casting for make an integer

            }

        }
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
        // we use enhance for loop

        for(int n[]: num){
            for(int m: n){
                System.out.print(m +" ");
            }
            System.out.println();
        }

    }
}
