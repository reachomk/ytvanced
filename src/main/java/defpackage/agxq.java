package defpackage;

import android.content.Intent;
import android.os.Binder;
import java.util.Map;

/* renamed from: agxq */
public final class agxq extends Binder {
    public final /* synthetic */ agxl a;

    public agxq(agxl agxl) {
        this.a = agxl;
    }

    public final Map a() {
        agxl agxl = this.a;
        if (agxl.c) {
            return amur.a(agxl.b);
        }
        return amwm.a;
    }

    public final void a(String str, String str2, int i, agpw agpw) {
        c();
        agxl agxl = this.a;
        agxl.f = agxl.e.a(str, str2, i, agpw);
    }

    public final void a(String str, int i) {
        c();
        agxl agxl = this.a;
        agxl.f = agxl.e.a(str, i);
    }

    public final String b() {
        return this.a.e.d();
    }

    public final void c() {
        agxl agxl = this.a;
        xva.a(agxl, new Intent(agxl, agxl.getClass()));
    }
}
