package defpackage;

/* renamed from: ausc */
public final class ausc extends anxl implements anzf {
    public static final ausc D;
    private static volatile anzq E;
    public int A;
    public String B = "";
    public boolean C;
    public int a;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public int g;
    public anyd h = anxl.emptyProtobufList();
    public anyd i = anxl.emptyProtobufList();
    public int j;
    public boolean k;
    public int l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public int s;
    public int t;
    public boolean u;
    public int v;
    public int w;
    public int x;
    public boolean y;
    public boolean z;

    private ausc() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(D, "\u0001\u001b\u0000\u0002\u00037\u001b\u0000\u0002\u0000\u0003\u0007\u0002\u0004\u0007\u0003\u0007\u0007\u0005\b\u0007\u0006\f\u0004\n\u000f\u001b\u0010\u001b\u0011\u0004\r\u0014\u0007\u0010\u0015\u0004\u0011\u0016\u0007\u0012\u0019\u0007\u0015\u001a\u0007\u0016\u001b\u0007\u0017\u001c\u0007\u0018\u001e\u0007\u001a$\u000b\u001b%\u000b\u001c(\u0007\")\u000b#*\u000b$+\u000b%.\u0007'3\u0007,4\u000b-5\b.7\u00070", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", ausq.class, "i", auss.class, "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C"});
            case 3:
                return new ausc();
            case 4:
                return new ausb();
            case 5:
                return D;
            case 6:
                Object obj3 = E;
                if (obj3 == null) {
                    synchronized (ausc.class) {
                        obj3 = E;
                        if (obj3 == null) {
                            obj3 = new anxn(D);
                            E = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        ausc ausc = new ausc();
        D = ausc;
        anxl.registerDefaultInstance(ausc.class, ausc);
    }
}
