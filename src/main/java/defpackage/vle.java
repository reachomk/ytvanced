package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: vle */
public final class vle implements vln, vlo, vls {
    public final long a;
    public final bcaa b;
    public final Map c = new HashMap();
    private final bcaa d;
    private final bcaa e;
    private final bcaa f;

    public vle(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, vdj vdj, bctz bctz) {
        this.b = bcaa;
        this.d = bcaa2;
        this.e = bcaa3;
        this.f = bcaa4;
        this.a = vdj.f();
        bctz.c().a(new vlh(this));
    }

    public final void a(vst vst) {
        String valueOf;
        if (this.c.containsKey(vst.a)) {
            vle.a("Non-null slotState for onSlot");
            return;
        }
        Object vll;
        String str = "FulfillmentStatusChangeException for onSlotEntered: ";
        if (vst.b == vsm.PRE_ROLL) {
            vll = new vll(vst, null);
            try {
                vll.a(2);
                ((vlv) this.e.get()).a(vst);
            } catch (vlk e) {
                valueOf = String.valueOf(e);
                StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 52);
                stringBuilder.append(str);
                stringBuilder.append(valueOf);
                vle.a(stringBuilder.toString());
                vll.a();
                return;
            }
        }
        ajmv e2 = vst.e.e();
        if (e2 == null) {
            vle.a("Can't schedule midroll cueRanges because registrar is null");
            return;
        }
        try {
            ajmp vlg = new vlg(this, vst);
            vll vll2 = new vll(vst, vlg);
            vll2.a(1);
            e2.a(vlg);
            vll = vll2;
        } catch (vlk e3) {
            valueOf = String.valueOf(e3);
            StringBuilder stringBuilder2 = new StringBuilder(valueOf.length() + 52);
            stringBuilder2.append(str);
            stringBuilder2.append(valueOf);
            vle.a(stringBuilder2.toString());
            return;
        }
        this.c.put(vst.a, vll);
        ((vlx) this.b.get()).b(vst);
    }

    public final void b(vst vst) {
        vll vll = (vll) this.c.get(vst.a);
        int i = vll.c;
        if (i == 0 || i == 1) {
            try {
                vll.a(2);
                ((vlv) this.e.get()).a(vst);
            } catch (vlk e) {
                String valueOf = String.valueOf(e);
                StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 52);
                stringBuilder.append("FulfillmentStatusChangeException for onSlotEntered: ");
                stringBuilder.append(valueOf);
                vle.a(stringBuilder.toString());
                vll.a();
                ((vlx) this.b.get()).a(vst);
            }
        }
    }

    public static void a(String str) {
        afpc.a(2, afpf.ad, str);
    }

    public final /* synthetic */ void b(vss vss, vmb vmb) {
        vst vst = (vst) vss;
        if (((vll) this.c.get(vst.a)) == null) {
            vle.a("Null slotState for onSlotEnterError");
        }
        String valueOf = String.valueOf(vmb);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 18);
        stringBuilder.append("onSlotEnterError: ");
        stringBuilder.append(valueOf);
        vle.a(stringBuilder.toString());
        ((vlx) this.b.get()).a(vst);
    }

    public final /* synthetic */ void c(vss vss) {
        vst vst = (vst) vss;
        if (((vll) this.c.get(vst.a)) == null) {
            vle.a("Null slotState for onSlotEntered");
            ((vlx) this.b.get()).a(vst);
            return;
        }
        b(vst);
    }

    public final /* synthetic */ void d(vss vss) {
        vst vst = (vst) vss;
        vll vll = (vll) this.c.get(vst.a);
        if (vll == null) {
            vle.a("Null slotState for onSlotUnscheduled");
            return;
        }
        if (!(vll.b == null || vst.e.e() == null)) {
            vst.e.e().b(vll.b);
        }
        this.c.remove(vst.a);
    }

    public final /* synthetic */ void e(vss vss) {
        vst vst = (vst) vss;
        if (((vll) this.c.get(vst.a)) == null) {
            vle.a("Null slotState for onSlotScheduled");
            ((vlx) this.b.get()).a(vst);
            return;
        }
        ((xci) this.f.get()).d(new vqa());
    }
}
