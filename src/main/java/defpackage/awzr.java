package defpackage;

/* renamed from: awzr */
public final class awzr extends anxl implements anzf {
    public static final awzr g;
    private static volatile anzq i;
    public int a;
    public arml b;
    public aygk c;
    public apxu d;
    public arml e;
    public arml f;
    private byte h = (byte) 2;

    private awzr() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.h = b;
                return null;
            case 2:
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\b\u0005\u0000\u0000\u0005\u0001Љ\u0000\u0002Љ\u0001\u0006Љ\u0002\u0007Љ\u0003\bЉ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
            case 3:
                return new awzr();
            case 4:
                return new awzq();
            case 5:
                return g;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (awzr.class) {
                        obj3 = i;
                        if (obj3 == null) {
                            obj3 = new anxn(g);
                            i = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        awzr awzr = new awzr();
        g = awzr;
        anxl.registerDefaultInstance(awzr.class, awzr);
    }
}
