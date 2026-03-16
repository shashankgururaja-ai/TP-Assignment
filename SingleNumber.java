class SingleNumber {
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int num : nums)
            result ^= num;
        return result;
    }
    public static void main(String[] args) {
        SingleNumber sn=new SingleNumber();
        int[] nums = {2,2,1,3,7,7};
        System.out.println(sn.singleNumber(nums));
    }
}