package com.mustafa.computer.controllers;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class ComputersController implements Serializable {

	private List<Computer> computers = new ArrayList<Computer>();
	
	@PostConstruct
	public void lsitComputers(){
		computers.add(new Computer("hp", 1600));
		computers.add(new Computer("toshiba", 1400));
		computers.add(new Computer("acer", 1500));
		computers.add(new Computer("lenovo", 1350));
		computers.add(new Computer("intel", 1200));
	}

	public List<Computer> getComputers() {
		return computers;
	}

	public void setComputers(List<Computer> computers) {
		this.computers = computers;
	}

}
