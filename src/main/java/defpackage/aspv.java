package defpackage;

/* renamed from: aspv */
public final class aspv extends anxl implements anzf {
    public static final aspv c;
    private static volatile anzq e;
    public int a = 0;
    public Object b;
    private byte d = (byte) 2;

    private aspv() {
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
                return anxl.newMessageInfo(c, "\u0001\u0001\u0001\u0000ᮯᮯ\u0001\u0000\u0000\u0001ᮯм\u0000", new Object[]{"b", "a", aopj.class});
            case 3:
                return new aspv();
            case 4:
                return new aspy();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (aspv.class) {
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
        aspv aspv = new aspv();
        c = aspv;
        anxl.registerDefaultInstance(aspv.class, aspv);
    }
}
