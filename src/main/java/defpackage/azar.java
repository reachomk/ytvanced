package defpackage;

/* renamed from: azar */
public final class azar extends anxl implements anzf {
    public static final azar k;
    private static volatile anzq m;
    public int a;
    public String b;
    public String c;
    public String d;
    public String e;
    public long f;
    public long g;
    public int h;
    public aygk i;
    public int j;
    private byte l = (byte) 2;

    private azar() {
        String str = "";
        this.b = str;
        this.c = str;
        this.d = str;
        this.e = str;
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
                return anxl.newMessageInfo(k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0001\u0001\b\u0000\u0002\b\u0001\u0003\b\u0002\u0004\b\u0003\u0005\u0003\u0004\u0006\u0003\u0005\u0007\u0004\u0006\bЉ\u0007\t\u0004\b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"});
            case 3:
                return new azar();
            case 4:
                return new azat();
            case 5:
                return k;
            case 6:
                Object obj3 = m;
                if (obj3 == null) {
                    synchronized (azar.class) {
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
        azar azar = new azar();
        k = azar;
        anxl.registerDefaultInstance(azar.class, azar);
    }
}
