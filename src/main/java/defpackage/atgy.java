package defpackage;

/* renamed from: atgy */
public final class atgy extends anxl implements anzf {
    public static final atgy s;
    private static volatile anzq t;
    public int a;
    public int b;
    public int c;
    public String d;
    public int e;
    public anxz f = anxl.emptyIntList();
    public atha g;
    public String h;
    public athg i;
    public anyd j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public String r;

    private atgy() {
        String str = "";
        this.d = str;
        this.h = str;
        this.j = anxl.emptyProtobufList();
        anxl.emptyProtobufList();
        this.r = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(s, "\u0001\u0011\u0000\u0001\u0001&\u0011\u0000\u0002\u0000\u0001\f\u0000\u0002\b\u0002\u0003\t\u0005\u0004\b\u0006\u0005\t\b\u0006\u001b\t\u000b\r\n\u000b\u000e\u000b\u000b\u000f\u0013\u000b\u0012\u0014\u000b\u0013\u0015\b\u0014\u0017\f\u0004\u001d\f\u0001\u001f\u001e%\u000b\n&\u0007\t", new Object[]{"a", "b", athh.a, "d", "g", "h", "i", "j", athg.class, "m", "n", "o", "p", "q", "r", "e", athd.a, "c", athe.a, "f", athc.a(), "l", "k"});
            case 3:
                return new atgy();
            case 4:
                return new atgx();
            case 5:
                return s;
            case 6:
                Object obj3 = t;
                if (obj3 == null) {
                    synchronized (atgy.class) {
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
        atgy atgy = new atgy();
        s = atgy;
        anxl.registerDefaultInstance(atgy.class, atgy);
    }
}
