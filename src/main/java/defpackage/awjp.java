package defpackage;

/* renamed from: awjp */
public final class awjp extends anxl implements anzf {
    public static final awjp u;
    private static volatile anzq w;
    public int a;
    public String b = "";
    public arml c;
    public awkv d;
    public anyd e = anxl.emptyProtobufList();
    public anyd f = anxl.emptyProtobufList();
    public long g;
    public arml h;
    public apxu i;
    public arml j;
    public arml k;
    public arml l;
    public arml m;
    public aopn n;
    public auvr o;
    public arml p;
    public anvu q;
    public atzt r;
    public arml s;
    public appu t;
    private byte v = (byte) 2;

    private awjp() {
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
        this.q = anvu.a;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.v);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.v = b;
                return null;
            case 2:
                return anxl.newMessageInfo(u, "\u0001\u0013\u0000\u0001\u0001\u0019\u0013\u0000\u0002\u0010\u0001\b\u0000\u0002Љ\u0001\u0003Л\u0004\u0002\u0003\u0005Љ\u0005\u0006Љ\u0006\u0007Љ\u0007\bЉ\t\nЉ\n\rЉ\u0004\u000eЉ\u0010\u000f\n\u000f\u0010Љ\u0011\u0011Љ\b\u0013Љ\u000b\u0014Љ\u0002\u0017Л\u0018Љ\u0012\u0019Љ\f", new Object[]{"a", "b", "c", "e", aygk.class, "g", "i", "j", "k", "m", "n", "h", "r", "q", "s", "l", "o", "d", "f", ayfu.class, "t", "p"});
            case 3:
                return new awjp();
            case 4:
                return new awjo();
            case 5:
                return u;
            case 6:
                Object obj3 = w;
                if (obj3 == null) {
                    synchronized (awjp.class) {
                        obj3 = w;
                        if (obj3 == null) {
                            obj3 = new anxn(u);
                            w = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public static anzq a() {
        return u.getParserForType();
    }

    static {
        awjp awjp = new awjp();
        u = awjp;
        anxl.registerDefaultInstance(awjp.class, awjp);
    }
}
