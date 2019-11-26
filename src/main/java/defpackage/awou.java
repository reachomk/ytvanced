package defpackage;

/* renamed from: awou */
public final class awou extends anxl implements anzf {
    public static final awou e;
    private static volatile anzq g;
    public int a;
    public apdh b;
    public arml c;
    public awom d;
    private byte f = (byte) 2;

    private awou() {
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
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
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0003\u0001Љ\u0001\u0003Љ\u0003\u0004Љ\u0004", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new awou();
            case 4:
                return new awox();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (awou.class) {
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
        awou awou = new awou();
        e = awou;
        anxl.registerDefaultInstance(awou.class, awou);
    }
}
