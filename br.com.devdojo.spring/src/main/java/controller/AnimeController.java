package controller;

import domain.Anime;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("anime")
public class AnimeController {

    @GetMapping("listar")
    public List<Anime> listAnime(){
        return List.of(new Anime("DBZ"), new Anime("OBZ"));

    }
}
