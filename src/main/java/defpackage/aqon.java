package defpackage;

/* renamed from: aqon */
public final class aqon extends anxl implements anzf {
    public static final aqon o;
    private static volatile anzq q;
    public int a;
    public arml b;
    public auvr c;
    public aqnj d;
    public aqnp e;
    public arml f;
    public arml g;
    public aqnb h;
    public aqnh i;
    public apxu j;
    public apxu k;
    public arml l;
    public arml m;
    public apxu n;
    private byte p = (byte) 2;

    private aqon() {
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.p);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.p = b;
                return null;
            case 2:
                return anxl.newMessageInfo(o, "\u0001\r\u0000\u0001\u0002\u001a\r\u0000\u0000\r\u0002Љ\u0004\u0005Љ\t\u0006Љ\n\bЉ\r\tЉ\u0006\fЉ\u0010\rЉ\u0011\u000fЉ\u0013\u0010Љ\u000b\u0013Љ\u0007\u0014Љ\f\u0018Љ\u0016\u001aЉ\u0017", new Object[]{"a", "b", "e", "f", "i", "c", "j", "k", "l", "g", "d", "h", "m", "n"});
            case 3:
                return new aqon();
            case 4:
                return new aqom();
            case 5:
                return o;
            case 6:
                Object obj3 = q;
                if (obj3 == null) {
                    synchronized (aqon.class) {
                        obj3 = q;
                        if (obj3 == null) {
                            obj3 = new anxn(o);
                            q = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aqon aqon = new aqon();
        o = aqon;
        anxl.registerDefaultInstance(aqon.class, aqon);
    }
}
