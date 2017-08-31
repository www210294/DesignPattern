package designPattern_facade;

/**
 * @author www
 * Computer = CPU + Disk + Memory,Ϊ��ʹ���������Ϲ���������Computer����Э������
 */
public class Computer { 
	private CPU cpu;
	private Disk disk;
	private Memory memory;
	public Computer() { // !!!!�׶�ʧ
		super();
		cpu = new CPU();
		disk = new Disk();
		memory = new Memory();
	}
	public void startup() {
		System.out.println("Computer is starting...");
		cpu.startup();
		memory.startup();
		disk.startup();
		System.out.println("you can work on it!");
	}
	public void shutdown() {
		System.out.println("Computer is shutdowning...");
		cpu.shutdown();
		memory.shutdown();
		disk.shutdown();
		System.out.println("bye!");
	}
	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.startup();
		System.out.println("I'm working with the computer.");
		computer.shutdown();
	}
}
