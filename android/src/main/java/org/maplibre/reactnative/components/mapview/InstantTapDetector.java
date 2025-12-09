package org.maplibre.reactnative.components.mapview;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;

public class InstantTapDetector {

    public interface OnInstantTapListener {
        void onInstantTap(MotionEvent e);
    }

    private GestureDetector detector;
    private OnInstantTapListener listener;
    private boolean enabled = false;

    public InstantTapDetector(Context context) {
        detector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() {
            @Override
            public boolean onSingleTapUp(MotionEvent e) {
                // Fires IMMEDIATELY - no double-tap wait!
                if (enabled && listener != null) {
                    listener.onInstantTap(e);
                    return true;
                }
                return false;
            }
        });
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public void setListener(OnInstantTapListener listener) {
        this.listener = listener;
    }

    public boolean onTouchEvent(MotionEvent event) {
        if (enabled) {
            return detector.onTouchEvent(event);
        }
        return false;
    }
}
