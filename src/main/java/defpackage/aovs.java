package defpackage;

/* renamed from: aovs */
public final class aovs extends anxl implements anzf {
    public static final aovs f;
    private static volatile anzq h;
    public int a;
    public long b;
    public long c;
    public aygk d;
    public anvu e = anvu.a;
    private byte g = (byte) 2;

    private aovs() {
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
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\t\u0004\u0000\u0000\u0001\u0001\u0002\u0000\u0002\u0002\u0001\u0006Љ\u0002\t\n\u0004", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new aovs();
            case 4:
                return new aovv();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (aovs.class) {
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
        aovs aovs = new aovs();
        f = aovs;
        anxl.registerDefaultInstance(aovs.class, aovs);
    }
}
