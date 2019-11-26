package defpackage;

/* renamed from: aozs */
public final class aozs extends anxl implements anzf {
    public static final aozs l;
    private static volatile anzq n;
    public int a;
    public arml b;
    public arml c;
    public arml d;
    public apxu e;
    public apxu f;
    public atej g;
    public arml h;
    public atzt i;
    public aphr j;
    public auvr k;
    private byte m = (byte) 2;

    private aozs() {
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
                return anxl.newMessageInfo(l, "\u0001\n\u0000\u0001\u0002\u0010\n\u0000\u0000\n\u0002Љ\u0002\u0003Љ\u0003\u0004Љ\u0004\u0006Љ\u0006\u0007Љ\b\bЉ\n\fЉ\r\u000eЉ\u000f\u000fЉ\u0007\u0010Љ\u000e", new Object[]{"a", "b", "c", "d", "e", "g", "h", "i", "k", "f", "j"});
            case 3:
                return new aozs();
            case 4:
                return new aozv();
            case 5:
                return l;
            case 6:
                Object obj3 = n;
                if (obj3 == null) {
                    synchronized (aozs.class) {
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
        aozs aozs = new aozs();
        l = aozs;
        anxl.registerDefaultInstance(aozs.class, aozs);
    }
}
