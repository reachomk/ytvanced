package defpackage;

/* renamed from: aqji */
public final class aqji extends anxl implements anzf {
    public static final aqji r;
    private static volatile anzq t;
    public int a;
    public String b;
    public anvu c;
    public boolean d;
    public aygk e;
    public int f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public String n;
    public String o;
    public String p;
    public boolean q;
    private byte s = (byte) 2;

    private aqji() {
        String str = "";
        this.b = str;
        this.c = anvu.a;
        this.g = str;
        this.h = str;
        this.i = str;
        this.j = str;
        this.k = str;
        this.l = str;
        this.m = str;
        this.n = str;
        this.o = str;
        this.p = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.s);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.s = b;
                return null;
            case 2:
                return anxl.newMessageInfo(r, "\u0001\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0000\u0001\u0001\b\u0000\u0002\n\u0001\u0003Љ\u0003\u0004\f\u0004\u0005\b\u0005\u0006\b\u0006\u0007\b\u0007\b\b\b\t\b\t\n\b\n\u000b\b\u000b\f\b\f\r\b\r\u000e\b\u000e\u000f\u0007\u0002\u0010\u0007\u000f", new Object[]{"a", "b", "c", "e", "f", aqkt.a(), "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "d", "q"});
            case 3:
                return new aqji();
            case 4:
                return new aqjh();
            case 5:
                return r;
            case 6:
                Object obj3 = t;
                if (obj3 == null) {
                    synchronized (aqji.class) {
                        obj3 = t;
                        if (obj3 == null) {
                            obj3 = new anxn(r);
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
        aqji aqji = new aqji();
        r = aqji;
        anxl.registerDefaultInstance(aqji.class, aqji);
    }
}
