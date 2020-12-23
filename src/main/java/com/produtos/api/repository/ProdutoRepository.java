package com.produtos.api.repository;


import com.produtos.api.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

//aqui vai extender a classe jpa reposiroty
//e como argumento a gente passa nossa entidade e o tipo do id que é Long

//JpaRepository facilita o desenvolvimento
//pois no jparepository ja possui metodos prontos pra persistir no banco de dados

//Produto = entidade
//Tipo do ID
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    Produto findById(long id);
}
