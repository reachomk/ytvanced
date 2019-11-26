package defpackage;

/* renamed from: avaw */
public final class avaw extends anxl implements anzf {
    public static final avaw i;
    private static volatile anzq k;
    public int a;
    public arml b;
    public arml c;
    public arml d;
    public int e;
    public aygk f;
    public anyd g = anxl.emptyProtobufList();
    public anyd h = anxl.emptyProtobufList();
    private byte j = (byte) 2;

    private avaw() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.j = b;
                return null;
            case 2:
                return anxl.newMessageInfo(i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0006\u0001Љ\u0000\u0002Љ\u0001\u0003Љ\u0002\u0004Љ\u0004\u0005Л\u0006Л\u0007\f\u0003", new Object[]{"a", "b", "c", "d", "f", "g", aphj.class, "h", axvk.class, "e", awnx.a()});
            case 3:
                return new avaw();
            case 4:
                return new avav();
            case 5:
                return i;
            case 6:
                Object obj3 = k;
                if (obj3 == null) {
                    synchronized (avaw.class) {
                        obj3 = k;
                        if (obj3 == null) {
                            obj3 = new anxn(i);
                            k = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        avaw avaw = new avaw();
        i = avaw;
        anxl.registerDefaultInstance(avaw.class, avaw);
    }
}
