package defpackage;

/* renamed from: aryr */
public final class aryr extends anxl implements anzf {
    public static final aryr c;
    private static volatile anzq e;
    public int a = 0;
    public Object b;
    private byte d = (byte) 2;

    private aryr() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.d);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.d = b;
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0005\u0001\u0000ᠤ㮜\u0005\u0000\u0000\u0005ᠤм\u0000啕᳉м\u0000⟕м\u0000⩲м\u0000㮜м\u0000", new Object[]{"b", "a", aqgs.class, arss.class, aryi.class, azem.class, aryp.class});
            case 3:
                return new aryr();
            case 4:
                return new aryu();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (aryr.class) {
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
        aryr aryr = new aryr();
        c = aryr;
        anxl.registerDefaultInstance(aryr.class, aryr);
    }
}
