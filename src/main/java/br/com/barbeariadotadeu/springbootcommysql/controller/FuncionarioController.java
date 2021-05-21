package br.com.barbeariadotadeu.springbootcommysql.controller;

import br.com.barbeariadotadeu.springbootcommysql.controller.dto.ClienteRQ;
import br.com.barbeariadotadeu.springbootcommysql.controller.dto.FuncionarioDTO;
import br.com.barbeariadotadeu.springbootcommysql.controller.dto.FuncionarioRQ;
import br.com.barbeariadotadeu.springbootcommysql.model.Funcionario;
import br.com.barbeariadotadeu.springbootcommysql.repository.FuncionarioRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {
    private final FuncionarioRepository funcionarioRepository;

    public FuncionarioController(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }

    @GetMapping("/")
    public List<FuncionarioDTO> findAll(){
        var funcionario = funcionarioRepository.findAll();
        return funcionario.stream()
                .map(FuncionarioDTO::converter)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public FuncionarioDTO findById(@PathVariable("id") int id){
        var funcionario = funcionarioRepository.getOne(id);
        return FuncionarioDTO.converter(funcionario);
    }
    @PostMapping("/")
    public void POST (@RequestBody FuncionarioRQ funcionario){
        var f = new Funcionario();
        f.setTempoExp(funcionario.getTempoExp());
        f.setPessoa(funcionario.getPessoa());
        funcionarioRepository.save(f);
    }

    @PutMapping("/{id}")
    public void PUT(@PathVariable("id") int id, @RequestBody FuncionarioRQ funcionario) throws Exception{
        var f = funcionarioRepository.findById(id);

        if(f.isPresent()){
            var funSave = f.get();
            funSave.setTempoExp(funcionario.getTempoExp());
            funSave.setPessoa(funcionario.getPessoa());
            funcionarioRepository.save(funSave);
        } else{
            throw new Exception("Cliente não encontrado");
        }
    }

    public void DeleteByID(@PathVariable int id) throws Exception{
        var f = funcionarioRepository.findById(id);
        if(f.isPresent()){
            funcionarioRepository.deleteById(id);
        } else{
            throw new Exception("Cliente não encontrado");
        }
    }
}
