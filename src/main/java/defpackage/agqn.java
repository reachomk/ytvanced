package defpackage;

import android.net.Uri;
import java.util.List;

/* renamed from: agqn */
public final class agqn {
    public final agql a;
    public final agql b;
    public final long c;
    public final long d;
    public final Uri e;
    public final boolean f;
    public final String g;
    public final boolean h;
    public final int i;

    public agqn(agql agql, agql agql2, boolean z) {
        int p;
        Uri o;
        String m;
        boolean v;
        boolean z2 = true;
        if (agql == null && agql2 == null) {
            z2 = false;
        }
        amqw.a(z2);
        this.a = agql;
        this.b = agql2;
        long j = 0;
        this.c = (agql != null ? agql.c() : 0) + (agql2 != null ? agql2.c() : 0);
        long t = agql != null ? agql.t() : 0;
        if (agql2 != null) {
            j = agql2.t();
        }
        this.d = t + j;
        if (agql == null) {
            agql2.f();
        } else {
            agql.f();
        }
        if (agql == null) {
            agql2.g();
        } else {
            agql.g();
        }
        if (agql == null) {
            p = agql2.p();
        } else {
            p = agql.p();
        }
        this.i = p;
        if (agql != null) {
            o = agql.o();
        } else {
            o = agql2.o();
        }
        this.e = o;
        this.f = z;
        if (agql != null) {
            m = agql.m();
        } else {
            m = agql2.m();
        }
        this.g = m;
        if (agql == null) {
            v = agql2.v();
        } else {
            v = agql.v();
        }
        this.h = v;
    }

    public final String a() {
        boolean z = true;
        if (this.a == null && this.b == null) {
            z = false;
        }
        amqw.b(z);
        agql agql = this.a;
        if (agql == null) {
            agql = this.b;
        }
        return agql.q();
    }

    public final aahr a(List list, zzl zzl) {
        agql agql = this.a;
        return (agql != null && agql.u() && this.a.a(list, zzl)) ? this.a.a() : null;
    }

    public final aahr b() {
        agql agql = this.a;
        return agql != null ? agql.a() : null;
    }

    public final aahr b(List list, zzl zzl) {
        agql agql = this.b;
        return (agql != null && agql.u() && this.b.a(list, zzl)) ? this.b.a() : null;
    }

    public final aahr c() {
        agql agql = this.b;
        return agql != null ? agql.a() : null;
    }

    public static agqn a(agql agql, agql agql2) {
        return new agqn(agql, agql2, true);
    }
}
