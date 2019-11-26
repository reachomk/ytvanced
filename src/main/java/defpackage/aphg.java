package defpackage;

/* renamed from: aphg */
public final class aphg extends anxp implements anzf {
    public static final aphg s;
    private static volatile anzq u;
    public int a;
    public int b = 0;
    public Object c;
    public int d;
    public arwf e;
    public boolean f;
    public arml g;
    public String i;
    public String j;
    public arup k;
    public apxu l;
    public apxu m;
    public apxu n;
    public anyd o;
    public aodv p;
    public aodx q;
    public anvu r;
    private byte t = (byte) 2;

    private aphg() {
        String str = "";
        this.i = str;
        this.j = str;
        this.o = anxl.emptyProtobufList();
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
                return anxl.newMessageInfo(s, "\u0001\u0011\u0001\u0001\u0001\u0015\u0011\u0000\u0001\u0006\u0001?\u0000\u0002\f\u0003\u0003\u0007\u0005\u0005Љ\u0007\u0007Љ\u000b\b\t\u0004\tЉ\f\n\t\u000e\u000b\b\b\r\n\u0012\u000eЉ\n\u0010\t\u000f\u0011<\u0000\u0012\b\t\u0013Љ\r\u0014<\u0000\u0015Л", new Object[]{"c", "b", "a", aphk.a, "d", aphi.a, "f", "g", "l", "e", "m", "p", "i", "r", "k", "q", aphe.class, "j", "n", ayet.class, "o", apxu.class});
            case 3:
                return new aphg();
            case 4:
                return new aphf();
            case 5:
                return s;
            case 6:
                Object obj3 = u;
                if (obj3 == null) {
                    synchronized (aphg.class) {
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

    public static anzq b() {
        return s.getParserForType();
    }

    static {
        aphg aphg = new aphg();
        s = aphg;
        anxl.registerDefaultInstance(aphg.class, aphg);
    }
}
