package br.com.barbeariadotadeu.springbootcommysql.controller;


import br.com.barbeariadotadeu.springbootcommysql.controller.dto.ClienteDTO;
import br.com.barbeariadotadeu.springbootcommysql.controller.dto.ClienteRQ;
import br.com.barbeariadotadeu.springbootcommysql.model.Cliente;
import br.com.barbeariadotadeu.springbootcommysql.repository.ClienteRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteRepository clienteRepository;

    public ClienteController(ClienteRepository clienteRepository){
        this.clienteRepository = clienteRepository;
    }
    @GetMapping("/")
    public List<ClienteDTO> findAll(){
        var cliente = clienteRepository.findAll();
        return cliente.stream()
                .map(ClienteDTO::converter)
                .collect(Collectors.toList());
    }
    @GetMapping("/{id}")
    public ClienteDTO findById(@PathVariable("id") int id){
        var cliente = clienteRepository.getOne(id);
        return ClienteDTO.converter(cliente);
    }
    @PostMapping("/")
    public void POST (@RequestBody ClienteRQ cliente){
        var c = new Cliente();
        c.setLogin(cliente.getLogin());
        c.setPassword(cliente.getPassword());
        c.setHoraMarcada(cliente.getHoraMarcada());
        c.setPessoa(cliente.getPessoa());
        clienteRepository.save(c);
    }

    @PutMapping("/{id}")
    public void PUT (@PathVariable("id") int id, @RequestBody ClienteRQ cliente) throws Exception{
        var c = clienteRepository.findById(id);

        if (c.isPresent()){
            var clienteSave = c.get();
            clienteSave.setLogin(cliente.getLogin());
            clienteSave.setPassword(cliente.getPassword());
            clienteSave.setHoraMarcada(cliente.getHoraMarcada());
            clienteSave.setPessoa(cliente.getPessoa());
            clienteRepository.save(clienteSave);
        } else{
            throw new Exception("Cliente não encontrado");
        }
    }
    public void DeleteByID (@PathVariable int id) throws Exception{
        var c = clienteRepository.findById(id);
        if(c.isPresent()){
            clienteRepository.deleteById(id);
        } else{
            throw new Exception("Cliente não encontrado");
        }
    }



}
