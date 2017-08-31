package designPattern_singleton;
/**  
 * ������
 * ����ģʽ���ŷ���
 * �̰߳�ȫ  ����Ч�ʸ�  
 *  
 */  
public class SingletonTest { 

    // ����һ��˽�й��췽��
    private SingletonTest() { 
     
    }   
    //����һ����̬˽�б���(����ʼ������ʹ��final�ؼ��֣�ʹ��volatile��֤�˶��̷߳���ʱinstance�����Ŀɼ��ԣ�������instance��ʼ��ʱ�����������Ի�û��ֵ��ʱ���������̵߳���)
    private static volatile SingletonTest instance;  

    //����һ�����еľ�̬���������ظ�����ʵ��
    public static SingletonTest getIstance() { 
        // ����ʵ����ʱ����жϣ���ʹ��ͬ������飬instance������nullʱ��ֱ�ӷ��ض����������Ч�ʣ�
        if (instance == null) {
            //ͬ������飨����δ��ʼ��ʱ��ʹ��ͬ������飬��֤���̷߳���ʱ�����ڵ�һ�δ����󣬲����ظ���������
            synchronized (SingletonTest.class) {
                //δ��ʼ�������ʼinstance����
                if (instance == null) {
                    instance = new SingletonTest();   
                }   
            }   
        }   
        return instance;   
    }   
}