package defpackage;

/* renamed from: avbw */
public final class avbw extends anxl implements anzf {
    public static final avbw b;
    private static volatile anzq d;
    public anyd a = anxl.emptyProtobufList();
    private byte c = (byte) 2;

    private avbw() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.c);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.c = b;
                return null;
            case 2:
                return anxl.newMessageInfo(b, "\u0001\u0001\u0000\u0000ﬡ䎭ﬡ䎭\u0001\u0000\u0001\u0001ﬡ䎭Л", new Object[]{"a", avbu.class});
            case 3:
                return new avbw();
            case 4:
                return new avbv();
            case 5:
                return b;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (avbw.class) {
                        obj3 = d;
                        if (obj3 == null) {
                            obj3 = new anxn(b);
                            d = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        avbw avbw = new avbw();
        b = avbw;
        anxl.registerDefaultInstance(avbw.class, avbw);
    }
}
