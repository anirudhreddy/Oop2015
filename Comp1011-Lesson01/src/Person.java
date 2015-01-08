
public class Person {
	
		float height;
		float weight;
		public Person() {
			this.height = 6;
			this.weight = 300;
			
		}
		
		public void walks(){
			this.weight *= 0.9;
			System.out.println("You lost weight!");
			System.out.println("Your weigh:" + this.weight);
		}
		
		public void eats() {
			this.weight *= 1.2;
			System.out.println("You Gained weight!");
			System.out.println("You weigh : " + this.weight);
			
		}
		public void marathon(int walking) {
			for (int i = 0; 
					i < walking; i++) {
						walks();
			
		}
		}
			public void eat (int eating){
				for (int i = 0; 
						i < eating; i++) {
							eats();
			}
		}
	}


