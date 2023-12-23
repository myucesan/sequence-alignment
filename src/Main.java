public class Main {
    public static int solve(String firstString, String secondString) {
        int xLength = firstString.length();
        int yLength = secondString.length();
        int[][] mem = new int[xLength + 1][yLength + 1];
        final int gapMismatchCost = 1;
//        if (xLength == 0) return yLength * gapMismatchCost;
//        if (yLength == 0) return xLength * gapMismatchCost;

        // Initialize base cases
        for (int i = 0; i <= xLength; i++) {
            mem[i][0] = i * gapMismatchCost;
        }
        for (int j = 0; j <= yLength; j++) {
            mem[0][j] = j * gapMismatchCost;
        }

        for (int i = 1; i <= xLength; i++) {
            for (int j = 1; j <= yLength; j++) {
                 if (firstString.charAt(i - 1) != secondString.charAt(j - 1)) {
                     mem[i][j] = Math.min(gapMismatchCost + mem[i-1][j-1], Math.min(gapMismatchCost + mem[i-1][j], gapMismatchCost + mem[i][j-1]));
;                 } else {
                     mem[i][j] = Math.min(mem[i-1][j-1], Math.min(gapMismatchCost + mem[i-1][j], gapMismatchCost + mem[i][j-1]));
                 }
            }
        }
        return mem[xLength][yLength];
    }
}