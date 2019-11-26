package defpackage;

/* renamed from: clc */
public final class clc {
    public int a;
    public int b;
    public int c;
    public int d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            clc clc = (clc) obj;
            return this.c == clc.c && this.b == clc.b && this.d == clc.d && this.a == clc.a;
        }
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }
}
