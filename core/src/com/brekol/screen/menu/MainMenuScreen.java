package com.brekol.screen.menu;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.brekol.screen.AbstractScreen;
import com.brekol.screen.menu.button.ExitButton;

import static com.brekol.util.ThinkFasterConstants.BLACKBOARD_BACKGROUND_PATH;
import static com.brekol.util.ThinkFasterConstants.FONT_BOLD_PATH;

/**
 * Created by brekol on 10.09.16.
 */
public class MainMenuScreen extends AbstractScreen {

    protected BitmapFont bitmapFont;

    private ExitButton exitButton = new ExitButton(assetManager);
    private Texture background = assetManager.get(BLACKBOARD_BACKGROUND_PATH, Texture.class);
//    private Image background2 = assetManager.get(BLACKBOARD_BACKGROUND_PATH, Texture.class);
    private ShapeRenderer shapeRenderer = new ShapeRenderer();

    public MainMenuScreen(AssetManager assetManager) {
        super(assetManager);
    }

    @Override
    public void show() {
        stage.addActor(exitButton);
        Gdx.input.setInputProcessor(stage);

        bitmapFont = assetManager.get(FONT_BOLD_PATH, BitmapFont.class);
        bitmapFont.setColor(1.0f, 1.0f, 1.0f, 1.0f);


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

    @Override
    public void render(float delta) {
        super.render(delta);
        spriteBatch.begin();
        spriteBatch.draw(background, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());

        spriteBatch.end();

        spriteBatch.begin();
        stage.act(delta);
        stage.draw();
        spriteBatch.end();

        int x = Gdx.graphics.getWidth() / 2 - 70;
        int y = Gdx.graphics.getHeight() / 5 - 40;
        shapeRenderer.begin(ShapeRenderer.ShapeType.Line);
        shapeRenderer.setColor(1, 1, 0, 1);
        shapeRenderer.rect(x,y,100,50);
        shapeRenderer.end();
    }

    @Override
    public void resize(int width, int height) {
        super.resize(width, height);

        int x = Gdx.graphics.getWidth() / 2 - 70;
        int y = Gdx.graphics.getHeight() / 5 - 40;
        exitButton.setBounds(x, y, 100, 50);

//        Matrix4 matrix = new Matrix4();
//        matrix.setToOrtho2D(0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
//        stage.getBatch().setProjectionMatrix(matrix);
    }
}
