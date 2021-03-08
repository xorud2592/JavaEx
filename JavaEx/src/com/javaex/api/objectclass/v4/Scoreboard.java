package com.javaex.api.objectclass.v4;

import java.util.Arrays;

public class Scoreboard implements Cloneable {
	private int[] scores;
	
	public Scoreboard(int[] scores) {
		this.scores = scores;
	}

	public int[] getScores() {
		return scores;
	}

	public void setScores(int[] scores) {
		this.scores = scores;
	}

	@Override
	public String toString() {
		return "Scoreboard [scores=" + Arrays.toString(scores) + "]";
	}
	
	public Scoreboard getclone() {
		Scoreboard clone = null;
		
		try {
			clone = (Scoreboard)clone();
		}catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}
}
