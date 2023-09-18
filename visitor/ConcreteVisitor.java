package visitor;

public class ConcreteVisitor implements Visitor {
    @Override
    public void visit(ConcreteElementA elementA) {
        System.out.println("ConcreteElementA accepts");
    }

    @Override
    public void visit(ConcreteElementB elementB) {
        System.out.println("ConcreteElementB accepts");
    }
}
