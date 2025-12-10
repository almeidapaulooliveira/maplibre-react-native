package org.maplibre.reactnative.events;

import android.view.View;

import com.facebook.react.bridge.WritableMap;

import org.maplibre.reactnative.events.constants.EventKeys;

/**
 * Event emitted when circle drawing gesture is completed.
 * Contains the circle polygon coordinates, center point, and radius.
 */
public class CircleDrawEndEvent extends AbstractEvent {
    private WritableMap mPayload;

    public CircleDrawEndEvent(View view, WritableMap payload) {
        super(view, "circleDrawEnd");
        mPayload = payload;
    }

    @Override
    public String getKey() {
        return EventKeys.CIRCLE_DRAW_END;
    }

    @Override
    public WritableMap getPayload() {
        return mPayload;
    }
}
