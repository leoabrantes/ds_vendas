package com.abrantes.pagina_de_vendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abrantes.pagina_de_vendas.entities.Sale;

public interface SaleRepository extends JpaRepository <Sale, Long>{

}

