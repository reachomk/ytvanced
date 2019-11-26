package defpackage;

/* renamed from: avgs */
public final class avgs extends anxp implements anzf {
    public static final avgs g;
    private static volatile anzq j;
    public int a;
    public arml b;
    public arml c;
    public apxu d;
    public auvr e;
    public avgq f;
    private byte i = (byte) 2;

    private avgs() {
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
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0002\u000b\u0005\u0000\u0000\u0005\u0002Љ\u0001\u0003Љ\u0003\u0004Љ\u0004\tЉ\u0005\u000bЉ\t", new Object[]{"a", "b", "c", "d", "e", "f"});
            case 3:
                return new avgs();
            case 4:
                return new avgr();
            case 5:
                return g;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (avgs.class) {
                        obj3 = j;
                        if (obj3 == null) {
                            obj3 = new anxn(g);
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
        avgs avgs = new avgs();
        g = avgs;
        anxl.registerDefaultInstance(avgs.class, avgs);
    }
}
