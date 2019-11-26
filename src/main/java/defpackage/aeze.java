package defpackage;

import java.io.IOException;
import java.util.Set;

/* renamed from: aeze */
final class aeze extends afah {
    private final Set b;
    private final aezd c;

    aeze(Set set, aezd aezd) {
        this.b = set;
        this.c = aezd;
    }

    public final void a(oza oza, int i) {
        try {
            Set set = this.b;
            oza.c(0);
            oza.i();
            afho afho = null;
            if (oza.e(4).equals("emsg")) {
                oza.i();
                String r = oza.r();
                if (set.isEmpty() || set.contains(r)) {
                    oza.r();
                    oza.i();
                    oza.i();
                    oza.i();
                    oza.i();
                    afho = new afhr(afhr.a(oza));
                }
            }
            if (afho != null) {
                this.c.a(afho);
            }
        } catch (IOException | InterruptedException e) {
            this.c.a(e);
        }
    }
}
