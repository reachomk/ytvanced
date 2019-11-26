package defpackage;

/* renamed from: awsy */
public final class awsy extends anxl implements anzf {
    public static final awsy n;
    private static volatile anzq p;
    public int a;
    public arml b;
    public arml c;
    public arml d;
    public arml e;
    public arml f;
    public arml g;
    public apxu h;
    public awsw i;
    public apxu j;
    public auvr k;
    public awta l;
    public aojc m;
    private byte o = (byte) 2;

    private awsy() {
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.o);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.o = b;
                return null;
            case 2:
                return anxl.newMessageInfo(n, "\u0001\f\u0000\u0001\u0003\u0019\f\u0000\u0000\f\u0003Љ\u0002\u0004Љ\u0003\u0005Љ\u0004\u0006Љ\u0005\bЉ\u0007\tЉ\t\nЉ\n\rЉ\r\u0012Љ\u000b\u0013Љ\f\u0014Љ\b\u0019Љ\u0013", new Object[]{"a", "b", "c", "d", "e", "f", "h", "i", "l", "j", "k", "g", "m"});
            case 3:
                return new awsy();
            case 4:
                return new awtb();
            case 5:
                return n;
            case 6:
                Object obj3 = p;
                if (obj3 == null) {
                    synchronized (awsy.class) {
                        obj3 = p;
                        if (obj3 == null) {
                            obj3 = new anxn(n);
                            p = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        awsy awsy = new awsy();
        n = awsy;
        anxl.registerDefaultInstance(awsy.class, awsy);
    }
}
