package com.labsession2.problem2;

public class NotesCount {

	public void notesCountImplementation(int notes[],int amount)
	{
		int[] noteCounter = new int[notes.length];
		try {
			for (int i = 0; i <notes.length;i++)
			{
				if (amount>=notes[i]) {
					noteCounter[i]= amount/notes[i];
					amount = amount - noteCounter[i]* notes[i];
				}
			}
			if (amount > 0) {
				System.out.println("exact amount cannnot be given with the highest denomination");
				for (int i = 0; i< notes.length; i++)
				{
					if (noteCounter[i]!= 0) {
						System.out.println(notes[i]+":"+noteCounter[i]);
					}
				}
			}
		}catch (ArithmeticException e) {
			System.out.println(e+"notes of denomination 0 is invalid");
		}
	}

}
