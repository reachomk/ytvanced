package defpackage;

import java.util.Arrays;

/* renamed from: ahsq */
public final class ahsq {
    public final float a;
    public final float b;
    private final ahst c;

    public ahsq() {
        this(ahst.DISABLED, 0.0f, 0.0f);
    }

    public ahsq(ahst ahst, float f, float f2) {
        this.c = ahst;
        this.a = f;
        this.b = f2;
    }

    public final boolean a() {
        return this.c == ahst.ENABLED || this.c == ahst.PAUSED;
    }

    public final boolean b() {
        return this.c == ahst.PAUSED;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ahsq) {
            ahsq ahsq = (ahsq) obj;
            if (this.c == ahsq.c && this.a == ahsq.a && this.b == ahsq.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, Float.valueOf(this.a), Float.valueOf(this.b)});
    }

    public final String toString() {
        amqo a = amql.a(this);
        a.a("state", this.c);
        a.a("scale", this.a);
        a.a("offset", this.b);
        return a.toString();
    }
}
