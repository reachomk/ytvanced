package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: vdy */
public final class vdy implements vln, vlo, vls {
    public final bcaa a;
    public final Map b = new HashMap();
    private final bcaa c;
    private final bcaa d;

    public vdy(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bctz bctz) {
        this.c = (bcaa) amqw.a((Object) bcaa);
        this.a = (bcaa) amqw.a((Object) bcaa2);
        this.d = (bcaa) amqw.a((Object) bcaa3);
        bctz.c().a(new veb(this));
    }

    public final /* bridge */ /* synthetic */ void e(vss vss) {
    }

    public final /* synthetic */ void a(vss vss) {
        vrt vrt = (vrt) vss;
        if (vrt == null) {
            afpc.a(2, afpf.ad, "Should never receive a null slot from fulfillment.");
        } else if (this.b.containsKey(vrt.a)) {
            afpc.a(2, afpf.ad, "Should never receive the same BelowPlayerSlot from fulfillment.");
        } else {
            this.b.put(vrt.a, new vml(vrt));
            ((vlx) this.a.get()).b(vrt);
        }
    }

    public final /* synthetic */ void b(vss vss) {
        ((vlx) this.a.get()).a((vrt) vss);
    }

    public final /* synthetic */ void b(vss vss, vmb vmb) {
        vrt vrt = (vrt) vss;
        afpf afpf = afpf.ad;
        String valueOf = String.valueOf(vmb);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 21);
        stringBuilder.append("Error entering slot: ");
        stringBuilder.append(valueOf);
        afpc.a(2, afpf, stringBuilder.toString());
        if (vrt != null) {
            ((vlx) this.a.get()).a(vrt);
        }
    }

    public final /* synthetic */ void c(vss vss) {
        vrt vrt = (vrt) vss;
        if (vrt == null) {
            afpc.a(2, afpf.ad, "Should never receive a null slot from RenderingManager.");
        } else if (this.b.containsKey(vrt.a)) {
            vml vml = (vml) this.b.get(vrt.a);
            if (vml.b == 0) {
                try {
                    vml.a(1);
                } catch (vmk e) {
                    String valueOf = String.valueOf(e);
                    StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 21);
                    stringBuilder.append("Error onSlotEntered: ");
                    stringBuilder.append(valueOf);
                    xtl.c(stringBuilder.toString());
                    ((vlx) this.a.get()).a(vrt);
                }
                ((vlv) this.c.get()).a(vrt);
            }
        } else {
            afpc.a(2, afpf.ad, "Entered unknown slot.");
        }
    }

    public final /* synthetic */ void d(vss vss) {
        vrt vrt = (vrt) vss;
        if (vrt == null) {
            afpc.a(2, afpf.ad, "Unscheduled an unknown slot");
        } else {
            this.b.remove(vrt.a);
        }
    }
}
