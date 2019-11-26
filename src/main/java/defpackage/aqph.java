package defpackage;

/* renamed from: aqph */
public final class aqph extends anxl implements anzf {
    public static final aqph e;
    private static volatile anzq g;
    public int a;
    public avkc b;
    public atuj c;
    public awzv d;
    private byte f = (byte) 2;

    private aqph() {
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
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001ᣑ┤\u0003\u0000\u0000\u0002ᣑЉ\u0000᳗Љ\u0002┤\t\u0001", new Object[]{"a", "b", "d", "c"});
            case 3:
                return new aqph();
            case 4:
                return new aqpg();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (aqph.class) {
                        obj3 = g;
                        if (obj3 == null) {
                            obj3 = new anxn(e);
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
        aqph aqph = new aqph();
        e = aqph;
        anxl.registerDefaultInstance(aqph.class, aqph);
    }
}
