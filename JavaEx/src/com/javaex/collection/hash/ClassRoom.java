package com.javaex.collection.hash;

public class ClassRoom {

	private String subject;
	private String roomName;

	public ClassRoom(String subject) {
		this.subject = subject;
	}

	public ClassRoom(String subject, String roomName) {
		this.subject = subject;
		this.roomName = roomName;
	}

	@Override
	public int hashCode() {
		return subject.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ClassRoom) {
			ClassRoom other = (ClassRoom)obj;
			return subject == other.subject;
		}
		return true;
	}

	@Override
	public String toString() {
		return "ClassRoom [subject=" + subject + ", roomName=" + roomName + "]";
	}
}
