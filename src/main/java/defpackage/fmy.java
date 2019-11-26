package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: fmy */
public final class fmy {
    public final fmz a;
    public final WeakReference b;
    public final WeakReference c;
    public final WeakReference d;

    fmy(fmx fmx, aruh aruh, View view, acvx acvx, albc albc) {
        this.a = new fmz(aruh.b, view, fmx.f);
        this.b = new WeakReference(aruh);
        this.c = new WeakReference(acvx);
        this.d = new WeakReference(albc);
    }
}
