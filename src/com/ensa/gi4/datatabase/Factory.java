package com.ensa.gi4.datatabase;



import com.ensa.gi4.modele.Chaise;
import com.ensa.gi4.modele.Livre;
import com.ensa.gi4.modele.Materiel;


import java.util.ArrayList;
import java.util.List;

public class Factory {

	  private List<Materiel> listMateriel = new ArrayList<>();

	    public Factory()
	    {
	        Chaise chaise1 = new Chaise();
	        chaise1.setName("chaise1");
	        chaise1.setId(0);
	        Chaise chaise2 = new Chaise();
	        chaise2.setName("chaise2");
	        chaise2.setId(1);
	        Chaise chaise3 = new Chaise();
	        chaise3.setName("chaise3");
	        chaise3.setId(2);
	        Chaise chaise4 = new Chaise();
	        chaise4.setName("chaise4");
	        chaise4.setId(3);
	        Chaise chaise5 = new Chaise();
	        chaise5.setName("chaise5");
	        chaise5.setId(4);
	        Chaise chaise6 = new Chaise();
	        chaise6.setName("chaise6");
	        chaise6.setId(5);
	        Livre livre1 = new Livre();
	        livre1.setId(6);
	        livre1.setName("livre1");
	        Livre livre2 = new Livre();
	        livre2.setId(7);
	        livre2.setName("livre2");
	        Livre livre3 = new Livre();
	        livre3.setId(8);
	        livre3.setName("livre3");
	        Livre livre4 = new Livre();
	        livre4.setId(9);
	        livre4.setName("livre4");
	        Livre livre5 = new Livre();
	        livre5.setId(10);
	        livre5.setName("livre5");

	        listMateriel.add(chaise1);
	        listMateriel.add(chaise2);
	        listMateriel.add(chaise3);
	        listMateriel.add(chaise4);
	        listMateriel.add(chaise5);
	        listMateriel.add(chaise6);
	        listMateriel.add(livre1);
	        listMateriel.add(livre2);
	        listMateriel.add(livre3);
	        listMateriel.add(livre4);
	        listMateriel.add(livre5);
	    }

	    public List<Materiel> getListMateriel() {
	        return listMateriel;
	    }

	    public void setListMateriel(List<Materiel> listMateriel) {
	        this.listMateriel = listMateriel;
	    }

}
