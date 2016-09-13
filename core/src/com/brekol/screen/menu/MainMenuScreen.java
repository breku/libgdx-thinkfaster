package com.brekol.screen.menu;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;
import com.brekol.screen.AbstractScreen;
import com.brekol.screen.menu.button.ExitButton;

import static com.brekol.util.ThinkFasterConstants.BLACKBOARD_BACKGROUND_PATH;

/**
 * Created by brekol on 10.09.16.
 */
public class MainMenuScreen extends AbstractScreen {


    private ExitButton exitButton = new ExitButton(assetManager);
    private Texture background = assetManager.get(BLACKBOARD_BACKGROUND_PATH, Texture.class);

    public MainMenuScreen(AssetManager assetManager) {
        super(assetManager);
    }

    @Override
    public void show() {
        Gdx.input.setInputProcessor(stage);
        stage.addActor(exitButton);
    }

    @Override
    public void render(float delta) {
        super.render(delta);
        spriteBatch.begin();
        spriteBatch.draw(background, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        spriteBatch.end();

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
