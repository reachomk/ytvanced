package defpackage;

import java.util.Arrays;
import java.util.List;

/* renamed from: adpw */
public abstract class adpw {
    public static final adpw k = adpw.n().e();

    public abstract String a();

    public abstract List b();

    public abstract long c();

    public abstract ajis d();

    public abstract String e();

    public abstract int f();

    public abstract String g();

    public abstract String h();

    public abstract boolean i();

    public abstract byte[] j();

    public abstract adpv k();

    public final boolean l() {
        if (m() || (e().isEmpty() ^ 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        return a().isEmpty() ^ 1;
    }

    public final boolean a(String str) {
        return a().equals(str);
    }

    public final boolean b(String str) {
        return aebk.a(e(), str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof adpw) {
            adpw adpw = (adpw) obj;
            if (a(adpw.a()) && b(adpw.e()) && f() == adpw.f() && i() == adpw.i() && amqq.a(g(), adpw.g()) && amqq.a(h(), adpw.h()) && Arrays.equals(j(), adpw.j())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = new Object[7];
        objArr[0] = a();
        objArr[1] = !aebk.a(e()) ? e() : "RQ";
        objArr[2] = Integer.valueOf(f());
        objArr[3] = g();
        objArr[4] = h();
        objArr[5] = Boolean.valueOf(i());
        objArr[6] = Integer.valueOf(Arrays.hashCode(j()));
        return Arrays.hashCode(objArr);
    }

    public static adpv n() {
        adpq adpq = new adpq();
        adpq.a(false);
        adpq.a(0);
        adpq.a(-1);
        return adpq;
    }

    public static adpw a(autt autt) {
        return adpw.n().a(autt.c).b(autt.e).a(autt.f).a((long) autt.d).d(autt.g).a(autt.h).e();
    }

    public static int a(int i) {
        return i < 0 ? k.f() : i + 1;
    }

    public static int b(int i) {
        return i <= 0 ? k.f() : i - 1;
    }
}
