package defpackage;

/* renamed from: avre */
public final class avre extends anxl implements anzf {
    public static final avre p;
    private static volatile anzq r;
    public int a;
    public String b;
    public aygk c;
    public avnc d;
    public String e;
    public String f;
    public long g;
    public long h;
    public String i;
    public arml j;
    public String k;
    public String l;
    public String m;
    public long n;
    public avrc o;
    private byte q = (byte) 2;

    private avre() {
        String str = "";
        this.b = str;
        this.e = str;
        this.f = str;
        this.i = str;
        this.k = str;
        this.l = str;
        this.m = str;
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
                return anxl.newMessageInfo(p, "\u0001\u000e\u0000\u0001\u0001\u0011\u000e\u0000\u0000\u0004\u0001\b\u0000\u0002Љ\u0001\u0003Љ\u0002\u0004\b\u0003\u0005\b\u0004\u0006\u0002\u0005\u0007\u0002\u0006\b\b\b\tЉ\t\n\b\n\f\b\u000b\r\b\f\u0010\u0002\r\u0011Љ\u000e", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o"});
            case 3:
                return new avre();
            case 4:
                return new avrd();
            case 5:
                return p;
            case 6:
                Object obj3 = r;
                if (obj3 == null) {
                    synchronized (avre.class) {
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
        avre avre = new avre();
        p = avre;
        anxl.registerDefaultInstance(avre.class, avre);
    }
}
