package com.javaex.oop.summary;

public class SummaryApp {
	static KungfuSkill[] dojang;
	public static void main(String[] args) {
		Human h1 = new Human("홍길동", 30);
		Human h2 = new TheOne("네오", 50);
		Panda p1 = new Panda("핑", 30);
		Panda p2 = new KungfuPanda("퐁", 15);
		
		fight(h1);
		fight(h2);
		fight(p1);
		fight(p2);
		
		fly(h1);
		fly(h2);
		fly(p1);
		fly(p2);
		
		dojang = new KungfuSkill[] {
				(KungfuSkill)h2,
				(KungfuSkill)p2
		};
		
		for (KungfuSkill member: dojang)
		{
			member.kungfu();
		}
	}

	public static void fight(Animal actor) {
		if (actor instanceof KungfuSkill) {
			((KungfuSkill)actor).kungfu();
		}
		else {
			System.out.println(actor.
					name + ": 쿵푸 못해요~");
		}
	}
	
	public static void fly(Animal actor) {
		if (actor instanceof Flyable) {
			((Flyable)actor).fly();
		}
		else {
			System.out.println(actor.
					name + ": 날 수 없어~");
		}
	}
}
