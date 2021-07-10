package com.service;

import java.util.List;

import com.model.Icecream;

public interface IceService 
{
public void saveice(Icecream icecream);
public void updatice(Icecream icecream);
public void deleteice(Icecream icecream);
public Icecream editice(int id);
public Icecream editice1(int id);
public List<Icecream> getAllIcecreams();
public Icecream findFlaver(int id);
}
