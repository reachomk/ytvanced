package defpackage;

/* renamed from: aqkp */
public final class aqkp extends anxl implements anzf {
    public static final aqkp c;
    private static volatile anzq e;
    public int a;
    public aqkn b;
    private byte d = (byte) 2;

    private aqkp() {
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
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001ﮓ㢝ﮓ㢝\u0001\u0000\u0000\u0001ﮓ㢝Љ\u0000", new Object[]{"a", "b"});
            case 3:
                return new aqkp();
            case 4:
                return new aqko();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (aqkp.class) {
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
        aqkp aqkp = new aqkp();
        c = aqkp;
        anxl.registerDefaultInstance(aqkp.class, aqkp);
    }
}
