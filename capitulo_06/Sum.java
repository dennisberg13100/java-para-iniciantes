// soma de todos o argumentos passados

class Sum {
    static int sum (int ...nums) {
        int result = 0;
        for (int num : nums)
            result += num;
        return result;
    }


    public static void main(String[] args) {
        System.out.println(sum(1));
        System.out.println(sum(1, 2));
        System.out.println(sum(1, 2, 3));
        System.out.println(sum(1, 2, 3, 4));
    }
}