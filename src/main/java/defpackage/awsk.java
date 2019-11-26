package defpackage;

/* renamed from: awsk */
public final class awsk extends anxl implements anzf {
    public static final awsk f;
    private static volatile anzq h;
    public int a;
    public awqy b;
    public axak c;
    public aojc d;
    public axak e;
    private byte g = (byte) 2;

    private awsk() {
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
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\b\u0004\u0000\u0000\u0004\u0001Љ\u0000\u0003Љ\u0001\u0007Љ\u0003\bЉ\u0006", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new awsk();
            case 4:
                return new awsn();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (awsk.class) {
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
        awsk awsk = new awsk();
        f = awsk;
        anxl.registerDefaultInstance(awsk.class, awsk);
    }
}
