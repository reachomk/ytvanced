package defpackage;

import android.view.View;

/* renamed from: gkq */
public final class gkq extends aoq {
    public final int[] a(apn apn, View view) {
        if (apn.l()) {
            return super.a(apn, view);
        }
        int[] iArr = new int[2];
        iArr[1] = 0;
        if (apn.k()) {
            aol a = aol.a(apn);
            iArr[0] = a.a(view) - a.b();
        } else {
            iArr[0] = 0;
        }
        return iArr;
    }
}
