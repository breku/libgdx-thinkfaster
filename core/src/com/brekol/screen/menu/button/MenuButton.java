package com.brekol.screen.menu.button;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;

/**
 * Created by brekol on 10.09.16.
 */
public class MenuButton extends AbstractMenuButton {

    Texture texture = new Texture(Gdx.files.internal("gfx/menu/menu_exit.png"));


    @Override
    public void draw(Batch batch, float parentAlpha) {
        super.draw(batch, parentAlpha);
        batch.draw(texture,0,0);
    }
}
