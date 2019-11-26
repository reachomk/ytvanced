package defpackage;

import android.view.MenuItem;

/* renamed from: jpr */
final class jpr extends fai {
    private final int a;
    private final CharSequence b;
    private final apxu c;
    private final /* synthetic */ jps d;

    jpr(jps jps, int i, auvl auvl) {
        apxu apxu;
        this.d = jps;
        arml arml = null;
        if ((auvl.a & 4) != 0) {
            apxu = auvl.d;
            if (apxu == null) {
                apxu = apxu.d;
            }
        } else {
            apxu = null;
        }
        this.c = apxu;
        if ((auvl.a & 1) != 0) {
            arml = auvl.b;
            if (arml == null) {
                arml = arml.f;
            }
        }
        this.b = ajqy.a(arml);
        this.a = i;
    }

    public final boolean b() {
        return false;
    }

    public final ezx d() {
        return null;
    }

    jpr(jps jps, int i, auvp auvp) {
        arml arml;
        this.d = jps;
        apxu apxu = auvp.e;
        if (apxu == null) {
            apxu = apxu.d;
        }
        this.c = apxu;
        if ((auvp.a & 1) != 0) {
            arml = auvp.b;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        this.b = ajqy.a(arml);
        this.a = i;
    }

    public final CharSequence e() {
        return this.b;
    }

    public final int a() {
        return this.a;
    }

    public final int f() {
        return this.a;
    }

    public final void a(MenuItem menuItem) {
        menuItem.setTitle(this.b);
    }

    public final boolean b(MenuItem menuItem) {
        apxu apxu = this.c;
        if (apxu == null) {
            return false;
        }
        this.d.a.a(apxu, null);
        return true;
    }
}
