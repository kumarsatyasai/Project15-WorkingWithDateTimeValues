package com.nt.runner;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Actor;
import com.nt.service.IActorMgmtService;


@Component
public class ActorOperationsTestRunner implements CommandLineRunner {
	
	@Autowired
	private IActorMgmtService actorService;

	@Override
	public void run(String... args) throws Exception {
		
		try
		{
			
			Actor actor = new Actor("Prabhas", "Hero", LocalDate.of(1991, 12, 14), LocalTime.of(10, 20, 30), LocalDateTime.of(2002, 9, 24, 12, 15, 28));
			String registerActor = actorService.registerActor(actor);
			System.out.println(registerActor);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
