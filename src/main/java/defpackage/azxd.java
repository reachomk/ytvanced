package defpackage;

/* renamed from: azxd */
public final class azxd extends anxl implements anzf {
    public static final azxd d;
    public static final anxr e;
    private static volatile anzq g;
    public int a;
    public azuj b;
    public int c;
    private byte f = (byte) 2;

    private azxd() {
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
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001Љ\u0000\u0002\f\u0001", new Object[]{"a", "b", "c", azws.a});
            case 3:
                return new azxd();
            case 4:
                return new azxc();
            case 5:
                return d;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (azxd.class) {
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
        azxd azxd = new azxd();
        d = azxd;
        anxl.registerDefaultInstance(azxd.class, azxd);
        azsr azsr = azsr.a;
        azxd azxd2 = d;
        e = anxl.newSingularGeneratedExtension(azsr, azxd2, azxd2, null, 220544256, aobm.MESSAGE, azxd.class);
    }
}
