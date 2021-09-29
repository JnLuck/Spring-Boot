package com.jhoselyn.iservice;

import java.util.List;
import java.util.Optional;

import com.jhoselyn.models.Tractor;

public interface ItractorService {
	public List<Tractor>listar();
	public Optional<Tractor>buscarId(int id);
	public int guardar(Tractor tor);
	public void eliminar(int id);
}
