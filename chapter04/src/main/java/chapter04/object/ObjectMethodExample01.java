package chapter04.object;

public class ObjectMethodExample01 {
	public static void main(String[] args) {
		Goods goods = new Goods("d",2,2,2);
		Goods gods = new Goods();
		
		Class klass = goods.getClass(); //reflection
		System.out.println(klass.getName());
		
		System.out.println(goods.hashCode()); // address 기반의 해싱값
		System.out.println(gods.hashCode()); // address x, reference 값 x
		
		System.out.println(goods.toString()); // getClass().getName() + "@" + hashCode()
		System.out.println(gods);
	}
}
