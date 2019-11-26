package defpackage;

/* renamed from: auhj */
public final class auhj extends anxl implements anzf {
    public static final auhj k;
    private static volatile anzq l;
    public int a;
    public String b = "";
    public long c;
    public long d;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;
    public int i;
    public boolean j;

    private auhj() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(k, "\u0001\t\u0000\u0001\u0001\f\t\u0000\u0000\u0000\u0001\b\u0000\u0002\u0003\u0002\u0003\u0003\u0003\u0004\u0007\u0004\u0005\u0007\u0005\u0006\u0007\u0006\u0007\f\u0007\n\f\n\f\u0007\u000b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", auib.a, "i", auhz.a, "j"});
            case 3:
                return new auhj();
            case 4:
                return new auhi();
            case 5:
                return k;
            case 6:
                Object obj3 = l;
                if (obj3 == null) {
                    synchronized (auhj.class) {
                        obj3 = l;
                        if (obj3 == null) {
                            obj3 = new anxn(k);
                            l = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        auhj auhj = new auhj();
        k = auhj;
        anxl.registerDefaultInstance(auhj.class, auhj);
    }
}
