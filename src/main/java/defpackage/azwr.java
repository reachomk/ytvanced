package defpackage;

/* renamed from: azwr */
public final class azwr extends anxl implements anzf {
    public static final azwr c;
    public static final anxr d;
    private static volatile anzq e;
    public int a;
    public String b = "";

    private azwr() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\b\u0000", new Object[]{"a", "b"});
            case 3:
                return new azwr();
            case 4:
                return new azwq();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (azwr.class) {
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
        azwr azwr = new azwr();
        c = azwr;
        anxl.registerDefaultInstance(azwr.class, azwr);
        azvv azvv = azvv.a;
        azwr azwr2 = c;
        d = anxl.newSingularGeneratedExtension(azvv, azwr2, azwr2, null, 172035250, aobm.MESSAGE, azwr.class);
    }
}
