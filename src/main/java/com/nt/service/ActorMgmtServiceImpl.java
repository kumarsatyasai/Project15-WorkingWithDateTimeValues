package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Actor;
import com.nt.repository.IActorRepository;

@Service("actor")
public class ActorMgmtServiceImpl implements IActorMgmtService {
	
	@Autowired
	private IActorRepository actorRepo;

	@Override
	public String registerActor(Actor actor) {
		
		Actor save = actorRepo.save(actor);

		return "Actor Registered With Id :"+save.getActorId();
	}

}
