package com.brekol.screen.menu.button;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;

import static com.brekol.util.ThinkFasterConstants.MENU_BUTTON_EXIT_PATH;

/**
 * Created by brekol on 10.09.16.
 */
public class ExitButton extends AbstractMenuButton {

    private Texture texture;

    public ExitButton(final AssetManager assetManager) {
        super(assetManager);
        texture = assetManager.get(MENU_BUTTON_EXIT_PATH, Texture.class);
    }


    @Override
    public void draw(Batch batch, float parentAlpha) {
        super.draw(batch, parentAlpha);
        batch.draw(texture, Gdx.graphics.getWidth() / 2 - texture.getWidth() / 2, Gdx.graphics.getHeight() / 5);
    }
}
