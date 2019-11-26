package defpackage;

/* renamed from: apnr */
public final class apnr extends anxl implements anzf {
    public static final apnr c;
    private static volatile anzq e;
    public int a = 0;
    public Object b;
    private byte d = (byte) 2;

    private apnr() {
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
                return anxl.newMessageInfo(c, "\u0001\u0001\u0001\u0000㐔㐔\u0001\u0000\u0000\u0001㐔м\u0000", new Object[]{"b", "a", apnp.class});
            case 3:
                return new apnr();
            case 4:
                return new apnu();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (apnr.class) {
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
        apnr apnr = new apnr();
        c = apnr;
        anxl.registerDefaultInstance(apnr.class, apnr);
    }
}
