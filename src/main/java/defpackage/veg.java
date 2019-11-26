package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: veg */
public final class veg implements vln, vlo, vls {
    public final bcaa a;
    public final Map b = new HashMap();
    private final bcaa c;
    private final bcaa d;

    public veg(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bctz bctz) {
        this.a = bcaa;
        this.c = bcaa2;
        this.d = bcaa3;
        bctz.c().a(new vej(this));
    }

    private static void a(String str) {
        afpc.a(2, afpf.ad, str);
    }

    public final /* synthetic */ void b(vss vss) {
        vry vry = (vry) vss;
        if (((vel) this.b.get(vry.a)) == null) {
            veg.a("Null slotState for onSlotExited");
        }
        ((vlx) this.a.get()).a(vry);
    }

    public final /* synthetic */ void b(vss vss, vmb vmb) {
        vry vry = (vry) vss;
        if (((vel) this.b.get(vry.a)) == null) {
            veg.a("Null slotState for onSlotEnterError");
        }
        String valueOf = String.valueOf(vmb);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 18);
        stringBuilder.append("onSlotEnterError: ");
        stringBuilder.append(valueOf);
        veg.a(stringBuilder.toString());
        ((vlx) this.a.get()).a(vry);
    }

    public final /* synthetic */ void c(vss vss) {
        vry vry = (vry) vss;
        vel vel = (vel) this.b.get(vry.a);
        if (vel == null) {
            veg.a("Null slotState for onSlotEntered");
            ((vlx) this.a.get()).a(vry);
            return;
        }
        try {
            vel.a(2);
            ((vlv) this.d.get()).a(vry);
        } catch (vek e) {
            String valueOf = String.valueOf(e);
            StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 52);
            stringBuilder.append("FulfillmentStatusChangeException for onSlotEntered: ");
            stringBuilder.append(valueOf);
            veg.a(stringBuilder.toString());
            vel.a();
            ((vlx) this.a.get()).a(vry);
        }
    }

    public final /* synthetic */ void d(vss vss) {
        vry vry = (vry) vss;
        if (((vel) this.b.get(vry.a)) == null) {
            veg.a("Null slotState for onSlotUnscheduled");
        } else {
            this.b.remove(vry.a);
        }
    }

    public final /* synthetic */ void e(vss vss) {
        vry vry = (vry) vss;
        if (((vel) this.b.get(vry.a)) == null) {
            veg.a("Null slotState for onSlotScheduled");
            ((vlx) this.a.get()).a(vry);
        }
    }
}
