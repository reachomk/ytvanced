package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: aaqb */
public final class aaqb implements aaqc {
    private final apkz a;
    private List b;

    public aaqb(apkz apkz) {
        this.a = (apkz) amqw.a((Object) apkz);
    }

    public final String a() {
        return this.a.c;
    }

    public final CharSequence b() {
        arml arml;
        apkz apkz = this.a;
        if ((apkz.a & 2) != 0) {
            arml = apkz.b;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        return ajqy.a(arml);
    }

    public final boolean c() {
        return this.a.d;
    }

    public final String d() {
        return this.a.f;
    }

    public final CharSequence e() {
        arml arml;
        apkz apkz = this.a;
        if ((apkz.a & 32) != 0) {
            arml = apkz.e;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        return ajqy.a(arml);
    }

    public final boolean f() {
        return this.a.g;
    }

    public final List a(aaas aaas) {
        if (this.b == null) {
            this.b = new ArrayList();
            for (arml a : this.a.h) {
                this.b.add(aabb.a(a, aaas, false));
            }
        }
        return this.b;
    }

    public final CharSequence a(int i) {
        if (i - 1 != 0) {
            return "";
        }
        arml arml;
        apkz apkz = this.a;
        if ((apkz.a & 512) != 0) {
            arml = apkz.i;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        return ajqy.a(arml);
    }
}
