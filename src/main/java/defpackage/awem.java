package defpackage;

/* renamed from: awem */
public final class awem extends anxl implements anzf {
    public static final awem g;
    private static volatile anzq i;
    public int a;
    public apxu b;
    public arml c;
    public axak d;
    public axak e;
    public anvu f = anvu.a;
    private byte h = (byte) 2;

    private awem() {
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
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0004\u0001Љ\u0000\u0002Љ\u0001\u0004\n\u0005\u0005Љ\u0002\u0006Љ\u0003", new Object[]{"a", "b", "c", "f", "d", "e"});
            case 3:
                return new awem();
            case 4:
                return new awep();
            case 5:
                return g;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (awem.class) {
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
        awem awem = new awem();
        g = awem;
        anxl.registerDefaultInstance(awem.class, awem);
    }
}
