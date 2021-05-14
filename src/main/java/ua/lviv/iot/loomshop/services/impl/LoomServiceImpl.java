package ua.lviv.iot.loomshop.services.impl;

import lombok.RequiredArgsConstructor;
import org.hibernate.query.criteria.internal.expression.function.AggregationFunction;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import ua.lviv.iot.loomshop.dao.LoomDAO;
import ua.lviv.iot.loomshop.models.loom.Country;
import ua.lviv.iot.loomshop.models.loom.Loom;
import ua.lviv.iot.loomshop.services.LoomService;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class LoomServiceImpl implements LoomService {

    private final LoomDAO loomDAO;

    @Override
    public Loom createLoom(Loom loom) {
        loomDAO.save(loom);
        return loom;
    }

    @Override
    public List<Loom> getAllLooms() {
        return loomDAO.findAll();
    }

    @Override
    public Loom getLoom(Long id) {
        return loomDAO.findLoomById(id);
    }

    /**
     * Returns 200 status code and previous loom object if loom with this id exists
     * Returns 404 status code if loom with this id is missing
     */
    @Override
    public ResponseEntity<Loom> updateLoomById(Long id, Loom newLoom) {

        Optional<Loom> loomOptional = loomDAO.findLoomsById(id);

        // Save locally old loom with copy constructor
        Loom oldLoom = loomOptional.isPresent() ? new Loom(loomDAO.findLoomById(id)) : null;

        newLoom.setId(id);

        if (loomOptional.isPresent()) {
            loomDAO.save(newLoom);
            return new ResponseEntity<>(oldLoom, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public void deleteAllLooms() {
        loomDAO.deleteAll();
    }

    @Override
    public void deleteLoomById(Long id) {
        loomDAO.deleteById(id);
    }
}
