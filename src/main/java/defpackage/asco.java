package defpackage;

/* renamed from: asco */
public final class asco extends anxl implements anzf {
    public static final asco g;
    private static volatile anzq i;
    public int a;
    public asic b;
    public ascc c;
    public int d;
    public String e = "";
    public apoa f;
    private byte h = (byte) 2;

    private asco() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.h = b;
                return null;
            case 2:
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0003\u0001Љ\u0000\u0003Љ\u0001\u0004\f\u0002\u0005\b\u0003\u0006Љ\u0004", new Object[]{"a", "b", "c", "d", asct.a, "e", "f"});
            case 3:
                return new asco();
            case 4:
                return new ascr();
            case 5:
                return g;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (asco.class) {
                        obj3 = i;
                        if (obj3 == null) {
                            obj3 = new anxn(g);
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
        asco asco = new asco();
        g = asco;
        anxl.registerDefaultInstance(asco.class, asco);
    }
}