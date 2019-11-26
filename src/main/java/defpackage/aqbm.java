package defpackage;

/* renamed from: aqbm */
public final class aqbm extends anxl implements anzf {
    public static final aqbm c;
    private static volatile anzq e;
    public int a;
    public aqbk b;
    private byte d = (byte) 2;

    private aqbm() {
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
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001⧁⧁\u0001\u0000\u0000\u0001⧁Љ\u0000", new Object[]{"a", "b"});
            case 3:
                return new aqbm();
            case 4:
                return new aqbl();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (aqbm.class) {
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
        aqbm aqbm = new aqbm();
        c = aqbm;
        anxl.registerDefaultInstance(aqbm.class, aqbm);
    }
}
