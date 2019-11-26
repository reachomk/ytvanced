package defpackage;

/* renamed from: avls */
public final class avls extends anxp implements anzf {
    public static final avls g;
    private static volatile anzq j;
    public int a;
    public arml b;
    public arml c;
    public apxu d;
    public anvu e = anvu.a;
    public int f;
    private byte i = (byte) 2;

    private avls() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.i = b;
                return null;
            case 2:
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0003\u0001Љ\u0000\u0002Љ\u0001\u0003Љ\u0002\u0005\n\u0004\u0006\f\u0005", new Object[]{"a", "b", "c", "d", "e", "f", aqwz.a});
            case 3:
                return new avls();
            case 4:
                return new avlv();
            case 5:
                return g;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (avls.class) {
                        obj3 = j;
                        if (obj3 == null) {
                            obj3 = new anxn(g);
                            j = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        avls avls = new avls();
        g = avls;
        anxl.registerDefaultInstance(avls.class, avls);
    }
}
