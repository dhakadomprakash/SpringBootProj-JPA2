package com.example.service;

import com.example.entity.Actor;

import java.util.List;

public interface ActorService {
    String addActor(Actor actor);

    String addAllActors(List<Actor> actors);
}
