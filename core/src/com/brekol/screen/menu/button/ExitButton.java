package com.brekol.screen.menu.button;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;

import static com.brekol.util.ThinkFasterConstants.MENU_BUTTON_EXIT_PATH;

/**
 * Created by brekol on 10.09.16.
 */
public class ExitButton extends AbstractMenuButton {

    private static final String TAG = "ExitButton";
    private Texture texture;

    public ExitButton(final AssetManager assetManager) {
        super(assetManager);
        texture = assetManager.get(MENU_BUTTON_EXIT_PATH, Texture.class);

        int x = Gdx.graphics.getWidth() / 2 - texture.getWidth() / 2;
        int y = Gdx.graphics.getHeight() / 5;
        setBounds(x, y, texture.getWidth(), texture.getHeight());

        addListener(new InputListener() {

            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                Gdx.app.log(TAG, "touch down");
                return true;
            }

            @Override
            public void touchUp(InputEvent event, float x, float y, int pointer, int button) {
                Gdx.app.log(TAG, "Exiting game.");
                Gdx.app.exit();
            }
        });
    }


    @Override
    public void act(float delta) {
        super.act(delta);
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        super.draw(batch, parentAlpha);
        int x = Gdx.graphics.getWidth() / 2 - texture.getWidth() / 2;
        int y = Gdx.graphics.getHeight() / 5;
        batch.draw(texture, x, y);
    }
}
