package defpackage;

/* renamed from: awjx */
public final class awjx extends anxl implements anzf {
    public static final awjx e;
    private static volatile anzq g;
    public int a;
    public arml b;
    public anyd c = anxl.emptyProtobufList();
    public arml d;
    private byte f = (byte) 2;

    private awjx() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.f = b;
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0001\u0003\u0001Љ\u0000\u0002Л\u0006Љ\u0001", new Object[]{"a", "b", "c", awjt.class, "d"});
            case 3:
                return new awjx();
            case 4:
                return new awjw();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (awjx.class) {
                        obj3 = g;
                        if (obj3 == null) {
                            obj3 = new anxn(e);
                            g = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        awjx awjx = new awjx();
        e = awjx;
        anxl.registerDefaultInstance(awjx.class, awjx);
    }
}
