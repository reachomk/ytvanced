package defpackage;

/* renamed from: aokm */
public final class aokm extends anxp implements anzf {
    public static final aokm f;
    private static volatile anzq i;
    public int a;
    public String b = "";
    public aokq c;
    public boolean d;
    public aohw e;
    private byte g = (byte) 2;

    private aokm() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.g = b;
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0001\u0001\b\u0000\u0002\t\u0001\u0003\u0007\u0002\u0006Љ\u0005", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new aokm();
            case 4:
                return new aokl();
            case 5:
                return f;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (aokm.class) {
                        obj3 = i;
                        if (obj3 == null) {
                            obj3 = new anxn(f);
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
        aokm aokm = new aokm();
        f = aokm;
        anxl.registerDefaultInstance(aokm.class, aokm);
    }
}
