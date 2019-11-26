package defpackage;

/* renamed from: aqak */
public final class aqak extends anxl implements anzf {
    public static final aqak p;
    private static volatile anzq r;
    public int a;
    public aygk b;
    public arml c;
    public arml d;
    public aphj e;
    public aphj f;
    public aphj g;
    public aqai h;
    public aqag i;
    public arml j;
    public arml k;
    public arml l;
    public apxu m;
    public aphj n;
    public axak o;
    private byte q = (byte) 2;

    private aqak() {
        anxl.emptyProtobufList();
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
                return anxl.newMessageInfo(p, "\u0001\u000e\u0000\u0001\u0002\u0011\u000e\u0000\u0000\u000e\u0002Љ\u0005\u0003Љ\u0006\u0004Љ\u0001\u0005Љ\u0003\u0006Љ\u0004\u0007Љ\u0007\bЉ\n\tЉ\b\nЉ\t\u000bЉ\u000b\rЉ\f\u000eЉ\r\u000fЉ\u000e\u0011Љ\u000f", new Object[]{"a", "e", "f", "b", "c", "d", "g", "j", "h", "i", "k", "l", "m", "n", "o"});
            case 3:
                return new aqak();
            case 4:
                return new aqan();
            case 5:
                return p;
            case 6:
                Object obj3 = r;
                if (obj3 == null) {
                    synchronized (aqak.class) {
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
        aqak aqak = new aqak();
        p = aqak;
        anxl.registerDefaultInstance(aqak.class, aqak);
    }
}
