package defpackage;

import android.os.Handler;
import android.view.View;
import com.facebook.yoga.YogaFlexDirection;
import java.util.List;

/* renamed from: eoh */
public final class eoh extends cma {
    @cue(a = 6)
    public List a;
    @cue(a = 13)
    public bapu b;
    @cue(a = 13)
    public YogaFlexDirection c;
    @cue(a = 13)
    public azsr d;
    @cue(a = 13)
    public azsr e;
    @cue(a = 10)
    public cma f;
    @cue(a = 13)
    public bapu g;
    @cue(a = 13)
    public Handler u;
    @cue(a = 14)
    private eoi v = new eoi();

    private eoh() {
        super("InlinePlayback");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean y() {
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    public final crh d() {
        return this.v;
    }

    public static eol a(boolean z) {
        return new eol(z);
    }

    /* Access modifiers changed, original: protected|final */
    public final csq a(cmg cmg, csq csq) {
        csq = csq.b(csq);
        eoi eoi = this.v;
        eot eot = eoi.d;
        eoz eoz = eoi.a;
        eot.a(cmg);
        csq.a(eoz.class, eoz);
        return csq;
    }

    /* Access modifiers changed, original: protected|final */
    public final void f(cmg cmg) {
        cri cri = new cri();
        cri cri2 = new cri();
        cri cri3 = new cri();
        cri cri4 = new cri();
        bapu bapu = this.b;
        azsr azsr = this.d;
        azsr azsr2 = this.e;
        Boolean valueOf = Boolean.valueOf(false);
        cri.a = valueOf;
        cri2.a = valueOf;
        eoz eoz = new eoz();
        cri3.a = eoz;
        cri4.a = new eot(cmg, bapu, azsr, azsr2, eoz);
        Object obj = cri.a;
        if (obj != null) {
            this.v.b = ((Boolean) obj).booleanValue();
        }
        obj = cri2.a;
        if (obj != null) {
            this.v.c = ((Boolean) obj).booleanValue();
        }
        obj = cri3.a;
        if (obj != null) {
            this.v.a = (eoz) obj;
        }
        obj = cri4.a;
        if (obj != null) {
            this.v.d = (eot) obj;
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final cma b(cmg cmg) {
        clz a;
        Handler handler = this.u;
        cma cma = this.f;
        List<cma> list = this.a;
        YogaFlexDirection yogaFlexDirection = this.c;
        eoi eoi = this.v;
        eoz eoz = eoi.a;
        eot eot = eoi.d;
        boolean z = eoi.b;
        boolean z2 = eoi.c;
        eot.a(cmg);
        if (z && !z2) {
            handler.post(new eoq(eoz));
        }
        int ordinal = yogaFlexDirection.ordinal();
        if (ordinal == 0) {
            a = cls.a(cmg);
        } else if (ordinal == 1) {
            a = cls.a(cmg);
            a.a();
        } else if (ordinal == 2) {
            a = cqz.a(cmg);
        } else if (ordinal == 3) {
            a = cqz.a(cmg);
            a.a();
        } else {
            String valueOf = String.valueOf(yogaFlexDirection);
            StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 20);
            stringBuilder.append("Unknown enum value: ");
            stringBuilder.append(valueOf);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        cmc cmc = (cmc) ((cmc) a.d(cmm.a(cmg, 1803022739, new Object[]{cmg}))).e(cmm.a(cmg, -1932591986, new Object[]{cmg}));
        cmc.b(cma.g());
        for (cma cma2 : list) {
            cmc.b(cma2.g());
        }
        cmc.r(!z2 ? 1.0f : 0.0f);
        return cmc.c();
    }

    public final Object a(coj coj, Object obj) {
        int i = coj.b;
        cor cor;
        cmg cmg;
        View view;
        eoh eoh;
        bapu bapu;
        if (i == -1932591986) {
            cpc cpc = (cpc) obj;
            cor = coj.a;
            cmg = (cmg) coj.c[0];
            view = cpc.a;
            eoh = (eoh) cor;
            bapu = eoh.g;
            eoh.v.d.a(cmg);
            eoh.c(cmg, false);
            fhk fhk = (fhk) bapu.get();
            fhk.a.remove(view);
            fhp fhp = fhk.b;
            if (fhp != null) {
                fhp.a.remove(view);
            }
            return null;
        } else if (i == -1048037474) {
            cmm.a((cmg) coj.c[0], (coi) obj);
            return null;
        } else if (i != 1803022739) {
            return null;
        } else {
            csw csw = (csw) obj;
            cor = coj.a;
            cmg = (cmg) coj.c[0];
            view = csw.a;
            eoh = (eoh) cor;
            bapu = eoh.g;
            fhn fhn = eoh.v.d;
            fhn.a(cmg);
            eoh.c(cmg, true);
            ((fhk) bapu.get()).a(view, fhn);
            return null;
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(crh crh, crh crh2) {
        eoi eoi = (eoi) crh;
        eoi eoi2 = (eoi) crh2;
        eoi2.a = eoi.a;
        eoi2.b = eoi.b;
        eoi2.c = eoi.c;
        eoi2.d = eoi.d;
    }

    private static void c(cmg cmg, boolean z) {
        if (cmg.h != null) {
            cmg.a(new eog(z));
        }
    }

    public static eoj a(cmg cmg) {
        eoj eoj = new eoj();
        eoj.a(eoj, cmg, new eoh());
        return eoj;
    }

    public final /* synthetic */ cma g() {
        eoh eoh = (eoh) super.g();
        cma cma = eoh.f;
        eoh.f = cma != null ? cma.g() : null;
        eoh.v = new eoi();
        return eoh;
    }
}
