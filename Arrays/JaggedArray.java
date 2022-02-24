class JaggedArray {
    public static void main(String[] args) {
        int nums[][] = new int[3][];
        nums[0] = new int[2];
        nums[0][0] = 0;
        nums[0][1] = 1;
        nums[1] = new int[0];
        nums[2] = new int[3];
        nums[2][0] = 2;
        nums[2][1] = 3;
        nums[2][2] = 4;
        for(int i=0;i<nums.length;i++) {
            System.out.print(nums[i].length + " ");
            for(int j=0;j<nums[i].length;j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}