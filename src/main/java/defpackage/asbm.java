package defpackage;

/* renamed from: asbm */
public final class asbm extends anxp implements anzf {
    public static final asbm u;
    private static volatile anzq w;
    public int a;
    public ashy b;
    public String c;
    public String d;
    public String e;
    public String f;
    public ateh g;
    public arkl i;
    public avki j;
    public boolean k;
    public asbi l;
    public aqje m;
    public boolean n;
    public anxz o;
    public anyd p;
    public int q;
    public int r;
    public aqvv s;
    public asbo t;
    private byte v = (byte) 2;

    private asbm() {
        String str = "";
        this.c = str;
        this.d = str;
        this.e = str;
        this.f = str;
        this.o = anxl.emptyIntList();
        this.p = anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.v);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.v = b;
                return null;
            case 2:
                return anxl.newMessageInfo(u, "\u0001\u0012\u0000\u0001\u0001!\u0012\u0000\u0002\u0002\u0001Љ\u0000\u0002\b\u0001\u0003\b\u0002\u0007\b\u0004\nЉ\b\u000b\b\u0003\r\t\t\u000f\u0007\f\u0012\t\u000f\u0017\t\u0014\u0019\u0007\u0015\u001a\t\n\u001b\u0016\u001c\u001b\u001d\f\u0016\u001f\f\u0018 \t\u0019!\t\u001a", new Object[]{"a", "b", "c", "d", "f", "g", "e", "i", "k", "l", "m", "n", "j", "o", "p", awuw.class, "q", arym.a, "r", apgo.a, "s", "t"});
            case 3:
                return new asbm();
            case 4:
                return new asbp();
            case 5:
                return u;
            case 6:
                Object obj3 = w;
                if (obj3 == null) {
                    synchronized (asbm.class) {
                        obj3 = w;
                        if (obj3 == null) {
                            obj3 = new anxn(u);
                            w = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        asbm asbm = new asbm();
        u = asbm;
        anxl.registerDefaultInstance(asbm.class, asbm);
    }
}
