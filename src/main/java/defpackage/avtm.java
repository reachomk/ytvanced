package defpackage;

/* renamed from: avtm */
public final class avtm extends anxl implements anzf {
    public static final avtm y;
    private static volatile anzq z;
    public int a;
    public int b;
    public String c;
    public avti d;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;
    public boolean i;
    public boolean j;
    public avto k;
    public String l;
    public aqsq m;
    public anxz n = anxl.emptyIntList();
    public boolean o;
    public boolean p;
    public boolean q;
    public int r;
    public boolean s;
    public int t;
    public int u;
    public float v;
    public aoth w;
    public avjo x;

    private avtm() {
        String str = "";
        this.c = str;
        this.l = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(y, "\u0001\u0016\u0000\u0002\u00011\u0016\u0000\u0001\u0000\u0001\b\u0000\u0002\t\u0001\u0004\u0007\u0003\u0005\u0007\u0004\b\u0007\u0006\u000e\u0004\u000b\u0011\u0007\u000e\u0012\u0007\u000f\u0014\t\u0011\u0015\b\u0012\u001b\t\u0017\u001f\u0016 \u0007\u001a&\u0007\u001d'\u0007\u001e(\u0004\u001f)\u0007 *\u0004!.\u0004%/\u0001&0\t'1\t(", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x"});
            case 3:
                return new avtm();
            case 4:
                return new avtp();
            case 5:
                return y;
            case 6:
                Object obj3 = z;
                if (obj3 == null) {
                    synchronized (avtm.class) {
                        obj3 = z;
                        if (obj3 == null) {
                            obj3 = new anxn(y);
                            z = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        avtm avtm = new avtm();
        y = avtm;
        anxl.registerDefaultInstance(avtm.class, avtm);
    }
}
