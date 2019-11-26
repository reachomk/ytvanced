package defpackage;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: bbgs */
final class bbgs {
    public final int a;
    public final int b;
    public final int c;
    public final AtomicInteger d = new AtomicInteger();

    bbgs(float f, float f2) {
        this.c = (int) (f2 * 1000.0f);
        int i = (int) (f * 1000.0f);
        this.a = i;
        this.b = i / 2;
        this.d.set(i);
    }

    /* Access modifiers changed, original: final */
    public final boolean a() {
        return this.d.get() > this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bbgs) {
            bbgs bbgs = (bbgs) obj;
            return this.a == bbgs.a && this.c == bbgs.c;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.c)});
    }
}
