package defpackage;

/* renamed from: apgy */
public final class apgy extends anxl implements anzf {
    public static final apgy c;
    public static final anxr d;
    private static volatile anzq e;
    public int a;
    public int b;

    private apgy() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f\u0000", new Object[]{"a", "b", aphc.a});
            case 3:
                return new apgy();
            case 4:
                return new aphb();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (apgy.class) {
                        obj3 = e;
                        if (obj3 == null) {
                            obj3 = new anxn(c);
                            e = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        apgy apgy = new apgy();
        c = apgy;
        anxl.registerDefaultInstance(apgy.class, apgy);
        aphg aphg = aphg.s;
        apgy apgy2 = c;
        d = anxl.newSingularGeneratedExtension(aphg, apgy2, apgy2, null, 160206468, aobm.MESSAGE, apgy.class);
    }
}
