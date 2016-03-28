package controller;

import java.util.List;

import javax.inject.Inject;

import model.Exame;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import dao.ExameRepository;

@Controller
@Path("/exames")
public class ExamesController {
	
	@Inject private Result result;
	@Inject private ExameRepository repository;

	@Get("/form")
	public List<Exame> form() {
		List<Exame> list = (List<Exame>) repository.list();
		result.include("exames", list);
		return list;
		
	}
	
	@Get("")
	public List<Exame> listar() {
		List<Exame> list = (List<Exame>) repository.list();
		result.include("exames", list);
		return list;
	}
	
	@Post("/save")
	public void save(Exame exame) {
		repository.save(exame);
		result.redirectTo(this).form();
	}
	
	@Path("/editar/{id}")
	public void editar(Long id) {
		Exame exame = null;
		if (id != null) {
		    exame = repository.find(id);
			result.include("exame", exame);
		}
	}
	
	@Get("/remover/{id}")
	public void remover(Long id) {
		if (id != null) {
			repository.delete(id);
		}
		result.redirectTo(this).form();
	}
	
}