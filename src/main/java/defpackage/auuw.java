package defpackage;

/* renamed from: auuw */
public final class auuw extends anxl implements anzf {
    public static final auuw o;
    private static volatile anzq q;
    public int a;
    public arml b;
    public arwf c;
    public aphj d;
    public aygk e;
    public aygk f;
    public aphj g;
    public aygk h;
    public axak i;
    public axak j;
    public axak k;
    public arml l;
    public axak m;
    public anvu n;
    private byte p = (byte) 2;

    private auuw() {
        anxl.emptyProtobufList();
        this.n = anvu.a;
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
                return anxl.newMessageInfo(o, "\u0001\r\u0000\u0001\u0001\u000f\r\u0000\u0000\u000b\u0001Љ\u0000\u0002\t\u0001\u0004Љ\u0002\u0006\n\r\u0007Љ\u0003\bЉ\u0004\tЉ\u0006\nЉ\u0007\u000bЉ\b\fЉ\n\rЉ\t\u000eЉ\u0005\u000fЉ\u000b", new Object[]{"a", "b", "c", "d", "n", "e", "f", "h", "i", "j", "l", "k", "g", "m"});
            case 3:
                return new auuw();
            case 4:
                return new auuv();
            case 5:
                return o;
            case 6:
                Object obj3 = q;
                if (obj3 == null) {
                    synchronized (auuw.class) {
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
        auuw auuw = new auuw();
        o = auuw;
        anxl.registerDefaultInstance(auuw.class, auuw);
    }
}
