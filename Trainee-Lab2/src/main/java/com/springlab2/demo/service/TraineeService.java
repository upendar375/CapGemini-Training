package com.springlab2.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springlab2.demo.models.Trainee;
import com.springlab2.demo.repository.TraineeDaoInterface;

@Service
public class TraineeService{

	@Autowired
	TraineeDaoInterface traineeDao;
	

	@Transactional
	public Trainee addTrainee(Trainee trainee) {
		return  traineeDao.save(trainee);
	}

	@Transactional
	public boolean deleteTrainee(int traineeId) {
		traineeDao.deleteById(traineeId);
		return !traineeDao.existsById(traineeId);
	}

	@Transactional
	public Trainee updateTrainee(Trainee trainee) {
	    Trainee newTrainee=traineeDao.getOne(trainee.getTraineeId());
	    newTrainee.setTraineeName(trainee.getTraineeName());
	    newTrainee.setTraineeLocation(trainee.getTraineeLocation());
	    newTrainee.setTraineeDomain(trainee.getTraineeDomain());
	    traineeDao.save(newTrainee);
		return trainee;
	}

	public Trainee getTraineeById(int traineeId) {
		return traineeDao.getOne(traineeId);
	}
	
	public List<Trainee> getAllTrainees() {
		return traineeDao.findAll();
	}

}
