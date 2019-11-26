package defpackage;

import java.util.Arrays;

/* renamed from: acff */
public final class acff {
    public static final acff a = new acff(null, 0);
    public static final acff b = new acff(null, 2);
    private final int c;
    private final Object d;

    private acff(Object obj, int i) {
        this.d = obj;
        this.c = i;
    }

    public static acff a(Object obj) {
        return new acff(obj, 1);
    }

    public final Object a() {
        boolean z = true;
        if (this.c != 1) {
            z = false;
        }
        amqw.b(z);
        return this.d;
    }

    public final boolean b() {
        return this.c == 0;
    }

    public final boolean c() {
        return this.c == 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            acff acff = (acff) obj;
            return this.c == acff.c && amqq.a(this.d, acff.d);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.c), this.d});
    }
}
