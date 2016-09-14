package com.brekol.screen.menu.button;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;

/**
 * Created by brekol on 10.09.16.
 */
public class ExitButton extends AbstractMenuButton {

    private static final String TAG = "ExitButton";


    public ExitButton(final AssetManager assetManager) {
        super(assetManager);
        int x = Gdx.graphics.getWidth() / 2 - 70;
        int y = Gdx.graphics.getHeight() / 5 - 40;
        setBounds(x, y, 100, 50);

        addListener(new InputListener() {


            // touchDown has to return true to touchUp fire
            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                Gdx.app.log(TAG, String.format("touch down at position x=%s y=%s", x, y));
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
    public void draw(Batch batch, float parentAlpha) {
        super.draw(batch, parentAlpha);
        int x = Gdx.graphics.getWidth() / 2 - 50;
        int y = Gdx.graphics.getHeight() / 5;
        bitmapFont.draw(batch, "Exit", x, y);
    }


    @Override
    public void act(float delta) {
        super.act(delta);
    }
}
