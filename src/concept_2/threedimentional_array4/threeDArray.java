package concept_2.threedimentional_array4;

public class threeDArray {
    public static void main(String[] args) {

        int num[][][] = new int[2][3][4];

        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<4;k++){
                    num[i][j][k] = (int)(Math.random()*10);
                }
            }
        }

        for(int n[][]:num){
            for(int o[]:n){
                for(int m:o){
                    System.out.print(m + " ");
                }
                System.out.println();
            }

        }

    }
}
