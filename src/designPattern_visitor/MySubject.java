package designPattern_visitor;

public class MySubject implements Subject{
	public void accept(Visitor visitor) {
		visitor.visit(this); //!!!!!
	}
	public String getSubject() { //subject ҵ���߼����ܸı�
		return "Love";
	}
	public static void main(String[] args) {
		Visitor visitor = new MyVisitor();
		Subject subject = new MySubject();
		subject.accept(visitor);
	}
}
