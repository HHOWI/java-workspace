package com.kh.list;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

public class B_Other {
	public static void main(String[] args) {
		B_Other b = new B_Other();
//		b.method1();
//		b.method2();
		b.method3();
	}
	
	// Vector
	// - 동기화된(synchronized) 메서드로 구성
	
	public void method1() {
		Vector v = new Vector();
		v.add(0);
		v.add(1);
		
		v.trimToSize();
		
		v.add(3);
		v.add(4);
		v.ensureCapacity(5);	// capacity
		v.setSize(10);
		v.clear();
		v.trimToSize();
		
		System.out.println(v);
		System.out.println("size : " + v.size());
		System.out.println("capacity : " + v.capacity());
	}
	// 스택(Stack) : 마지막에 저장한 것을 제일 먼저 꺼내는 LIFO(Last In First Out)구조
	public void method2() {
		
		Stack s = new Stack();
		
		s.push(0);
		s.push(1);
		s.push(2);
		s.push(3);
		s.pop();
		s.push(4);
		s.pop();
		s.push(5);
		s.push(6);
		s.push(7);
		s.pop();
		
		System.out.println(s);
		
	}
	// 큐(Queue) : 처음에 저장한 것을 제일 먼저 꺼내는 FIFO(Fist In First Out) 구조. 선입선출
	public void method3() {
		Queue q = new LinkedList();
		
		q.offer(0);
		q.offer(1);
		q.offer(2);
		q.offer(3);
		q.poll();
		q.add(4);
		q.remove();
		q.add(5);
		q.add(6);
		q.add(7);
		q.remove();
		
		System.out.println(q);
	}
}
