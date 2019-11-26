package defpackage;

/* renamed from: auon */
public final class auon extends anxl implements anzf {
    public static final auon f;
    private static volatile anzq h;
    public int a;
    public arml b;
    public arml c;
    public arml d;
    public arml e;
    private byte g = (byte) 2;

    private auon() {
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
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0000\u0004\u0001Љ\u0000\u0004Љ\u0003\u0006Љ\u0005\u0007Љ\u0006", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new auon();
            case 4:
                return new auoq();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (auon.class) {
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
        auon auon = new auon();
        f = auon;
        anxl.registerDefaultInstance(auon.class, auon);
    }
}
