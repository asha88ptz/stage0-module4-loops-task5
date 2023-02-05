package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= length; j++) {
                if (i == 1 || i == height || j == 1 || j == length) {
                    sb.append("8");
                } else sb.append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb.toString());
    }
}
