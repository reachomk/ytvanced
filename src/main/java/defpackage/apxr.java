package defpackage;

/* renamed from: apxr */
public final class apxr extends anxl implements anzf {
    public static final apxr g;
    private static volatile anzq i;
    public int a;
    public axak b;
    public arml c;
    public arml d;
    public int e;
    public int f;
    private byte h = (byte) 2;

    private apxr() {
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
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0002\u0006\u0005\u0000\u0000\u0003\u0002Љ\u0001\u0003Љ\u0002\u0004\u000b\u0003\u0005\f\u0004\u0006Љ\u0000", new Object[]{"a", "c", "d", "e", "f", aohi.a, "b"});
            case 3:
                return new apxr();
            case 4:
                return new apxt();
            case 5:
                return g;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (apxr.class) {
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
        apxr apxr = new apxr();
        g = apxr;
        anxl.registerDefaultInstance(apxr.class, apxr);
    }
}
