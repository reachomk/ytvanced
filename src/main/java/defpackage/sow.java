package defpackage;

import android.view.View.MeasureSpec;

/* renamed from: sow */
final class sow extends cma {
    @cue(a = 13)
    public swf a;
    @cue(a = 13)
    public bdhe b;
    @cue(a = 13)
    public sxd c;
    @cue(a = 13)
    public syl d;
    @cue(a = 14)
    private soy e = new soy();

    public sow() {
        super("ExpandableTextComponent");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean n() {
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean y() {
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    public final crh d() {
        return this.e;
    }

    /* Access modifiers changed, original: protected|final */
    public final void f(cmg cmg) {
        cri cri = new cri();
        cri.a = Boolean.valueOf(false);
        this.e.a = (Boolean) cri.a;
    }

    /* Access modifiers changed, original: protected|final */
    public final cma a(cmg cmg, int i, int i2) {
        bdgf bdgf;
        bdhe bdhe = this.b;
        swf swf = this.a;
        syl syl = this.d;
        sxd sxd = this.c;
        Boolean bool = this.e.a;
        spw a = spt.a(cmg);
        a.a(swf);
        a.a(syl);
        a.a(sxd);
        a.a(spd.a(bdhe, bool));
        cma cma = (spt) a.c();
        clr a2 = cls.a(cmg);
        a2.a(cma);
        if (bool.booleanValue()) {
            bdgf = bdhe.g;
        } else {
            bdgf = bdhe.f;
        }
        int i3 = bdhe.i;
        int i4 = i3 - 1;
        if (i3 != 0) {
            Object obj;
            if (i4 == 2) {
                i3 = bool.booleanValue() ^ 1;
                if (bool.booleanValue() || bdgf == null) {
                    i4 = i3;
                    obj = null;
                } else {
                    i4 = i3;
                    obj = 1;
                }
            } else if (i4 != 3) {
                obj = bdgf != null ? 1 : null;
                i4 = 1;
            } else {
                obj = bdgf != null ? 1 : null;
                i4 = 0;
            }
            if (!(bool.booleanValue() || r7 == null)) {
                spw a3 = spt.a(cmg);
                a3.a(swf);
                a3.a(syl);
                a3.a(sxd);
                a3.a(spd.a(bdhe, Boolean.valueOf(true)));
                spt spt = (spt) a3.c();
                crd crd = new crd();
                spt.a(cmg, i, MeasureSpec.makeMeasureSpec(0, 0), crd);
                crd crd2 = new crd();
                cma.a(cmg, i, MeasureSpec.makeMeasureSpec(0, 0), crd2);
                if (crd.a == crd2.a && crd.b == crd2.b) {
                    obj = null;
                    i4 = 0;
                }
            }
            if (obj != null) {
                bdhu bdhu = new bdhu();
                bdhu.b = bdgf;
                clz a4 = spt.a(cmg);
                a4.a(swf);
                a4.a(syl);
                a4.a(sxd);
                a4.a(bdhu);
                if (bdhe.h && r8 != 0) {
                    a4.a(sow.a(cmg));
                    i4 = 0;
                }
                a2.a(a4);
            }
            if (i4 != 0) {
                a2.a(sow.a(cmg));
            }
            return (cls) a2.c();
        }
        throw null;
    }

    private static coj a(cmg cmg) {
        return cmm.a(cmg, 2076732558, new Object[]{cmg});
    }

    public final Object a(coj coj, Object obj) {
        int i = coj.b;
        if (i == -1048037474) {
            cmm.a((cmg) coj.c[0], (coi) obj);
            return null;
        } else if (i != 2076732558) {
            return null;
        } else {
            cmg cmg = (cmg) coj.c[0];
            if (cmg.h != null) {
                cmg.b(new sox(), "ExpandableTextComponent.updateExpand");
            }
            return null;
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(crh crh, crh crh2) {
        ((soy) crh2).a = ((soy) crh).a;
    }

    public final /* synthetic */ cma g() {
        sow sow = (sow) super.g();
        sow.e = new soy();
        return sow;
    }
}
