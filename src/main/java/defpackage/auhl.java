package defpackage;

/* renamed from: auhl */
public final class auhl extends anxl implements anzf {
    public static final auhl p;
    private static volatile anzq q;
    public int a;
    public auhj b;
    public long c;
    public float d;
    public float e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public String n = "";
    public int o;

    private auhl() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(p, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0000\u0000\u0001\t\u0000\u0002\u0003\u0001\u0003\u0001\u0002\u0004\u0001\u0003\u0005\u0004\u0004\u0006\u0004\u0005\u0007\u0004\u0006\b\u0004\u0007\t\u0004\b\n\u0004\t\u000b\u0004\n\f\u0004\u000b\r\b\f\u000e\u000b\r", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o"});
            case 3:
                return new auhl();
            case 4:
                return new auhk();
            case 5:
                return p;
            case 6:
                Object obj3 = q;
                if (obj3 == null) {
                    synchronized (auhl.class) {
                        obj3 = q;
                        if (obj3 == null) {
                            obj3 = new anxn(p);
                            q = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        auhl auhl = new auhl();
        p = auhl;
        anxl.registerDefaultInstance(auhl.class, auhl);
    }
}
