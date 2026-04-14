package concept_2.array1;

public class array {
    public static void main(String[] args) {
        int num[]={3,7,2,5,4,6};
        num[1]=10; // Update the value in 1 place
        System.out.println(num[1]);

        int nums[] = new int[4]; // in this array have only 4 element
        nums[0] = 4;
        nums[1] = 9;
        nums[2] = 3;
        nums[3] = 1;

        // I want to print all the values without multipal statement
        for(int i =0; i<4;i++){
            System.out.println(nums[i]);
        }



     }
}


