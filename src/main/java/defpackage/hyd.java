package defpackage;

import java.util.HashSet;
import java.util.Set;

/* renamed from: hyd */
class hyd implements hyb {
    public boolean a;
    private final Set b = new HashSet();

    hyd() {
    }

    public void a(hye hye) {
        this.b.add(hye);
    }

    public void b(hye hye) {
        this.b.remove(hye);
    }

    public boolean c() {
        return this.a;
    }

    /* Access modifiers changed, original: final */
    public final void a(boolean z) {
        if (this.a != z) {
            this.a = z;
            for (hye a : this.b) {
                a.a(this.a);
            }
        }
    }
}
