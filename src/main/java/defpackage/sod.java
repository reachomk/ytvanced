package defpackage;

import android.view.MotionEvent;
import android.view.View;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: sod */
final class sod extends cma {
    @cue(a = 10)
    public cma a;
    @cue(a = 5)
    public List b;
    @cue(a = 5)
    public List c;
    @cue(a = 5)
    public List d;
    @cue(a = 5)
    public List e;
    @cue(a = 5)
    public List f;
    @cue(a = 5)
    public List g;
    @cue(a = 5)
    public List u;
    @cue(a = 5)
    public List v;
    @cue(a = 5)
    public List w;
    @cue(a = 14)
    private sof x = new sof();

    public sod() {
        super("ElementEvent");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean y() {
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    public final crh d() {
        return this.x;
    }

    /* Access modifiers changed, original: protected|final */
    public final cma b(cmg cmg) {
        cma cma = this.a;
        List list = this.f;
        List list2 = this.e;
        List list3 = this.b;
        List list4 = this.w;
        List list5 = this.d;
        List list6 = this.v;
        List list7 = this.u;
        List list8 = this.c;
        ctb a = ctc.a(cmg);
        a.a(cma);
        if (!(list == null && list2 == null && list7 == null && list6 == null)) {
            a.c(cmm.a(cmg, -1336101728, new Object[]{cmg}));
        }
        if (list != null) {
            a.a(cmm.a(cmg, -1351902487, new Object[]{cmg}));
        }
        if (list2 != null) {
            a.b.l().b().b(cmm.a(cmg, 71235917, new Object[]{cmg}));
        }
        if (!(list4 == null && list3 == null)) {
            a.d(cmm.a(cmg, 1803022739, new Object[]{cmg}));
        }
        if (list5 != null) {
            coj a2 = cmm.a(cmg, 1110660298, new Object[]{cmg});
            clw a3 = a.b.l().a();
            a3.a |= Long.MIN_VALUE;
            a3.c = a2;
        }
        if (list8 != null) {
            a.e(cmm.a(cmg, -1932591986, new Object[]{cmg}));
        }
        return (ctc) a.c();
    }

    /* Access modifiers changed, original: protected|final */
    public final void f(cmg cmg) {
        cri cri = new cri();
        cri cri2 = new cri();
        cri.a = new AtomicBoolean(true);
        cri2.a = new AtomicReference(null);
        Object obj = cri.a;
        if (obj != null) {
            this.x.a = (AtomicBoolean) obj;
        }
        obj = cri2.a;
        if (obj != null) {
            this.x.b = (AtomicReference) obj;
        }
    }

    public final Object a(coj coj, Object obj) {
        boolean z = false;
        cor cor;
        View view;
        sod sod;
        AtomicReference atomicReference;
        View view2;
        switch (coj.b) {
            case -1932591986:
                cpc cpc = (cpc) obj;
                cor = coj.a;
                view = cpc.a;
                List<sws> list = ((sod) cor).c;
                if (list != null) {
                    for (sws a : list) {
                        a.a(view);
                    }
                }
                return null;
            case -1351902487:
                clp clp = (clp) obj;
                cor = coj.a;
                view = clp.a;
                sod = (sod) cor;
                List<swu> list2 = sod.f;
                atomicReference = sod.x.b;
                if (list2 != null) {
                    for (swu a2 : list2) {
                        a2.a(view, (syj) atomicReference.get());
                    }
                }
                return null;
            case -1336101728:
                crn crn = (crn) obj;
                cor = coj.a;
                view2 = crn.a;
                MotionEvent motionEvent = crn.b;
                sod = (sod) cor;
                List<swv> list3 = sod.v;
                List<sww> list4 = sod.u;
                List<swt> list5 = sod.g;
                atomicReference = sod.x.b;
                if (motionEvent.getAction() == 0 || motionEvent.getAction() == 1) {
                    syj syj = new syj(motionEvent.getX(), motionEvent.getY());
                    atomicReference.set(syj);
                    if (motionEvent.getAction() == 0 && list4 != null) {
                        for (sww a3 : list4) {
                            a3.a(view2, syj);
                        }
                    } else if (motionEvent.getAction() == 1 && list3 != null) {
                        for (swv a4 : list3) {
                            a4.a(view2, syj);
                        }
                    }
                } else if (motionEvent.getAction() == 3) {
                    if (list5 != null) {
                        for (swt a5 : list5) {
                            a5.a(view2);
                        }
                    }
                    atomicReference.set(null);
                }
                return Boolean.valueOf(false);
            case -1048037474:
                cmm.a((cmg) coj.c[0], (coi) obj);
                return null;
            case 71235917:
                cpv cpv = (cpv) obj;
                cor = coj.a;
                view = cpv.a;
                sod = (sod) cor;
                List<swr> list6 = sod.e;
                atomicReference = sod.x.b;
                if (list6 != null) {
                    Object obj2 = null;
                    for (swr a6 : list6) {
                        a6.a(view, (syj) atomicReference.get());
                        obj2 = 1;
                    }
                    if (obj2 != null) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 1110660298:
                cpn cpn = (cpn) obj;
                cor = coj.a;
                view = cpn.a;
                List<swy> list7 = ((sod) cor).d;
                if (list7 != null) {
                    for (swy a7 : list7) {
                        a7.a(view);
                    }
                }
                return null;
            case 1803022739:
                csw csw = (csw) obj;
                cor = coj.a;
                view2 = csw.a;
                view = csw.b;
                sod = (sod) cor;
                List<swy> list8 = sod.w;
                List<swy> list9 = sod.b;
                AtomicBoolean atomicBoolean = sod.x.a;
                if (list9 != null && atomicBoolean.getAndSet(false)) {
                    for (swy a8 : list9) {
                        a8.a(view2, view);
                    }
                }
                if (list8 != null) {
                    for (swy a9 : list8) {
                        a9.a(view2, view);
                    }
                }
                return null;
            default:
                return null;
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(crh crh, crh crh2) {
        sof sof = (sof) crh;
        sof sof2 = (sof) crh2;
        sof2.a = sof.a;
        sof2.b = sof.b;
    }

    public final /* synthetic */ cma g() {
        sod sod = (sod) super.g();
        cma cma = sod.a;
        sod.a = cma != null ? cma.g() : null;
        sod.x = new sof();
        return sod;
    }
}
