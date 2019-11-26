package defpackage;

/* renamed from: axwm */
public final class axwm extends anxl implements anzf {
    public static final axwm f;
    private static volatile anzq h;
    public int a;
    public avut b;
    public azns c;
    public aqwx d;
    public axwk e;
    private byte g = (byte) 2;

    private axwm() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.g = b;
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001ﱃ᥯἗\u0004\u0000\u0000\u0004ﱃ᥯Љ\u0002ᩭЉ\u0000ᯧЉ\u0001἗Љ\u0003", new Object[]{"a", "d", "b", "c", "e"});
            case 3:
                return new axwm();
            case 4:
                return new axwp();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (axwm.class) {
                        obj3 = h;
                        if (obj3 == null) {
                            obj3 = new anxn(f);
                            h = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        axwm axwm = new axwm();
        f = axwm;
        anxl.registerDefaultInstance(axwm.class, axwm);
    }
}
