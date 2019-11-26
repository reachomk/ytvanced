package defpackage;

import android.view.View;

/* renamed from: ess */
final class ess implements evf {
    private final /* synthetic */ axwa a;
    private final /* synthetic */ boolean b;
    private final /* synthetic */ eso c;

    ess(eso eso, axwa axwa, boolean z) {
        this.c = eso;
        this.a = axwa;
        this.b = z;
    }

    public final void b() {
    }

    public final void a() {
        axwa axwa = this.a;
        if (axwa != null && axwa.equals(this.c.g)) {
            this.c.a(this.b);
        }
    }

    public final void a(atiy atiy) {
        if (atiy != null) {
            atiu atiu = atiy.e;
            if (atiu == null) {
                atiu = atiu.c;
            }
            if (atiu.a == 102716411) {
                eus eus = this.c.d;
                if (eus != null) {
                    View b = eus.b();
                    if (b != null) {
                        aruh aruh;
                        fmx fmx = this.c.f;
                        atiu atiu2 = atiy.e;
                        if (atiu2 == null) {
                            atiu2 = atiu.c;
                        }
                        if (atiu2.a == 102716411) {
                            aruh = (aruh) atiu2.b;
                        } else {
                            aruh = aruh.j;
                        }
                        Object obj = atiy.e;
                        if (obj == null) {
                            obj = atiu.c;
                        }
                        fmx.a(aruh, b, obj, this.c.h);
                    }
                }
            }
        }
    }
}
