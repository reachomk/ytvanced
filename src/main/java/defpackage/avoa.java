package defpackage;

/* renamed from: avoa */
public final class avoa extends anxl implements anzf {
    public static final avoa w;
    private static volatile anzq x;
    public int a;
    public int b;
    public avpy c;
    public azqx d;
    public boolean e;
    public int f;
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
    public int q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;

    private avoa() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(w, "\u0001\u0014\u0000\u0002\u0003䶞\u0014\u0000\u0000\u0000\u0003\u0007\u0005\u0004\u0004\u0006\u0006\u0007\b\u0007\u0007\t\f\u0007\u000e\r\u0007\u000f\u000e\u0007\u0010\u000f\u0007\u0011\u0013\u0007\u0015\u0014\u0007\u0016\u0015\u0004\u0017\u0016\u0007\u0018\u0017\u0007\u001a\u0018\u0007\u001b\u001a\u0007\u001d\u001b\u0004\u0019\u001d\u0007\u001f\u001e\u0007 㸤\t\u0000䶞\t\u0002", new Object[]{"a", "b", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "r", "s", "t", "q", "u", "v", "c", "d"});
            case 3:
                return new avoa();
            case 4:
                return new avnz();
            case 5:
                return w;
            case 6:
                Object obj3 = x;
                if (obj3 == null) {
                    synchronized (avoa.class) {
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
        avoa avoa = new avoa();
        w = avoa;
        anxl.registerDefaultInstance(avoa.class, avoa);
    }
}
