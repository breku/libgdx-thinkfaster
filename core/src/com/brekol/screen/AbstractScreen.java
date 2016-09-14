package com.brekol.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.FillViewport;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.badlogic.gdx.utils.viewport.Viewport;


/**
 * Created by brekol on 10.09.16.
 */
public abstract class AbstractScreen implements Screen {



    final protected OrthographicCamera camera = new OrthographicCamera();

    final protected Viewport viewport = new StretchViewport(Gdx.graphics.getWidth(), Gdx.graphics.getHeight(),camera);
    final protected Stage stage = new Stage(viewport);
    final protected AssetManager assetManager;

    final protected SpriteBatch spriteBatch = new SpriteBatch();

    protected AbstractScreen(AssetManager assetManager) {
        this.assetManager = assetManager;
    }


    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1, 1, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

    }

    @Override
    public void resize(int width, int height) {
        viewport.update(width, height);
        spriteBatch.getProjectionMatrix().setToOrtho2D(0, 0, width, height);


        camera.setToOrtho(false);
        stage.getBatch().setProjectionMatrix(camera.combined);
    }
}
