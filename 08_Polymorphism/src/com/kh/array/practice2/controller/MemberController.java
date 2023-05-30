package com.kh.array.practice2.controller;

import com.kh.array.practice2.model.Member;

public class MemberController {

	private Member[] mArr = new Member[3];

	public int count = 0;

	public void intsertMember(Member m) {

		mArr[count++] = new Member(m.getId(), m.getName(), m.getPassword(), m.getEmail(), m.getGender(), m.getAge());

	}

	public boolean updateMember(String id, String name, String password, String email) { //매개변수로 id, name, password, email 입력받음

		int index = this.checkId(id);  			//checkId 에서 반환되는 값을 index에 대입
		if(index!=-1) {							//index가 -1이 아니라면(=mArr 배열에 입력받았던 id와 일치하는 값이 있다면, 중복되는 아이디가 있다면)
			mArr[index].setName(name);			//mArr 배열의 인덱스값 index에 name을 대입
			mArr[index].setPassword(password);	//mArr 배열의 인덱스값 index에 password을 대입
			mArr[index].setEmail(email);		//mArr 배열의 인덱스값 index에 email을 대입
			return true;						//true를 반환
			
		}
		
		return false; // index가 -1이라면(=mArr 배열에 입력받았던 id와 일치하는 값이 없다면, 중복되는 아이디가 없다면)
	}

	public int checkId(String id) {									//매개변수로 id 입력받음										
		for (int i = 0; i < mArr.length; i++) { 					//mArr 배열 크기 만큼 반복
			if (mArr[i]!=null && mArr[i].getId().equals(id)) {		//mArr 배열의 인덱스값 i에 있는 값과 id가 일치한다면 = 중복되는 아이디가 있다면
				return i;											//i를 반환
			}
		}

		return -1;													//아니라면 -1을 반환
	}

	public Member[] printAll() {
		return mArr;
	}

}
