package pe.edu.upc.trabajopelicula.serviceimplements;

import org.springframework.stereotype.Service;
import pe.edu.upc.trabajopelicula.entities.Review;
import pe.edu.upc.trabajopelicula.serviceinterfaces.IReviewInterface;

import java.util.List;

@Service
public class ReviewServiceImplement implements IReviewInterface {
    @Override
    public void insert(Review review) {

    }

    @Override
    public List<Review> list() {
        return List.of();
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void update(Review review) {

    }

    @Override
    public Review listarId(int id) {
        return null;
    }
}
