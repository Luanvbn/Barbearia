package br.com.barbeariadotadeu.springbootcommysql.controller;

import br.com.barbeariadotadeu.springbootcommysql.controller.dto.PessoaDTO;
import br.com.barbeariadotadeu.springbootcommysql.controller.dto.PessoaRQ;
import br.com.barbeariadotadeu.springbootcommysql.model.Pessoa;
import br.com.barbeariadotadeu.springbootcommysql.repository.PessoaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    private final PessoaRepository pessoaRepository;

    public PessoaController(PessoaRepository pessoaRepository){
        this.pessoaRepository =pessoaRepository;
    }
    @GetMapping("/")
    public List<PessoaDTO> findAll(){
        var pessoas = pessoaRepository.findAll();
        return pessoas.stream()
                .map(PessoaDTO::converter)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public PessoaDTO findById(@PathVariable("id") int id){
        var pessoa = pessoaRepository.getOne(id);
        return PessoaDTO.converter(pessoa);
    }
    @PostMapping("/")
    public void POST (@RequestBody PessoaRQ pessoa){
        var p = new Pessoa();
        p.setNome(pessoa.getNome());
        p.setTelefone(pessoa.getTelefone());
        pessoaRepository.save(p);
    }

    @PutMapping("/{id}")
    public void PUT (@PathVariable("id") int id, @RequestBody PessoaRQ pessoa) throws Exception{
        var p = pessoaRepository.findById(id);

        if (p.isPresent()){
            var pessoaSave = p.get();
            pessoaSave.setNome(pessoa.getNome());
            pessoaSave.setTelefone(pessoa.getTelefone());
            pessoaRepository.save(pessoaSave);
        } else {
            throw new Exception("Pessoa não encontrada");
        }
    }

    @DeleteMapping("/{id}")
    public void DeletebyId (@PathVariable int id) throws Exception {
        var p = pessoaRepository.findById(id);
        if (p.isPresent()){
            pessoaRepository.deleteById(id);
        } else{
            throw new Exception("Pessoa não encontrada");
        }

    }
}
