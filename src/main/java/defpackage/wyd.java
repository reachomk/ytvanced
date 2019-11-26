package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;

/* renamed from: wyd */
public final class wyd implements wya {
    private final wxz a;
    private final ddv b;
    private final wye c;

    public wyd(Context context, wxz wxz, wye wye) {
        this.a = wxz;
        this.b = new ddv(new dea(context));
        this.c = wye;
    }

    public final boolean a(String str, long j, long j2, boolean z, int i, boolean z2, Bundle bundle, wxy wxy, boolean z3) {
        long j3 = j;
        dek a = a(z, i, z2, bundle, wxy, z3);
        a.c = str;
        a.i = true;
        a.d = dfe.a((int) (j3 - j2), (int) j3);
        this.b.a(a.a());
        return true;
    }

    public final boolean a(String str, long j, long j2, boolean z, int i, boolean z2, Bundle bundle, wxy wxy, boolean z3, boolean z4) {
        String str2 = str;
        long j3 = j;
        dek a = a(z, i, z2, bundle, wxy, z3);
        a.i = false;
        a.d = dfe.a((int) j3, (int) (j3 + j2));
        if (z4) {
            String d = this.a.d(str);
            if (d == null) {
                return false;
            }
            a.c = d;
            this.a.a(str, d);
            this.b.a(a.a());
        } else {
            a.c = str2;
            this.b.a(a.a());
        }
        return true;
    }

    public final void a(String str) {
        this.b.a(str);
    }

    public final void b(String str) {
        if (this.a.a(str)) {
            for (String str2 : new HashSet(this.a.b(str))) {
                this.b.a(str2);
                this.a.b(str, str2);
            }
        }
    }

    private final dek a(boolean z, int i, boolean z2, Bundle bundle, wxy wxy, boolean z3) {
        dek a = this.b.a();
        a.a(this.c.a());
        a.h = z;
        a.e = !z3 ? 1 : 2;
        if (!(bundle == null && this.c.b() == null)) {
            Bundle bundle2 = new Bundle();
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            if (this.c.b() != null) {
                bundle2.putAll(this.c.b());
            }
            a.b = bundle2;
        }
        if (wxy != null) {
            ddv ddv = this.b;
            int i2 = wxy.a == 0 ? 1 : 2;
            int i3 = wxy.b;
            int i4 = wxy.c;
            dff dff = ddv.a;
            dfc dfc = new dfc(i2, i3, i4);
            dfg.a(dff.a.a(dfc));
            a.g = dfc;
        }
        if (i == 2) {
            a.a(1);
        } else if (i == 1) {
            a.a(2);
        }
        if (z2) {
            a.a(4);
        }
        return a;
    }
}
