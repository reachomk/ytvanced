package defpackage;

/* renamed from: asov */
public final class asov extends anxl implements anzf {
    public static final asov c;
    private static volatile anzq e;
    public int a = 0;
    public Object b;
    private byte d = (byte) 2;

    private asov() {
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
                return anxl.newMessageInfo(c, "\u0001\u0005\u0001\u0000⢵冰\u0005\u0000\u0000\u0005⢵м\u0000㬮м\u0000㬮м\u0000請乆м\u0000冰м\u0000", new Object[]{"b", "a", aril.class, asox.class, asot.class, asog.class, atze.class});
            case 3:
                return new asov();
            case 4:
                return new asoy();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (asov.class) {
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
        asov asov = new asov();
        c = asov;
        anxl.registerDefaultInstance(asov.class, asov);
    }
}
