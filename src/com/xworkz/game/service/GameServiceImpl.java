package com.xworkz.game.service;

import com.xworkz.game.dto.GameDTO;

public class GameServiceImpl  implements GameService{

	@Override
	public String validateAndSave( GameDTO dto) {
		boolean nameValid = false;
		boolean versionValid = false;
		boolean DevelpodByValid = false;
		boolean memoryRequiredValid = false;
		boolean maxPlayersValid = false;
		boolean onlineValid = false;
		if (dto != null) {
			
		System.out.println("dto is not null ...start validating the data");
		
		String name  = dto.getName();
		if(name != null && name.isEmpty() && name.length() >=3 && name.length() <= 50 ) {
		System.out.println("name is valid");	
		nameValid = true;
		
		}else {
			System.out.println("name is invalid");
			nameValid = false;
		}
		System.out.println("..............");
		
		String version  = dto.getVersion();
		if(version != null && version.isEmpty() && version.length() >= 1 && version.length() <=  50 ) {
		System.out.println("version  is valid");	
		versionValid = true;
		}else {
			System.out.println("version is invalid");
			versionValid = false;
		}
		
		System.out.println("..............");
		
		String developed = dto.getDevelpodBy();
		if(developed != null && developed.isEmpty() && developed.length() >= 1 && developed.length() <=  50 ) {
		System.out.println("DevelpodBy  is valid");	
		DevelpodByValid = true;
		}else {
			System.out.println("DevelpodBy is invalid");
			DevelpodByValid = false;
		}
		
		System.out.println("..............");
		
		int players = dto.getMaxPlayers();
		if( players >= 1 && players <= 15 ) {
		System.out.println("MaxPlayers  is valid");	
		maxPlayersValid = true;
		}else {
			System.out.println("MaxPlayers is invalid");
			maxPlayersValid = false;
		}
        System.out.println("..............");
		
		double memory = dto.getMemoryRequired();
		if( memory >= 50 && memory <= 5000000 ) {
		System.out.println("MemoryRequired  is valid");	
		memoryRequiredValid = true;
		}else {
			System.out.println("MemoryRequired is invalid");
			memoryRequiredValid = false;
		}
//		 System.out.println("..............");
//			
//			boolean  onlineCheck = dto.isOnline();
//			if( memory >= 50 && memory <= 5000000 ) {
//			System.out.println("MaxPlayers  is valid");	
//			memoryRequiredValid = true;
//			}else {
//				System.out.println("MaxPlayers is invalid");
//				memoryRequiredValid = false;
//			}
		
		
		
		if(nameValid && versionValid && DevelpodByValid && memoryRequiredValid &&  onlineValid ) {
			System.out.println("data is valid ,returning successfully");
			return " SuccessFully validated";
		}
		}
		
		return "Failed validation" ;
	}

}
