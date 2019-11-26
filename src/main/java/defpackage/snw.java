package defpackage;

import java.util.List;

/* renamed from: snw */
public final /* synthetic */ class snw implements sos {
    public static final sos a = new snw();

    private snw() {
    }

    public final clz a(cmg cmg, swk swk, Object obj, bapc bapc, List list) {
        baom baom = (baom) obj;
        snd a = sne.a(cmg);
        a.a(snf.a(bapc));
        a.a(list);
        int a2 = baom.a(6);
        long j = 0;
        a2 = (int) (a2 != 0 ? ((long) baom.b.getInt(a2 + baom.a)) & 4294967295L : 0);
        if (a2 != 0) {
            a.a(Integer.valueOf(a2));
        }
        a2 = baom.a(4);
        if (a2 != 0) {
            j = ((long) baom.b.getInt(a2 + baom.a)) & 4294967295L;
        }
        a2 = (int) j;
        if (a2 != 0) {
            a.b(Integer.valueOf(a2));
        }
        a.a(true);
        return a;
    }
}
