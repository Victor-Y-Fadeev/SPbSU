package sem2.hw6.task1;

/** Multiply operator class. */
public class Multiply extends Operator implements Operand {
    public Multiply() {
        operation = '*';
    }

    @Override
    public int calculate() {
        return left.calculate() * right.calculate();
    }
}