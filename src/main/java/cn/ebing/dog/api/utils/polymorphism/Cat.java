package cn.ebing.dog.api.utils.polymorphism;

class Cat extends Animal {
	@Override
	public void eat() {
		System.out.println("吃鱼");
	}

	public void work() {
		System.out.println("抓老鼠");
	}
}