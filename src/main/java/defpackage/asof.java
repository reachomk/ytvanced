package defpackage;

/* renamed from: asof */
public final class asof extends anxl implements anzf {
    public static final asof i;
    private static volatile anzq k;
    public int a;
    public asic b;
    public boolean c;
    public boolean d;
    public String e;
    public String f;
    public aygk g;
    public String h;
    private byte j = (byte) 2;

    private asof() {
        String str = "";
        this.e = str;
        this.f = str;
        this.h = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.j = b;
                return null;
            case 2:
                return anxl.newMessageInfo(i, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0000\u0002\u0001Љ\u0000\u0002\u0007\u0001\u0003\u0007\u0002\u0004\b\u0004\u0005\b\u0005\u0007\b\u0007\tЉ\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "h", "g"});
            case 3:
                return new asof();
            case 4:
                return new asoe();
            case 5:
                return i;
            case 6:
                Object obj3 = k;
                if (obj3 == null) {
                    synchronized (asof.class) {
                        obj3 = k;
                        if (obj3 == null) {
                            obj3 = new anxn(i);
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
        asof asof = new asof();
        i = asof;
        anxl.registerDefaultInstance(asof.class, asof);
    }
}
