package defpackage;

/* renamed from: awix */
public final class awix extends anxl implements anzf {
    public static final awix d;
    private static volatile anzq f;
    public int a;
    public arml b;
    public anyd c = anxl.emptyProtobufList();
    private byte e = (byte) 2;

    private awix() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.e = b;
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0001\u0002\u0002Љ\u0001\u0003Л", new Object[]{"a", "b", "c", awiv.class});
            case 3:
                return new awix();
            case 4:
                return new awiw();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (awix.class) {
                        obj3 = f;
                        if (obj3 == null) {
                            obj3 = new anxn(d);
                            f = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public static anzq a() {
        return d.getParserForType();
    }

    static {
        awix awix = new awix();
        d = awix;
        anxl.registerDefaultInstance(awix.class, awix);
    }
}
