package fightman;

import java.util.Scanner;

public class FightMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean turn = Math.random() < 0.5;
		
		User user1 = new User();
		User user2 = new User();
		
		
		// 게임방법 안내
		System.out.println("FIGHT MAN _ @Made Heera");
		System.out.println("게임 방법 : ");
		System.out.println(" - 게임에 필요한 유저는 2명이며, 각 피를 200씩 나눠 갖는다.");
		System.out.println(" - 데미지는 1~100사이의 공격력을 가지며, 랜덤으로 가지게된다.");
		System.out.println(" - 먼저 피를 0으로 만드는 사람이 이긴다.");
		System.out.println("========<게임시작>=======");
		System.out.println("게임을 시작하려면 <Enter>를 누르세요.");
		sc.nextLine();
		
		
		// 닉네임 정하기
		System.out.print("첫번째 용사님의 닉네임을 입력하세요 >>> ");
		user1.setName(sc.next());
		System.out.println(user1.getName() + "용사님! FightMan에 오신것을 환영합니다!!");
		System.out.println();
		System.out.print("두번째 용사님의 닉네임을 입력하세요 >>> ");
		user2.setName(sc.next());
		System.out.println(user2.getName() + "용사님! FightMan에 오신것을 환영합니다!!");
		
		// 순서 정하기
		System.out.println();
		System.out.println("그럼 먼저, 순서를 정하겠습니다. 준비가되면 <Enter>를 눌러주세요.");
		sc.nextLine();
		sc.nextLine();
		if(turn == true) {
			System.out.println(user1.getName() + "님이 먼저 공격하겠습니다.");
		} else {
			System.out.println(user2.getName() + "님이 먼저 공격하겠습니다.");
		}
		
		System.out.println("데미지는 1~100 중 랜덤입니다. 준비가되면 <Enter>를 눌러주세요.");
		
		// 공격하기
		
		while(user1.getHp() <= 0 || user2.getHp() <= 0) {
			
			user1.setPower((int) (Math.random() * 100) + 1);
			user2.setPower((int) (Math.random() * 100) + 1);
			
			if(turn == true) {
				user2.setHp(user2.getHp() - user1.getPower());
				System.out.println(user1.getName() + "님이 " + user2.getName() + "님을 " + user1.getPower() + "데미지로 공격했습니다.");
				System.out.println(user2.getName() + "님의 남은 피 : " + user2.getHp());
				turn = false;
			} else {
				user1.setHp(user1.getHp() - user2.getPower());
				System.out.println(user2.getName() + "님이 " + user1.getName() + "님을 " + user2.getPower() + "데미지로 공격했습니다.");
				System.out.println(user1.getName() + "님의 남은 피 : " + user1.getHp());
				turn = true;
			}
		}
		
		
		
	}

}
