package com.javaex.api;

public class Member implements Comparable{
	String name;
	
	public Member(String name)
	{
		this.name = name;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + "]";
	}
	
	@Override
	public int compareTo(Object o) {
		if ( o instanceof Member)
		{
			Member other = (Member)o;
			return name.compareTo(other.name);
		}
		return 0;
	}
}
