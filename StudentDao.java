package com.shubham.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.shubham.model.Stuent;

@Component
public class StudentDao {
	static List<Stuent> list =null;
	static {		
		list = new ArrayList<Stuent>(); 
		list.add(new Stuent(1, "Anil", "Mang"));
		list.add(new Stuent(2, "Aji", "Mang2"));
		list.add(new Stuent(3, "Sanal", "Pralin"));
		list.add(new Stuent(4, "Nibin", "Raj"));
	}
	public List<Stuent> getUsers(){		
		
		return StudentDao.list;
	}	
	public ResponseEntity<?> insertUser(Stuent st){
		list.add(st);		
		return new ResponseEntity<Stuent>(st, HttpStatus.OK);
	}
	public ResponseEntity<?> getUser(int id){
		for (Stuent st : list) {
			if(st.getUid() == id) {
				return new ResponseEntity<Stuent>(st, HttpStatus.OK);
			}
		}
		return null;
	}
	public int deleteUser(int id){
		for (Stuent st : list) {
			if(st.getUid() == id) {
				list.remove(st);
				return id;
			}
		}
		return 0;
	}
}


