package defpackage;

import java.util.HashSet;
import java.util.Set;

/* renamed from: ibd */
public final class ibd {
    public final Set a = new HashSet();

    public ibd(ifd ifd, icw icw, ibq ibq) {
        this.a.add(ifd);
        this.a.add(icw);
        this.a.add(ibq);
    }

    public final void a(ibc ibc) {
        this.a.add(ibc);
    }

    public final void a(aicd aicd) {
        for (ibc a : this.a) {
            a.a(aicd);
        }
    }

    public final void a(aich aich) {
        for (ibc a : this.a) {
            a.a(aich);
        }
    }

    public final void a(boolean z) {
        for (ibc g : this.a) {
            g.g(z);
        }
    }

    /* Access modifiers changed, original: final */
    public final void b(boolean z) {
        for (ibc i : this.a) {
            i.i(z);
        }
    }

    /* Access modifiers changed, original: final */
    public final void c(boolean z) {
        for (ibc j : this.a) {
            j.j(z);
        }
    }
}
