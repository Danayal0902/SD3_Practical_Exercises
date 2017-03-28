
public class Ball {
	WhiteBall whiteball = new WhiteBall("Whiteball");
	BlackBall blackball = new BlackBall("Blackball");
	
	Ball owner = new Ball();
	
	
	Random ran = new Random();
	int random = ran.Next(0, 12); {
	
	
	if (random <=5) {
		owner = whiteball;
	}
	
	if (random >=6) {
		owner = blackball;
}
	
	display(random.toString());
	
}
}
