package defpackage;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.ViewGroup;

/* renamed from: kyb */
final /* synthetic */ class kyb implements Runnable {
    private final kxy a;
    private final int b;

    kyb(kxy kxy, int i) {
        this.a = kxy;
        this.b = i;
    }

    public final void run() {
        kxy kxy = this.a;
        int i = this.b;
        ViewGroup viewGroup = kxy.a;
        klk klk = kxy.b;
        TouchDelegate touchDelegate = null;
        if (klk.a() && abe.D(klk.a)) {
            Rect rect = new Rect();
            klk.a.getHitRect(rect);
            viewGroup.offsetDescendantRectToMyCoords(klk.f, rect);
            i = -i;
            rect.inset(i, i);
            touchDelegate = new xrm(rect, klk.a, viewGroup);
        }
        viewGroup.setTouchDelegate(touchDelegate);
    }
}
