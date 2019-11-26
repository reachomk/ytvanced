package defpackage;

/* renamed from: aufj */
public final class aufj extends anxl implements anzf {
    public static final aufj t;
    private static volatile anzq v;
    public int a;
    public String b;
    public apxu c;
    public long d;
    public aygk e;
    public arml f;
    public int g;
    public int h;
    public int i;
    public arml j;
    public anyd k;
    public String l;
    public arml m;
    public arml n;
    public aygk o;
    public int p;
    public int q;
    public arml r;
    public arml s;
    private byte u = (byte) 2;

    private aufj() {
        String str = "";
        this.b = str;
        anxl.emptyProtobufList();
        this.k = anxl.emptyProtobufList();
        this.l = str;
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
                return anxl.newMessageInfo(t, "\u0001\u0012\u0000\u0001\u0001\u0017\u0012\u0000\u0001\n\u0001\b\u0000\u0002Љ\u0001\u0004\u0003\u0003\u0006Љ\u0004\u0007Љ\u0005\b\b\u000b\tЉ\f\u000bЉ\u000f\fЛ\rЉ\r\u000eЉ\u0012\u000fЉ\u0013\u0011\u000b\t\u0012Љ\n\u0013\u0004\u0010\u0014\u0004\u0011\u0016\u000b\u0007\u0017\u000b\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "l", "m", "o", "k", auce.class, "n", "r", "s", "i", "j", "p", "q", "h", "g"});
            case 3:
                return new aufj();
            case 4:
                return new aufi();
            case 5:
                return t;
            case 6:
                Object obj3 = v;
                if (obj3 == null) {
                    synchronized (aufj.class) {
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
        aufj aufj = new aufj();
        t = aufj;
        anxl.registerDefaultInstance(aufj.class, aufj);
    }
}
