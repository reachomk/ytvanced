package defpackage;

/* renamed from: awsa */
public final class awsa extends anxl implements anzf {
    public static final awsa f;
    private static volatile anzq h;
    public int a;
    public awrw b;
    public axak c;
    public aojc d;
    public axak e;
    private byte g = (byte) 2;

    private awsa() {
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
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0000\u0004\u0001Љ\u0000\u0003Љ\u0001\u0006Љ\u0002\u0007Љ\u0005", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new awsa();
            case 4:
                return new awsd();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (awsa.class) {
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
        awsa awsa = new awsa();
        f = awsa;
        anxl.registerDefaultInstance(awsa.class, awsa);
    }
}
