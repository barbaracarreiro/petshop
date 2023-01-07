public class PetshopServicelmpl {

    import java.util.List;
    import java.util.Optional;
    
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Service;
    
    import com.petshop.petshop.model.Petshop;
    import com.petshop.petshop.repository.PetshopRepository;
    @Service
    public class PetshopServiceImpl implements PetshopService {
        @Autowired
        private PetshopRepository repositorio;
        @Override
        public List<Petshop> ObterPets() {
            
            return repositorio.findAll();
        }
    
        @Override
        public Optional<Petshop> ObterPorId(String id) {
            
            return repositorio.findById(id);
        }
    
        @Override
        public void excluirPorId(String id) {
            
            repositorio.deleteById(id);
    
        }
    
        @Override
        public Petshop cadastrarPet(Petshop petshop) {
             
            return repositorio.save(petshop);
        }
    
        @Override
        public Optional<Petshop> atualizarPorId(String id, Petshop petshop) {
            
            Optional<Petshop> retorno = repositorio.findById(id);
            if(retorno.isPresent()){
                petshop.setId(id);
                return Optional.of(repositorio.save(petshop));
            }else{
                return Optional.empty();
            }
        }
    
    } 
}
