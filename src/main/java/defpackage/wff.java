package defpackage;

import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;

/* renamed from: wff */
final class wff implements OnPreDrawListener {
    private final /* synthetic */ albo a;
    private final /* synthetic */ View b;
    private final /* synthetic */ wfe c;

    wff(wfe wfe, albo albo, View view) {
        this.c = wfe;
        this.a = albo;
        this.b = view;
    }

    public final boolean onPreDraw() {
        if (this.a.c()) {
            int[] iArr = this.c.a;
            int i = iArr[0];
            int i2 = iArr[1];
            this.b.getLocationOnScreen(iArr);
            iArr = this.c.a;
            if (!(i == iArr[0] && i2 == iArr[1])) {
                this.a.a();
            }
            return true;
        }
        this.b.getViewTreeObserver().removeOnPreDrawListener(this);
        return true;
    }
}
