package defpackage;

/* renamed from: avcz */
public final class avcz extends anxl implements anzf {
    public static final avcz m;
    private static volatile anzq o;
    public int a;
    public arml b;
    public arml c;
    public apxu d;
    public arml e;
    public arml f;
    public arml g;
    public arml h;
    public aopn i;
    public auvr j;
    public atzt k;
    public arml l;
    private byte n = (byte) 2;

    private avcz() {
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.n);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.n = b;
                return null;
            case 2:
                return anxl.newMessageInfo(m, "\u0001\u000b\u0000\u0001\u0002\u0013\u000b\u0000\u0000\u000b\u0002Љ\u0001\u0005Љ\u0004\u0006Љ\u0005\u0007Љ\u0006\bЉ\u0007\tЉ\b\nЉ\t\fЉ\n\u0011Љ\u000f\u0012Љ\u0010\u0013Љ\u000b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "k", "l", "j"});
            case 3:
                return new avcz();
            case 4:
                return new avdc();
            case 5:
                return m;
            case 6:
                Object obj3 = o;
                if (obj3 == null) {
                    synchronized (avcz.class) {
                        obj3 = o;
                        if (obj3 == null) {
                            obj3 = new anxn(m);
                            o = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        avcz avcz = new avcz();
        m = avcz;
        anxl.registerDefaultInstance(avcz.class, avcz);
    }
}
