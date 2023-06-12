package com.kh.practice.controller;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.kh.object.model.Person;
import com.kh.practice.model.Book;

public class BookController {

	// src/books.obj 파일에 저장
	public void fileSave(Book book) {

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/book.obj", true))) {

			oos.writeObject(book);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	// src/books.obj 파일에서 데이터 가져오기
	public List<Book> fileRead() {
		List<Book> list = new ArrayList<>();

		FileInputStream fis = null;

		ObjectInputStream ois = null;

		try {

			fis = new FileInputStream("src/book.obj");

			while (true) {

				ois = new ObjectInputStream(fis);
				list.add((Book) ois.readObject());
			}
		} catch (EOFException e) {
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return list;

	}

}
