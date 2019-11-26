package defpackage;

/* renamed from: aowr */
public final class aowr extends anxl implements anzf {
    public static final aowr w;
    private static volatile anzq y;
    public int a;
    public arml b;
    public axak c;
    public arml d;
    public axak e;
    public aygk f;
    public axak g;
    public float h;
    public int i;
    public arml j;
    public apxu k;
    public apxu l;
    public axak m;
    public axak n;
    public auvr o;
    public anyd p = anxl.emptyProtobufList();
    public apxu q;
    public int r;
    public aqlj s;
    public int t;
    public anvu u = anvu.a;
    public axak v;
    private byte x = (byte) 2;

    private aowr() {
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
                return anxl.newMessageInfo(w, "\u0001\u0015\u0000\u0001\u0001\u0017\u0015\u0000\u0001\u000f\u0001Љ\u0000\u0002Љ\u0002\u0003Љ\u0004\u0004\u0001\u0006\u0005Љ\b\u0006Љ\t\u0007Љ\r\t\n\u0013\u000bЛ\fЉ\u0014\r\f\u000f\u000eЉ\u0001\u000fЉ\u0003\u0010Љ\u0005\u0011\t\u0010\u0012\u000b\u0011\u0013Љ\u000b\u0014\f\u0007\u0015Љ\f\u0016Љ\u000e\u0017Љ\n", new Object[]{"a", "b", "d", "f", "h", "j", "k", "o", "u", "p", apxu.class, "v", "r", aqhd.a, "c", "e", "g", "s", "t", "m", "i", awul.a, "n", "q", "l"});
            case 3:
                return new aowr();
            case 4:
                return new aowt();
            case 5:
                return w;
            case 6:
                Object obj3 = y;
                if (obj3 == null) {
                    synchronized (aowr.class) {
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
        aowr aowr = new aowr();
        w = aowr;
        anxl.registerDefaultInstance(aowr.class, aowr);
    }
}
