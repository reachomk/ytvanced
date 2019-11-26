package defpackage;

import java.util.List;

/* renamed from: mrd */
public final class mrd {
    public static aiqq a(String str, long j) {
        aiqs a = aiqq.a();
        a.a = msf.a(str, j);
        return a.b();
    }

    public static aiqq a(String str, int i, long j) {
        aiqs a = aiqq.a();
        a.a = msf.a(str, i, j);
        return a.b();
    }

    public static aiqq a(List list, int i, long j) {
        int max = Math.max(0, Math.min(list.size() - 1, i));
        if (max != i) {
            ammj.a("Out of bounds video list index. Using nearest valid index.", new Object[0]);
        }
        aiqs a = aiqq.a();
        a.a(list);
        a.b = max;
        a.g = j;
        return a.b();
    }

    public static apxu a(aiqq aiqq) {
        apxu apxu = aiqq.b;
        return apxu == null ? msf.a(aiqq.f(), aiqq.d(), aiqq.g()) : apxu;
    }
}
