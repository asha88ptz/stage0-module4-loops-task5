package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        assert sideLength % 2 == 1 || sideLength == 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sideLength; i++) {
            for (int j = 0; j < sideLength; j++) {
                if (i == sideLength / 2 || j == sideLength / 2) {
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
