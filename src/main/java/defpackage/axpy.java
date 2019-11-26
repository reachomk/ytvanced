package defpackage;

/* renamed from: axpy */
public final class axpy extends anxl implements anzf {
    public static final axpy f;
    private static volatile anzq g;
    public int a;
    public String b;
    public String c;
    public axqf d;
    public long e;

    private axpy() {
        String str = "";
        this.b = str;
        this.c = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0000\u0001\b\u0000\u0004\b\u0001\u0005\t\u0002\u0006\u0002\u0003", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new axpy();
            case 4:
                return new axqb();
            case 5:
                return f;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (axpy.class) {
                        obj3 = g;
                        if (obj3 == null) {
                            obj3 = new anxn(f);
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
        axpy axpy = new axpy();
        f = axpy;
        anxl.registerDefaultInstance(axpy.class, axpy);
    }
}
