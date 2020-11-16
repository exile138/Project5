package Tasks_From_Ruslan_Samatov;

public class Ruslan_task {
    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 5};

        int xz = arr[0];
        int res = 0;
        for (int i = 1; i < arr.length; i++) {

            if ((xz + 1) != arr[i]) {
                res = arr[i];
                break;
            }
        }


        System.out.println(++res);
    }
}

