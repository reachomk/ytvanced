package defpackage;

/* renamed from: apvm */
public final class apvm extends anxl implements anzf {
    public static final apvm c;
    private static volatile anzq d;
    public int a;
    public apvi b;

    private apvm() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001\u0016\u0016\u0001\u0000\u0000\u0000\u0016\t\u0000", new Object[]{"a", "b"});
            case 3:
                return new apvm();
            case 4:
                return new apvl();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (apvm.class) {
                        obj3 = d;
                        if (obj3 == null) {
                            obj3 = new anxn(c);
                            d = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        apvm apvm = new apvm();
        c = apvm;
        anxl.registerDefaultInstance(apvm.class, apvm);
    }
}
