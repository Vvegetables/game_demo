package pat;

import java.util.HashSet;
import java.util.Iterator;
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
		Set<Stu> set = new HashSet<Stu>();
		Stu max = new Stu(1,1,1);
		set.add(new Stu(2,222,222));
		set.add(new Stu(1,1,1));
		Stu kk = null;
		Iterator<Stu> it = set.iterator();
		Iterator<Stu> is = null;
//		while(it.hasNext()){
//			System.out.println(it.next());
//		}
		//set.remove(max);
		it = set.iterator();
		while(it.hasNext()){
//			max.setId(2);
//			max.setlScore(1222);
//			max.sethScore(1);
			if(set.contains(max)){
				kk = it.next();is = it;
				it.remove();
			}
				
			
			System.out.println(kk);
			//it.remove();
			//System.out.println();
		}
		System.out.println(max);
		is.remove();
		it = set.iterator();
//		while(it.hasNext()){
////			max.setId(2);
////			max.setlScore(1222);
////			max.sethScore(1);
//			//System.out.println(set.contains(max));
//			System.out.println(it.next());
//			//it.remove();
//			//System.out.println();
//		}
	}

}
