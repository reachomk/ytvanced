package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.util.List;

/* renamed from: agql */
public abstract class agql {
    public static final int[] a = new int[]{0, 1, 2, 3, 4};

    public abstract aahr a();

    public abstract boolean b();

    public abstract long c();

    public abstract int d();

    public abstract long e();

    public abstract long f();

    public abstract long g();

    public abstract byte[] h();

    public abstract byte[] i();

    public abstract azxz j();

    public abstract String k();

    public abstract int l();

    public abstract String m();

    public abstract boolean n();

    public abstract Uri o();

    public abstract int p();

    public final String q() {
        return a().b;
    }

    public final int r() {
        return a().b();
    }

    public final String s() {
        return a().t();
    }

    public final long t() {
        return a().c();
    }

    public final boolean u() {
        return c() == t();
    }

    public final boolean v() {
        return (TextUtils.isEmpty(m()) || m().startsWith("0000-0000")) ? false : true;
    }

    public final boolean a(List list, zzl zzl) {
        return b(list, zzl) != null;
    }

    public final agpv b(List list, zzl zzl) {
        if (u()) {
            String w = w();
            for (agpv agpv : list) {
                if (agpv != null) {
                    avoa avoa = zzl.b().h;
                    if (avoa == null) {
                        avoa = avoa.w;
                    }
                    if (!avoa.l || m() == null || m().equals(agpv.a)) {
                        if (agpv.c().contains(w)) {
                            if (agpv.b(w, 0, t())) {
                                return agpv;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        }
        return null;
    }

    public final String w() {
        return aeey.a(q(), r(), s(), a().C());
    }

    public final azle x() {
        if (j() == null || i() == null || l() != 1) {
            return null;
        }
        azld azld = (azld) azle.g.createBuilder();
        azlk a = ahdh.a(q(), a().a);
        azld.copyOnWrite();
        azle azle = (azle) azld.instance;
        if (a != null) {
            azle.b = a;
            azle.a = 1 | azle.a;
            azld.copyOnWrite();
            azle azle2 = (azle) azld.instance;
            azle2.a |= 2;
            azle2.c = 2;
            anvu toByteString = j().toByteString();
            azld.copyOnWrite();
            azle azle3 = (azle) azld.instance;
            if (toByteString != null) {
                azle3.a |= 4;
                azle3.d = toByteString;
                byte[] i = i();
                if (i != null) {
                    toByteString = anvu.a(i);
                    azld.copyOnWrite();
                    azle3 = (azle) azld.instance;
                    if (toByteString != null) {
                        azle3.a |= 8;
                        azle3.e = toByteString;
                    } else {
                        throw new NullPointerException();
                    }
                }
                return (azle) ((anxl) azld.build());
            }
            throw new NullPointerException();
        }
        throw new NullPointerException();
    }

    public final agqo y() {
        return agql.z().a(a()).a(b()).a(c()).a(d()).b(e()).c(f()).d(g()).c(p()).a(h()).b(i()).a(j()).a(k()).b(l()).b(m()).b(n()).a(o());
    }

    public static agqo z() {
        agpt agpt = new agpt();
        agpt.a(0);
        agpt.b(0);
        agpt.c(0);
        agpt.d(0);
        agpt.c(1);
        agpt.b(0);
        agpt.b(false);
        return agpt;
    }
}
