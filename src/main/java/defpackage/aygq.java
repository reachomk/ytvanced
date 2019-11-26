package defpackage;

/* renamed from: aygq */
public final class aygq extends anxl implements anzf {
    public static final aygq m;
    private static volatile anzq o;
    public int a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public apxu h;
    public String i;
    public String j;
    public String k;
    public anvu l;
    private byte n = (byte) 2;

    private aygq() {
        String str = "";
        this.b = str;
        this.c = str;
        this.d = str;
        this.e = str;
        this.f = str;
        this.g = str;
        this.i = str;
        this.j = str;
        this.k = str;
        this.l = anvu.a;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.n);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.n = b;
                return null;
            case 2:
                return anxl.newMessageInfo(m, "\u0001\u000b\u0000\u0001\u0001\u0016\u000b\u0000\u0000\u0001\u0001\b\u0000\u0006\b\u000b\u0007\b\f\t\b\u0011\u000b\n\u0013\f\b\u0006\rЉ\b\u000e\b\u0003\u000f\b\u0004\u0015\b\u0001\u0016\b\u0007", new Object[]{"a", "b", "i", "j", "k", "l", "f", "h", "d", "e", "c", "g"});
            case 3:
                return new aygq();
            case 4:
                return new aygt();
            case 5:
                return m;
            case 6:
                Object obj3 = o;
                if (obj3 == null) {
                    synchronized (aygq.class) {
                        obj3 = o;
                        if (obj3 == null) {
                            obj3 = new anxn(m);
                            o = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public static anzq a() {
        return m.getParserForType();
    }

    static {
        aygq aygq = new aygq();
        m = aygq;
        anxl.registerDefaultInstance(aygq.class, aygq);
    }
}
