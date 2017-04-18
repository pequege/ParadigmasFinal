package pkgVentanaplayaround;
public enum Color {
		//SON STATIC, FINAL 
		RED, BLUE, YELLOW, BLACK;
		
		//add more class members
		private int red;
		private int green;
		private int blue;
		
		//los constructores deben ser Private
		private Color(int r, int g, int b){
				red = r;
				green = g;
				blue = b;
		}
}
