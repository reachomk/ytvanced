package defpackage;

import android.app.Activity;

/* renamed from: drv */
public final class drv extends uzf {
    public drv(drw drw, Activity activity, uzn uzn, aanz aanz, usv usv, uys uys, afpu afpu, uyy uyy, zyw zyw, apxu apxu, boolean z) {
        super(drw, activity, uzn, aanz, usv, afpu, uys, uyy, apxu, z);
        if (afpu.a()) {
            apxn a = zyw.a();
            if (a != null) {
                aulu aulu = a.e;
                if (aulu == null) {
                    aulu = aulu.bw;
                }
                if (aulu.ax) {
                    drw.e();
                    return;
                }
            }
            drw.f();
            return;
        }
        drw.f();
        drw.e();
    }
}
