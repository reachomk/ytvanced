package defpackage;

/* renamed from: arlv */
public final class arlv extends anxp implements anzf {
    public static final arlv E;
    private static volatile anzq G;
    public static final anyb t = new arlu();
    public armd A;
    public double B;
    public double C;
    public apiv D;
    private byte F = (byte) 2;
    public int a;
    public int b;
    public int c;
    public String d;
    public String e;
    public int f;
    public int g;
    public int i;
    public int j;
    public int k;
    public armb l;
    public armb m;
    public long n;
    public long o;
    public boolean p;
    public int q;
    public String r;
    public anxz s;
    public String u;
    public int v;
    public int w;
    public aoyg x;
    public anyd y;
    public arlp z;

    private arlv() {
        String str = "";
        this.d = str;
        this.e = str;
        this.r = str;
        this.s = anxl.emptyIntList();
        this.u = str;
        this.y = anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.F);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.F = b;
                return null;
            case 2:
                return anxl.newMessageInfo(E, "\u0001\u001a\u0000\u0002\u0001*\u001a\u0000\u0002\u0001\u0001\u0004\u0000\u0002\b\u0001\u0005\b\u0004\u0006\u0004\u0005\u0007\u0004\u0007\b\u0004\b\t\t\n\n\t\u000b\u000b\u0002\f\f\u0002\r\u0012\u0007\u0013\u0013\f\u0014\u0017\b\u0016\u0018\u001e\u0019\u0004\t\u001a\b\u0017\u001b\f\u0018\u001c\t\u001c\u001eЛ\u001f\u0004\u0006!\t\u001d\"\t\u001e#\u0000\u001f%\f\u001a&\u0000!*\t%", new Object[]{"a", "b", "c", "d", "e", "f", "i", "j", "l", "m", "n", "o", "p", "q", arlw.a, "r", "s", atzi.a(), "k", "u", "v", arls.a, "x", "y", arlz.class, "g", "z", "A", "B", "w", axue.a, "C", "D"});
            case 3:
                return new arlv();
            case 4:
                return new arlx();
            case 5:
                return E;
            case 6:
                Object obj3 = G;
                if (obj3 == null) {
                    synchronized (arlv.class) {
                        obj3 = G;
                        if (obj3 == null) {
                            obj3 = new anxn(E);
                            G = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        arlv arlv = new arlv();
        E = arlv;
        anxl.registerDefaultInstance(arlv.class, arlv);
    }
}
