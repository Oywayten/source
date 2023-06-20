package ru.job4j.source.repository;
import org.springframework.data.repository.CrudRepository;
import ru.job4j.source.model.Item;
import java.util.List;

/**
 * Oywayten 19.06.2023.
 */
public interface ItemRepository extends CrudRepository<Item, Integer> {
    List<Item> findByNameIgnoreCase(String name);
}