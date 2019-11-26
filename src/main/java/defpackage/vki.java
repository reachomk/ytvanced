package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: vki */
public final class vki implements vkn, vlp, vlx {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final Map d = new HashMap();

    public vki(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
    }

    public final void a(vst vst) {
        if (((vkk) this.d.get(vst.a)) == null) {
            ((vls) this.a.get()).b(vst, new vmb("Null slot state"));
        } else {
            ((vls) this.a.get()).c(vst);
        }
    }

    public final void b(vst vst) {
        if (((vkk) this.d.get(vst.a)) == null) {
            ((vls) this.a.get()).a((vss) vst, new vmb("Null slot state"));
        } else {
            ((vls) this.a.get()).b(vst);
        }
    }

    public final void a(vst vst, vmb vmb) {
        ((vls) this.a.get()).b(vst, vmb);
    }

    public final void a(vst vst, vso vso) {
        if (((vkk) this.d.get(vst.a)) == null) {
            ((vlr) this.b.get()).a((vss) vst, (vsj) vso, new vly("Null slotHandler"));
        } else {
            ((vlr) this.b.get()).b(vst, vso);
        }
    }

    public final void a(vst vst, vso vso, vlq vlq) {
        if (((vkk) this.d.get(vst.a)) == null) {
            ((vlr) this.b.get()).a((vss) vst, (vsj) vso, new vly("Null slotHandler"));
        } else {
            ((vlr) this.b.get()).a((vss) vst, (vsj) vso, vlq);
        }
    }

    public final void a(vst vst, vso vso, vlt vlt) {
        if (((vkk) this.d.get(vst.a)) == null) {
            ((vlr) this.b.get()).a((vss) vst, (vsj) vso, new vly("Null slotHandler"));
        } else {
            ((vlr) this.b.get()).a((vss) vst, (vsj) vso, vlt);
        }
    }

    public final void a(vst vst, vsq vsq, vly vly) {
        ((vlr) this.b.get()).a((vss) vst, (vsj) vsq, vly);
    }
}
