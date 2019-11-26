package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: ebk */
public final class ebk {
    public boolean a;
    private final List b = new ArrayList();

    public ebk(boolean z) {
        this.a = z;
    }

    public final void a(ebj ebj) {
        this.b.add(ebj);
    }

    public final void b(ebj ebj) {
        this.b.remove(ebj);
    }

    public final void a(boolean z) {
        if (this.a != z) {
            this.a = z;
            for (ebj a : this.b) {
                a.a(z);
            }
        }
    }
}
