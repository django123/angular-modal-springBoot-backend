package com.angularmodalspringBoot.django.service;

import java.util.List;

import org.hibernate.sql.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.angularmodalspringBoot.django.dao.FriendDao;
import com.angularmodalspringBoot.django.entities.Friend;

@Service
public class FriendService {
	
	@Autowired
	private FriendDao friendDao;
	
	public List<Friend>getFriends() {
		
		return friendDao.findAll();
		
	}
	
	public void addFriend(Friend friend) {
		friendDao.save(friend);
		
	}
	
	public void UpdateFriend(Friend friend) {
		friendDao.save(friend);
	}
	
	public void deleteFriend(Long id) {
		friendDao.deleteById(id);
	}

}
