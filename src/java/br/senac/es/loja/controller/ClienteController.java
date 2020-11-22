/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.es.loja.controller;

import br.senac.es.loja.dao.ClienteDAO;
import br.senac.es.loja.model.Cliente;
import java.sql.SQLException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author MAICON
 */
@Controller
public class ClienteController {

    @RequestMapping("/")
    public String iniciar() {
        return "index";
    }
    
    @RequestMapping("/form")
    public String abrirForm() {
        return "cadastro";
    }    

    @RequestMapping("/cadastrar")
    public ModelAndView adiciona(Cliente cliente) {
        ClienteDAO dao = new ClienteDAO();
        ModelAndView mv = new ModelAndView("informacao");
        try {
            dao.inserir(cliente);
            mv.addObject("mensagem", "Cliente cadastrado com sucesso!");
        } catch (SQLException | ClassNotFoundException ex) {
            mv.addObject("mensagem", "Ocorreu um erro ao cadastrar: "+ex.getMessage());
        }
        
        return mv;
    }


}
