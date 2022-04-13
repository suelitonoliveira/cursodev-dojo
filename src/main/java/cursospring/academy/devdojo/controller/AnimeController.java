package cursospring.academy.devdojo.controller;

import cursospring.academy.devdojo.model.Anime;
import cursospring.academy.devdojo.util.DateUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("animes")
@Log4j2
@RequiredArgsConstructor
public class AnimeController {

    private final DateUtil dateUtil;

    @GetMapping
    public List<Anime> list() {
        log.info(this.dateUtil.formatLocalDateTimeToDataBaseStyle(LocalDateTime.now()));
        return List.of(
                Anime.builder().name("DBZ").build(),
                Anime.builder().name("Berserk").build(),
                Anime.builder().name("Boruto").build()
        );
    }

}
