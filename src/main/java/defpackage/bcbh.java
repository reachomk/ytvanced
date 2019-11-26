package defpackage;

/* renamed from: bcbh */
public final class bcbh extends anxl implements anzf {
    public static final bcbh u;
    private static volatile anzq v;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;

    private bcbh() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(u, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0004\u0001\u0003\u0004\u0002\u0004\u0004\u0003\u0005\u0004\u0004\u0006\u0004\u0005\u0007\u0004\u0007\b\u0004\b\t\u0004\t\n\u0004\n\u000b\u0004\u000b\f\u0004\f\r\u0004\r\u000e\u0004\u000e\u000f\u0004\u000f\u0010\u0004\u0010\u0011\u0004\u0011\u0012\u0004\u0012\u0013\u0004\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "h"});
            case 3:
                return new bcbh();
            case 4:
                return new bcbk();
            case 5:
                return u;
            case 6:
                Object obj3 = v;
                if (obj3 == null) {
                    synchronized (bcbh.class) {
                        obj3 = v;
                        if (obj3 == null) {
                            obj3 = new anxn(u);
                            v = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        bcbh bcbh = new bcbh();
        u = bcbh;
        anxl.registerDefaultInstance(bcbh.class, bcbh);
    }
}
