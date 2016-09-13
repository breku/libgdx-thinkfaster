package com.brekol;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;
import com.brekol.screen.menu.MainMenuScreen;

import static com.brekol.util.ThinkFasterConstants.BLACKBOARD_BACKGROUND_PATH;
import static com.brekol.util.ThinkFasterConstants.MENU_BUTTON_EXIT_PATH;

public class ThinkFasterApp extends Game {


    private final AssetManager assetManager = new AssetManager();

    @Override
    public void create() {

        Gdx.input.setInputProcessor(null);
        assetManager.load(MENU_BUTTON_EXIT_PATH, Texture.class);
        assetManager.load(BLACKBOARD_BACKGROUND_PATH, Texture.class);

    }


    @Override
    public void render() {
        super.render();
        if (assetManager.update()) {
            setScreen(new MainMenuScreen(assetManager));
        }
    }

    @Override
    public void dispose() {
    }
}
