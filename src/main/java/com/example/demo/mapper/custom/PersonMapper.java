package com.example.demo.mapper.custom;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.example.demo.data.vo.v2.PersonVOV2;
import com.example.demo.model.Person;

@Service
public class PersonMapper {
	
	public PersonVOV2 convertEntityToVo(Person person) {
		PersonVOV2 vo = new PersonVOV2();
		vo.setId(person.getId());
		vo.setAddress(person.getAddress());
		vo.setBirthday(new Date());
		vo.setFirstName(person.getFirstName());
		vo.setLastName(person.getGender());
		return vo;
	}
	
	public Person convertVoToEntity(PersonVOV2 person) {
		Person entity = new Person();
		entity.setId(person.getId());
		entity.setAddress(person.getAddress());
		// vo.setBirthday(new Date());
		entity.setFirstName(person.getFirstName());
		entity.setLastName(person.getGender());
		return entity;
	}
}
