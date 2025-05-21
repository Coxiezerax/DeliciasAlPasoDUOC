package Pedido;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepo;

    public List<Pedido> listar() {
        return pedidoRepo.findAll();
    }

    public Optional<Pedido> buscarPorId(Long id) {
        return pedidoRepo.findById(id);
    }

    public Pedido guardar(Pedido pedido) {
        return pedidoRepo.save(pedido);
    }

    public void eliminar(Long id) {
        pedidoRepo.deleteById(id);
    }
}
