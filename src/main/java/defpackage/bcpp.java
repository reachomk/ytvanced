package defpackage;

/* renamed from: bcpp */
final class bcpp extends bcpm {
    public static final long serialVersionUID = -9937958251642L;
    private final transient bcpw A;
    private final byte y;
    private final transient bcpw z;

    bcpp(String str, byte b, bcpw bcpw, bcpw bcpw2) {
        super(str);
        this.y = b;
        this.z = bcpw;
        this.A = bcpw2;
    }

    public final bcpw a() {
        return this.z;
    }

    public final bcpw b() {
        return this.A;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof bcpp) && this.y == ((bcpp) obj).y;
        } else {
            return true;
        }
    }

    public final int hashCode() {
        return 1 << this.y;
    }

    public final bcpn a(bcpl bcpl) {
        bcpl = bcpo.a(bcpl);
        switch (this.y) {
            case (byte) 1:
                return bcpl.K();
            case (byte) 2:
                return bcpl.F();
            case (byte) 3:
                return bcpl.I();
            case (byte) 4:
                return bcpl.G();
            case (byte) 5:
                return bcpl.E();
            case (byte) 6:
                return bcpl.v();
            case (byte) 7:
                return bcpl.C();
            case (byte) 8:
                return bcpl.u();
            case (byte) 9:
                return bcpl.A();
            case (byte) 10:
                return bcpl.z();
            case (byte) 11:
                return bcpl.x();
            case (byte) 12:
                return bcpl.t();
            case (byte) 13:
                return bcpl.r();
            case (byte) 14:
                return bcpl.p();
            case (byte) 15:
                return bcpl.q();
            case (byte) 16:
                return bcpl.n();
            case (byte) 17:
                return bcpl.m();
            case (byte) 18:
                return bcpl.k();
            case (byte) 19:
                return bcpl.j();
            case (byte) 20:
                return bcpl.h();
            case (byte) 21:
                return bcpl.g();
            case (byte) 22:
                return bcpl.e();
            case (byte) 23:
                return bcpl.d();
            default:
                throw new InternalError();
        }
    }

    private final Object readResolve() {
        switch (this.y) {
            case (byte) 1:
                return bcpm.a;
            case (byte) 2:
                return bcpm.b;
            case (byte) 3:
                return bcpm.c;
            case (byte) 4:
                return bcpm.d;
            case (byte) 5:
                return bcpm.e;
            case (byte) 6:
                return bcpm.f;
            case (byte) 7:
                return bcpm.g;
            case (byte) 8:
                return bcpm.h;
            case (byte) 9:
                return bcpm.i;
            case (byte) 10:
                return bcpm.j;
            case (byte) 11:
                return bcpm.k;
            case (byte) 12:
                return bcpm.l;
            case (byte) 13:
                return bcpm.m;
            case (byte) 14:
                return bcpm.n;
            case (byte) 15:
                return bcpm.o;
            case (byte) 16:
                return bcpm.p;
            case (byte) 17:
                return bcpm.q;
            case (byte) 18:
                return bcpm.r;
            case (byte) 19:
                return bcpm.s;
            case (byte) 20:
                return bcpm.t;
            case (byte) 21:
                return bcpm.u;
            case (byte) 22:
                return bcpm.v;
            case (byte) 23:
                return bcpm.w;
            default:
                return this;
        }
    }
}
