package defpackage;

/* renamed from: amdl */
public final class amdl extends anxl implements anzf {
    public static final amdl h;
    private static volatile anzq i;
    public int a;
    public int b;
    public String c = "";
    public long d;
    public long e;
    public long f;
    public long g;

    private amdl() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\f\u0000\u0002\b\u0001\u0003\u0003\u0002\u0004\u0003\u0003\u0005\u0003\u0004\u0006\u0003\u0005", new Object[]{"a", "b", amdn.a, "c", "d", "e", "f", "g"});
            case 3:
                return new amdl();
            case 4:
                return new amdq();
            case 5:
                return h;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (amdl.class) {
                        obj3 = i;
                        if (obj3 == null) {
                            obj3 = new anxn(h);
                            i = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        amdl amdl = new amdl();
        h = amdl;
        anxl.registerDefaultInstance(amdl.class, amdl);
    }
}
