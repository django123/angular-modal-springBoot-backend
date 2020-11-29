package com.angularmodalspringBoot.django.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.angularmodalspringBoot.django.entities.Friend;

@Repository
public interface FriendDao extends JpaRepository<Friend, Long>{
	

}
