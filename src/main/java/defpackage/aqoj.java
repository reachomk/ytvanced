package defpackage;

/* renamed from: aqoj */
public final class aqoj extends anxl implements anzf {
    public static final aqoj s;
    private static volatile anzq u;
    public int a;
    public long b;
    public long c;
    public String d;
    public String e;
    public arml f;
    public aygk g;
    public auvr h;
    public aqnj i;
    public arml j;
    public aqnb k;
    public aqnh l;
    public apxu m;
    public apxu n;
    public aqnl o;
    public String p;
    public arml q;
    public apxu r;
    private byte t = (byte) 2;

    private aqoj() {
        String str = "";
        this.d = str;
        this.e = str;
        anxl.emptyProtobufList();
        this.p = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.t);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.t = b;
                return null;
            case 2:
                return anxl.newMessageInfo(s, "\u0001\u0011\u0000\u0001\u0001\u0018\u0011\u0000\u0000\u000b\u0001\u0002\u0000\u0002Љ\u0004\u0003Љ\u0005\u0004Љ\b\u0007Љ\u000b\tЉ\u0006\fЉ\u000e\rЉ\u000f\u0010\b\u0002\u0011\u0002\u0001\u0012Љ\u0007\u0013Љ\n\u0014\t\u0012\u0015\b\u0013\u0016Љ\u0014\u0017\b\u0003\u0018Љ\u0015", new Object[]{"a", "b", "f", "g", "j", "l", "h", "m", "n", "d", "c", "i", "k", "o", "p", "q", "e", "r"});
            case 3:
                return new aqoj();
            case 4:
                return new aqoi();
            case 5:
                return s;
            case 6:
                Object obj3 = u;
                if (obj3 == null) {
                    synchronized (aqoj.class) {
                        obj3 = u;
                        if (obj3 == null) {
                            obj3 = new anxn(s);
                            u = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aqoj aqoj = new aqoj();
        s = aqoj;
        anxl.registerDefaultInstance(aqoj.class, aqoj);
    }
}
