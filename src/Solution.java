import java.util.HashSet;
import java.util.Scanner;

/**
 *
 *  「快乐数」定义为：对于一个正整数，
 *  每一次将该数替换为它每个位置上的数字的平方和，
 *  然后重复这个过程直到这个数变为 1，
 *  也可能是 无限循环 但始终变不到 1。
 *  如果 可以变为  1，那么这个数就是快乐数。
 *
 *  如果 n 是快乐数就返回 True ；不是，则返回 False 。
 *
 *  输入：19
 *  输出：true
 *  解释：
 *  1^2 + 9^2 = 82
 *  8^2 + 2^2 = 68
 *  6^2 + 8^2 = 100
 *  1^2 + 0^2 + 0^2 = 1
 *
 *
 *
 * @Author panyangyi
 * @create 2020/4/30 23:00
 */
public class Solution {


    private static int getNext(int n){

        int sum = 0;

        while (n>0){

            int i = n % 10;

            sum += i*i;

            n = n/10;
        }

        return sum;

    }

    public static boolean isHappy(int n){

        HashSet<Integer> set = new HashSet<>();

        while (n != 1 && ! set.contains(n)){
            set.add(n);
            n = getNext(n);
        }

        return n == 1;

    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(isHappy(n));


//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("请输入一个正整数： ");
//
//        int num = scanner.nextInt();
//
//        int numOption = num;
//
//        int sum = 0;
//
//        while (true){
//
//            char[] chars = String.valueOf(numOption).toCharArray();
//
//            for (char c: chars) {
//
//                //判断是否是数字
//                if (Character.isDigit(c)){
//                    int n = Integer.parseInt(String.valueOf(c));
//                    sum = sum + n*n;
//                } else {
//                    System.out.println("输入的数据有误");
//                }
//
//            }
//
//            if (sum == 1){
//                System.out.println(true);
//                return;
//            }
//
//            numOption = sum;
//            sum = 0;
//
//
//        }

    }

}
