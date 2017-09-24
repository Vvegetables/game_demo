package pat;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

class Stu{
	private int id;
	private int lScore;
	private int hScore;
	public int getId() {
		return id;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + hScore;
		result = prime * result + id;
		result = prime * result + lScore;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Stu other = (Stu) obj;
		if (hScore != other.hScore)
			return false;
		if (id != other.id)
			return false;
		if (lScore != other.lScore)
			return false;
		return true;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getlScore() {
		return lScore;
	}
	public void setlScore(int lScore) {
		this.lScore = lScore;
	}
	public int gethScore() {
		return hScore;
	}
	public void sethScore(int hScore) {
		this.hScore = hScore;
	}
	public Stu(int id, int lScore, int hScore) {
		super();
		this.id = id;
		this.lScore = lScore;
		this.hScore = hScore;
	}
	@Override
	public String toString() {
		return "StuStruct [id=" + id + ", lScore=" + lScore + ", hScore=" + hScore + "]";
	}
	
}

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		byte[] test = new byte[10000];
		int index = 0;
		while(sc.hasNextByte()){
			test[index] = sc.nextByte();
			++index;
		}
		for(int i = 0; i < index; i ++){
			System.out.println(test[i]);
		}
	}

}
