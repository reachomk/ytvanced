package defpackage;

/* renamed from: avhu */
public final class avhu extends anxl implements anzf {
    public static final avhu c;
    private static volatile anzq e;
    public int a;
    public arho b;
    private byte d = (byte) 2;

    private avhu() {
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
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001ⶔⶔ\u0001\u0000\u0000\u0001ⶔЉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new avhu();
            case 4:
                return new avht();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (avhu.class) {
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
        avhu avhu = new avhu();
        c = avhu;
        anxl.registerDefaultInstance(avhu.class, avhu);
    }
}
