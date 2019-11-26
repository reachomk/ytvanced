package defpackage;

/* renamed from: awgc */
public final class awgc extends anxl implements anzf {
    public static final awgc f;
    private static volatile anzq h;
    public int a;
    public anyd b = anxl.emptyProtobufList();
    public axak c;
    public String d = "";
    public anvu e = anvu.a;
    private byte g = (byte) 2;

    private awgc() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.g = b;
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0002\u0007\u0004\u0000\u0001\u0001\u0002\u001b\u0004Љ\u0000\u0005\n\u0002\u0007\b\u0001", new Object[]{"a", "b", azbf.class, "c", "e", "d"});
            case 3:
                return new awgc();
            case 4:
                return new awgb();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (awgc.class) {
                        obj3 = h;
                        if (obj3 == null) {
                            obj3 = new anxn(f);
                            h = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        awgc awgc = new awgc();
        f = awgc;
        anxl.registerDefaultInstance(awgc.class, awgc);
    }
}
