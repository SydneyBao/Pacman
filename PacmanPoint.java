/**
 * This program adds an integer coordinate system and displays mentods that are overridden from Object
 */

public class PacmanPoint {
    private int x;
    private int y;

    // Constructor for the PacmanPoint
    public PacmanPoint(int ptX, int ptY) {
        x = ptX;
        y = ptY;
    }

    // Overriding the Object.equals method, so we must downcast
    // to a PacmanPoint and then compare the two points
    public boolean equals(Object obj) {
        PacmanPoint pt = (PacmanPoint) obj;
        return ((x == pt.getX()) && (y == pt.getY()));
    }

    // Accessor method for x
    public int getX() {
        return x;
    }

    // Accessor method for y
    public int getY() {
        return y;
    }

    // Moves the point by a certain amount
    public void moveBy(int dx, int dy) {
        x += dx;
        y += dy;
    }

    // Overrides the Object.toString method to provide a useful string
    // output of the PacmanPoint
    public String toString() {
        return ("(" + x + ", " + y + ")");
    }

    //A simple tester main for the PacmanPoint class
    public static void main(String[] args) {
        PacmanPoint one = new PacmanPoint(10, 10);
        PacmanPoint two = new PacmanPoint(0, 10);
        System.out.println(one);
        System.out.println(two);
        two.moveBy(10, 0);

        if (one.equals(two)) {
            System.out.println("They represent the same point!");
        }
    }
}