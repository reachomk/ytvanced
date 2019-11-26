package defpackage;

/* renamed from: arrw */
public final class arrw extends anxl implements anzf {
    public static final arrw n;
    private static volatile anzq p;
    public int a;
    public aygk b;
    public anyd c = anxl.emptyProtobufList();
    public arml d;
    public int e;
    public arml f;
    public arml g;
    public arml h;
    public apxu i;
    public apxu j;
    public auvr k;
    public aphj l;
    public anvu m = anvu.a;
    private byte o = (byte) 2;

    private arrw() {
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
                return anxl.newMessageInfo(n, "\u0001\f\u0000\u0001\u0002\u000e\f\u0000\u0001\n\u0002Љ\u0001\u0003Л\u0004Љ\u0002\u0005Љ\u0004\u0006Љ\u0005\u0007Љ\u0006\bЉ\u0007\tЉ\b\nЉ\t\f\n\f\r\u0004\u0003\u000eЉ\n", new Object[]{"a", "b", "c", ayfu.class, "d", "f", "g", "h", "i", "j", "k", "m", "e", "l"});
            case 3:
                return new arrw();
            case 4:
                return new arrz();
            case 5:
                return n;
            case 6:
                Object obj3 = p;
                if (obj3 == null) {
                    synchronized (arrw.class) {
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
        arrw arrw = new arrw();
        n = arrw;
        anxl.registerDefaultInstance(arrw.class, arrw);
    }
}
