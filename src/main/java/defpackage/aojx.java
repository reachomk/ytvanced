package defpackage;

/* renamed from: aojx */
public final class aojx extends anxl implements anzf {
    public static final aojx w;
    private static volatile anzq x;
    public anyd a = anxl.emptyProtobufList();
    public anyd b = anxl.emptyProtobufList();
    public anyd c = anxl.emptyProtobufList();
    public anyd d;
    public anyd e;
    public anyd f;
    public anyd g;
    public anyd h;
    public anyd i;
    public anyd j;
    public anyd k;
    public anyd l;
    public anyd m;
    public anyd n;
    public anyd o;
    public anyd p;
    public anyd q;
    public anyd r;
    public anyd s;
    public anyd t;
    public anyd u;
    public anyd v;

    private aojx() {
        anxl.emptyProtobufList();
        this.d = anxl.emptyProtobufList();
        anxl.emptyProtobufList();
        this.e = anxl.emptyProtobufList();
        this.f = anxl.emptyProtobufList();
        this.g = anxl.emptyProtobufList();
        this.h = anxl.emptyProtobufList();
        this.i = anxl.emptyProtobufList();
        this.j = anxl.emptyProtobufList();
        this.k = anxl.emptyProtobufList();
        this.l = anxl.emptyProtobufList();
        this.m = anxl.emptyProtobufList();
        this.n = anxl.emptyProtobufList();
        this.o = anxl.emptyProtobufList();
        this.p = anxl.emptyProtobufList();
        this.q = anxl.emptyProtobufList();
        this.r = anxl.emptyProtobufList();
        this.s = anxl.emptyProtobufList();
        this.t = anxl.emptyProtobufList();
        this.u = anxl.emptyProtobufList();
        this.v = anxl.emptyProtobufList();
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(w, "\u0001\u0016\u0000\u0000\u0001\u0018\u0016\u0000\u0016\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0005\u001b\u0007\u001b\b\u001b\t\u001b\n\u001b\u000b\u001b\f\u001b\r\u001b\u000e\u001b\u000f\u001b\u0010\u001b\u0011\u001b\u0012\u001b\u0013\u001b\u0014\u001b\u0015\u001b\u0016\u001b\u0017\u001b\u0018\u001b", new Object[]{"a", aojo.class, "b", aojo.class, "c", aojo.class, "d", aojo.class, "e", aojo.class, "f", aojo.class, "g", aojo.class, "h", aojo.class, "i", aojo.class, "j", aojo.class, "k", aojo.class, "n", aojo.class, "o", aojo.class, "l", aojo.class, "p", aojo.class, "m", aojo.class, "q", aojo.class, "r", aojo.class, "s", aojo.class, "t", aojo.class, "u", aojo.class, "v", aojo.class});
            case 3:
                return new aojx();
            case 4:
                return new aojw();
            case 5:
                return w;
            case 6:
                Object obj3 = x;
                if (obj3 == null) {
                    synchronized (aojx.class) {
                        obj3 = x;
                        if (obj3 == null) {
                            obj3 = new anxn(w);
                            x = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aojx aojx = new aojx();
        w = aojx;
        anxl.registerDefaultInstance(aojx.class, aojx);
    }
}
