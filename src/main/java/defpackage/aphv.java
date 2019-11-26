package defpackage;

/* renamed from: aphv */
public final class aphv extends anxl implements anzf {
    public static final aphv s;
    private static volatile anzq u;
    public int a;
    public boolean b;
    public boolean c;
    public arwf d;
    public arml e;
    public String f;
    public apht g;
    public apxu h;
    public apxu i;
    public arwf j;
    public arml k;
    public String l;
    public apxu m;
    public aodx n;
    public aodx o;
    public String p;
    public boolean q;
    public anvu r;
    private byte t = (byte) 2;

    private aphv() {
        String str = "";
        this.f = str;
        this.l = str;
        this.p = str;
        this.r = anvu.a;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.t);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.t = b;
                return null;
            case 2:
                return anxl.newMessageInfo(s, "\u0001\u0011\u0000\u0001\u0003\u001a\u0011\u0000\u0000\u0006\u0003\u0007\u0003\u0004\u0007\u0004\u0005\t\u0005\u0006Љ\u0006\u0007Љ\t\b\t\u000b\tЉ\f\nЉ\u000e\r\n\u0018\u000e\b\u0007\u000f\b\r\u0011Љ\n\u0012Љ\b\u0013\t\u0012\u0014\t\u0013\u0018\b\u0015\u001a\u0007\u0016", new Object[]{"a", "b", "c", "d", "e", "h", "j", "k", "m", "r", "f", "l", "i", "g", "n", "o", "p", "q"});
            case 3:
                return new aphv();
            case 4:
                return new aphy();
            case 5:
                return s;
            case 6:
                Object obj3 = u;
                if (obj3 == null) {
                    synchronized (aphv.class) {
                        obj3 = u;
                        if (obj3 == null) {
                            obj3 = new anxn(s);
                            u = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aphv aphv = new aphv();
        s = aphv;
        anxl.registerDefaultInstance(aphv.class, aphv);
    }
}
