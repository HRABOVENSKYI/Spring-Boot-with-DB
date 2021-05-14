package ua.lviv.iot.loomshop.services;

import org.springframework.http.ResponseEntity;
import ua.lviv.iot.loomshop.models.loom.Loom;

import java.util.List;

public interface LoomService {

    Loom createLoom(Loom loom);

    List<Loom> getAllLooms();

    Loom getLoom(Long id);

    ResponseEntity<Loom> updateLoomById(Long id, Loom newLoom);

    void deleteAllLooms();

    void deleteLoomById(Long id);
}
