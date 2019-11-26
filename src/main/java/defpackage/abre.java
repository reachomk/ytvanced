package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: abre */
final /* synthetic */ class abre implements OnTouchListener {
    private final abrf a;
    private final abun b;

    abre(abrf abrf, abun abun) {
        this.a = abrf;
        this.b = abun;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        abrf abrf = this.a;
        abun abun = this.b;
        if (abrf.d && abun != null) {
            abun.f();
        }
        return false;
    }
}
