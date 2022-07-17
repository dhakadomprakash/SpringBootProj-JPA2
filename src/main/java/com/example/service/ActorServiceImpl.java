package com.example.service;

import com.example.entity.Actor;
import com.example.repository.ActorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service("actorService")
@RequiredArgsConstructor
public class ActorServiceImpl implements ActorService {
    private final ActorRepository actorRepository;

    @Override
    public String addActor(Actor actor) {
        return "Actor saved with id " + actorRepository.save(actor).getId();
    }

    @Override
    public String addAllActors(List<Actor> actors) {
        List<Actor> all = (List<Actor>) actorRepository.saveAll(actors);
        List<Integer> ids = all.stream().map(actor -> actor.getId()).collect(Collectors.toList());
        return "Actors are saved having ids " + ids;
    }
}
