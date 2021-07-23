package com.xworkz.game.tester;
import com.xworkz.game.dto.*;
import com.xworkz.game.service.*;
public class GameTester {

	public static void main(String[] args) {
		GameDTO dto = new GameDTO("SuperMario" , "SM1234" , "ShigeruMiyamoto" , 2 , 31.00d ,true);
		GameDTO dto1 = new GameDTO("Candycrush" , "CDC9876" , "KingDigitalEntertainment" , 1 ,97.8d ,true);
		GameDTO dto2 = new GameDTO("Ludo" , "Ld4589" , "GametionTechnologiesPvtLtd" , 4 ,7.8d ,true);
		   
		GameService gameservice = new GameServiceImpl();
		
		String saved = gameservice.validateAndSave(dto);
		System.out.println(saved);
		
	}
}
