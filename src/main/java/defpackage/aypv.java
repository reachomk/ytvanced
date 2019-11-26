package defpackage;

/* renamed from: aypv */
public final class aypv extends anxl implements anzf {
    public static final aypv n;
    private static volatile anzq p;
    public int a;
    public arml b;
    public anyd c = anxl.emptyProtobufList();
    public anyd d = anxl.emptyProtobufList();
    public int e;
    public aphj f;
    public aphj g;
    public anvu h = anvu.a;
    public anyd i = anxl.emptyProtobufList();
    public anyd j = anxl.emptyProtobufList();
    public arml k;
    public arml l;
    public apxu m;
    private byte o = (byte) 2;

    private aypv() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.o);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.o = b;
                return null;
            case 2:
                return anxl.newMessageInfo(n, "\u0001\f\u0000\u0001\u0001\u000e\f\u0000\u0004\n\u0001Љ\u0000\u0002Л\u0003Љ\u0006\u0005Љ\b\u0006Л\u0007Љ\u0002\bЉ\u0003\n\n\u0005\u000b\u0004\u0001\fЛ\rЛ\u000eЉ\t", new Object[]{"a", "b", "c", arml.class, "k", "l", "d", aypx.class, "f", "g", "h", "e", "i", apxu.class, "j", apxu.class, "m"});
            case 3:
                return new aypv();
            case 4:
                return new aypu();
            case 5:
                return n;
            case 6:
                Object obj3 = p;
                if (obj3 == null) {
                    synchronized (aypv.class) {
                        obj3 = p;
                        if (obj3 == null) {
                            obj3 = new anxn(n);
                            p = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aypv aypv = new aypv();
        n = aypv;
        anxl.registerDefaultInstance(aypv.class, aypv);
    }
}
