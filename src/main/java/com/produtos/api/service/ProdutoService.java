package com.produtos.api.service;

import com.produtos.api.models.Produto;
import com.produtos.api.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ProdutoService {
    //anottation
    //ponto de injeção para utilizar metodos para se comunicar com o banco de dados
    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> findAll(){
        return produtoRepository.findAll();
    }

    public Produto findById(long id){
        return produtoRepository.findById(id);
    }

    @Transactional
    public Produto save(Produto produto){
        return produtoRepository.save(produto);
    }

    @Transactional
    public void delete(long id){
        produtoRepository.delete(findById(id));
    }

    @Transactional
    public Produto update(Produto produto){
        return produtoRepository.save(produto);
    }

}
