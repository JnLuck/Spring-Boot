package com.jhoselyn.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jhoselyn.interfaces.ITractor;
import com.jhoselyn.iservice.ItractorService;

import com.jhoselyn.models.Tractor;

@Service
public class TractorService implements ItractorService{
	@Autowired
	private ITractor data;
	
	@Override
	public List<Tractor> listar() {
		// TODO Auto-generated method stub
		return (List<Tractor>)data.findAll();
	}

	@Override
	public Optional<Tractor> buscarId(int id) {
		// TODO Auto-generated method stub
		return data.findById(id);
	}

	@Override
	public int guardar(Tractor tor) {
		// TODO Auto-generated method stub
		int res=0;
		Tractor tractor=data.save(tor);
		if(!tractor.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		data.deleteById(id);
		
	}

}



