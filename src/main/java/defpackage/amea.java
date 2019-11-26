package defpackage;

/* renamed from: amea */
public final class amea extends anxl implements anzf {
    public static final amea U;
    private static volatile anzq V;
    public String A;
    public anyd B;
    public boolean C;
    public boolean D;
    public azaz E;
    public String F;
    public String G;
    public int H;
    public amec I;
    public amec J;
    public amec K;
    public boolean L;
    public boolean M;
    public amec N;
    public amec O;
    public String P;
    public amec Q;
    public amdv R;
    public amdr S;
    public boolean T;
    public int a;
    public int b;
    public String c;
    public String d;
    public long e;
    public ameo f;
    public String g;
    public int h;
    public anvu i = anvu.a;
    public int j;
    public int k;
    public String l;
    public amec m;
    public amdl n;
    public amec o;
    public String p;
    public String q;
    public long r;
    public amec s;
    public amec t;
    public amec u;
    public amec v;
    public amec w;
    public anyd x;
    public anyd y;
    public amdp z;

    private amea() {
        String str = "";
        this.c = str;
        this.d = str;
        this.g = str;
        this.l = str;
        this.p = str;
        this.q = str;
        this.x = anxl.emptyProtobufList();
        this.y = anxl.emptyProtobufList();
        this.A = str;
        this.B = anxl.emptyProtobufList();
        this.F = str;
        this.G = str;
        this.P = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(U, "\u0001,\u0000\u0002\u00010,\u0000\u0003\u0000\u0001\b\u0000\u0002\b\u0001\u0003\t\u0003\u0004\b\u0004\u0005\b\u000f\u0006\b\u0010\u0007\t\u0012\b\t\u0014\t\b\u001d\n\f\u001e\u000b\t\u001f\f\t \r\t!\u000e\u0007\"\u000f\t$\u0010\u0003\u0002\u0011\b\u001c\u0012\b&\u0013\t'\u0014\t\r\u0015\t\u000e\u0016\t\f\u0017\b\u000b\u0018\f\n\u0019\f\t\u001a\t(\u001c\t%\u001e\t\u0015\u001f\f\u0005 \t\u0016!\u001a\"\u001a$\t\u0017%\u0007#&\t)'\b\u0018)\n\b*\u001a+\u0007\u0019,\t\u0013-\u0003\u0011.\t\u001b/\u0007+0\u0007\u001a", new Object[]{"a", "b", "c", "d", "f", "g", "p", "q", "s", "u", "G", "H", amel.a, "I", "J", "K", "L", "N", "e", "F", "P", "Q", "n", "o", "m", "l", "k", amef.a, "j", ameh.a, "R", "O", "v", "h", amej.a, "w", "x", "y", "z", "M", "S", "A", "i", "B", "C", "t", "r", "E", "T", "D"});
            case 3:
                return new amea();
            case 4:
                return new amdz();
            case 5:
                return U;
            case 6:
                Object obj3 = V;
                if (obj3 == null) {
                    synchronized (amea.class) {
                        obj3 = V;
                        if (obj3 == null) {
                            obj3 = new anxn(U);
                            V = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        amea amea = new amea();
        U = amea;
        anxl.registerDefaultInstance(amea.class, amea);
    }
}
