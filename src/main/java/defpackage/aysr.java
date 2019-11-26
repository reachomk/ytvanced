package defpackage;

/* renamed from: aysr */
public final class aysr extends anxl implements anzf {
    public static final aysr e;
    private static volatile anzq g;
    public int a;
    public arml b;
    public apxu c;
    public arwf d;
    private byte f = (byte) 2;

    private aysr() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.f = b;
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0002\u0001Љ\u0000\u0002Љ\u0001\u0005\t\u0004", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new aysr();
            case 4:
                return new aysq();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (aysr.class) {
                        obj3 = g;
                        if (obj3 == null) {
                            obj3 = new anxn(e);
                            g = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aysr aysr = new aysr();
        e = aysr;
        anxl.registerDefaultInstance(aysr.class, aysr);
    }
}
