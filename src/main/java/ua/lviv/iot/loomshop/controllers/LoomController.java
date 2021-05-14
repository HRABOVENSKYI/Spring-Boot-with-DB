package ua.lviv.iot.loomshop.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.loomshop.models.loom.Loom;
import ua.lviv.iot.loomshop.services.LoomService;

import java.util.List;


@RestController
@RequestMapping("/loom-shop")
@RequiredArgsConstructor
public class LoomController {

    private final LoomService loomService;

    @PostMapping("/looms")
    public Loom addLoom(final @RequestBody Loom loom) {
        return loomService.createLoom(loom);
    }

    @GetMapping("/looms")
    public List<Loom> getAllLooms() {
        return loomService.getAllLooms();
    }

    @GetMapping("/looms/{id}")
    public Loom getLoom(final @PathVariable("id") Long id) {
        return loomService.getLoom(id);
    }

    @PutMapping("/looms/{id}")
    public ResponseEntity<Loom> updateLoom(final @PathVariable("id") Long id, final @RequestBody Loom loom) {
        return loomService.updateLoomById(id, loom);
    }

    @DeleteMapping("/looms")
    public void deleteAllLooms() {
        loomService.deleteAllLooms();
    }

    @DeleteMapping("/looms/{id}")
    public void deleteLoom(final @PathVariable("id") Long id) {
        loomService.deleteLoomById(id);
    }
}
