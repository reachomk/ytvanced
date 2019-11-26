package defpackage;

/* renamed from: awkb */
public final class awkb extends anxl implements anzf {
    public static final awkb p;
    private static volatile anzq r;
    public int a;
    public arml b;
    public awjv c;
    public awjx d;
    public awkd e;
    public awjx f;
    public arml g;
    public awkh h;
    public arml i;
    public awjz j;
    public arml k;
    public awjz l;
    public awjz m;
    public boolean n;
    public arml o;
    private byte q = (byte) 2;

    private awkb() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.q);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.q = b;
                return null;
            case 2:
                return anxl.newMessageInfo(p, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0000\r\u0001Љ\u0000\u0002Љ\u0001\u0003Љ\u0002\u0004Љ\u0004\u0005Љ\u0005\u0006Љ\u0003\u0007Љ\u0006\bЉ\u0007\tЉ\b\nЉ\t\u000bЉ\u000b\f\u0007\f\rЉ\n\u000eЉ\r", new Object[]{"a", "b", "c", "d", "f", "g", "e", "h", "i", "j", "k", "m", "n", "l", "o"});
            case 3:
                return new awkb();
            case 4:
                return new awka();
            case 5:
                return p;
            case 6:
                Object obj3 = r;
                if (obj3 == null) {
                    synchronized (awkb.class) {
                        obj3 = r;
                        if (obj3 == null) {
                            obj3 = new anxn(p);
                            r = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        awkb awkb = new awkb();
        p = awkb;
        anxl.registerDefaultInstance(awkb.class, awkb);
    }
}
