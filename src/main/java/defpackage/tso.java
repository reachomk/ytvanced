package defpackage;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import com.google.android.libraries.material.dialog.ButtonPaneLayout;
import java.util.Set;

/* renamed from: tso */
public final class tso extends TouchDelegate {
    public final Set a = new zl();
    public TouchDelegate b;
    private final /* synthetic */ ButtonPaneLayout c;

    public tso(ButtonPaneLayout buttonPaneLayout) {
        this.c = buttonPaneLayout;
        super(new Rect(), buttonPaneLayout);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        TouchDelegate touchDelegate = this.b;
        if (touchDelegate != null && touchDelegate.onTouchEvent(motionEvent)) {
            return true;
        }
        motionEvent.offsetLocation((float) (-this.c.getLeft()), (float) (-this.c.getTop()));
        if (!this.a.isEmpty()) {
            for (TouchDelegate onTouchEvent : this.a) {
                if (onTouchEvent.onTouchEvent(motionEvent)) {
                    return true;
                }
            }
        }
        return false;
    }
}
