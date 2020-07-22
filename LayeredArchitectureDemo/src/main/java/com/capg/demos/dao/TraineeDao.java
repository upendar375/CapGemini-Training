package com.capg.demos.dao;

import com.capg.demos.model.Trainee;

public interface TraineeDao {
public void addTrainee(Trainee Trainee);
public Trainee findTrainee(int id);
public void deleteTrainee(int id);
}
