package defpackage;

/* renamed from: aumo */
public final class aumo extends anxl implements anzf {
    public static final aumo p;
    private static volatile anzq r;
    public int a;
    public arml b;
    public aygk c;
    public aygk d;
    public arwf e;
    public arml f;
    public aphj g;
    public aphj h;
    public aygk i;
    public axak j;
    public axak k;
    public arml l;
    public anyd m;
    public anyd n;
    public anvu o;
    private byte q = (byte) 2;

    private aumo() {
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
        this.m = anxl.emptyProtobufList();
        this.n = anxl.emptyProtobufList();
        this.o = anvu.a;
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
                return anxl.newMessageInfo(p, "\u0001\u000e\u0000\u0001\u0001\u0011\u000e\u0000\u0002\f\u0001Љ\u0000\u0002Љ\u0001\u0003Љ\u0002\u0004\t\u0003\u0006Љ\u0004\bЉ\u0005\tЉ\u0006\u000b\n\f\fЉ\u0007\rЉ\b\u000eЉ\t\u000fЉ\n\u0010Л\u0011Л", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "o", "i", "j", "k", "l", "m", apxu.class, "n", apxu.class});
            case 3:
                return new aumo();
            case 4:
                return new aump();
            case 5:
                return p;
            case 6:
                Object obj3 = r;
                if (obj3 == null) {
                    synchronized (aumo.class) {
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
        aumo aumo = new aumo();
        p = aumo;
        anxl.registerDefaultInstance(aumo.class, aumo);
    }
}
