package defpackage;

/* renamed from: aynl */
public final class aynl extends anxl implements anzf {
    public static final aynl c;
    private static volatile anzq d;
    public int a = 0;
    public Object b;

    private aynl() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0001\u0000㡿㡿\u0001\u0000\u0000\u0000㡿<\u0000", new Object[]{"b", "a", apfb.class});
            case 3:
                return new aynl();
            case 4:
                return new ayno();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (aynl.class) {
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
        aynl aynl = new aynl();
        c = aynl;
        anxl.registerDefaultInstance(aynl.class, aynl);
    }
}
