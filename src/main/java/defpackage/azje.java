package defpackage;

/* renamed from: azje */
public final class azje extends anxl implements anzf {
    public static final azje r;
    private static volatile anzq t;
    public int a;
    public String b;
    public String c;
    public int d;
    public String e;
    public boolean f;
    public float g;
    public float h;
    public anyd i;
    public String j;
    public azjf k;
    public int l;
    public avtq m;
    public azjj n;
    public aziy o;
    public String p;
    public anyy q = anyy.b;
    private byte s = (byte) 2;

    private azje() {
        String str = "";
        this.b = str;
        this.c = str;
        this.e = str;
        this.i = anxl.emptyProtobufList();
        this.j = str;
        this.p = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.s);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.s = b;
                return null;
            case 2:
                return anxl.newMessageInfo(r, "\u0001\u0010\u0000\u0001\u0001㴗\u0010\u0001\u0001\u0001\u0001\b\u0000\u0002\b\u0001\u0003\u000b\u0002\u0005\b\u0004\u0006\u0007\u0005\u0007\u0001\u0006\b\u0001\u0007\t\b\b\f\f\f\u000eЛ\u000f\b\u0014\u0010\t\u0012\u00122⁾\t\t☔\t\r㴗\t\u000f", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "j", "l", azjb.a, "i", apxu.class, "p", "o", "q", azjg.a, "k", "m", "n"});
            case 3:
                return new azje();
            case 4:
                return new azjd();
            case 5:
                return r;
            case 6:
                Object obj3 = t;
                if (obj3 == null) {
                    synchronized (azje.class) {
                        obj3 = t;
                        if (obj3 == null) {
                            obj3 = new anxn(r);
                            t = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        azje azje = new azje();
        r = azje;
        anxl.registerDefaultInstance(azje.class, azje);
    }
}
