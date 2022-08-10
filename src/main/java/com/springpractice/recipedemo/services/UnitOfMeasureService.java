package com.springpractice.recipedemo.services;

import com.springpractice.recipedemo.commands.UnitOfMeasureCommand;

import java.util.Set;

public interface UnitOfMeasureService {
    Set<UnitOfMeasureCommand> listAllUoms();
}
