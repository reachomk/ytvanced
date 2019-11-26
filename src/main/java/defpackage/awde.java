package defpackage;

/* renamed from: awde */
public final class awde extends anxl implements anzf {
    public static final awde s;
    private static volatile anzq t;
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public int f;
    public boolean g;
    public boolean h;
    public boolean i;
    public long j;
    public long k;
    public int l;
    public int m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;

    private awde() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(s, "\u0001\u0011\u0000\u0001\u0002\u001f\u0011\u0000\u0000\u0000\u0002\u0007\u0001\u0003\u0007\u0002\u0004\u0007\u0003\t\u0007\b\n\u0004\t\u000b\u0007\n\r\u0007\f\u000e\u0007\r\u0012\u0002\u0011\u0016\u0002\u0013\u0017\u0004\u0014\u0019\u0004\u0016\u001a\u0007\u0017\u001b\u0007\u0018\u001c\u0007\u0019\u001d\u0007\u001a\u001f\u0007\u001c", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r"});
            case 3:
                return new awde();
            case 4:
                return new awdd();
            case 5:
                return s;
            case 6:
                Object obj3 = t;
                if (obj3 == null) {
                    synchronized (awde.class) {
                        obj3 = t;
                        if (obj3 == null) {
                            obj3 = new anxn(s);
                            t = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        awde awde = new awde();
        s = awde;
        anxl.registerDefaultInstance(awde.class, awde);
    }
}
