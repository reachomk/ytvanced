package defpackage;

/* renamed from: azts */
public final class azts extends anxl implements anzf {
    public static final azts d;
    public static final anxr e;
    private static volatile anzq g;
    public int a;
    public float b;
    public azsr c;
    private byte f = (byte) 2;

    private azts() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.f = b;
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u0001\u0000\u0002Љ\u0001", new Object[]{"a", "b", "c"});
            case 3:
                return new azts();
            case 4:
                return new aztv();
            case 5:
                return d;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (azts.class) {
                        obj3 = g;
                        if (obj3 == null) {
                            obj3 = new anxn(d);
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
        azts azts = new azts();
        d = azts;
        anxl.registerDefaultInstance(azts.class, azts);
        azsr azsr = azsr.a;
        azts azts2 = d;
        e = anxl.newSingularGeneratedExtension(azsr, azts2, azts2, null, 182590845, aobm.MESSAGE, azts.class);
    }
}
