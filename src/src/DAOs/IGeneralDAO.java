package src.DAOs;

import java.util.List;

public interface IGeneralDAO<T> {

    boolean add(T object);

    boolean update(T object);

    boolean delete(Long key);

    List<T> findAll();
}
