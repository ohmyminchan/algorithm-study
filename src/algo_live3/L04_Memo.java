package algo_live3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class L04_Memo {
    static int fiboCnt;
    static int fiboMemoCnt;

    static long fibo(int n) {
        fiboCnt++;
        if (n <= 1) {
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }

    @Test
    public void fiboTest() {
        assertEquals(fibo(6), 8);
    }

    static long fiboMemo(int n, long[] memo) {
        fiboMemoCnt++;
        if (n <= 1) {
            return n;
        } else if (memo[n] > 0) {
            return memo[n];
        }
        return memo[n] = fiboMemo(n - 1, memo) + fiboMemo(n - 2, memo);
    }

    @Test
    public void fiboMemoTest() {
        int n = 30;
        assertEquals(fibo(n), fiboMemo(n, new long[n + 1]));
        System.out.printf("일반 버전:  %d, 메모 버전: %d%n", fiboCnt, fiboMemoCnt);
    }

    static int factCnt;
    static int factMemoCnt;

    static long fact(int n) {
        factCnt++;
        if (n == 1) {
            return 1;
        }
        return fact(n - 1) * n;
    }

    static long factMemo(int n, long[] memo) {
        factMemoCnt++;
        if (n == 1) {
            return 1;
        } else if (memo[n] > 0) {
            return memo[n];
        }
        return memo[n] = factMemo(n - 1, memo) * n;
    }

    @Test
    public void factTest() {
        int n = 30;
        assertEquals(fact(n), factMemo(n, new long[n + 1]));
        System.out.printf("일반 버전: %d, 메모 버전: %d%n", factCnt, factMemoCnt);
    }
}
