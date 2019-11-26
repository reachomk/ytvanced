package defpackage;

import java.util.List;

/* renamed from: snu */
public final /* synthetic */ class snu implements soq {
    public static final soq a = new snu();

    private snu() {
    }

    public final clz a(cmg cmg, swk swk, Object obj, String str, bdho bdho, List list) {
        bdgi bdgi = (bdgi) obj;
        bdhp bdhp = bdho != null ? (bdhp) szb.a(bdho, bdhp.a) : null;
        int i = bdhp != null ? bdhp.k : 0;
        snd a = sne.a(cmg);
        a.a(sng.a(i));
        a.a(list);
        i = bdgi.c;
        if (i != 0) {
            a.a(Integer.valueOf(i));
        }
        i = bdgi.b;
        if (i != 0) {
            a.b(Integer.valueOf(i));
        }
        a.a(true);
        return a;
    }
}
