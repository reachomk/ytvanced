package defpackage;

/* renamed from: arej */
public final class arej extends anxl implements anzf {
    public static final arej m;
    private static volatile anzq o;
    public int a;
    public String b = "";
    public aygk c;
    public arml d;
    public arml e;
    public arml f;
    public arml g;
    public arml h;
    public arml i;
    public arml j;
    public apxu k;
    public anvu l;
    private byte n = (byte) 2;

    private arej() {
        anxl.emptyProtobufList();
        this.l = anvu.a;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.n);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.n = b;
                return null;
            case 2:
                return anxl.newMessageInfo(m, "\u0001\u000b\u0000\u0001\u0001\u000e\u000b\u0000\u0000\t\u0001\b\u0000\u0002Љ\u0001\u0003Љ\u0003\u0004Љ\u0004\u0005Љ\u0005\u0006Љ\u0007\u0007Љ\t\nЉ\f\f\n\u000e\rЉ\b\u000eЉ\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "h", "j", "k", "l", "i", "g"});
            case 3:
                return new arej();
            case 4:
                return new arel();
            case 5:
                return m;
            case 6:
                Object obj3 = o;
                if (obj3 == null) {
                    synchronized (arej.class) {
                        obj3 = o;
                        if (obj3 == null) {
                            obj3 = new anxn(m);
                            o = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        arej arej = new arej();
        m = arej;
        anxl.registerDefaultInstance(arej.class, arej);
    }
}
