package br.com.davibarbosa.clientes.api.controller;

import br.com.davibarbosa.clientes.api.model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {

    @GetMapping("/{parametroNome}")
    public Cliente welcome(@PathVariable String parametroNome){
        Cliente cliente = new Cliente();
        cliente.setNome(parametroNome);
        cliente.deposita(10);
        return cliente;
    }
}
