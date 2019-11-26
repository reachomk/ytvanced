package defpackage;

/* renamed from: aviq */
public final class aviq extends anxl implements anzf {
    public static final aviq g;
    private static volatile anzq i;
    public int a;
    public arml b;
    public axak c;
    public axak d;
    public long e;
    public anvu f = anvu.a;
    private byte h = (byte) 2;

    private aviq() {
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
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0003\u0001Љ\u0000\u0002Љ\u0001\u0003Љ\u0002\u0004\u0002\u0003\u0006\n\u0005", new Object[]{"a", "b", "c", "d", "e", "f"});
            case 3:
                return new aviq();
            case 4:
                return new avis();
            case 5:
                return g;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (aviq.class) {
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
        aviq aviq = new aviq();
        g = aviq;
        anxl.registerDefaultInstance(aviq.class, aviq);
    }
}
