package JavaCastleWolfenstein;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.Animation;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Player {
	Image player;
	float playerX = 100;
	float playerY = 100;
	float maxPlayerX = 771;
	float maxPlayerY = 554;
	float minPlayerX = 0;
	float minPlayerY = 0;
	float playerSpeed = 1;
	
	int[] animationDuration = { 200, 200, 200 };
	int delta;
	Animation playerStandingStill;
	Animation playerWalkingRight;
	Animation playerWalkingLeft;
	Animation playerWalkingUp;
	Animation playerWalkingDown;
	Animation currentPlayer;
	
	
	
	boolean gameOn = false;

	public Player() throws SlickException {
		// player = new Image("res/player.png");
		Image[] playerStill = { new Image("res/player/player.png"), new Image("res/player/player.png"), new Image("res/player/player.png") };
		Image[] walkRight = { new Image("res/player/playerright1.png"), new Image("res/player/playerright2.png"), new Image("res/player/playerright3.png") };
		Image[] walkleft = { new Image("res/player/playerleft1.png"), new Image("res/player/playerleft2.png"), new Image("res/player/playerleft3.png") };
		Image[] walkup = { new Image("res/player/playerback.png"), new Image("res/player/playerup1.png"), new Image("res/player/playerup2.png") };
		Image[] walkdown = { new Image("res/player/player.png"), new Image("res/player/playerdown1.png"), new Image("res/player/playerdown2.png") };
		playerWalkingRight = new Animation(walkRight, animationDuration, false);
		playerStandingStill = new Animation(playerStill, animationDuration, false);
		playerWalkingLeft = new Animation(walkleft, animationDuration, false);
		playerWalkingDown = new Animation(walkdown, animationDuration, false);
		playerWalkingUp = new Animation(walkup, animationDuration, false);

		currentPlayer = playerStandingStill;
	}

	public void render(Graphics g) {
		currentPlayer.draw(100, Mouse.getY());
	}

	public void update(int inDelta) {
		this.delta = inDelta;
		currentPlayer.update(delta);
		playerStandingStill.update(delta);
		playerWalkingRight.update(delta);
		playerWalkingLeft.update(delta);
		playerWalkingDown.update(delta);
		playerWalkingUp.update(delta);
	}


	public void setCurrentAnimation(int inAnim) {
		switch (inAnim) {
		case 0: currentPlayer = playerStandingStill;
			break;
		case 1: currentPlayer = playerWalkingRight;
			break;
		case 2: currentPlayer = playerWalkingLeft;
			break;
		case 3: currentPlayer = playerWalkingUp;
			break;
		case 4: currentPlayer = playerWalkingDown;
			break;
		}
		
	}
	
	public Animation getplayer() {
		return currentPlayer;
	}

	public float getPlayerX() {
		return playerX;
	}

	public void setPlayerX(float playerX) {
		this.playerX = playerX;
	}

	public float getPlayerY() {
		return playerY;
	}

	public void setPlayerY(float playerY) {
		this.playerY = playerY;
	}

	public float getMaxPlayerX() {
		return maxPlayerX;
	}

	public void setMaxPlayerX(float maxPlayerX) {
		this.maxPlayerX = maxPlayerX;
	}

	public float getMaxPlayerY() {
		return maxPlayerY;
	}

	public void setMaxPlayerY(float maxPlayerY) {
		this.maxPlayerY = maxPlayerY;
	}

	public float getMinPlayerX() {
		return minPlayerX;
	}

	public void setMinPlayerX(float minPlayerX) {
		this.minPlayerX = minPlayerX;
	}

	public float getMinPlayerY() {
		return minPlayerY;
	}

	public void setMinPlayerY(float minPlayerY) {
		this.minPlayerY = minPlayerY;
	}

	public float getPlayerSpeed() {
		return playerSpeed;
	}

	public void setPlayerSpeed(float playerSpeed) {
		this.playerSpeed = playerSpeed;
	}


}
