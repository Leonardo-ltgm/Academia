package com.example.academia.Controller;

import com.example.academia.Entity.Administracao;
import com.example.academia.Entity.Aula;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.GerenciamentoService;

@RestController
@RequestMapping("/api/academia")
@Slf4j
public class GerControler {

    private final GerenciamentoService gerenciamentoService;

    public GerControler(GerenciamentoService gerenciamentoService) {
        this.gerenciamentoService = gerenciamentoService;
    }


    @GetMapping("/malhacao")
    public ResponseEntity<Aula> Malhacao(){
        Aula aula = new Aula();
        aula.setAula("Malhacao");
        aula.setTurno("Matutino");
        return new ResponseEntity<>(aula, HttpStatus.OK);
    }

    @PostMapping
    public String cadastrarAula(@RequestBody Aula aula) {

        return "Cadastrado com sucesso";
    }

    @PutMapping("/alterar/{codigo}")
    public String alterarAula(@RequestBody Aula aula, @PathVariable("codigo") int Id) {

        log.info("O codigo é " + Id);

        return "Aula alerada com sucesso";
    }

    @PatchMapping("/alterarTurno/{codigo}")
    public String alterarTurno(@RequestBody Aula aula, @PathVariable("codigo")int codigo) {
        return "Turno alterada com sucesso";
    }

    @DeleteMapping("/excluir/{codigo}")
    public String excluirAula(@PathVariable("codigo") int codigo) {
        return "Aula excluída com secesso";
    }

    @GetMapping("/consulta/{codigo}")
    public Aula consultaAula(@PathVariable("codigo") int codigo) {
        Aula aula = new Aula();
        aula.setAula("Malhacao");
        aula.setTurno("Matutino");
        return aula;
    }
    



    try {
        gerenciamentoService.salvarAdministracao(administracao);
    }catch (Exception exception)
        return new ResponseEntity<>("Erro",HttpStatus.BAD_REQUEST);
    }
    return new ResponseEntity<>("Administracao cadastrada com sucesso", HttpStatus.CREATED);
}

