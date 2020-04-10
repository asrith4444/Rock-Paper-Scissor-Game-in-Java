import java.lang.*;
import java.util.Random;
class Game{
	int A=0,B=0,C=0,D=0;
	//String Great="";
	StringBuilder winner = new StringBuilder("");
	public void incre(String z){
		if(z=="A")
			A++;
		else if(z=="B")
			B++;
		else if(z=="C")
			C++;
		else if(z=="D")
			D++;
	}
	public void rockps(String p, String q){
		Random r = new Random();
		int a=r.nextInt(3);
		int b=r.nextInt(3);
		if(a==0 && b==1){
			System.out.println("Player "+p+"'s choice : Rock \nPlayer "+q+"'s choice : Paper");
			System.out.println("Player "+q+" Won!");
			incre(q);
		}
		else if(a==0 && b==2){
			System.out.println("Player "+p+"'s choice : Rock \nPlayer "+q+"'s choice : Scissor");
			System.out.println("Player "+p+" Won!");
			incre(p);
		}
		else if(a==1 && b==0){
			System.out.println("Player "+p+"'s choice : Paper \nPlayer "+q+"'s choice : Rock");
			System.out.println("Player "+p+" Won!");
			incre(p);
		}
		else if(a==1 && b==2){
			System.out.println("Player "+p+"'s choice : Paper \nPlayer "+q+"'s choice : Scissor");
			System.out.println("Player "+q+" Won!");
			incre(q);
		}
		else if(a==2 && b==0){
			System.out.println("Player "+p+"'s choice : Scissor \nPlayer "+q+"'s choice : Rock");
			System.out.println("Player "+q+" Won!");
			incre(q);
		}	
		else if(a==2 && b==1){
			System.out.println("Player "+p+"'s choice : Scissor \nPlayer "+q+"'s choice : Paper");
			System.out.println("Player "+p+" Won!");
			incre(p);
		}
		else{
			rockps(p,q);
		}
		//return new int[]{t,s};
	}
	public void rockps1(String p, String q){
		Random r = new Random();
		int a=r.nextInt(3);
		int b=r.nextInt(3);
		if(a==0 && b==1){
			System.out.println("Player "+p+"'s choice : Rock \nPlayer "+q+"'s choice : Paper");
			System.out.println("Player "+q+" Won!");
			winner.append(q);
		}
		else if(a==0 && b==2){
			System.out.println("Player "+p+"'s choice : Rock \nPlayer "+q+"'s choice : Scissor");
			System.out.println("Player "+p+" Won!");
			winner.append(p);
		}
		else if(a==1 && b==0){
			System.out.println("Player "+p+"'s choice : Paper \nPlayer "+q+"'s choice : Rock");
			System.out.println("Player "+p+" Won!");
			winner.append(p);
		}
		else if(a==1 && b==2){
			System.out.println("Player "+p+"'s choice : Paper \nPlayer "+q+"'s choice : Scissor");
			System.out.println("Player "+q+" Won!");
			winner.append(q);
		}
		else if(a==2 && b==0){
			System.out.println("Player "+p+"'s choice : Scissor \nPlayer "+q+"'s choice : Rock");
			System.out.println("Player "+q+" Won!");
			winner.append(q);
		}	
		else if(a==2 && b==1){
			System.out.println("Player "+p+"'s choice : Scissor \nPlayer "+q+"'s choice : Paper");
			System.out.println("Player "+p+" Won!");
			winner.append(p);
		}
		else{
			rockps1(p,q);
		}
	}
	public void prewin(){
		if("AC".equals(winner.toString()))
			rockps("A","C");
		else if("AD".equals(winner.toString()))
			rockps("A","D");
		else if("BC".equals(winner.toString()))
			rockps("B","C");
		else if("BD".equals(winner.toString()))
			rockps("B","D");
	}
}
class Main{
	public static void main(String args[]){
		Game obj = new Game();
		int c=1;
		System.out.println("Rock-Paper-Scissor Game \n===============================");
		while(c!=51){
			System.out.println("The Round No : "+c+"\n-------------------------------");
			obj.rockps1("A","B");
			obj.rockps1("C","D");
			System.out.println("The Final Match among : "+obj.winner);
			obj.prewin();
			obj.winner.setLength(0);
			System.out.println("-------------------------------");
			c++;
		}
		System.out.println("The Total Result Of 50 Rounds :\n===============================\nPlayer A won :"+obj.A+" rounds \nPlayer B won :"+obj.B+" rounds \nPlayer C won :"+obj.C+" rounds \nPlayer D won : "+obj.D+" rounds");
	}
}
