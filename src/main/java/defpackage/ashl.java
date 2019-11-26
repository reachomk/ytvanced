package defpackage;

/* renamed from: ashl */
public final class ashl extends anxl implements anzf {
    public static final ashl O;
    private static volatile anzq P;
    public int A;
    public int B;
    public int C;
    public float D;
    public float E;
    public int F;
    public float G;
    public axqr H;
    public int I;
    public int J;
    public int K;
    public int L;
    public String M;
    public int N;
    public int a;
    public int b;
    public int c;
    public String d;
    public String e;
    public boolean f;
    public String g;
    public String h;
    public String i;
    public auke j;
    public String k;
    public String l;
    public anxz m = anxl.emptyIntList();
    public int n;
    public int o;
    public String p;
    public baae q;
    public String r;
    public String s;
    public String t;
    public String u;
    public int v;
    public int w;
    public ashs x;
    public int y;
    public int z;

    private ashl() {
        String str = "";
        this.d = str;
        this.e = str;
        this.g = str;
        this.h = str;
        this.i = str;
        this.k = str;
        this.l = str;
        anxl.emptyIntList();
        anxl.emptyIntList();
        anxl.emptyIntList();
        this.p = str;
        this.r = str;
        this.s = str;
        this.t = str;
        this.u = str;
        this.M = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(O, "\u0001%\u0000\u0003\u0001P%\u0000\u0001\u0000\u0001\b\u0000\u0002\b\u0003\b\b\u0014\u000b\u0007\u0002\f\b\u001f\r\b \u0010\f\u0018\u0011\b\u001a\u0012\b!\u0013\b\"\u0015\b\u0001\u0016\b\u0004\u0019\b\u0015\u001c\f$\"\b\u0007#\f*%\u0004,&\u0004-'\u00010(\u00011)\u00042-\t7.\f8/\t\u001c2\u0004:4\f=7\u0004.8\u0004/=\f#>\t'@\u0004\u0019A\u00013B\u0016C\u0004?J\t\nN\fEP\b@", new Object[]{"a", "b", "c", "d", "g", "k", "f", "r", "s", "n", ashr.a(), "p", "t", "u", "e", "h", "l", "w", asht.a, "i", "y", ashk.a, "z", "A", "D", "E", "F", "H", "I", asho.a, "q", "J", "K", ashm.a(), "B", "C", "v", apvn.a, "x", "o", "G", "m", "L", "j", "N", aowu.a, "M"});
            case 3:
                return new ashl();
            case 4:
                return new ashn();
            case 5:
                return O;
            case 6:
                Object obj3 = P;
                if (obj3 == null) {
                    synchronized (ashl.class) {
                        obj3 = P;
                        if (obj3 == null) {
                            obj3 = new anxn(O);
                            P = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        ashl ashl = new ashl();
        O = ashl;
        anxl.registerDefaultInstance(ashl.class, ashl);
    }
}
