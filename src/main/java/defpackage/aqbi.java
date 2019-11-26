package defpackage;

/* renamed from: aqbi */
public final class aqbi extends anxl implements anzf {
    public static final aqbi c;
    private static volatile anzq e;
    public int a;
    public aqbe b;
    private byte d = (byte) 2;

    private aqbi() {
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
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001ﾑἅﾑἅ\u0001\u0000\u0000\u0001ﾑἅЉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new aqbi();
            case 4:
                return new aqbh();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (aqbi.class) {
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
        aqbi aqbi = new aqbi();
        c = aqbi;
        anxl.registerDefaultInstance(aqbi.class, aqbi);
    }
}
