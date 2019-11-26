package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: kbk */
final /* synthetic */ class kbk implements OnTouchListener {
    private final kbi a;

    kbk(kbi kbi) {
        this.a = kbi;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        jud jud = this.a.a;
        if (jud != null) {
            jud.c();
        }
        return false;
    }
}
