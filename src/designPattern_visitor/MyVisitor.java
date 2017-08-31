package designPattern_visitor;

public class MyVisitor implements Visitor{
	public void visit(Subject subject) {
		visitorFuc(subject);
		System.out.println(subject.getSubject());
	}
	private void visitorFuc(Subject subject) {
		System.out.println("This is addition function of visitor ----" + subject);
	}
}
