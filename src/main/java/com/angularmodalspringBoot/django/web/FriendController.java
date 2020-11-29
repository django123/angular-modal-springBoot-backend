package com.angularmodalspringBoot.django.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.angularmodalspringBoot.django.dao.FriendDao;
import com.angularmodalspringBoot.django.entities.Friend;
import com.angularmodalspringBoot.django.service.FriendService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1")
public class FriendController {
	
	@Autowired
	private FriendService friendService;
	
	@GetMapping("/friends")
	public  List<Friend> getFriends(){
		return friendService.getFriends();
		
	}
	
	@PostMapping("/friends/add")
	public void addFriend(@RequestBody Friend friend) {
		
		friendService.addFriend(friend);
		
	}
	
	@PutMapping("/friends/{id}/edit")
	public void updateFriend(@RequestBody Friend friend, @PathVariable("id")Long id) {
		friendService.UpdateFriend(friend);
	}
	
	@DeleteMapping("/friends/{id}/delete")
	public void deleteFriend(@PathVariable("id")Long id) {
		friendService.deleteFriend(id);
	}

}
