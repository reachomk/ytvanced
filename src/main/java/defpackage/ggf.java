package defpackage;

/* renamed from: ggf */
public final class ggf {
    public static aiqq a(aiqq aiqq, int i) {
        avjh b = ggf.b(aiqq.b);
        b.a(i);
        apxx apxx = (apxx) ((anxo) aiqq.b.toBuilder());
        apxx.a(avjd.b, (avjf) ((anxl) b.build()));
        aiqs s = aiqq.s();
        s.a = (apxu) ((anxl) apxx.build());
        return s.b();
    }

    public static avjf a(apxu apxu) {
        if (apxu != null) {
            anxr access$000 = anxl.checkIsLite(avjd.b);
            apxu.a(access$000);
            if (apxu.h.a(access$000.d)) {
                anxr access$0002 = anxl.checkIsLite(avjd.b);
                apxu.a(access$0002);
                Object b = apxu.h.b(access$0002.d);
                if (b == null) {
                    b = access$0002.b;
                } else {
                    b = access$0002.a(b);
                }
                return (avjf) b;
            }
        }
        return null;
    }

    public static avjh b(apxu apxu) {
        anxr access$000 = anxl.checkIsLite(avjd.b);
        apxu.a(access$000);
        if (!apxu.h.a(access$000.d)) {
            return (avjh) avjf.h.createBuilder();
        }
        access$000 = anxl.checkIsLite(avjd.b);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        return (avjh) ((anxo) ((avjf) b).toBuilder());
    }

    public static ajzp a(ajzq ajzq) {
        ajzs ajzs = ajzq.a;
        return ajzs != null ? ajzs.a : null;
    }

    public static byte[] b(ajzq ajzq) {
        if (ajzq != null) {
            ajzp a = ggf.a(ajzq);
            if (a != null) {
                aoze aoze = (aoze) ajzv.a(a.i, aoze.class);
                if (aoze != null) {
                    return aoze.c.d();
                }
            }
        }
        return null;
    }
}
