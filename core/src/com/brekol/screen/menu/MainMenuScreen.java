package com.brekol.screen.menu;

import com.badlogic.gdx.Gdx;
import com.brekol.screen.AbstractScreen;
import com.brekol.screen.menu.button.MenuButton;

/**
 * Created by brekol on 10.09.16.
 */
public class MainMenuScreen extends AbstractScreen {


    private MenuButton startGameButton = new MenuButton();

    @Override
    public void show() {
        Gdx.input.setInputProcessor(stage);


        stage.addActor(startGameButton);

    }

    @Override
    public void render(float delta) {
        super.render(delta);
        spriteBatch.begin();
        stage.draw();
        spriteBatch.end();
    }

    @Override
    public void resize(int width, int height) {
        super.resize(width, height);
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
