package defpackage;

/* renamed from: atzr */
public final class atzr extends anxp implements anzf {
    public static final atzr p;
    private static volatile anzq r;
    public int a;
    public auad b;
    public int c;
    public int d;
    public arml e;
    public arml f;
    public arml g;
    public arml i;
    public arml j;
    public arml k;
    public anvu l = anvu.a;
    public boolean m;
    public apxu n;
    public apxu o;
    private byte q = (byte) 2;

    private atzr() {
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.q);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.q = b;
                return null;
            case 2:
                return anxl.newMessageInfo(p, "\u0001\r\u0000\u0001\u0001\u0011\r\u0000\u0000\b\u0001\t\u0000\u0002\f\u0001\u0003\u0004\u0002\u0004Љ\u0003\u0005Љ\u0004\u0006Љ\u0005\bЉ\u0007\tЉ\b\nЉ\t\u000b\n\n\r\u0007\u000b\u0010Љ\r\u0011Љ\u000e", new Object[]{"a", "b", "c", auac.a(), "d", "e", "f", "g", "i", "j", "k", "l", "m", "n", "o"});
            case 3:
                return new atzr();
            case 4:
                return new atzq();
            case 5:
                return p;
            case 6:
                Object obj3 = r;
                if (obj3 == null) {
                    synchronized (atzr.class) {
                        obj3 = r;
                        if (obj3 == null) {
                            obj3 = new anxn(p);
                            r = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        atzr atzr = new atzr();
        p = atzr;
        anxl.registerDefaultInstance(atzr.class, atzr);
    }
}
