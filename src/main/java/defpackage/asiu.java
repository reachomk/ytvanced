package defpackage;

/* renamed from: asiu */
public final class asiu extends anxl implements anzf {
    public static final asiu k;
    private static volatile anzq m;
    public int a;
    public ashy b;
    public boolean c;
    public int d;
    public asim e;
    public asiq f;
    public asjl g;
    public asjn h;
    public augp i;
    public augr j;
    private byte l = (byte) 2;

    private asiu() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.l = b;
                return null;
            case 2:
                return anxl.newMessageInfo(k, "\u0001\t\u0000\u0001\u0001\f\t\u0000\u0000\u0001\u0001Љ\u0000\u0002\f\u0002\u0003\t\u0004\u0004\t\u0006\u0006\u0007\u0001\u0007\t\u0005\b\t\u0007\u000b\t\b\f\t\t", new Object[]{"a", "b", "d", asix.a, "e", "g", "c", "f", "h", "i", "j"});
            case 3:
                return new asiu();
            case 4:
                return new asiw();
            case 5:
                return k;
            case 6:
                Object obj3 = m;
                if (obj3 == null) {
                    synchronized (asiu.class) {
                        obj3 = m;
                        if (obj3 == null) {
                            obj3 = new anxn(k);
                            m = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        asiu asiu = new asiu();
        k = asiu;
        anxl.registerDefaultInstance(asiu.class, asiu);
    }
}
