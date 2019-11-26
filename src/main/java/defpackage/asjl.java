package defpackage;

/* renamed from: asjl */
public final class asjl extends anxl implements anzf {
    public static final asjl k;
    private static volatile anzq l;
    public int a;
    public String b;
    public String c;
    public String d;
    public int e;
    public asjd f;
    public boolean g;
    public String h;
    public String i;
    public boolean j;

    private asjl() {
        String str = "";
        this.b = str;
        this.c = str;
        this.d = str;
        this.h = str;
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
                return anxl.newMessageInfo(k, "\u0001\t\u0000\u0001\u0001\u000b\t\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0004\f\u0004\u0006\t\u0006\u0007\u0007\u0007\b\b\b\t\b\t\n\u0007\n\u000b\b\u0003", new Object[]{"a", "b", "c", "e", awnx.a(), "f", "g", "h", "i", "j", "d"});
            case 3:
                return new asjl();
            case 4:
                return new asjk();
            case 5:
                return k;
            case 6:
                Object obj3 = l;
                if (obj3 == null) {
                    synchronized (asjl.class) {
                        obj3 = l;
                        if (obj3 == null) {
                            obj3 = new anxn(k);
                            l = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        asjl asjl = new asjl();
        k = asjl;
        anxl.registerDefaultInstance(asjl.class, asjl);
    }
}
