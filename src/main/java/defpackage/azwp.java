package defpackage;

/* renamed from: azwp */
public final class azwp extends anxl implements anzf {
    public static final azwp d;
    public static final anxr e;
    private static volatile anzq f;
    public int a;
    public String b = "";
    public anvu c = anvu.a;

    private azwp() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\b\u0000\u0002\n\u0001", new Object[]{"a", "b", "c"});
            case 3:
                return new azwp();
            case 4:
                return new azwo();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (azwp.class) {
                        obj3 = f;
                        if (obj3 == null) {
                            obj3 = new anxn(d);
                            f = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        azwp azwp = new azwp();
        d = azwp;
        anxl.registerDefaultInstance(azwp.class, azwp);
        azsr azsr = azsr.a;
        azwp azwp2 = d;
        e = anxl.newSingularGeneratedExtension(azsr, azwp2, azwp2, null, 170382760, aobm.MESSAGE, azwp.class);
    }
}
