package defpackage;

/* renamed from: avdb */
public final class avdb extends anxl implements anzf {
    public static final avdb u;
    private static volatile anzq w;
    public int a;
    public arml b;
    public arml c;
    public arml d;
    public aphj e;
    public arml f;
    public arml g;
    public arml h;
    public arml i;
    public arml j;
    public arml k;
    public arml l;
    public apxu m;
    public apdx n;
    public apdx o;
    public apdx p;
    public aopn q;
    public atwi r;
    public auvr s;
    public aphj t;
    private byte v = (byte) 2;

    private avdb() {
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
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
                return anxl.newMessageInfo(u, "\u0001\u0013\u0000\u0001\u0003$\u0013\u0000\u0000\u0013\u0003Љ\u0002\u0004Љ\u0004\u0005Љ\u0006\u0007Љ\b\bЉ\t\tЉ\u000b\nЉ\f\u000bЉ\u000e\u000eЉ\u0012\u0012Љ\n\u0013Љ\u0013\u0015Љ\r\u0016Љ\u0014\u0018Љ\u000f\u0019Љ\u0010\u001aЉ\u0011\u001cЉ\u0003!Љ\u0005$Љ\u001a", new Object[]{"a", "b", "d", "f", "g", "h", "j", "k", "m", "q", "i", "r", "l", "s", "n", "o", "p", "c", "e", "t"});
            case 3:
                return new avdb();
            case 4:
                return new avde();
            case 5:
                return u;
            case 6:
                Object obj3 = w;
                if (obj3 == null) {
                    synchronized (avdb.class) {
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
        avdb avdb = new avdb();
        u = avdb;
        anxl.registerDefaultInstance(avdb.class, avdb);
    }
}
