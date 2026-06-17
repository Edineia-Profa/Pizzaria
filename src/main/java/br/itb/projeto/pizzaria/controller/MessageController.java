package br.itb.projeto.pizzaria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
 
@Controller
public class MessageController {
 
    @GetMapping("/home")
    public String paginaInicial(Model model) {
        model.addAttribute("titulo", "Início");
        model.addAttribute("mensagem", "Bem-vindo a Pizzaria ITB!");
        model.addAttribute("paginaAtual", "home");
        return "layout";
    }
     @GetMapping("/cardapio")
    public String cardapio(Model model) {
        model.addAttribute("titulo", "Cardápio");
        model.addAttribute("paginaAtual", "cardapio");
        return "cardapio";
    }
      @GetMapping("/sobre")
    public String sobre(Model model) {
        model.addAttribute("titulo", "Sobre nós");
        model.addAttribute("paginaAtual", "sobre");
        return "sobre";
    }
    //contato
}