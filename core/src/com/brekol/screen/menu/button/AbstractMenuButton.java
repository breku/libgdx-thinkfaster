package com.brekol.screen.menu.button;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Touchable;

/**
 * Created by brekol on 10.09.16.
 */
public abstract class AbstractMenuButton extends Actor {

    final AssetManager assetManager;

    protected AbstractMenuButton(AssetManager assetManager) {
        this.assetManager = assetManager;
        setTouchable(Touchable.enabled);

    }
}
