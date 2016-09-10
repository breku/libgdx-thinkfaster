package com.brekol;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.brekol.screen.menu.MainMenuScreen;

public class ThinkFasterApp extends Game {
    SpriteBatch batch;
    Texture img;

    @Override
    public void create() {
        batch = new SpriteBatch();
        setScreen(new MainMenuScreen());
        Gdx.input.setInputProcessor(null);


        img = new Texture("badlogic.jpg");
    }


    @Override
    public void dispose() {
        batch.dispose();
        img.dispose();
    }
}
