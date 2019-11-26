package defpackage;

/* renamed from: awle */
public final class awle extends anxl implements anzf {
    public static final awle d;
    private static volatile anzq f;
    public int a;
    public anyd b = anxl.emptyProtobufList();
    public apxu c;
    private byte e = (byte) 2;

    private awle() {
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
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
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u000b\u0002\u0000\u0001\u0002\u0001Л\u000bЉ\u0003", new Object[]{"a", "b", awli.class, "c"});
            case 3:
                return new awle();
            case 4:
                return new awlh();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (awle.class) {
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

    static {
        awle awle = new awle();
        d = awle;
        anxl.registerDefaultInstance(awle.class, awle);
    }
}
