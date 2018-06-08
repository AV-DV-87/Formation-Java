package test;

import model.CircleCustomEx;
import model.InvalidRadiusException;

public class TestCircleCustomEx {

	public static void main(String[] args) {
		
			try {
				CircleCustomEx testCircle = new CircleCustomEx(-50);
			} catch (InvalidRadiusException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				System.out.println("Bonjour, Je m'execute dans tous les cas. Meme si le main va pas au bout.");
			}
			

	}

}
