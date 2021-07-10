package com.dao;

import java.util.List;

import com.model.Icecream;

public interface IceDao
{
public void saveice(Icecream icecream);
public void updatice(Icecream icecream);
public void deleteice(Icecream icecream);
public Icecream editice(int id);
public Icecream editice1(int id);
public Icecream findFlaver(int id);
public List<Icecream> getAllIcecreams();

}
