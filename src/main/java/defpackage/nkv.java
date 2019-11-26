package defpackage;

/* renamed from: nkv */
public final class nkv extends anxl implements anzf {
    public static final nkv j;
    private static volatile anzq k;
    public int a;
    public nkm b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;

    private nkv() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(j, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0000\u0000\u0001\t\u0000\u0003\u0007\u0001\u0004\u0007\u0002\u0005\u0007\u0003\u0006\u0007\u0004\u0007\u0007\u0005\t\u0007\u0006\n\u0007\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i"});
            case 3:
                return new nkv();
            case 4:
                return new nky();
            case 5:
                return j;
            case 6:
                Object obj3 = k;
                if (obj3 == null) {
                    synchronized (nkv.class) {
                        obj3 = k;
                        if (obj3 == null) {
                            obj3 = new anxn(j);
                            k = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        nkv nkv = new nkv();
        j = nkv;
        anxl.registerDefaultInstance(nkv.class, nkv);
    }
}
