package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;

/* renamed from: qc */
public final class qc {
    public final Bundle a;
    public final qt[] b;
    public final qt[] c;
    public boolean d;
    public boolean e;
    public final int f;
    public int g;
    public CharSequence h;
    public PendingIntent i;

    public qc(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        this(i, charSequence, pendingIntent, new Bundle(), null, null, true, true);
    }

    qc(int i, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, qt[] qtVarArr, qt[] qtVarArr2, boolean z, boolean z2) {
        this.e = true;
        this.g = i;
        this.h = qg.f(charSequence);
        this.i = pendingIntent;
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.a = bundle;
        this.b = qtVarArr;
        this.c = qtVarArr2;
        this.d = z;
        this.f = 0;
        this.e = z2;
    }
}
