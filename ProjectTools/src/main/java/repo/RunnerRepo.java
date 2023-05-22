package com.lab.task.repo;

import java.util.List;

import com.lab.task.model.Runner;

public interface RunnerRepo {

	Runner getRunnerById(int id);

	List<Runner> getAvailableRunners();

	void addRunner(Runner runner);

	void updateRunner(Runner runner);

	void deleteRunner(Runner runner);
}
