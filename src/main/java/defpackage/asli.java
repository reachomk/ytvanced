package defpackage;

/* renamed from: asli */
public final class asli extends anxl implements anzf {
    public static final asli l;
    private static volatile anzq m;
    public int a;
    public boolean b;
    public int c;
    public boolean d;
    public boolean e;
    public int f;
    public int g;
    public long h;
    public long i;
    public int j;
    public anyd k = anxl.emptyProtobufList();

    private asli() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(l, "\u0001\n\u0000\u0001\u0001\u000f\n\u0000\u0001\u0000\u0001\u0007\u0000\u0002\u0007\u0002\u0003\u000b\u0001\u0006\u0007\u0004\u0007\u0004\u0005\u000b\u0002\n\f\u0002\u000b\r\f\f\u000e\u001b\u000f\u0004\u0006", new Object[]{"a", "b", "d", "c", "e", "f", "h", "i", "j", avks.a, "k", aslk.class, "g"});
            case 3:
                return new asli();
            case 4:
                return new asll();
            case 5:
                return l;
            case 6:
                Object obj3 = m;
                if (obj3 == null) {
                    synchronized (asli.class) {
                        obj3 = m;
                        if (obj3 == null) {
                            obj3 = new anxn(l);
                            m = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        asli asli = new asli();
        l = asli;
        anxl.registerDefaultInstance(asli.class, asli);
    }
}
