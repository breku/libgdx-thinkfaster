package com.brekol;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.brekol.screen.menu.MainMenuScreen;

import static com.brekol.util.ThinkFasterConstants.MENU_BUTTON_EXIT_PATH;

public class ThinkFasterApp extends Game {
    SpriteBatch batch;
    Texture img;


    private final AssetManager assetManager = new AssetManager();

    @Override
    public void create() {
        batch = new SpriteBatch();

        Gdx.input.setInputProcessor(null);
        assetManager.load(MENU_BUTTON_EXIT_PATH, Texture.class);

        img = new Texture("badlogic.jpg");
    }


    @Override
    public void render() {
        super.render();
        if(assetManager.update()){
            setScreen(new MainMenuScreen(assetManager));
        }
    }

    @Override
    public void dispose() {
        batch.dispose();
        img.dispose();
    }
}
