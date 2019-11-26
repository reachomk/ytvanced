package defpackage;

/* renamed from: avtc */
public final class avtc extends anxl implements anzf {
    public static final avtc w;
    private static volatile anzq x;
    public int a;
    public anvu b = anvu.a;
    public anvu c = anvu.a;
    public long d;
    public boolean e;
    public String f = "";
    public long g;
    public long h;
    public boolean i;
    public boolean j;
    public int k;
    public int l;
    public int m;
    public boolean n;
    public int o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public int t;
    public aosx u;
    public boolean v;

    private avtc() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(w, "\u0001\u0015\u0000\u0001\u0001\u001d\u0015\u0000\u0000\u0000\u0001\n\u0000\u0002\u0002\u0002\u0003\n\u0001\u0005\b\u0005\u0006\u0002\u0006\u0007\u0002\u0007\t\u0007\u0004\n\u0007\t\u000b\u0007\n\u000e\u0004\r\u000f\u0004\u000e\u0010\u0004\u000f\u0011\u0007\u0010\u0013\u0004\u0012\u0014\u0007\u0013\u0015\u0007\u0014\u0016\u0007\u0015\u0018\u0007\u0016\u0019\u0004\u0018\u001b\t\u001a\u001d\u0007\u001c", new Object[]{"a", "b", "d", "c", "f", "g", "h", "e", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v"});
            case 3:
                return new avtc();
            case 4:
                return new avtf();
            case 5:
                return w;
            case 6:
                Object obj3 = x;
                if (obj3 == null) {
                    synchronized (avtc.class) {
                        obj3 = x;
                        if (obj3 == null) {
                            obj3 = new anxn(w);
                            x = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        avtc avtc = new avtc();
        w = avtc;
        anxl.registerDefaultInstance(avtc.class, avtc);
    }
}
