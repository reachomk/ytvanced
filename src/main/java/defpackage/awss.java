package defpackage;

/* renamed from: awss */
public final class awss extends anxl implements anzf {
    public static final awss h;
    private static volatile anzq j;
    public int a;
    public arml b;
    public arml c;
    public arml d;
    public apxu e;
    public auvr f;
    public aojc g;
    private byte i = (byte) 2;

    private awss() {
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.i = b;
                return null;
            case 2:
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0001\u000e\u0006\u0000\u0000\u0006\u0001Љ\u0000\u0002Љ\u0001\u0003Љ\u0002\u0006Љ\u0005\bЉ\u0006\u000eЉ\n", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
            case 3:
                return new awss();
            case 4:
                return new awsv();
            case 5:
                return h;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (awss.class) {
                        obj3 = j;
                        if (obj3 == null) {
                            obj3 = new anxn(h);
                            j = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        awss awss = new awss();
        h = awss;
        anxl.registerDefaultInstance(awss.class, awss);
    }
}
