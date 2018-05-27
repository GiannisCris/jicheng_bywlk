package wlk.ar;
import java.util.*;
import wlk.*;
public class TestArrayList {
	public static void main(String[] args) {
		ArrayList<String> cityList=new ArrayList<>();
		cityList.add("渔沟");
		cityList.add("灵璧");
		cityList.add("宏泰");
		System.out.println("数组列表的大小: "+cityList.size());
		System.out.println("数组列内容： "+cityList.toString());
		System.out.println("是否包含灵璧： "+cityList.contains("灵璧"));
		System.out.println("灵璧在序列的第几号： "+cityList.indexOf("灵璧"));
		for(int i=cityList.size()-1;i>=0;i--) {
			System.out.println(cityList.get(i)+" ");
		}/*数组列放String对象*/
		ArrayList<CircleFromSimpleGeomertricObject> a=new ArrayList<>();
		a.add(new CircleFromSimpleGeomertricObject(3.0));
		a.add(new CircleFromSimpleGeomertricObject(5.0));
        System.out.println(a.get(0).toString()); 	
        System.out.println(a.get(1).toString()); 
		}/*数组列放Object对象*/
	}


