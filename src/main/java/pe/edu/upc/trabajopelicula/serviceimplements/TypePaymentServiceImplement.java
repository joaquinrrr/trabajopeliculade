package pe.edu.upc.trabajopelicula.serviceimplements;

import org.springframework.stereotype.Service;
import pe.edu.upc.trabajopelicula.entities.TypePayments;
import pe.edu.upc.trabajopelicula.serviceinterfaces.ITypePaymentsInterface;

import java.util.List;

@Service
public class TypePaymentServiceImplement implements ITypePaymentsInterface {
    @Override
    public void insert(TypePayments typePayments) {

    }

    @Override
    public List<TypePayments> list() {
        return List.of();
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void update(TypePayments typePayments) {

    }

    @Override
    public TypePayments listarId(int id) {
        return null;
    }
}
