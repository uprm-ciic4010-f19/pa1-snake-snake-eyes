package Game.GameStates;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import Main.Handler;
import Resources.Images;
import UI.UIImageButton;
import UI.UIManager;


/**
 * Created by AlexVR on 7/1/2018.
 */
public class GameOverState extends State {

	private int count = 0;
	private UIManager uiManager;
	

	public GameOverState(Handler handler) {
		super(handler);
		uiManager = new UIManager(handler);
		handler.getMouseManager().setUimanager(uiManager);
		

		
		uiManager.addObjects(new UIImageButton(312, 523, 128, 64, Images.BTitle, () -> {
			handler.getMouseManager().setUimanager(null);
			State.setState(handler.getGame().menuState);
		}));

	}

	@Override
	public void tick() {

		handler.getMouseManager().setUimanager(uiManager);
		uiManager.tick();
		count++;
		if (count >= 30) {
			count = 30;
		}
		if (handler.getKeyManager().pbutt && count >= 30) {
			count = 0;

			State.setState(handler.getGame().gameState);
		}

	}

	@Override
	public void render(Graphics g) {
		
		g.setColor(Color.white);
		
		g.setFont(new Font("Impact", Font.BOLD, 100));

		g.drawString("GAME OVER", 180, 300);

		uiManager.Render(g);

	}
}
