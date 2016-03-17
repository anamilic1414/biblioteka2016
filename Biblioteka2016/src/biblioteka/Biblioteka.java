package biblioteka;

import java.util.LinkedList;

import biblioteka.interfejs.Bibliotekainterfejs;

public class Biblioteka implements Bibliotekainterfejs {

	private LinkedList<Knjiga> knjige = new LinkedList<Knjiga>();
	
	@Override
	public void dodajKnjigu(Knjiga knjiga) {
		knjige.add(knjiga);

	}

	@Override
	public void obrisiKnjigu(Knjiga knjiga) {
		knjige.remove(knjiga);
	}

	@Override
	public LinkedList<Knjiga> vratiSveKnjige() {
			return knjige;
	}

	@Override
	public LinkedList<Knjiga> pronadjiKnjigu(Autor autor, long ISBN, String naslov, String izdavac) {
		LinkedList<Knjiga> rezultat = new LinkedList<Knjiga>();
		
		for (int i = 0; i < knjige.size(); i++) {
			if(knjige.get(i).getNaslov().contains(naslov))
				rezultat.add(knjige.get(i));
		}
		
		return rezultat;
	}

}
