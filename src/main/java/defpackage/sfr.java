package defpackage;

import java.util.HashSet;

/* renamed from: sfr */
public final class sfr extends sfw {
    private static final HashSet b = new HashSet();
    private static final HashSet c = new HashSet();
    private static final HashSet d = new HashSet();
    private static final HashSet e = new HashSet();

    public static sfr a(bcfl bcfl) {
        String str = bcfl.c;
        int i = bcfl.b != bcfn.b.b ? b.contains(Integer.valueOf(bcfl.b)) ? 200 : 201 : 1;
        if (c.contains(Integer.valueOf(bcfl.b))) {
            str = bcfl.d;
        } else if (d.contains(Integer.valueOf(bcfl.b))) {
            str = "Client error";
        } else if (e.contains(Integer.valueOf(bcfl.b))) {
            str = "Unknown AppAuth error";
        }
        return new sfr(i, str);
    }

    private sfr(int i, String str) {
        super(i, str);
    }

    static {
        b.add(Integer.valueOf(bcfo.a.b));
        b.add(Integer.valueOf(bcfo.b.b));
        b.add(Integer.valueOf(bcfo.c.b));
        b.add(Integer.valueOf(bcfp.a.b));
        b.add(Integer.valueOf(bcfp.b.b));
        b.add(Integer.valueOf(bcfp.c.b));
        b.add(Integer.valueOf(bcfp.d.b));
        b.add(Integer.valueOf(bcfp.e.b));
        b.add(Integer.valueOf(bcfp.f.b));
        b.add(Integer.valueOf(bcfp.g.b));
        b.add(Integer.valueOf(bcfq.a.b));
        b.add(Integer.valueOf(bcfq.c.b));
        b.add(Integer.valueOf(bcfq.b.b));
        b.add(Integer.valueOf(bcfq.d.b));
        c.add(Integer.valueOf(bcfn.a.b));
        c.add(Integer.valueOf(bcfn.b.b));
        c.add(Integer.valueOf(bcfn.c.b));
        c.add(Integer.valueOf(bcfn.d.b));
        c.add(Integer.valueOf(bcfn.e.b));
        c.add(Integer.valueOf(bcfn.f.b));
        c.add(Integer.valueOf(bcfn.g.b));
        c.add(Integer.valueOf(bcfn.h.b));
        c.add(Integer.valueOf(bcfo.e.b));
        d.add(Integer.valueOf(bcfo.c.b));
        d.add(Integer.valueOf(bcfp.g.b));
        d.add(Integer.valueOf(bcfq.d.b));
        e.add(Integer.valueOf(bcfo.d.b));
        e.add(Integer.valueOf(bcfp.h.b));
        e.add(Integer.valueOf(bcfq.e.b));
    }
}
