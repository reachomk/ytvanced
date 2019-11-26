package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: aatd */
public final class aatd {
    public final ajtd a;
    public final aqhy b;
    private List c;

    public aatd(ajtd ajtd, aqhy aqhy) {
        this.a = (ajtd) amqw.a((Object) ajtd);
        this.b = aqhy;
    }

    public final aphg a() {
        aphj aphj = this.a.d;
        if (aphj == null || (aphj.a & 1) == 0) {
            return null;
        }
        aphg aphg = aphj.b;
        if (aphg == null) {
            aphg = aphg.s;
        }
        return aphg;
    }

    public final List b() {
        if (this.c == null) {
            this.c = new ArrayList();
            ajxn[] ajxnArr = this.a.b;
            if (ajxnArr != null) {
                for (ajxn ajxn : ajxnArr) {
                    ayle ayle = ajxn.b;
                    if (ayle != null) {
                        this.c.add(new aaub(ayle));
                    } else {
                        aoms aoms = ajxn.c;
                        if (aoms != null) {
                            this.c.add(aoms);
                        }
                    }
                }
            }
        }
        return this.c;
    }

    public final ayla c() {
        aylc aylc = this.a.f;
        return (aylc == null || aylc.a != 133836655) ? null : (ayla) aylc.b;
    }
}
