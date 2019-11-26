package defpackage;

import android.content.Context;
import android.util.JsonReader;
import java.io.StringReader;

/* renamed from: sld */
final class sld extends cma {
    @cue(a = 13)
    public String a;
    @cue(a = 13)
    public bdgd b;

    public sld() {
        super("AnimatedType");
    }

    public final int A() {
        return 3;
    }

    public final boolean t() {
        return true;
    }

    public final boolean u() {
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    public final int w() {
        return 3;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean x() {
        return false;
    }

    public final boolean a(cma cma) {
        if (this == cma) {
            return true;
        }
        if (cma == null || getClass() != cma.getClass()) {
            return false;
        }
        sld sld = (sld) cma;
        if (this.j != sld.j) {
            String str = this.a;
            if (!str == null ? str.equals(sld.a) : sld.a == null) {
                return false;
            }
            bdgd bdgd = this.b;
            bdgd bdgd2 = sld.b;
            return bdgd == null ? bdgd2 == null : bdgd.equals(bdgd2);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final Object b(Context context) {
        return new bjg(context);
    }

    /* Access modifiers changed, original: protected|final */
    public final void c(cmg cmg, Object obj) {
        bjg bjg = (bjg) obj;
        bdgd bdgd = this.b;
        bdgc bdgc = bdgd.b;
        if (bdgc.a == 0) {
            bjg.a(bjm.a(new JsonReader(new StringReader(bdgc.b))));
            bjg.b(bdgd.d);
            bjg.a(bdgd.e);
            bjg.a.b(!bdgd.c ? 0 : -1);
            if (bdgd.f == 2) {
                bjg.c();
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void d(cmg cmg, Object obj) {
        bjg bjg = (bjg) obj;
        bjg.clearAnimation();
        bjg.b(0.0f);
        bjg.d();
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean b(cma cma, cma cma2) {
        sld sld = (sld) cma;
        sld sld2 = (sld) cma2;
        Object obj = null;
        coa coa = new coa(sld != null ? sld.b : null, sld2 != null ? sld2.b : null);
        Object obj2 = sld != null ? sld.a : null;
        if (sld2 != null) {
            obj = sld2.a;
        }
        coa coa2 = new coa(obj2, obj);
        if (((String) coa2.b).equals(coa2.a) || ((bdgd) coa.b).equals(coa.a)) {
            return false;
        }
        return true;
    }
}
