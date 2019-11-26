package defpackage;

/* renamed from: aour */
public final class aour extends anxl implements anzf {
    public static final aour t;
    private static volatile anzq v;
    public int a;
    public String b;
    public int c;
    public int d;
    public arml e;
    public arml f;
    public arml g;
    public arml h;
    public aygk i;
    public String j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public String q;
    public int r;
    public int s;
    private byte u = (byte) 2;

    private aour() {
        String str = "";
        this.b = str;
        this.c = 99;
        this.j = str;
        this.m = true;
        this.n = true;
        this.q = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.u);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.u = b;
                return null;
            case 2:
                return anxl.newMessageInfo(t, "\u0001\u0012\u0000\u0001\u0001\u001b\u0012\u0000\u0000\u0005\u0001\b\u0000\u0002\u0004\u0001\u0003\u0004\u0002\u0004Љ\u0003\u0005Љ\u0004\u0006Љ\u0005\u0007Љ\u0006\bЉ\u0007\n\b\t\u000b\u0007\u000b\f\u0007\f\r\u0007\r\u000e\u0007\u000e\u000f\b\u0010\u0017\u0004\u0012\u0019\u0007\n\u001a\f\u0011\u001b\u0007\u000f", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "l", "m", "n", "o", "q", "s", "k", "r", avkt.a, "p"});
            case 3:
                return new aour();
            case 4:
                return new aouq();
            case 5:
                return t;
            case 6:
                Object obj3 = v;
                if (obj3 == null) {
                    synchronized (aour.class) {
                        obj3 = v;
                        if (obj3 == null) {
                            obj3 = new anxn(t);
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
        aour aour = new aour();
        t = aour;
        anxl.registerDefaultInstance(aour.class, aour);
    }
}
