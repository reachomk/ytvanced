package defpackage;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import java.util.IdentityHashMap;
import java.util.Map;

/* renamed from: xrl */
public final class xrl extends TouchDelegate {
    private final Map a = new IdentityHashMap();
    private TouchDelegate b;

    private xrl(View view, TouchDelegate touchDelegate) {
        super(new Rect(), view);
        if (touchDelegate instanceof xrl) {
            xrl xrl = (xrl) touchDelegate;
            this.b = xrl.b;
            this.a.putAll(xrl.a);
            return;
        }
        this.b = touchDelegate;
    }

    public final void a(View view) {
        this.a.remove(view);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        TouchDelegate touchDelegate = this.b;
        int a = touchDelegate != null ? xrl.a(motionEvent, touchDelegate) : false;
        for (TouchDelegate a2 : this.a.values()) {
            a |= xrl.a(motionEvent, a2);
        }
        if (a != 0) {
            return true;
        }
        return false;
    }

    private static boolean a(MotionEvent motionEvent, TouchDelegate touchDelegate) {
        motionEvent = MotionEvent.obtain(motionEvent);
        boolean onTouchEvent = touchDelegate.onTouchEvent(motionEvent);
        motionEvent.recycle();
        return onTouchEvent;
    }

    public static void a(View view, View view2, TouchDelegate touchDelegate) {
        TouchDelegate touchDelegate2;
        amqw.a((Object) view);
        amqw.a((Object) view2);
        amqw.a((Object) touchDelegate);
        TouchDelegate touchDelegate3 = view.getTouchDelegate();
        if (touchDelegate3 instanceof xrl) {
            touchDelegate2 = (xrl) touchDelegate3;
        } else {
            touchDelegate2 = new xrl(view, touchDelegate3);
        }
        amqw.b((touchDelegate instanceof xrl) ^ 1);
        touchDelegate2.a.put((View) amqw.a((Object) view2), (TouchDelegate) amqw.a((Object) touchDelegate));
        if (touchDelegate == touchDelegate2.b) {
            touchDelegate2.b = null;
        }
        if (touchDelegate3 != touchDelegate2) {
            view.setTouchDelegate(touchDelegate2);
        }
    }
}
