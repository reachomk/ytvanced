package defpackage;

/* renamed from: aqhp */
public final class aqhp extends anxl implements anzf {
    public static final aqhp m;
    private static volatile anzq o;
    public int a;
    public axak b;
    public axak c;
    public axak d;
    public axak e;
    public axak f;
    public apxu g;
    public arml h;
    public arml i;
    public arml j;
    public apxu k;
    public arml l;
    private byte n = (byte) 2;

    private aqhp() {
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.n);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.n = b;
                return null;
            case 2:
                return anxl.newMessageInfo(m, "\u0001\u000b\u0000\u0001\b\u0017\u000b\u0000\u0000\u000b\bЉ\u0007\tЉ\b\nЉ\u0001\rЉ\t\u000eЉ\u0005\u0011Љ\u000b\u0013Љ\u0003\u0014Љ\u0004\u0015Љ\f\u0016Љ\u0006\u0017Љ\n", new Object[]{"a", "g", "h", "b", "i", "e", "k", "c", "d", "l", "f", "j"});
            case 3:
                return new aqhp();
            case 4:
                return new aqhs();
            case 5:
                return m;
            case 6:
                Object obj3 = o;
                if (obj3 == null) {
                    synchronized (aqhp.class) {
                        obj3 = o;
                        if (obj3 == null) {
                            obj3 = new anxn(m);
                            o = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aqhp aqhp = new aqhp();
        m = aqhp;
        anxl.registerDefaultInstance(aqhp.class, aqhp);
    }
}
