package com.brekol.screen.menu.button;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Touchable;

import static com.brekol.util.ThinkFasterConstants.FONT_BOLD_PATH;

/**
 * Created by brekol on 10.09.16.
 */
public abstract class AbstractMenuButton extends Actor {

    final AssetManager assetManager;

    protected BitmapFont bitmapFont;


    protected AbstractMenuButton(AssetManager assetManager) {
        this.assetManager = assetManager;
        setTouchable(Touchable.enabled);
        bitmapFont = assetManager.get(FONT_BOLD_PATH, BitmapFont.class);
        bitmapFont.setColor(1.0f, 1.0f, 1.0f, 1.0f);

    }
}
