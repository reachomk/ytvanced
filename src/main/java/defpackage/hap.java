package defpackage;

import android.text.TextUtils;

/* renamed from: hap */
public final class hap implements har {
    public final xsc a;
    public long b = -1;
    private final eic c;
    private boolean d = false;

    public hap(xsc xsc, eic eic) {
        this.a = xsc;
        this.c = eic;
    }

    public final void a(String str) {
        if (!this.d && TextUtils.equals(str, "library-recent")) {
            this.d = true;
            this.c.a(new hao(this));
        }
    }

    public final boolean a(String str, long j) {
        return TextUtils.equals(str, "library-recent") && j < this.b;
    }
}
