package defpackage;

/* renamed from: asjn */
public final class asjn extends anxl implements anzf {
    public static final asjn k;
    private static volatile anzq l;
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;
    public asjf e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;

    private asjn() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(k, "\u0001\t\u0000\u0001\u0001\u000b\t\u0000\u0000\u0000\u0001\u0007\u0000\u0002\u0007\u0001\u0004\u0007\u0003\u0006\t\u0005\u0007\u0007\u0006\b\u0007\u0007\t\u0007\b\n\u0007\t\u000b\u0007\n", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"});
            case 3:
                return new asjn();
            case 4:
                return new asjm();
            case 5:
                return k;
            case 6:
                Object obj3 = l;
                if (obj3 == null) {
                    synchronized (asjn.class) {
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
        asjn asjn = new asjn();
        k = asjn;
        anxl.registerDefaultInstance(asjn.class, asjn);
    }
}
