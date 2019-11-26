package defpackage;

/* renamed from: aojz */
public final class aojz extends anxl implements anzf {
    public static final aojz s;
    private static volatile anzq u;
    public anyd a = anxl.emptyProtobufList();
    public anyd b = anxl.emptyProtobufList();
    public anyd c;
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
    private byte t = (byte) 2;

    private aojz() {
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
        this.c = anxl.emptyProtobufList();
        anxl.emptyProtobufList();
        this.d = anxl.emptyProtobufList();
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
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.t);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.t = b;
                return null;
            case 2:
                return anxl.newMessageInfo(s, "\u0001\u0012\u0000\u0000\u0001\u0015\u0012\u0000\u0012\u0012\u0001Л\u0002Л\u0005Л\u0007Л\bЛ\tЛ\nЛ\u000bЛ\fЛ\rЛ\u000eЛ\u000fЛ\u0010Л\u0011Л\u0012Л\u0013Л\u0014Л\u0015Л", new Object[]{"a", apxu.class, "b", apxu.class, "c", apxu.class, "d", apxu.class, "e", apxu.class, "f", apxu.class, "g", aols.class, "h", apxu.class, "i", apxu.class, "j", apxu.class, "k", apxu.class, "l", apxu.class, "m", apxu.class, "n", apxu.class, "o", apxu.class, "p", apxu.class, "q", apxu.class, "r", apxu.class});
            case 3:
                return new aojz();
            case 4:
                return new aojy();
            case 5:
                return s;
            case 6:
                Object obj3 = u;
                if (obj3 == null) {
                    synchronized (aojz.class) {
                        obj3 = u;
                        if (obj3 == null) {
                            obj3 = new anxn(s);
                            u = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aojz aojz = new aojz();
        s = aojz;
        anxl.registerDefaultInstance(aojz.class, aojz);
    }
}
