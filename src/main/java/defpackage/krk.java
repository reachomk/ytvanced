package defpackage;

import android.view.MotionEvent;
import android.view.accessibility.AccessibilityManager;
import java.util.ArrayList;
import java.util.List;

/* renamed from: krk */
final /* synthetic */ class krk implements wcc {
    private final krl a;

    krk(krl krl) {
        this.a = krl;
    }

    public final void a(MotionEvent motionEvent, List list) {
        krl krl = this.a;
        if (!krl.a(krl.h, motionEvent, list)) {
            ArrayList arrayList = new ArrayList(list);
            arrayList.remove(krl.h);
            arrayList.remove(krl.i);
            if (!(list.contains(krl.i) || krl.e())) {
                AccessibilityManager a = xrn.a(krl.d);
                if (a == null || !a.isEnabled()) {
                    krl.c(krl.h, motionEvent, arrayList);
                    return;
                }
            }
            krl.b(krl.h, motionEvent, arrayList);
        }
    }
}
