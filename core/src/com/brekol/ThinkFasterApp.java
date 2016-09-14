package com.brekol;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.brekol.screen.menu.MainMenuScreen;

import static com.brekol.util.ThinkFasterConstants.*;

public class ThinkFasterApp extends Game {


    private final AssetManager assetManager = new AssetManager();

    private boolean isScreenSet = false;

    @Override
    public void create() {
        assetManager.load(BLACKBOARD_BACKGROUND_PATH, Texture.class);
        assetManager.load(FONT_PATH, BitmapFont.class);
        assetManager.load(FONT_BOLD_PATH, BitmapFont.class);

    }

    @Override
    public void dispose() {
    }

    @Override
    public void render() {
        super.render();
        if (assetManager.update() && !isScreenSet) {
            setScreen(new MainMenuScreen(assetManager));
            isScreenSet = true;
        }
    }
}
