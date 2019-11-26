package defpackage;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: ziq */
public class ziq implements OnTouchListener {
    private final Context a;
    private final zip b;
    private final GestureDetector c;
    private ScaleGestureDetector d;
    private boolean e;

    public ziq(Context context, zip zip) {
        this.a = (Context) amqw.a((Object) context);
        this.b = (zip) amqw.a((Object) zip);
        this.c = new GestureDetector(context, new zir(this, zip));
    }

    public boolean a() {
        return true;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        this.c.onTouchEvent(motionEvent);
        int action = motionEvent.getAction() & 255;
        boolean a = ziq.a(this.e, view, action, motionEvent);
        this.e = a;
        if (action == 1) {
            this.d = null;
        }
        if (!a || action != 2) {
            return true;
        }
        if (this.d == null) {
            this.d = new ScaleGestureDetector(this.a, new zis(this.b));
        }
        return this.d.onTouchEvent(motionEvent);
    }

    public static boolean a(boolean z, View view, int i, MotionEvent motionEvent) {
        if (i == 1) {
            view.performClick();
            return false;
        } else if (i != 5) {
            return (i == 6 && motionEvent.getPointerCount() < 2) ? false : z;
        } else {
            return true;
        }
    }
}
