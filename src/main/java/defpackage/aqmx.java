package defpackage;

/* renamed from: aqmx */
public final class aqmx extends anxl implements anzf {
    public static final aqmx v;
    private static volatile anzq x;
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
    public aqnb k;
    public aqnh l;
    public apxu m;
    public apxu n;
    public aqnl o;
    public String p;
    public apxu q;
    public aygk r;
    public arml s;
    public arml t;
    public apxu u;
    private byte w = (byte) 2;

    private aqmx() {
        String str = "";
        this.d = str;
        this.e = str;
        this.j = str;
        this.p = str;
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
                return anxl.newMessageInfo(v, "\u0001\u0014\u0000\u0001\u0001\u001b\u0014\u0000\u0000\r\u0001\u0002\u0000\u0002\u0002\u0001\u0003\b\u0002\u0004\b\u0003\u0005Љ\u0004\u0006Љ\u0005\u0007Љ\u0006\bЉ\u0007\t\b\b\fЉ\u000b\rЉ\f\u0010Љ\u000f\u0011Љ\u0010\u0013\t\u0012\u0014\b\u0013\u0015Љ\u0014\u0016Љ\u0015\u0017Љ\u0016\u0018Љ\u0017\u001bЉ\u001a", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u"});
            case 3:
                return new aqmx();
            case 4:
                return new aqmw();
            case 5:
                return v;
            case 6:
                Object obj3 = x;
                if (obj3 == null) {
                    synchronized (aqmx.class) {
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
        aqmx aqmx = new aqmx();
        v = aqmx;
        anxl.registerDefaultInstance(aqmx.class, aqmx);
    }
}
