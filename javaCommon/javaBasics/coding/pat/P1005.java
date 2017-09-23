package pat;

/**
 * 记住iterator迭代器，删除的时候，这个是很难使用的。
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

class StuStruct{
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
		StuStruct other = (StuStruct) obj;
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
	public StuStruct(int id, int lScore, int hScore) {
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

public class P1005 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int lScore = sc.nextInt();
		int hScore = sc.nextInt();
		
		List<StuStruct> list = new ArrayList<StuStruct>();
		Set<StuStruct> set = new HashSet<StuStruct>();
		int stuId = Integer.MAX_VALUE,stuLScore = 0,stuHScore = 0;
		for(int i = 0; i < count; i++){
			stuId = sc.nextInt();
			stuLScore = sc.nextInt();
			stuHScore = sc.nextInt();
			
			if(stuLScore >= lScore && stuHScore >= lScore){
				set.add(new StuStruct(stuId, stuLScore, stuHScore));
			}
		}
		/**
		 * 调试1
		 */
//		for(Iterator<StuStruct> li = set.iterator(); li.hasNext();){
//			StuStruct temp = li.next();
//			System.out.println(temp.getId() + " " + temp.getlScore() + " " + 
//					temp.gethScore());
//		}
		
		/**
		 * 第一类
		 */
		StuStruct max = new StuStruct(Integer.MAX_VALUE,0,0);
		boolean flag = true;
		while(flag){
			Iterator<StuStruct> i = set.iterator();
			
			max.sethScore(0);
			max.setId(Integer.MAX_VALUE);
			max.setlScore(0);
			for(; i.hasNext();){
				StuStruct temp = i.next();
				if(temp.gethScore() >= hScore && temp.getlScore() >= hScore){
					compare(max,temp);
					//System.out.println(temp);
					//System.out.println(max);
					//j = i;
				}
			}
			if(set.contains(max)){
				set.remove(max);
				//System.out.println(max);
				//System.out.println(set.contains(max));
				list.add(new StuStruct(max.getId(),max.getlScore(),max.gethScore()));
				//flag =false;
			}else{
				flag =false;
			}
				
		}
		
		/**
		 * 第二类
		 */
		flag = true;
		while(flag){
			max.sethScore(0);
			max.setId(Integer.MAX_VALUE);
			max.setlScore(0);
			Iterator<StuStruct> i = set.iterator(); 
			for(;i.hasNext();){
				StuStruct temp = i.next();
				if(temp.getlScore() >= hScore && temp.getlScore() < hScore){
					compare(max,temp);
					//j = i;
				}
			}
			//flag = set.remove(max);
			if(set.contains(max)){
				set.remove(max);
				list.add(new StuStruct(max.getId(),max.getlScore(),max.gethScore()));
				//j.remove();
			}else{
				flag =false;
			}
				
		}
		/**
		 * 第三类
		 */
		flag = true;
		while(flag){
			Iterator<StuStruct> i = set.iterator(); 
			max.sethScore(0);
			max.setId(Integer.MAX_VALUE);
			max.setlScore(0);
			for(i = set.iterator(); i.hasNext();){
				StuStruct temp = i.next();
				if(temp.getlScore() > temp.gethScore()){
					compare(max,temp);
					//j = i;
				}
			}
			//flag = set.remove(max);
			if(set.contains(max)){
				set.remove(max);
				list.add(new StuStruct(max.getId(),max.getlScore(),max.gethScore()));
				//j.remove();
			}else{
				flag =false;
			}
				
		}
		/**
		 * 第四类
		 */
		flag = true;
		while(flag){
			Iterator<StuStruct> i = set.iterator();
			max.sethScore(0);
			max.setId(Integer.MAX_VALUE);
			max.setlScore(0);
			for(; i.hasNext();){
				StuStruct temp = i.next();
				compare(max,temp);
				//j = i;
			}
			//flag = set.remove(max);
			if(set.contains(max)){
				set.remove(max);
				list.add(new StuStruct(max.getId(),max.getlScore(),max.gethScore()));
				//j.remove();
			}else{
				flag =false;
			}
		}
		
		/**
		 * 输出
		 */
		System.out.println(list.size());
		
		for(Iterator<StuStruct> li = list.iterator(); li.hasNext();){
			StuStruct temp = li.next();
			System.out.println(temp.getId() + " " + temp.getlScore() + " " + 
					temp.gethScore());
		}
		
		
	}
	
	public static boolean compare(StuStruct max, StuStruct i){
		
		if(max.getlScore() + max.gethScore() < 
			i.getlScore() + i.gethScore()){
		
			max.setId(i.getId());
			max.setlScore(i.getlScore());
			max.sethScore(i.gethScore());
			return true;
		}else if(max.getlScore() + max.gethScore() == 
				i.getlScore() + i.gethScore()){
			
			if(max.getlScore() < i.getlScore()){
				max.setId(i.getId());
				max.setlScore(i.getlScore());
				max.sethScore(i.gethScore());
				return true;
			}else if(max.getlScore() == i.getlScore()){
				if(max.getId() > i.getId()){
					max.setId(i.getId());
					max.setlScore(i.getlScore());
					max.sethScore(i.gethScore());
					return true;
				}
			}
		}
		return false;
	}

}
