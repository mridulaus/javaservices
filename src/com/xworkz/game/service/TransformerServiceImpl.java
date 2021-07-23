package com.xworkz.game.service;
import com.xworkz.game.constants.*;
import com.xworkz.game.constants.CharacterType;
import com.xworkz.game.dto.TransformerDTO;

public class TransformerServiceImpl implements TransformerService {


	
	@Override
	public String validateAndSave(TransformerDTO dto) {
		 boolean nameValid = false;
		boolean placeValid = false;
		boolean characterTypeValid = false;
		boolean angryValid = false;
		boolean happyValid = false;
		boolean sadValid = false;
		boolean likeToDoValid = false;
		if(dto != null) {
			System.out.println("dto isn't null...start validatation");
			String name  = dto.getName();
			if(name.length() >=5 && name.length() <= 50 ) {
			System.out.println("name is valid");	
			nameValid = true;
			
			}else {
				System.out.println("name is invalid");
				nameValid = false;
			}
			
			String place  = dto.getPlace();
			if(place.length() >=5 && place.length() <= 50 ) {
			System.out.println("place is valid");	
			placeValid = true;
			
			}else {
				System.out.println("place is invalid");
				placeValid = false;
			}
//			CharacterType character  = dto.getType();
//			if(character.length() >=5 && place.length() <= 50 ) {
//			System.out.println("place is valid");	
//			placeValid = true;
//			
//			}else {
//				System.out.println("place is invalid");
//				placeValid = false;
//			}
			String anger  = dto.getAngry();
			if(anger.length() >=4 && anger.length() <= 12 ) {
			System.out.println("anger is valid");	
			angryValid = true;
			
			}else {
				System.out.println("anger is invalid");
				angryValid = false;
			}
			
			String happy  = dto.getHappy();
			if(happy.length() >=4 && happy.length() <= 12 ) {
			System.out.println("happy is valid");	
			happyValid = true;
			
			}else {
				System.out.println("happy is invalid");
				happyValid = false;
			}
			
			String sad  = dto.getSad();
			if(sad.length() >=4 && sad.length() <= 12 ) {
			System.out.println("Sad is valid");	
			sadValid = true;
			
			}else {
				System.out.println("Sad is invalid");
				sadValid = false;
			}
			String myLiking  = dto.getLikeToDo();
			if(myLiking.length() >=4 && myLiking.length() <= 12 ) {
			System.out.println("LikeToDo is valid");	
			happyValid = true;
			
			}else {
				System.out.println("LikeToDo is invalid");
				happyValid = false;
			}
			if(nameValid && placeValid && angryValid && characterTypeValid &&  happyValid && sadValid   && likeToDoValid ) {
				System.out.println("data is valid ,retusadValidrning successfully");
				return " SuccessFully validated";
			}
			
		}
		return "  data is not valiadated so it is Failed ";
	}

}
