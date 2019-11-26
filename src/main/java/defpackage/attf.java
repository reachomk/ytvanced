package defpackage;

/* renamed from: attf */
public final class attf extends anxl implements anzf {
    public static final attf m;
    private static volatile anzq n;
    public int a;
    public boolean b;
    public boolean c;
    public long d;
    public long e;
    public String f;
    public float g;
    public long h;
    public String i;
    public boolean j;
    public boolean k;
    public boolean l;

    private attf() {
        String str = "";
        this.f = str;
        this.i = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(m, "\u0001\u000b\u0000\u0001\u0001\r\u000b\u0000\u0000\u0000\u0001\u0007\u0000\u0002\u0007\u0001\u0003\u0002\u0002\u0004\u0002\u0003\u0005\b\u0004\u0006\u0001\u0005\u0007\u0002\u0006\b\b\b\u000b\u0007\n\f\u0007\u000b\r\u0007\f", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l"});
            case 3:
                return new attf();
            case 4:
                return new atte();
            case 5:
                return m;
            case 6:
                Object obj3 = n;
                if (obj3 == null) {
                    synchronized (attf.class) {
                        obj3 = n;
                        if (obj3 == null) {
                            obj3 = new anxn(m);
                            n = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        attf attf = new attf();
        m = attf;
        anxl.registerDefaultInstance(attf.class, attf);
    }
}
