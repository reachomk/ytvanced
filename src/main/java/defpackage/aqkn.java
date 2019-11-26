package defpackage;

/* renamed from: aqkn */
public final class aqkn extends anxl implements anzf {
    public static final aqkn f;
    private static volatile anzq h;
    public int a;
    public arwf b;
    public arml c;
    public arml d;
    public arml e;
    private byte g = (byte) 2;

    private aqkn() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.g = b;
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0003\u0001Љ\u0001\u0002Љ\u0002\u0003Љ\u0003\u0004\t\u0000", new Object[]{"a", "c", "d", "e", "b"});
            case 3:
                return new aqkn();
            case 4:
                return new aqkm();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (aqkn.class) {
                        obj3 = h;
                        if (obj3 == null) {
                            obj3 = new anxn(f);
                            h = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aqkn aqkn = new aqkn();
        f = aqkn;
        anxl.registerDefaultInstance(aqkn.class, aqkn);
    }
}
