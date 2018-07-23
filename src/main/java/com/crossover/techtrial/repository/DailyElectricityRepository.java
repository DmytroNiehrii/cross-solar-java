package com.crossover.techtrial.repository;

import com.crossover.techtrial.model.DailyElectricity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DailyElectricityRepository extends CrudRepository<DailyElectricity, Long> {

    List<DailyElectricity> findAllByPanelId(Long panelId);
}
