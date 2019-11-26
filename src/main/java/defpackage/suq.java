package defpackage;

import android.content.res.Configuration;
import java.util.ArrayList;
import java.util.List;

/* renamed from: suq */
public final class suq implements sxi {
    private final swm a;
    private final List b = new ArrayList();

    public suq(swm swm) {
        this.a = swm;
    }

    public final void a() {
    }

    public final void b() {
    }

    public final void a(Configuration configuration) {
        int i = configuration.orientation;
        int i2 = 2;
        if (i == 1) {
            i2 = 4;
        } else if (i != 2) {
            i2 = 1;
        }
        aztx aztx = (aztx) aztu.c.createBuilder();
        aztx.a(i2);
        aztu aztu = (aztu) ((anxl) aztx.build());
        c();
        this.a.a("/device/orientation", aztu.toByteArray(), false);
    }

    public final synchronized void a(sup sup) {
        this.b.add(sup);
    }

    public final synchronized void b(sup sup) {
        this.b.remove(sup);
    }

    private final synchronized void c() {
        for (sup a : this.b) {
            a.a();
        }
    }
}
