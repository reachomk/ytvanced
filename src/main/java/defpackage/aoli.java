package defpackage;

/* renamed from: aoli */
public final class aoli extends anxp implements anzf {
    public static final aoli u;
    private static volatile anzq w;
    public int a;
    public aygk b;
    public axak c;
    public arml d;
    public axak e;
    public arml f;
    public float g;
    public axak i;
    public arml j;
    public arml k;
    public apxu l;
    public float m;
    public anvu n;
    public anyd o;
    public aygk p;
    public int q;
    public int r;
    public axak s;
    public aolm t;
    private byte v = (byte) 2;

    private aoli() {
        anxl.emptyProtobufList();
        this.n = anvu.a;
        this.o = anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.v);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.v = b;
                return null;
            case 2:
                return anxl.newMessageInfo(u, "\u0001\u0012\u0000\u0001\u0001\u0016\u0012\u0000\u0001\f\u0001Љ\u0000\u0002Љ\u0002\u0003Љ\u0004\u0004\u0001\u0005\u0005Љ\u0007\u0006Љ\b\u0007Љ\t\b\u0001\n\u000b\n\f\fЛ\rЉ\r\u0010Љ\u0001\u0011Љ\u0003\u0012Љ\u0006\u0013\u000b\u000e\u0014\f\u000f\u0015Љ\u0010\u0016\t\u0011", new Object[]{"a", "b", "d", "f", "g", "j", "k", "l", "m", "n", "o", apxu.class, "p", "c", "e", "i", "q", "r", awul.a, "s", "t"});
            case 3:
                return new aoli();
            case 4:
                return new aoll();
            case 5:
                return u;
            case 6:
                Object obj3 = w;
                if (obj3 == null) {
                    synchronized (aoli.class) {
                        obj3 = w;
                        if (obj3 == null) {
                            obj3 = new anxn(u);
                            w = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aoli aoli = new aoli();
        u = aoli;
        anxl.registerDefaultInstance(aoli.class, aoli);
    }
}
