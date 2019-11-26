package defpackage;

/* renamed from: awdc */
public final class awdc extends anxl implements anzf {
    public static final awdc f;
    private static volatile anzq h;
    public int a;
    public anyd b = anxl.emptyProtobufList();
    public anyd c = anxl.emptyProtobufList();
    public int d;
    public awcs e;
    private byte g = (byte) 2;

    private awdc() {
        anxl.emptyProtobufList();
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
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0002\u0002\u0001Л\u0002\u001b\u0004\u0004\u0000\u0005Љ\u0001", new Object[]{"a", "b", awda.class, "c", awcw.class, "d", "e"});
            case 3:
                return new awdc();
            case 4:
                return new awdb();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (awdc.class) {
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
        awdc awdc = new awdc();
        f = awdc;
        anxl.registerDefaultInstance(awdc.class, awdc);
    }
}
