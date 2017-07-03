package ajn.zhihu.zhuanlan.chapter11;

public class Demo03 {
	public static void main(String[] args) {
		new iOut(new iOut(){

			@Override
			public void print() {
				System.out.println("我是一个匿名内部类。");
			}
		});
	}
}

class iOut{
	public iOut(){
		
	}
	
	public iOut(iOut i){
		i.print();
	}
	
	public void print(){
		System.out.println("我是一个类。");
	}
}