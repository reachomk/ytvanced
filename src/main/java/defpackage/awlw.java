package defpackage;

/* renamed from: awlw */
public final class awlw extends anxl implements anzf {
    public static final awlw o;
    private static volatile anzq q;
    public int a;
    public arml b;
    public long c;
    public boolean d;
    public apxu e;
    public double f;
    public arml g;
    public apxu h;
    public apxu i;
    public apxu j;
    public double k;
    public arml l;
    public double m;
    public arml n;
    private byte p = (byte) 2;

    private awlw() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.p);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.p = b;
                return null;
            case 2:
                return anxl.newMessageInfo(o, "\u0001\r\u0000\u0001\u0001\u000e\r\u0000\u0000\b\u0001Љ\u0000\u0002\u0003\u0001\u0003\u0007\u0002\u0004Љ\u0003\u0005\u0000\u0004\u0006Љ\u0005\bЉ\u0006\tЉ\u0007\nЉ\b\u000b\u0000\t\fЉ\n\r\u0000\u000b\u000eЉ\f", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n"});
            case 3:
                return new awlw();
            case 4:
                return new awlz();
            case 5:
                return o;
            case 6:
                Object obj3 = q;
                if (obj3 == null) {
                    synchronized (awlw.class) {
                        obj3 = q;
                        if (obj3 == null) {
                            obj3 = new anxn(o);
                            q = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        awlw awlw = new awlw();
        o = awlw;
        anxl.registerDefaultInstance(awlw.class, awlw);
    }
}
