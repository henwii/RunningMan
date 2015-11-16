package com.mygdx.game;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

/**
 * Created by Besten on 2015-11-16.
 */
public class Man {

    float x = 100;
    float y = 100;
    float vx = 2;
    float vy;
    float radius = 20;

    public void render(ShapeRenderer shapeRenderer) {
        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
        shapeRenderer.setColor(Color.RED);
        shapeRenderer.circle(x,y,radius);
        shapeRenderer.end();
    }

    public void update(float delta) {
        x += vx;
        y += vy;

        

    }
}
