package com.xworkz.game.dto;

import java.io.Serializable;

public class GameDTO  implements Serializable{
	private String name;
	private String version;
	private String DevelpodBy;
	private int maxPlayers;
	private double  memoryRequired;
	private boolean online;
	
	public GameDTO(String name, String version, String develpodBy, int maxPlayers, double memoryRequired,
			boolean online) {
		
		this.name = name;
		this.version = version;
		DevelpodBy = develpodBy;
		this.maxPlayers = maxPlayers;
		this.memoryRequired = memoryRequired;
		this.online = online;
	}
	public GameDTO() {
		
	}
	@Override
	public String toString() {
		return "GameDTO [name=" + name + ", version=" + version + ", DevelpodBy=" + DevelpodBy + ", maxPlayers="
				+ maxPlayers + ", memoryRequired=" + memoryRequired + ", online=" + online + "]";
	}
	@Override
	public int hashCode() {
		System.out.println("Original Hashcode  " +System.identityHashCode(this)   );
		return 2021;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj == null) 
			return false;
		if (obj instanceof GameDTO) {
			GameDTO casted = (GameDTO)obj;
			if(this.name.equalsIgnoreCase(casted.name) && this.version.equalsIgnoreCase(casted.version) && this.DevelpodBy.equalsIgnoreCase(casted.DevelpodBy)  ) {
				return true;
			}
		}
		return false;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getDevelpodBy() {
		return DevelpodBy;
	}
	public void setDevelpodBy(String develpodBy) {
		DevelpodBy = develpodBy;
	}
	public int getMaxPlayers() {
		return maxPlayers;
	}
	public void setMaxPlayers(int maxPlayers) {
		this.maxPlayers = maxPlayers;
	}
	public double getMemoryRequired() {
		return memoryRequired;
	}
	public void setMemoryRequired(double memoryRequired) {
		this.memoryRequired = memoryRequired;
	}
	public boolean isOnline() {
		return online;
	}
	public void setOnline(boolean online) {
		this.online = online;
	}
	

}
