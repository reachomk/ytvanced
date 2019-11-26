package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: vdr */
public final class vdr implements vlr, vlu {
    private final bcaa a;
    private final bcaa b;
    private final Map c = new HashMap();

    public vdr(bcaa bcaa, bcaa bcaa2) {
        this.a = (bcaa) amqw.a((Object) bcaa);
        this.b = (bcaa) amqw.a((Object) bcaa2);
    }

    public final /* bridge */ /* synthetic */ void a() {
    }

    public final /* bridge */ /* synthetic */ void b(vss vss, vsj vsj) {
    }

    public final /* synthetic */ void a(vss vss, vsj vsj) {
        vrt vrt = (vrt) vss;
        vrq vrq = (vrq) vsj;
        if (vrt == null) {
            afpc.a(2, afpf.ad, "Should never receive a null slot from SlotManager.");
        } else if (vrq == null) {
            afpc.a(2, afpf.ad, "Should never receive a null layout from SlotManager.");
        } else if (this.c.containsKey(vrt.a)) {
            afpc.a(2, afpf.ad, "Should never receive a layout for the same BelowPlayerSlot from fulfillment.");
        } else {
            this.c.put(vrt.a, vrq);
            ((vlp) this.b.get()).a(vrt, vrq);
        }
    }

    public final /* synthetic */ void a(vss vss) {
        if (vss == null) {
            afpc.a(2, afpf.ad, "Unscheduled a layout for an unknown slot");
        } else {
            this.c.remove(((vrt) vss).a);
        }
    }
}
