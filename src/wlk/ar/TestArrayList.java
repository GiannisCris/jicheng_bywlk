package wlk.ar;
import java.util.*;
import wlk.*;
public class TestArrayList {
	public static void main(String[] args) {
		ArrayList<String> cityList=new ArrayList<>();
		cityList.add("�湵");
		cityList.add("���");
		cityList.add("��̩");
		System.out.println("�����б�Ĵ�С: "+cityList.size());
		System.out.println("���������ݣ� "+cityList.toString());
		System.out.println("�Ƿ������赣� "+cityList.contains("���"));
		System.out.println("��������еĵڼ��ţ� "+cityList.indexOf("���"));
		for(int i=cityList.size()-1;i>=0;i--) {
			System.out.println(cityList.get(i)+" ");
		}/*�����з�String����*/
		ArrayList<CircleFromSimpleGeomertricObject> a=new ArrayList<>();
		a.add(new CircleFromSimpleGeomertricObject(3.0));
		a.add(new CircleFromSimpleGeomertricObject(5.0));
        System.out.println(a.get(0).toString()); 	
        System.out.println(a.get(1).toString()); 
		}/*�����з�Object����*/
	}


