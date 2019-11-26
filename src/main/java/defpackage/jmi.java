package defpackage;

import android.view.View;

/* renamed from: jmi */
final class jmi implements apq {
    private final /* synthetic */ jmh a;

    jmi(jmh jmh) {
        this.a = jmh;
    }

    public final void a() {
    }

    public final void a(View view) {
        jml jml = this.a.d;
        if (jml != null && view.equals(jml.a)) {
            this.a.d.b();
        }
    }
}
