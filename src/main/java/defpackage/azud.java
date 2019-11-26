package defpackage;

/* renamed from: azud */
public final class azud extends anxl implements anzf {
    public static final azud d;
    public static final anxr e;
    private static volatile anzq g;
    public int a;
    public azsz b;
    public azsb c;
    private byte f = (byte) 2;

    private azud() {
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
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001Љ\u0000\u0002\t\u0001", new Object[]{"a", "b", "c"});
            case 3:
                return new azud();
            case 4:
                return new azuc();
            case 5:
                return d;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (azud.class) {
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
        azud azud = new azud();
        d = azud;
        anxl.registerDefaultInstance(azud.class, azud);
        azsr azsr = azsr.a;
        azud azud2 = d;
        e = anxl.newSingularGeneratedExtension(azsr, azud2, azud2, null, 206181248, aobm.MESSAGE, azud.class);
    }
}
