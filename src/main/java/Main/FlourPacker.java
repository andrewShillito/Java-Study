package Main;

public class FlourPacker {


    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        } else if (goal == 0) {
            return true;
        }
        if ( bigCount == 0) {
            return smallCount >= goal;
        } else {
            for (int i = 1; i<= bigCount; i++) {
                int bigWeight = 5*i;
                if (bigWeight == goal) {
                    return true;
                } else if ((goal - bigWeight) <= smallCount) {
                    return true;
                } else if (bigWeight > goal) {
                    return false;
                }
            }
        }
        return false;
    }
}
