package br.santalucia.demomvc.repository;

import br.santalucia.demomvc.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long>{

}
