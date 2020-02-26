/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domein;

import java.util.ArrayList;
import java.util.List;

public class ArtCollection {
	private List<Saleable> mySaleables;
	
	public static void main(String[] args) {
		new ArtCollection();
	}

	public ArtCollection() {
		super();
		
		mySaleables = new ArrayList<>();
		
		mySaleables.add(new Kat("Garfield",9));
		mySaleables.add(new Hond("Goovy"));
		
		for (Saleable s : mySaleables) {
			if (s instanceof Drawable) {
				s.cost();
			}
		}
	} 
}
