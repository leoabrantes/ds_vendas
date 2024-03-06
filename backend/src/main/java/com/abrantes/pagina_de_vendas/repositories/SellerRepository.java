package com.abrantes.pagina_de_vendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abrantes.pagina_de_vendas.entities.Seller;

public interface SellerRepository extends JpaRepository <Seller, Long>{

}

