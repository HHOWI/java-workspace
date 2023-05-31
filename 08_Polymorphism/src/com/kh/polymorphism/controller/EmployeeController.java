package com.kh.polymorphism.controller;

import com.kh.polymorphism.model.child.Engineer;
import com.kh.polymorphism.model.parent.Employee;


public class EmployeeController {

	
	// Employee 객체배열과 이름을 가지고 와서 일치한 사람 반환
	public Employee findEmployeeByName(Employee[] ea, String name) {
				
		for(int i = 0; i<ea.length; i++) {
			if (ea[i]!=null && ea[i].getName().equals(name)) {		
				return ea[i];
			}
			
		}			
		
		return null;
	}
	
	// 연봉 계선 : engineer인 경우 보너스가 있음!
	public int getAnnualSalary(Employee e) {
		
		// instanceof 연산자 : 현재 참조변수가 실제로 어떤 클래스 형의 객체의 주소를 참조하고 있는지 확인할 때 사용
		if(e instanceof Engineer) {
			Engineer eg = (Engineer) e; // 부모 -> 자식 : 강제 형 변환!
			
			return e.getSalary() * 12 + eg.getBonus(); 
			
		}
		
		return e.getSalary() * 12;
		
		
		
	}
	
	// 전체 연봉 총 합계
	public int getTotalCoast(Employee[] ea) {
		
		int total = 0;
		
//		for(int i = 0; i < ea.length; i++ ) // == for(Employee i : ea) {
//			
//			total += this.getAnnualSalary(ea[i]);
//		}
		
		for(Employee i : ea) {
			total += this.getAnnualSalary(i);
		}
		
		return total;
	}
	
}
