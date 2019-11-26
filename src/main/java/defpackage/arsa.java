package defpackage;

/* renamed from: arsa */
public final class arsa extends anxl implements anzf {
    public static final arsa u;
    private static volatile anzq w;
    public int a;
    public awkv b;
    public aygk c;
    public arml d;
    public arml e;
    public arml f;
    public arml g;
    public arml h;
    public arml i;
    public apxu j;
    public apxu k;
    public arml l;
    public auvr m;
    public auma n;
    public anvu o;
    public arml p;
    public anyd q;
    public arsc r;
    public atzt s;
    public arqc t;
    private byte v = (byte) 2;

    private arsa() {
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
        this.o = anvu.a;
        this.q = anxl.emptyProtobufList();
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
                return anxl.newMessageInfo(u, "\u0001\u0013\u0000\u0001\u0002\u001a\u0013\u0000\u0001\u0011\u0002Љ\u0002\u0003Љ\u0003\u0004Љ\u0005\u0005Љ\u0007\u0006Љ\t\bЉ\u000b\tЉ\b\u000b\n\u0010\u000eЉ\u0011\u0010Љ\u0001\u0011Љ\u0006\u0012Љ\f\u0013Љ\u0012\u0014Љ\u0013\u0016Љ\u0014\u0017Л\u0018\t\r\u0019Љ\n\u001aЉ\u0004", new Object[]{"a", "c", "d", "f", "h", "j", "l", "i", "o", "p", "b", "g", "m", "r", "s", "t", "q", ayfu.class, "n", "k", "e"});
            case 3:
                return new arsa();
            case 4:
                return new arsd();
            case 5:
                return u;
            case 6:
                Object obj3 = w;
                if (obj3 == null) {
                    synchronized (arsa.class) {
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

    static {
        arsa arsa = new arsa();
        u = arsa;
        anxl.registerDefaultInstance(arsa.class, arsa);
    }
}
