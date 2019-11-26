package defpackage;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: lgu */
public final class lgu extends aijz {
    public final Set a = new CopyOnWriteArraySet();
    public enm b;
    public enm c;
    public lgv d;

    lgu() {
    }

    public final /* synthetic */ void a(aikr aikr) {
        enm enm = (enm) aikr;
        if (!b(enm)) {
            super.a(enm);
            enm = (enm) this.f;
            if (enm == null) {
                for (lgt c : this.a) {
                    c.c();
                }
            } else {
                aizn aizn;
                int i;
                enm enm2;
                enm.d();
                lgv lgv = this.d;
                if (lgv != null && b(lgv.b)) {
                    this.d.b.d();
                    lgv = this.d;
                    aizn = lgv.a;
                    i = lgv.c;
                    if (i == 2) {
                        enm2 = this.b;
                    } else if (i == 1) {
                        enm2 = this.c;
                    } else {
                        enm2 = null;
                    }
                } else {
                    aizn = null;
                    enm2 = aizn;
                    i = 0;
                }
                for (lgt a : this.a) {
                    a.a(enm, enm2, aizn, i);
                }
            }
            this.c = null;
        }
    }
}
