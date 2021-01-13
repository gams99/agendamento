package br.com.pmb.mvc.agendamento.controller;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.pmb.mvc.agendamento.model.Agendamento;

@Controller
public class HomeController {

	@PersistenceContext
	private EntityManager entityManager; //persistir dados do db
	
	@GetMapping("/home")
	public String home(Model model) {
		
		Query query = entityManager.createQuery("select a from Agendamento a", Agendamento.class);
		
		List<Agendamento> agendamentos = query.getResultList();
		model.addAttribute("agendamentos", agendamentos);
		return "home";
	}
}
