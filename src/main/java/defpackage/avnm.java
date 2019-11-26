package defpackage;

/* renamed from: avnm */
public final class avnm extends anxl implements anzf {
    public static final avnm q;
    private static volatile anzq r;
    public int a;
    public boolean b;
    public boolean c;
    public anxz d = anxl.emptyIntList();
    public boolean e;
    public int f;
    public boolean g;
    public boolean h;
    public boolean i;
    public double j;
    public boolean k;
    public boolean l;
    public long m;
    public long n;
    public boolean o;
    public long p;

    private avnm() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(q, "\u0001\u000f\u0000\u0001\u0004\u001c\u000f\u0000\u0001\u0000\u0004\u0007\u0003\u0005\u0007\u0004\u0006\u0016\b\u0007\u0006\t\u0004\u0007\u000e\u0007\f\u000f\u0007\r\u0012\u0007\u0010\u0014\u0000\u0012\u0016\u0007\u0014\u0018\u0007\u0019\u0019\u0007\u0016\u001a\u0002\u001a\u001b\u0002\u0017\u001c\u0002\u0018", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "o", "l", "p", "m", "n"});
            case 3:
                return new avnm();
            case 4:
                return new avnp();
            case 5:
                return q;
            case 6:
                Object obj3 = r;
                if (obj3 == null) {
                    synchronized (avnm.class) {
                        obj3 = r;
                        if (obj3 == null) {
                            obj3 = new anxn(q);
                            r = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        avnm avnm = new avnm();
        q = avnm;
        anxl.registerDefaultInstance(avnm.class, avnm);
    }
}
