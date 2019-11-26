package defpackage;

/* renamed from: aokb */
public final class aokb extends anxl implements anzf {
    public static final aokb B;
    private static volatile anzq C;
    public int A;
    public int a;
    public int b;
    public int c;
    public String d = "";
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public int o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public int t;
    public boolean u;
    public boolean v;
    public float w;
    public int x;
    public int y;
    public boolean z;

    private aokb() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(B, "\u0001\u0018\u0000\u0003\u0001O\u0018\u0000\u0000\u0000\u0001\b\u0000\u0007\u0004\u0006\t\u0007\b\u000b\u0007\n\u000f\u0007\u000e\u0010\u0007\u000f\u0015\u0007\u0014!\u0007\u001f#\u0007!1\u0007.4\u000715\u000428\u00075=\u0007:>\u0007;?\u0007<A\f>B\u0007?C\u0007@D\u0001AE\u0004BF\u0004CK\u0007HO\u0004L", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", aoks.a, "u", "v", "w", "x", "y", "z", "A"});
            case 3:
                return new aokb();
            case 4:
                return new aoka();
            case 5:
                return B;
            case 6:
                Object obj3 = C;
                if (obj3 == null) {
                    synchronized (aokb.class) {
                        obj3 = C;
                        if (obj3 == null) {
                            obj3 = new anxn(B);
                            C = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aokb aokb = new aokb();
        B = aokb;
        anxl.registerDefaultInstance(aokb.class, aokb);
    }
}
