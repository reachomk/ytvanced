package defpackage;

import android.content.Context;

/* renamed from: tez */
public class tez implements ter, tgb {
    private final Context a;
    private final tfy b;
    private final ptd c;

    protected tez(Context context, ptd ptd, tfy tfy) {
        this.a = context;
        this.c = ptd;
        this.b = tfy;
    }

    public final teg a() {
        return this.b.a(this.c.d());
    }

    public final void b() {
        this.c.c();
    }

    public final void c() {
        this.c.e();
    }

    public final boolean d() {
        return this.c.f();
    }

    public final boolean e() {
        return this.c.g();
    }

    public final Context f() {
        return this.a;
    }

    public final ptd g() {
        return this.c;
    }
}
