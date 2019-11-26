package defpackage;

/* renamed from: apid */
public final class apid extends anxl implements anzf {
    public static final apid f;
    private static volatile anzq g;
    public int a;
    public int b = 0;
    public Object c;
    public anvu d = anvu.a;
    public long e;

    private apid() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\n\u0000\u0002\u0003\u0001\u0003;\u0000\u0004<\u0000\u0005;\u0000", new Object[]{"c", "b", "a", "d", "e", augl.class});
            case 3:
                return new apid();
            case 4:
                return new apig();
            case 5:
                return f;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (apid.class) {
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
        apid apid = new apid();
        f = apid;
        anxl.registerDefaultInstance(apid.class, apid);
    }
}
