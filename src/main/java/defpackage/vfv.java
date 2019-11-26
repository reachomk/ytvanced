package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: vfv */
public final class vfv implements vln, vlo, vls {
    public final bcaa a;
    public final Map b = new HashMap();
    private final bcaa c;
    private final bcaa d;

    public vfv(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bctz bctz) {
        this.c = (bcaa) amqw.a((Object) bcaa);
        this.a = (bcaa) amqw.a((Object) bcaa2);
        this.d = (bcaa) amqw.a((Object) bcaa3);
        bctz.c().a(new vfu(this));
    }

    public final /* bridge */ /* synthetic */ void e(vss vss) {
    }

    public final /* synthetic */ void a(vss vss) {
        vsa vsa = (vsa) vss;
        if (vsa == null) {
            afpc.a(2, afpf.ad, "Should never receive a null InPlayerSlot from fulfillment.");
        } else if (this.b.containsKey(vsa.a)) {
            afpc.a(2, afpf.ad, "Should never receive the same InPlayerSlot from fulfillment.");
        } else {
            this.b.put(vsa.a, new vml(vsa));
            ((vlx) this.a.get()).b(vsa);
        }
    }

    public final /* synthetic */ void b(vss vss) {
        ((vlx) this.a.get()).a((vsa) vss);
    }

    public final /* synthetic */ void b(vss vss, vmb vmb) {
        vsa vsa = (vsa) vss;
        afpf afpf = afpf.ad;
        String valueOf = String.valueOf(vmb);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 29);
        stringBuilder.append("Error entering InPlayerSlot: ");
        stringBuilder.append(valueOf);
        afpc.a(2, afpf, stringBuilder.toString());
        if (vsa != null) {
            ((vlx) this.a.get()).a(vsa);
        }
    }

    public final /* synthetic */ void c(vss vss) {
        vsa vsa = (vsa) vss;
        if (vsa == null) {
            afpc.a(2, afpf.ad, "Should never receive a null InPlayerSlot from RenderingManager.");
        } else if (this.b.containsKey(vsa.a)) {
            vml vml = (vml) this.b.get(vsa.a);
            if (vml.b == 0) {
                try {
                    vml.a(1);
                } catch (vmk e) {
                    String valueOf = String.valueOf(e);
                    StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 21);
                    stringBuilder.append("Error onSlotEntered: ");
                    stringBuilder.append(valueOf);
                    xtl.c(stringBuilder.toString());
                    ((vlx) this.a.get()).a(vsa);
                }
                ((vlv) this.c.get()).a(vsa);
            }
        } else {
            afpc.a(2, afpf.ad, "Entered unknown InPlayerSlot.");
        }
    }

    public final /* synthetic */ void d(vss vss) {
        vsa vsa = (vsa) vss;
        if (vsa == null) {
            afpc.a(2, afpf.ad, "Unscheduled an unknown InPlayerSlot");
        } else {
            this.b.remove(vsa.a);
        }
    }
}
