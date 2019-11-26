package defpackage;

import java.util.Arrays;
import java.util.Set;

/* renamed from: amcc */
public final class amcc extends ambz {
    private final amcb b = new amcb(this);
    private final Set c;

    public amcc(amcj... amcjArr) {
        super(4);
        this.c = amuw.a((Object[]) amcjArr);
    }

    public final amcl e() {
        for (amcj e : this.c) {
            amcl e2 = e.e();
            if (!e2.b) {
                return e2;
            }
        }
        return amcl.a;
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        for (amcj a : this.c) {
            a.a(this.b);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void c() {
        for (amcj b : this.c) {
            b.b(this.b);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof amcc)) {
            return false;
        }
        return this.c.equals(((amcc) obj).c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.c});
    }
}
