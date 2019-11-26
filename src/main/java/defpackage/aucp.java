package defpackage;

/* renamed from: aucp */
public final class aucp extends anxl implements anzf {
    public static final aucp c;
    private static volatile anzq e;
    public int a;
    public auct b;
    private byte d = (byte) 2;

    private aucp() {
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
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001Ｖ䊽Ｖ䊽\u0001\u0000\u0000\u0001Ｖ䊽Љ\u0000", new Object[]{"a", "b"});
            case 3:
                return new aucp();
            case 4:
                return new auco();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (aucp.class) {
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
        aucp aucp = new aucp();
        c = aucp;
        anxl.registerDefaultInstance(aucp.class, aucp);
    }
}
