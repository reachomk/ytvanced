package defpackage;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;

/* renamed from: tlh */
final class tlh implements pte, pth, tlc {
    private final ptd a;
    private final tek b;
    private final ten c;
    private final tfy d = new tfy();

    public tlh(Context context, tek tek, ten ten) {
        this.b = tek;
        this.c = ten;
        ptf ptf = new ptf(context, this, this);
        ptf.a(rqp.a);
        this.a = ptf.b();
    }

    public final void a(psa psa) {
        ten ten = this.c;
        this.d.a(psa);
        ten.c();
    }

    public final void a(Bundle bundle) {
        this.b.a();
    }

    public final void a(int i) {
        this.b.b();
    }

    public final Location a() {
        return rqp.b.a(this.a);
    }

    public final void b() {
        this.a.c();
    }

    public final void c() {
        this.a.e();
    }

    public final boolean d() {
        return this.a.g();
    }

    public final boolean e() {
        return this.a.f();
    }
}
