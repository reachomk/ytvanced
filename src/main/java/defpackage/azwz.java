package defpackage;

/* renamed from: azwz */
public final class azwz extends anxl implements anzf {
    public static final azwz g;
    public static final anxr h;
    private static volatile anzq j;
    public int a;
    public int b;
    public azsr c;
    public azuz d;
    public boolean e;
    public azsg f;
    private byte i = (byte) 2;

    private azwz() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.i = b;
                return null;
            case 2:
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0002\u0007\u0005\u0000\u0000\u0003\u0002Љ\u0001\u0003Љ\u0002\u0004\f\u0000\u0006\u0007\u0003\u0007Љ\u0004", new Object[]{"a", "c", "d", "b", azww.a, "e", "f"});
            case 3:
                return new azwz();
            case 4:
                return new azwy();
            case 5:
                return g;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (azwz.class) {
                        obj3 = j;
                        if (obj3 == null) {
                            obj3 = new anxn(g);
                            j = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        azwz azwz = new azwz();
        g = azwz;
        anxl.registerDefaultInstance(azwz.class, azwz);
        azsr azsr = azsr.a;
        azwz azwz2 = g;
        h = anxl.newSingularGeneratedExtension(azsr, azwz2, azwz2, null, 217165905, aobm.MESSAGE, azwz.class);
    }
}
