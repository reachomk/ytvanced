package defpackage;

/* renamed from: arye */
public final class arye extends anxl implements anzf {
    public static final arye u;
    private static volatile anzq w;
    public int a;
    public arml b;
    public arml c;
    public arml d;
    public aygk e;
    public apxu f;
    public atzt g;
    public aphr h;
    public auvr i;
    public arml j;
    public arml k;
    public arml l;
    public aryk m;
    public axak n;
    public axak o;
    public anyd p = anxl.emptyProtobufList();
    public arya q;
    public aryc r;
    public axak s;
    public arml t;
    private byte v = (byte) 2;

    private arye() {
        anxl.emptyProtobufList();
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
                return anxl.newMessageInfo(u, "\u0001\u0013\u0000\u0001\u0001\u0018\u0013\u0000\u0001\u0013\u0001Љ\u0000\u0002Љ\u0002\u0004Љ\u0003\u0005Љ\u0004\u0006Љ\u0006\u0007Љ\u0007\bЉ\b\u000bЉ\u000b\fЉ\f\rЉ\u000e\u000fЉ\u0001\u0010Л\u0011Љ\u0011\u0013Љ\u0012\u0014Љ\r\u0015Љ\u0013\u0016Љ\u0010\u0017Љ\u000f\u0018Љ\u0014", new Object[]{"a", "b", "d", "e", "f", "g", "h", "i", "j", "k", "m", "c", "p", apdh.class, "q", "r", "l", "s", "o", "n", "t"});
            case 3:
                return new arye();
            case 4:
                return new aryd();
            case 5:
                return u;
            case 6:
                Object obj3 = w;
                if (obj3 == null) {
                    synchronized (arye.class) {
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
        arye arye = new arye();
        u = arye;
        anxl.registerDefaultInstance(arye.class, arye);
    }
}
