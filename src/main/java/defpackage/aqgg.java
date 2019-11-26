package defpackage;

/* renamed from: aqgg */
public final class aqgg extends anxp implements anzf {
    public static final aqgg n;
    private static volatile anzq p;
    public int a;
    public arml b;
    public arml c;
    public arml d;
    public arml e;
    public arml f;
    public arml g;
    public apxu i;
    public apxu j;
    public auvr k;
    public aojc l;
    public aqge m;
    private byte o = (byte) 2;

    private aqgg() {
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
                return anxl.newMessageInfo(n, "\u0001\u000b\u0000\u0001\u0003\u0015\u000b\u0000\u0000\u000b\u0003Љ\u0002\u0004Љ\u0003\u0005Љ\u0004\u0007Љ\u0006\bЉ\u0007\tЉ\b\nЉ\t\fЉ\u000b\u000eЉ\f\u0012Љ\u0012\u0015Љ\u0010", new Object[]{"a", "b", "c", "d", "e", "f", "g", "i", "j", "k", "m", "l"});
            case 3:
                return new aqgg();
            case 4:
                return new aqgf();
            case 5:
                return n;
            case 6:
                Object obj3 = p;
                if (obj3 == null) {
                    synchronized (aqgg.class) {
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
        aqgg aqgg = new aqgg();
        n = aqgg;
        anxl.registerDefaultInstance(aqgg.class, aqgg);
    }
}
