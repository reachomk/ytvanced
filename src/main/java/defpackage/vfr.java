package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: vfr */
public final class vfr implements vlr, vlu {
    private final bcaa a;
    private final bcaa b;
    private final Map c = new HashMap();

    public vfr(bcaa bcaa, bcaa bcaa2) {
        this.a = bcaa;
        this.b = bcaa2;
    }

    public final /* bridge */ /* synthetic */ void a() {
    }

    public final /* bridge */ /* synthetic */ void b(vss vss, vsj vsj) {
    }

    public final /* synthetic */ void a(vss vss, vsj vsj) {
        vsa vsa = (vsa) vss;
        vsb vsb = (vsb) vsj;
        if (vsa == null) {
            afpc.a(2, afpf.ad, "Should never receive a null InPlayerSlot from SlotManager.");
        } else if (vsb == null) {
            afpc.a(2, afpf.ad, "Should never receive a null InPlayerLayout from SlotManager.");
        } else if (this.c.containsKey(vsa.a)) {
            afpc.a(2, afpf.ad, "Should never receive a layout for the same InPlayerSlot from fulfillment.");
        } else {
            this.c.put(vsa.a, vsb);
            ((vlp) this.b.get()).a(vsa, vsb);
        }
    }

    public final /* synthetic */ void a(vss vss) {
        vsa vsa = (vsa) vss;
        if (vsa == null) {
            afpc.a(2, afpf.ad, "Unscheduled a InPlayerLayout for an unknown slot");
        } else {
            this.c.remove(vsa.a);
        }
    }
}
