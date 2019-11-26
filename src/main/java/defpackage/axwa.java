package defpackage;

/* renamed from: axwa */
public final class axwa extends anxl implements anzf {
    public static final axwa M;
    private static volatile anzq O;
    public arwf A;
    public anyd B;
    public anyd C;
    public anyd D;
    public anyd E;
    public aodx F;
    public aodx G;
    public anvu H;
    public apxu I;
    public long J;
    public long K;
    public boolean L;
    private byte N = (byte) 2;
    public int a;
    public int b;
    public int c = 0;
    public Object d;
    public String e;
    public arml f;
    public arml g;
    public arml h;
    public arml i;
    public arml j;
    public arml k;
    public arml l;
    public arml m;
    public arml n;
    public boolean o;
    public String p;
    public boolean q;
    public aphj r;
    public axvw s;
    public axvy t;
    public axwm u;
    public axwq v;
    public String w;
    public arup x;
    public axvv y;
    public int z;

    private axwa() {
        String str = "";
        this.e = str;
        this.p = str;
        this.w = str;
        this.B = anxl.emptyProtobufList();
        this.C = anxl.emptyProtobufList();
        this.D = anxl.emptyProtobufList();
        this.E = anxl.emptyProtobufList();
        this.H = anvu.a;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.N);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.N = b;
                return null;
            case 2:
                return anxl.newMessageInfo(M, "\u0001$\u0001\u0002\u0001)$\u0000\u0004\u0014\u0001Љ\u0001\u0002Љ\u0004\u0003\u0007\n\u0004\u0007\f\u0005Љ\u0010\u0006\f\u0015\u0007\b\u0000\tЉ\b\nЉ\t\u000bЉ\u0011\fЉ\u0002\rЉ\u0003\u000f\n\u001d\u0010Љ\u0007\u0011\t\u0016\u0012Л\u0013<\u0000\u0014Љ\u0005\u0015Љ\r\u0016Љ\u000f\u0017Љ\u0006\u0018Љ\u0013\u0019\t\u001a\u001a\t\u001b\u001bЉ\u000e\u001c\t\u0014\u001f\b\u0012 Љ !\u0002!\"Л#<\u0000$\b\u000b&Л'Л(\u0002\")\u0007#", new Object[]{"d", "c", "a", "b", "f", "i", "o", "q", "u", "z", axwf.a, "e", "m", "n", "v", "g", "h", "H", "l", "A", "B", apxu.class, axwe.class, "j", "r", "t", "k", "x", "F", "G", "s", "y", "w", "I", "J", "C", apxu.class, axwi.class, "p", "D", apxu.class, "E", apxu.class, "K", "L"});
            case 3:
                return new axwa();
            case 4:
                return new axwd();
            case 5:
                return M;
            case 6:
                Object obj3 = O;
                if (obj3 == null) {
                    synchronized (axwa.class) {
                        obj3 = O;
                        if (obj3 == null) {
                            obj3 = new anxn(M);
                            O = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        axwa axwa = new axwa();
        M = axwa;
        anxl.registerDefaultInstance(axwa.class, axwa);
    }
}
