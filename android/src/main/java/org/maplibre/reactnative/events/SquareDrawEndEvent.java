package org.maplibre.reactnative.events;

import android.view.View;

import com.facebook.react.bridge.WritableMap;

import org.maplibre.reactnative.events.constants.EventKeys;

/**
 * Event emitted when square drawing gesture is completed.
 * Contains the square polygon coordinates, center point, and side length.
 */
public class SquareDrawEndEvent extends AbstractEvent {
    private WritableMap mPayload;

    public SquareDrawEndEvent(View view, WritableMap payload) {
        super(view, "squareDrawEnd");
        mPayload = payload;
    }

    @Override
    public String getKey() {
        return EventKeys.SQUARE_DRAW_END;
    }

    @Override
    public WritableMap getPayload() {
        return mPayload;
    }
}
