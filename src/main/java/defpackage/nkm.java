package defpackage;

/* renamed from: nkm */
public final class nkm extends anxl implements anzf {
    public static final nkm x;
    private static volatile anzq y;
    public int a;
    public String b;
    public anyd c;
    public String d;
    public int e;
    public String f;
    public anvu g;
    public boolean h;
    public boolean i;
    public boolean j;
    public long k;
    public String l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public avtk q;
    public avtm r;
    public anvu s;
    public boolean t;
    public boolean u;
    public int v;
    public anyy w = anyy.b;

    private nkm() {
        String str = "";
        this.b = str;
        this.c = anxl.emptyProtobufList();
        this.d = str;
        this.f = str;
        this.g = anvu.a;
        this.l = str;
        this.s = anvu.a;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(x, "\u0001\u0016\u0000\u0001\u0001\u001f\u0016\u0001\u0001\u0000\u0001\b\u0000\u0002\u001a\u0003\b\u0001\u0004\u0004\u0002\u0005\b\u0003\u0006\n\u0004\u0007\u0007\u0005\b\u0007\u0006\t\u0007\u0007\u000b\u0002\b\f\b\t\r\u0007\n\u000e\u0007\u000b\u000f\u0007\f\u0012\u0007\u000f\u0013\t\u0010\u0015\t\u0012\u0016\n\u0013\u001a\u0007\u0016\u001b\u0007\u0017\u001e\f\u001a\u001f2", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", nko.a, "w", nkq.a});
            case 3:
                return new nkm();
            case 4:
                return new nkn();
            case 5:
                return x;
            case 6:
                Object obj3 = y;
                if (obj3 == null) {
                    synchronized (nkm.class) {
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
        nkm nkm = new nkm();
        x = nkm;
        anxl.registerDefaultInstance(nkm.class, nkm);
    }
}
