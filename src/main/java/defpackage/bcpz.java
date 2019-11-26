package defpackage;

/* renamed from: bcpz */
final class bcpz extends bcpw {
    public static final long serialVersionUID = 31156755687123L;
    private final byte n;

    bcpz(String str, byte b) {
        super(str);
        this.n = b;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof bcpz) && this.n == ((bcpz) obj).n;
        } else {
            return true;
        }
    }

    public final int hashCode() {
        return 1 << this.n;
    }

    public final bcpx a(bcpl bcpl) {
        bcpl = bcpo.a(bcpl);
        switch (this.n) {
            case (byte) 1:
                return bcpl.J();
            case (byte) 2:
                return bcpl.H();
            case (byte) 3:
                return bcpl.y();
            case (byte) 4:
                return bcpl.D();
            case (byte) 5:
                return bcpl.B();
            case (byte) 6:
                return bcpl.w();
            case (byte) 7:
                return bcpl.s();
            case (byte) 8:
                return bcpl.o();
            case (byte) 9:
                return bcpl.l();
            case (byte) 10:
                return bcpl.i();
            case (byte) 11:
                return bcpl.f();
            case (byte) 12:
                return bcpl.c();
            default:
                throw new InternalError();
        }
    }

    private final Object readResolve() {
        switch (this.n) {
            case (byte) 1:
                return a;
            case (byte) 2:
                return b;
            case (byte) 3:
                return c;
            case (byte) 4:
                return d;
            case (byte) 5:
                return e;
            case (byte) 6:
                return f;
            case (byte) 7:
                return g;
            case (byte) 8:
                return h;
            case (byte) 9:
                return i;
            case (byte) 10:
                return j;
            case (byte) 11:
                return k;
            case (byte) 12:
                return l;
            default:
                return this;
        }
    }
}
