package defpackage;

/* renamed from: aqnx */
public final class aqnx extends anxl implements anzf {
    public static final aqnx w;
    private static volatile anzq y;
    public int a;
    public long b;
    public long c;
    public String d;
    public String e;
    public arml f;
    public aygk g;
    public auvr h;
    public aqnj i;
    public String j;
    public String k;
    public aqnb l;
    public aqnh m;
    public apxu n;
    public apxu o;
    public aqnl p;
    public String q;
    public apxu r;
    public aygk s;
    public arml t;
    public arml u;
    public apxu v;
    private byte x = (byte) 2;

    private aqnx() {
        String str = "";
        this.d = str;
        this.e = str;
        this.j = str;
        this.k = str;
        this.q = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.x);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.x = b;
                return null;
            case 2:
                return anxl.newMessageInfo(w, "\u0001\u0015\u0000\u0001\u0001\u001b\u0015\u0000\u0000\r\u0001\u0002\u0000\u0002\u0002\u0001\u0003\b\u0002\u0004\b\u0003\u0005Љ\u0004\u0006Љ\u0005\u0007Љ\u0006\bЉ\u0007\t\b\b\n\b\t\fЉ\u000b\rЉ\f\u0010Љ\u000f\u0011Љ\u0010\u0013\t\u0012\u0014\b\u0013\u0015Љ\u0014\u0016Љ\u0015\u0017Љ\u0016\u0018Љ\u0017\u001bЉ\u001a", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v"});
            case 3:
                return new aqnx();
            case 4:
                return new aqnw();
            case 5:
                return w;
            case 6:
                Object obj3 = y;
                if (obj3 == null) {
                    synchronized (aqnx.class) {
                        obj3 = y;
                        if (obj3 == null) {
                            obj3 = new anxn(w);
                            y = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aqnx aqnx = new aqnx();
        w = aqnx;
        anxl.registerDefaultInstance(aqnx.class, aqnx);
    }
}
