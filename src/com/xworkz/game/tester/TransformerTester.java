package com.xworkz.game.tester;

import com.xworkz.game.dto.TransformerDTO;
import com.xworkz.game.service.TransformerService;
import com.xworkz.game.service.TransformerServiceImpl;
import com.xworkz.game.constants.*;
public class TransformerTester {

	public static void main(String[] args) {
		
		TransformerDTO dto = new TransformerDTO( "Mridula", "bhatkal", CharacterType.OMNIVERT, "backStabbing", "aestheticDecor", "mybrother'smemory", "Photograpy" );
TransformerService service = new TransformerServiceImpl();

 String valid = service.validateAndSave(dto);
 System.out.println(valid);

	}

}
