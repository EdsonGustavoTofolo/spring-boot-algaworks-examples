package br.com.algaworks.edsontofolo.gestaofesta.controller;

import br.com.algaworks.edsontofolo.gestaofesta.model.Convidado;
import br.com.algaworks.edsontofolo.gestaofesta.repository.Convidados;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Edson on 25/03/2018.
 */
@Controller
@RequestMapping("/convidados")
public class ConvidadosController {

    @Autowired
    private Convidados convidados;

    /*
    @GetMapping("/convidados")
    public String listar() {
        return "ListaConvidados";
    }*/

    @GetMapping()
    public ModelAndView listar() {
        ModelAndView modelAndView = new ModelAndView("ListaConvidados");
        modelAndView.addObject("convidados", convidados.findAll());
        modelAndView.addObject("convidado", new Convidado());
        return modelAndView;
    }

    @PostMapping()
    public String salvar(Convidado convidado) {
        this.convidados.save(convidado);
        return "redirect:/convidados";
    }
}
