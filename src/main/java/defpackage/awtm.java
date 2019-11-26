package defpackage;

/* renamed from: awtm */
public final class awtm extends anxl implements anzf {
    public static final awtm x;
    private static volatile anzq y;
    public int a;
    public boolean b;
    public boolean c;
    public aulg d;
    public int e;
    public boolean f;
    public String g;
    public boolean h;
    public String i;
    public boolean j;
    public int k;
    public int l;
    public boolean m;
    public boolean n;
    public boolean o;
    public int p;
    public float q;
    public int r;
    public float s;
    public int t;
    public boolean u;
    public boolean v = true;
    public boolean w;

    private awtm() {
        String str = "";
        this.g = str;
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
                return anxl.newMessageInfo(x, "\u0001\u0016\u0000\u0001\u0001\u001d\u0016\u0000\u0000\u0000\u0001\u0007\u0000\u0002\u0007\u0001\u0003\t\u0002\u0005\f\u0004\b\u0007\u0007\t\b\b\n\u0007\t\u000b\b\n\u000e\u0007\r\u000f\u0004\u000e\u0010\u0004\u000f\u0011\u0007\u0010\u0014\u0007\u0013\u0015\u0007\u0014\u0016\u0004\u0015\u0017\u0001\u0016\u0018\u0004\u0017\u0019\u0001\u0018\u001a\u0004\u0019\u001b\u0007\u001a\u001c\u0007\u001b\u001d\u0007\u001c", new Object[]{"a", "b", "c", "d", "e", apxf.a, "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w"});
            case 3:
                return new awtm();
            case 4:
                return new awtp();
            case 5:
                return x;
            case 6:
                Object obj3 = y;
                if (obj3 == null) {
                    synchronized (awtm.class) {
                        obj3 = y;
                        if (obj3 == null) {
                            obj3 = new anxn(x);
                            y = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        awtm awtm = new awtm();
        x = awtm;
        anxl.registerDefaultInstance(awtm.class, awtm);
    }
}
