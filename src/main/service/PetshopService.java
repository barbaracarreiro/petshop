package com.petshop.petshop;

public class PetshopService {

import java.util.List;
import java.util.Optional;

import com.petshop.petshop.model.Petshop;

public interface PetshopService {

    List<Petshop> ObterPets();

    Optional<Petshop> ObterPorId(String id);

    void excluirPorId(String id);

    Petshop cadastrarPet(Petshop petshop);

    Optional <Petshop> atualizarPorId(String id,Petshop petshop);
    }
}
