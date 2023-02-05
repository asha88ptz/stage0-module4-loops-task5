package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sideLength; i++) {
            for (int j = 0; j < sideLength; j++) {
                if (j == 0 || i == 0 || i == sideLength - 1 || j == sideLength - 1) {
                    sb.append("8");
                } else {
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }
        System.out.print(sb.toString());
    }
}
