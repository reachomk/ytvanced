package defpackage;

/* renamed from: auxr */
public final class auxr extends anxl implements anzf {
    public static final auxr c;
    private static volatile anzq e;
    public int a = 0;
    public Object b;
    private byte d = (byte) 2;

    private auxr() {
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
                return anxl.newMessageInfo(c, "\u0001\u0004\u0001\u0000⇿ﱡ扃\u0004\u0000\u0000\u0004⇿м\u0000㈰м\u0000刈м\u0000ﱡ扃м\u0000", new Object[]{"b", "a", auxp.class, auxt.class, auxn.class, auxx.class});
            case 3:
                return new auxr();
            case 4:
                return new auxq();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (auxr.class) {
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
        auxr auxr = new auxr();
        c = auxr;
        anxl.registerDefaultInstance(auxr.class, auxr);
    }
}
