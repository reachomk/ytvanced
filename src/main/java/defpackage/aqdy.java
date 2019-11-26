package defpackage;

/* renamed from: aqdy */
public final class aqdy extends anxp implements anzf {
    public static final aqdy l;
    private static volatile anzq n;
    public int a;
    public arml b;
    public arml c;
    public arml d;
    public arml e;
    public apxu f;
    public axwz g;
    public aqea i;
    public auvr j;
    public arqc k;
    private byte m = (byte) 2;

    private aqdy() {
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.m = b;
                return null;
            case 2:
                return anxl.newMessageInfo(l, "\u0001\t\u0000\u0001\u0003\u0013\t\u0000\u0000\t\u0003Љ\u0002\u0004Љ\u0004\u0005Љ\u0005\u0006Љ\u0006\bЉ\u0007\tЉ\u0003\u000bЉ\b\u0011Љ\u000f\u0013Љ\t", new Object[]{"a", "b", "d", "e", "f", "g", "c", "i", "k", "j"});
            case 3:
                return new aqdy();
            case 4:
                return new aqdx();
            case 5:
                return l;
            case 6:
                Object obj3 = n;
                if (obj3 == null) {
                    synchronized (aqdy.class) {
                        obj3 = n;
                        if (obj3 == null) {
                            obj3 = new anxn(l);
                            n = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aqdy aqdy = new aqdy();
        l = aqdy;
        anxl.registerDefaultInstance(aqdy.class, aqdy);
    }
}
