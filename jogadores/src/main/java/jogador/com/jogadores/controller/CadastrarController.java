package jogador.com.jogadores.controller;

import jogador.com.jogadores.dao.ClienteRepository;
import jogador.com.jogadores.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CadastrarController {

    @Autowired
    ClienteRepository clienteRepository;

    @GetMapping ("/Cadastrar")
    public String abrir(Cliente cliente) {return "Cadastrar";}

    @PostMapping("/cadastro")
    public String cadastro(Cliente cliente){
        clienteRepository.save(cliente);
        return "index";
    }

}