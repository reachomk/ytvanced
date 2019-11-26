package defpackage;

/* renamed from: axbx */
public final class axbx extends anxl implements anzf {
    public static final axbx l;
    private static volatile anzq n;
    public int a;
    public arml b;
    public apxu c;
    public arml d;
    public arml e;
    public arml f;
    public arml g;
    public arml h;
    public arml i;
    public arml j;
    public arml k;
    private byte m = (byte) 2;

    private axbx() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.m = b;
                return null;
            case 2:
                return anxl.newMessageInfo(l, "\u0001\n\u0000\u0001\u0001\u0013\n\u0000\u0000\n\u0001Љ\u0000\tЉ\u0007\nЉ\b\u000bЉ\t\fЉ\n\u000eЉ\u000b\u000fЉ\f\u0011Љ\r\u0012Љ\u000e\u0013Љ\u0006", new Object[]{"a", "b", "d", "e", "f", "g", "h", "i", "j", "k", "c"});
            case 3:
                return new axbx();
            case 4:
                return new axbw();
            case 5:
                return l;
            case 6:
                Object obj3 = n;
                if (obj3 == null) {
                    synchronized (axbx.class) {
                        obj3 = n;
                        if (obj3 == null) {
                            obj3 = new anxn(l);
                            n = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        axbx axbx = new axbx();
        l = axbx;
        anxl.registerDefaultInstance(axbx.class, axbx);
    }
}
