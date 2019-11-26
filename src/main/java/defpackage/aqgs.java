package defpackage;

/* renamed from: aqgs */
public final class aqgs extends anxp implements anzf {
    public static final aqgs H;
    private static volatile anzq J;
    public boolean A;
    public anyd B;
    public aqgq C;
    public arqc D;
    public anvu E;
    public axak F;
    public anyd G;
    private byte I = (byte) 2;
    public int a;
    public int b;
    public String c = "";
    public aygk d;
    public arml e;
    public arml f;
    public arml g;
    public armh i;
    public aygk j;
    public arml k;
    public arml l;
    public arml m;
    public arml n;
    public apxu o;
    public apxu p;
    public ayri q;
    public anyd r;
    public apdx s;
    public apdx t;
    public apdx u;
    public apdx v;
    public aqgu w;
    public ayym x;
    public apxu y;
    public auvr z;

    private aqgs() {
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
        this.r = anxl.emptyProtobufList();
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
        this.B = anxl.emptyProtobufList();
        this.E = anvu.a;
        this.G = anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.I);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.I = b;
                return null;
            case 2:
                return anxl.newMessageInfo(H, "\u0001\u001e\u0000\u0002\u00010\u001e\u0000\u0003\u0019\u0001\b\u0000\u0002Љ\u0001\u0003Љ\u0002\u0004Љ\u0003\u0005Љ\b\u0006Љ\t\u0007Љ\u000b\bЉ\f\nЉ\u0004\fЉ\u000e\rЛ\u000eЉ\u0006\u0011Љ\u0013\u0012\n$\u0017Љ\n\u0018Љ\u0019\u0019Љ\u001a\u001aЉ\u001e\u001b\u0007\u001b\u001cЉ\u0010\u001dЉ\u001f Л!Љ\u000f\"Љ\u0011+Љ\r,Љ\u0012-\t\u0014.Љ&/\t\u00050Л", new Object[]{"a", "b", "c", "d", "e", "f", "k", "l", "n", "o", "g", "q", "r", apdh.class, "j", "w", "E", "m", "y", "z", "C", "A", "t", "D", "B", ayfu.class, "s", "u", "p", "v", "x", "F", "i", "G", axak.class});
            case 3:
                return new aqgs();
            case 4:
                return new aqgv();
            case 5:
                return H;
            case 6:
                Object obj3 = J;
                if (obj3 == null) {
                    synchronized (aqgs.class) {
                        obj3 = J;
                        if (obj3 == null) {
                            obj3 = new anxn(H);
                            J = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public static anzq b() {
        return H.getParserForType();
    }

    static {
        aqgs aqgs = new aqgs();
        H = aqgs;
        anxl.registerDefaultInstance(aqgs.class, aqgs);
    }
}
