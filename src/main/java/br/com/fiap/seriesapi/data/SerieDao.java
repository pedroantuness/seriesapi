package br.com.fiap.seriesapi.data;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.seriesapi.model.Serie;

public class SerieDao {
	
	List<Serie> series = new ArrayList<>();
	
	public SerieDao() {
		var serie1 = new Serie(
				1L, 
				"Lost", 
				"Todos morreram...", 
				"http...",
				4.0
			);
		var serie2 = new Serie(
				2L, 
				"Os outros", 
				"Todos brigam...", 
				"http...",
				5.0
			);
		series.add(serie1);
		series.add(serie2);
		
	}

	public List<Serie> findAll(){
		
		return series;
		
	}

	public Serie findById(Long id) {
		// SELECT * FROM SERIES WHERE ID=?
		
		return series
			.stream()
			.filter(serie -> serie.id() == id)
			.findFirst()
			.orElse(null);
	}

	public void delete(Serie serie) {
		// DELETE FROM SERIES WHERE ID=?
		series.remove(serie);
		System.out.println(series);
	}

}
