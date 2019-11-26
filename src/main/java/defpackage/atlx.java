package defpackage;

/* renamed from: atlx */
public final class atlx extends anxl implements anzf {
    public static final atlx H;
    private static volatile anzq I;
    public static final anyb n = new atma();
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public int G;
    public int a;
    public int b;
    public String c;
    public String d;
    public anye e = anxl.emptyLongList();
    public boolean f;
    public boolean g;
    public boolean h;
    public String i;
    public boolean j;
    public boolean k;
    public boolean l;
    public anxz m;
    public anye o;
    public anye p;
    public anye q;
    public anye r;
    public anye s;
    public anye t;
    public anye u;
    public anye v;
    public boolean w;
    public int x;
    public boolean y;
    public boolean z;

    private atlx() {
        String str = "";
        this.c = str;
        this.d = str;
        this.i = str;
        this.m = anxl.emptyIntList();
        anxl.emptyLongList();
        this.o = anxl.emptyLongList();
        this.p = anxl.emptyLongList();
        this.q = anxl.emptyLongList();
        this.r = anxl.emptyLongList();
        this.s = anxl.emptyLongList();
        this.t = anxl.emptyLongList();
        this.u = anxl.emptyLongList();
        this.v = anxl.emptyLongList();
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(H, "\u0001\u001e\u0000\u0002\u0002A\u001e\u0000\n\u0000\u0002\b\u0002\u0003\b\u0001\u0004\u0007\u000b\u0005\u0015\u0006\u0015\u0007\u0015\b\u0015\t\u0015\n\u0015\f\u0004\f\u000e\u0007\r\u000f\u0007\u000e\u0012\u0007\u0010\u0015\u0007\u0016\u0019\u0007\u0003\u001b\u0007\u0005\u001e\b\u0006 \u0007\u0004-\u0004&/\u0007\u000f1\u001e2\u0007!3\u0007\"4\u0007#6\u0007\u00077\u0007\b9\u0007\t:\u0015@\u0015A\u0015", new Object[]{"a", "b", "d", "c", "w", "e", "p", "q", "r", "s", "t", "x", "y", "z", "B", "C", "f", "h", "i", "g", "G", "A", "m", atmc.a(), "D", "E", "F", "j", "k", "l", "o", "u", "v"});
            case 3:
                return new atlx();
            case 4:
                return new atlz();
            case 5:
                return H;
            case 6:
                Object obj3 = I;
                if (obj3 == null) {
                    synchronized (atlx.class) {
                        obj3 = I;
                        if (obj3 == null) {
                            obj3 = new anxn(H);
                            I = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        atlx atlx = new atlx();
        H = atlx;
        anxl.registerDefaultInstance(atlx.class, atlx);
    }
}
