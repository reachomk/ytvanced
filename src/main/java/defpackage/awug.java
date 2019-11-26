package defpackage;

/* renamed from: awug */
public final class awug extends anxl implements anzf {
    public static final awug o;
    private static volatile anzq q;
    public int a;
    public arml b;
    public aygk c;
    public anyd d = anxl.emptyProtobufList();
    public anyd e = anxl.emptyProtobufList();
    public arml f;
    public apxu g;
    public arml h;
    public arml i;
    public auvr j;
    public arml k;
    public int l;
    public anvu m;
    public arml n;
    private byte p = (byte) 2;

    private awug() {
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
        this.m = anvu.a;
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
                return anxl.newMessageInfo(o, "\u0001\r\u0000\u0001\u0002\u0014\r\u0000\u0002\u000b\u0002Љ\u0001\u0003Љ\u0002\u0004Љ\u0003\u0005Љ\u0004\u0006Љ\u0005\t\n\f\rЉ\r\u000eЉ\u0006\u000fЉ\u0007\u0011Л\u0012Љ\b\u0013\f\t\u0014Л", new Object[]{"a", "b", "c", "f", "g", "h", "m", "n", "i", "j", "e", ayfu.class, "k", "l", awuh.a, "d", aygk.class});
            case 3:
                return new awug();
            case 4:
                return new awuj();
            case 5:
                return o;
            case 6:
                Object obj3 = q;
                if (obj3 == null) {
                    synchronized (awug.class) {
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

    public static anzq a() {
        return o.getParserForType();
    }

    static {
        awug awug = new awug();
        o = awug;
        anxl.registerDefaultInstance(awug.class, awug);
    }
}
