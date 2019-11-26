package defpackage;

import android.content.Context;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;

/* renamed from: aan */
public final class aan {
    private final aam a;

    public aan(Context context, OnGestureListener onGestureListener) {
        this(context, onGestureListener, (byte) 0);
    }

    public aan(Context context, OnGestureListener onGestureListener, byte b) {
        this.a = new aap(context, onGestureListener);
    }

    public final boolean a(MotionEvent motionEvent) {
        return this.a.a(motionEvent);
    }
}
