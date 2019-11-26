package defpackage;

/* renamed from: atpa */
public final class atpa extends anxl implements anzf {
    public static final atpa v;
    private static volatile anzq x;
    public int a;
    public int b;
    public ashy c;
    public String d;
    public String e;
    public String f;
    public String g;
    public int h;
    public boolean i;
    public String j;
    public boolean k;
    public ateh l;
    public anxz m;
    public arkl n;
    public boolean o;
    public int p;
    public boolean q;
    public atog r;
    public atos s;
    public String t;
    public atou u;
    private byte w = (byte) 2;

    private atpa() {
        String str = "";
        this.d = str;
        this.e = str;
        this.f = str;
        this.g = str;
        this.j = str;
        this.m = anxl.emptyIntList();
        this.t = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.w);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.w = b;
                return null;
            case 2:
                return anxl.newMessageInfo(v, "\u0001\u0013\u0000\u0002\u0001'\u0013\u0000\u0001\u0002\u0001Љ\u0000\u0002\b\u0001\u0004\b\u0002\u0006\b\u0004\u0007\u000b\u0006\b\b\u0005\t\u0007\b\n\u0007\f\u000bЉ\r\u000f\u0016\u0010\b\t\u0011\t\u0011\u001a\u0007\u0018\u001c\f\u001a\u001e\u0007\u001b\"\t\u001d$\t\u001f%\b '\t\"", new Object[]{"a", "b", "c", "d", "e", "f", "h", "g", "i", "k", "l", "m", "j", "n", "o", "p", aozb.a, "q", "r", "s", "t", "u"});
            case 3:
                return new atpa();
            case 4:
                return new atoz();
            case 5:
                return v;
            case 6:
                Object obj3 = x;
                if (obj3 == null) {
                    synchronized (atpa.class) {
                        obj3 = x;
                        if (obj3 == null) {
                            obj3 = new anxn(v);
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
        atpa atpa = new atpa();
        v = atpa;
        anxl.registerDefaultInstance(atpa.class, atpa);
    }
}
