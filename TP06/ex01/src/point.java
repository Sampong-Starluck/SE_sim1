package ex01.src;

public class point {
    int x, y;
    
    public point() {

    }

    public point(int $x) {
        $x = x;
        y = 0;
    }

    public point(int $x, int $y) {
        $x = x;
        $y = y;
    }

    public Double distance(point $p) {
        Double distance;
        distance = Math.sqrt(Math.pow(($p.x - x), 2) + Math.pow(($p.y - y), 2));
        return distance;
    }
}
