package defpackage;

/* renamed from: apsa */
public final class apsa extends anxl implements anzf {
    public static final apsa f;
    private static volatile anzq g;
    public int a;
    public int b = 0;
    public Object c;
    public String d = "";
    public anvu e = anvu.a;

    private apsa() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\n\u0001\u0002<\u0000\u0003:\u0000\u0004:\u0000\u0005\b\u0000", new Object[]{"c", "b", "a", "e", aprq.class, "d"});
            case 3:
                return new apsa();
            case 4:
                return new apsd();
            case 5:
                return f;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (apsa.class) {
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
        apsa apsa = new apsa();
        f = apsa;
        anxl.registerDefaultInstance(apsa.class, apsa);
    }
}
