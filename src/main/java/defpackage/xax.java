package defpackage;

/* renamed from: xax */
public abstract class xax {
    public static final xax a = new xaw();

    public abstract aort a();

    public abstract aydm b();

    public abstract avam c();

    public abstract boolean d();

    public abstract aosl e();

    public final aoth f() {
        aosl e = e();
        if (e != null) {
            aosp aosp = e.d;
            if (aosp == null) {
                aosp = aosp.c;
            }
            if ((aosp.a & 1) != 0) {
                aosp aosp2 = e.d;
                if (aosp2 == null) {
                    aosp2 = aosp.c;
                }
                aoth aoth = aosp2.b;
                if (aoth == null) {
                    aoth = aoth.k;
                }
                return aoth;
            }
        }
        aotk aotk = (aotk) aoth.k.createBuilder();
        aotk.copyOnWrite();
        aoth aoth2 = (aoth) aotk.instance;
        aoth2.a |= 1;
        aoth2.b = 2;
        aotk.copyOnWrite();
        aoth2 = (aoth) aotk.instance;
        aoth2.a |= 64;
        aoth2.f = true;
        aotk.copyOnWrite();
        aoth2 = (aoth) aotk.instance;
        aoth2.a |= 128;
        aoth2.h = true;
        aotk.copyOnWrite();
        aoth2 = (aoth) aotk.instance;
        if (!aoth2.g.a()) {
            aoth2.g = anxl.mutableCopy(aoth2.g);
        }
        aoth2.g.add("https://youtubei.googleapis.com/generate_204");
        aoti aoti = (aoti) aotf.c.createBuilder();
        aoti.copyOnWrite();
        aotf aotf = (aotf) aoti.instance;
        aotf.a |= 1;
        aotf.b = true;
        aotf aotf2 = (aotf) ((anxl) aoti.build());
        aotk.copyOnWrite();
        aoth2 = (aoth) aotk.instance;
        if (aotf2 != null) {
            aoth2.j = aotf2;
            aoth2.a |= 512;
            return (aoth) ((anxl) aotk.build());
        }
        throw new NullPointerException();
    }

    public final avjo g() {
        aosl e = e();
        if (e != null) {
            aosn aosn = e.e;
            if (aosn == null) {
                aosn = aosn.c;
            }
            if ((aosn.a & 1) != 0) {
                aosn aosn2 = e.e;
                if (aosn2 == null) {
                    aosn2 = aosn.c;
                }
                avjo avjo = aosn2.b;
                if (avjo == null) {
                    avjo = avjo.d;
                }
                return avjo;
            }
        }
        avjn avjn = (avjn) avjo.d.createBuilder();
        avjn.copyOnWrite();
        avjo avjo2 = (avjo) avjn.instance;
        avjo2.a |= 2;
        avjo2.c = true;
        avjn.copyOnWrite();
        avjo2 = (avjo) avjn.instance;
        avjo2.a |= 1;
        avjo2.b = true;
        return (avjo) ((anxl) avjn.build());
    }
}
