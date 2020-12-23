package com.produtos.api.api;

import com.produtos.api.models.Produto;
import com.produtos.api.repository.ProdutoRepository;
import com.produtos.api.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Nessa Classe vamos receber nossas requisições http

@RestController
@RequestMapping(value="/api")
public class ProdutoResource {

    //Anotation
    //Ponto de injeção para utilizar os metodos para se conectar com o banco de dados
    @Autowired
    private ProdutoService service;
    private ProdutoRepository produtoRepository;

    @GetMapping("/produtos")
    public List<Produto> listaProdutos(){
        return service.findAll();
    }

    @GetMapping("/produtos/{id}")
    public Produto listaProdutoUnico(@PathVariable(value="id") long id){
        return service.findById(id);
    }

    @PostMapping("/produtos")
    //@RequestBody pq nosso produto vai vim do corpo da requisiçao e depois colocamos o que vamos trazer no corpo da requisição
    public Produto salvaProduto(@RequestBody Produto produto){
        return service.save(produto);
    }

    @PutMapping("/produtos")
    public void atualizaProduto(@RequestBody
                                            Produto produto){
        service.update(produto);
    }

    @DeleteMapping("/produtos/{id}")
    public void deleteProduto(@PathVariable("id") long id){
        service.delete(id);
    }


}
