package com.kh.practice2;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Application {

	Set<Integer> lotto = new TreeSet<>();
	Set<Integer> myLotto = new TreeSet<>();


	public static void main(String[] args) {

		Application app = new Application();

		app.method();

	}

	public Set lottoNum() {

		boolean check = true;
		while (check) {

			if (lotto.size() < 6) {

				lotto.add((int) (Math.random() * 45) + 1);

			} else {
				check = false;
			}
		}
		return lotto;
	}

	public Set auto() {

		boolean check = true;
		while (check) {

			if (myLotto.size() < 6) {

				myLotto.add((int) (Math.random() * 45) + 1);

			} else {
				check = false;
			}
		}
		return myLotto;
	}

	public void method() {

		boolean check = true;

//		System.out.println("로또 번호 : " + this.lottoNum());
//		System.out.println("내 번호 : " + this.auto());
		
		int count = 0;
		while (check) {
//			TreeSet<Integer> myLotto = (TreeSet<Integer>) this.auto();
			
			System.out.println("로또 번호 : " + this.lottoNum());
			System.out.println("내 번호 : " + this.auto());

			count++;
			if (myLotto.equals(this.lottoNum())) {
				System.out.println("횟수 : " + count);
				check = false;
			} else {
//				this.auto();
//				System.out.println("내 번호 : " + this.auto());				
			}
			myLotto.clear();

		}

	}
}
