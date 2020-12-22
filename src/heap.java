public class heap {
    private int[] nums;
    public heap(int[] num){
        nums = num;
    }
    private void heapfy(int i, int len){
        for(int k = 2 * i + 1; k < len; k = 2 *k + 1){
            if(k + 1 < len && nums[k + 1] > nums[k]){
                k = k + 1;
            }
            if(nums[i] < nums[k]) {
                swap(i, k);
                i = k;
            }
            else break;


        }

    }
    private void swap(int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;

    }
    public void heapSort(){
        if(nums.length == 0 || nums == null){return;}
        int len = nums.length;
        for(int i = (len - 1) / 2; i >= 0; i--){
            heapfy(i, len);
        }
        for(int i = len - 1; i >= 0; i--){
            swap(i, 0);
            heapfy(0, i);
        }
    }

    public static void main(String[] args) {
        int[] num = new int[]{3,5,1,7,6,99,1,4,55,34,88,22,66,12,45,33};
        heap a = new heap(num);
        a.heapSort();
        for(int i : num)
            System.out.println(i);
    }

}
