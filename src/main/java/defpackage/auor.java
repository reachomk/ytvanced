package defpackage;

/* renamed from: auor */
public final class auor extends anxl implements anzf {
    public static final auor m;
    private static volatile anzq o;
    public int a;
    public arml b;
    public arml c;
    public arml d;
    public arml e;
    public arml f;
    public arml g;
    public arml h;
    public arml i;
    public arml j;
    public apxu k;
    public arml l;
    private byte n = (byte) 2;

    private auor() {
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
                return anxl.newMessageInfo(m, "\u0001\u000b\u0000\u0001\u0002\u0011\u000b\u0000\u0000\u000b\u0002Љ\u0001\u0003Љ\u0002\u0004Љ\u0003\u0005Љ\u0004\u0006Љ\u0005\u0007Љ\u0006\bЉ\u0007\fЉ\b\u000fЉ\r\u0010Љ\u000e\u0011Љ\u000f", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l"});
            case 3:
                return new auor();
            case 4:
                return new auou();
            case 5:
                return m;
            case 6:
                Object obj3 = o;
                if (obj3 == null) {
                    synchronized (auor.class) {
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
        auor auor = new auor();
        m = auor;
        anxl.registerDefaultInstance(auor.class, auor);
    }
}
