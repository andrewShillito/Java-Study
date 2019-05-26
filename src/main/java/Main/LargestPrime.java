package Main;

import java.util.ArrayList;

public class LargestPrime {

    public static int getLargestPrime(int x) {
        if (x <= 0) {
            return -1;
        } else if (x == 1) {
            return -1;
        } else if (x == 2) {
            return 2;
        } else {

            // amit khandelwal implementation of sieve of eratosthenes
            // modified for this purpose
            boolean[] primes = new boolean[x+1];
            ArrayList<Integer> ans = new ArrayList<Integer>();
            
            for (int i = 0; i <= x; i++) {
                primes[i] = true;
            }

            for (int p = 2; p <= x; p++) {

                if (primes[p]) { // if true
                    if ( x%p == 0) {
                        ans.add(p);
                    }
                    for (int i = p*p; i <= x; i += p) {
                        primes[i] = false;
                    }
                }
            }
            if (ans.size() > 0) {
                return ans.get(ans.size()-1);
            } else {
                return -1;
            }
        }
    }
}