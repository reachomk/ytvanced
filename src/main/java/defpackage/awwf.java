package defpackage;

/* renamed from: awwf */
public final class awwf extends anxl implements anzf {
    public static final awwf b;
    private static volatile anzq c;
    public anxz a = anxl.emptyIntList();

    private awwf() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001d", new Object[]{"a"});
            case 3:
                return new awwf();
            case 4:
                return new awwe();
            case 5:
                return b;
            case 6:
                Object obj3 = c;
                if (obj3 == null) {
                    synchronized (awwf.class) {
                        obj3 = c;
                        if (obj3 == null) {
                            obj3 = new anxn(b);
                            c = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        awwf awwf = new awwf();
        b = awwf;
        anxl.registerDefaultInstance(awwf.class, awwf);
    }
}
