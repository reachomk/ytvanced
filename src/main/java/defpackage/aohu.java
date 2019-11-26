package defpackage;

/* renamed from: aohu */
public final class aohu extends anxl implements anzf {
    public static final aohu l;
    private static volatile anzq n;
    public int a;
    public arml b;
    public arml c;
    public arml d;
    public apxu e;
    public arml f;
    public anyd g = anxl.emptyProtobufList();
    public arml h;
    public apxu i;
    public axak j;
    public axak k;
    private byte m = (byte) 2;

    private aohu() {
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
                return anxl.newMessageInfo(l, "\u0001\n\u0000\u0001\u0001\r\n\u0000\u0001\n\u0001Љ\u0000\u0002Љ\u0001\u0003Љ\u0002\u0004Л\u0005Љ\u0005\u0007Љ\u0003\bЉ\u0006\nЉ\b\fЉ\u0007\rЉ\u0004", new Object[]{"a", "b", "c", "d", "g", aohs.class, "h", "e", "i", "k", "j", "f"});
            case 3:
                return new aohu();
            case 4:
                return new aohx();
            case 5:
                return l;
            case 6:
                Object obj3 = n;
                if (obj3 == null) {
                    synchronized (aohu.class) {
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
        aohu aohu = new aohu();
        l = aohu;
        anxl.registerDefaultInstance(aohu.class, aohu);
    }
}
