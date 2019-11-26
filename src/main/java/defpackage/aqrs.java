package defpackage;

/* renamed from: aqrs */
public final class aqrs extends anxl implements anzf {
    public static final aqrs m;
    private static volatile anzq o;
    public int a;
    public arml b;
    public azbn c;
    public apxu d;
    public apxu e;
    public apxu f;
    public arml g;
    public arml h;
    public arml i;
    public arml j;
    public axak k;
    public arml l;
    private byte n = (byte) 2;

    private aqrs() {
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
                return Byte.valueOf(this.n);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.n = b;
                return null;
            case 2:
                return anxl.newMessageInfo(m, "\u0001\u000b\u0000\u0001\u0001\u0014\u000b\u0000\u0000\u000b\u0001Љ\u0000\u0004Љ\u0004\u0006Љ\u0005\u0007Љ\u0006\tЉ\u0007\u000bЉ\b\fЉ\t\rЉ\n\u0010Љ\u000b\u0013Љ\u000e\u0014Љ\f", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "l", "k"});
            case 3:
                return new aqrs();
            case 4:
                return new aqrr();
            case 5:
                return m;
            case 6:
                Object obj3 = o;
                if (obj3 == null) {
                    synchronized (aqrs.class) {
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
        aqrs aqrs = new aqrs();
        m = aqrs;
        anxl.registerDefaultInstance(aqrs.class, aqrs);
    }
}
