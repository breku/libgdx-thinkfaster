package com.brekol.screen.menu.button;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;

/**
 * Created by brekol on 10.09.16.
 */
public class MenuButton extends AbstractMenuButton {

    private Texture texture;

    public MenuButton(final AssetManager assetManager, final String pathToResource) {
        super(assetManager);
        initialize(pathToResource);
    }

    private void initialize(final String pathToResource) {
        texture = assetManager.get(pathToResource, Texture.class);
    }


    @Override
    public void draw(Batch batch, float parentAlpha) {
        super.draw(batch, parentAlpha);
        batch.draw(texture, 0, 0);
    }
}
