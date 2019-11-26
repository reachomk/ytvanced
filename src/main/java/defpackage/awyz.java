package defpackage;

/* renamed from: awyz */
public final class awyz extends anxl implements anzf {
    public static final awyz g;
    private static volatile anzq i;
    public int a;
    public arml b;
    public apxu c;
    public arwf d;
    public awza e;
    public anvu f = anvu.a;
    private byte h = (byte) 2;

    private awyz() {
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
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0002\u0001Љ\u0000\u0003Љ\u0002\u0004\n\u0005\u0006\t\u0003\u0007\t\u0004", new Object[]{"a", "b", "c", "f", "d", "e"});
            case 3:
                return new awyz();
            case 4:
                return new awzb();
            case 5:
                return g;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (awyz.class) {
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
        awyz awyz = new awyz();
        g = awyz;
        anxl.registerDefaultInstance(awyz.class, awyz);
    }
}
