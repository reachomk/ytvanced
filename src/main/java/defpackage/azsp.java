package defpackage;

/* renamed from: azsp */
public final class azsp extends anxl implements anzf {
    public static final azsp c;
    public static final anxr d;
    private static volatile anzq e;
    public int a;
    public int b;

    private azsp() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u0004\u0001", new Object[]{"a", "b"});
            case 3:
                return new azsp();
            case 4:
                return new azso();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (azsp.class) {
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
        azsp azsp = new azsp();
        c = azsp;
        anxl.registerDefaultInstance(azsp.class, azsp);
        azvl azvl = azvl.a;
        azsp azsp2 = c;
        d = anxl.newSingularGeneratedExtension(azvl, azsp2, azsp2, null, 198239242, aobm.MESSAGE, azsp.class);
    }
}
