// Даны два Deque, представляющие два целых числа. 
// Цифры хранятся в обратном порядке и каждый из их узлов содержит одну цифру.
// 1) Умножьте два числа и верните произведение в виде связанного списка.
// 2) Сложите два числа и верните сумму в виде связанного списка.
// Одно или два числа могут быть отрицательными.
// Даны два Deque, цифры в обратном порядке.
// [3,2,1] - пример Deque
// [5,4,3]- пример второго Deque
// 1) 123 * 345 = 42 435
// Ответ всегда - связный список, в обычном порядке
// [4,2,4,3,5] - пример ответа
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;
/**
 * homeworkSem4
 */
public class homeworkSem4 {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        Deque<Integer> deque2 = new ArrayDeque<>();
        deque.add(3);deque.add(2);deque.add(1);
        deque2.add(5);deque2.add(4);deque2.add(3);
        Final(Resault(0, deque, deque2));
    }
    static int DeqInt(int n, Deque<Integer> x){
        String res = x.pollLast()+("")+x.pollLast()+("")+x.poll();
        n = Integer.parseInt(res);        
        return n;
    }
    static int Resault(int n, Deque<Integer> x, Deque<Integer> y){
        System.out.println("1 - сложение; 2 - произведение: ");
        Scanner sc = new Scanner(System.in);
        int op = sc.nextInt();
        if (op == 1){
            int summa = DeqInt(0, x) + DeqInt(0, y);
            return summa;
        }
        else if(op == 2){
            int mult = DeqInt(0, x) * DeqInt(0, y);
            return mult;
        }
        else{
            return Resault(n, x, y);
        }
        
    }
    static void Final(int Resault){
        String number = Integer.toString(Resault);
        char[] ch = number.toCharArray();
        int[] intarr = new int[ch.length];
        for (int i = 0; i < ch.length; i++) {
            intarr[i] = Character.getNumericValue(ch[i]);
        }
        System.out.println(Arrays.toString(intarr));
    }
}