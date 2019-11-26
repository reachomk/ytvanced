package defpackage;

/* renamed from: ook */
public final class ook {
    public final Object a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    public ook(Object obj) {
        this(obj, -1, -1, -1, -1);
    }

    public ook(Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }

    public ook(Object obj, int i, int i2, long j) {
        this(obj, i, i2, j, -1);
    }

    private ook(Object obj, int i, int i2, long j, int i3) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = i3;
    }

    public final ook a(Object obj) {
        if (this.a.equals(obj)) {
            return this;
        }
        return new ook(obj, this.b, this.c, this.d, this.e);
    }

    public final boolean a() {
        return this.b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ook ook = (ook) obj;
            return this.a.equals(ook.a) && this.b == ook.b && this.c == ook.c && this.d == ook.d && this.e == ook.e;
        }
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() + 527) * 31) + this.b) * 31) + this.c) * 31) + ((int) this.d)) * 31) + this.e;
    }
}
