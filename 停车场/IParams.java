package xiangmuguanli;

import java.util.ArrayList;

public interface IParams {
	 int big = 0;
	    int medium=0;
	    int small=0;
	    ArrayList<Integer>PlanParking=new ArrayList<>();
	    public void set(int big,int medium,int small);
	    public int getBig(); // ��ȡ��λ
	    public int getMedium();// ��ȡ�г�λ
	    public int getSmall();// ��ȡС��λ
	    public ArrayList<Integer> getPlanParking();
	    // ��ȡͣ�����У����� [1 2 2 3] ��ʾ ����ͣһ���󳵣��г����г���С��
	    public void add(int i);
}
