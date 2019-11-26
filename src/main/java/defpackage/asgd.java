package defpackage;

/* renamed from: asgd */
public final class asgd extends anxl implements anzf {
    public static final asgd i;
    private static volatile anzq k;
    public int a;
    public int b = 0;
    public Object c;
    public ashy d;
    public String e;
    public String f;
    public asff g;
    public String h;
    private byte j = (byte) 2;

    private asgd() {
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
                return anxl.newMessageInfo(i, "\u0001\u000b\u0001\u0001\u0001\u000e\u000b\u0000\u0000\u0001\u0001Љ\u0000\u0002\b\u0001\u0003\b\u0002\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b\t\u0004\f\b\u0005\r<\u0000\u000e<\u0000", new Object[]{"c", "b", "a", "d", "e", "f", asfr.class, asfp.class, asfj.class, asfl.class, "g", "h", asfn.class, asfh.class});
            case 3:
                return new asgd();
            case 4:
                return new asgc();
            case 5:
                return i;
            case 6:
                Object obj3 = k;
                if (obj3 == null) {
                    synchronized (asgd.class) {
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
        asgd asgd = new asgd();
        i = asgd;
        anxl.registerDefaultInstance(asgd.class, asgd);
    }
}
