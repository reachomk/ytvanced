package defpackage;

/* renamed from: aqby */
public final class aqby extends anxl implements anzf {
    public static final aqby o;
    private static volatile anzq q;
    public int a;
    public aqae b;
    public axak c;
    public axak d;
    public axak e;
    public axak f;
    public aqbi g;
    public aqaw h;
    public arml i;
    public arml j;
    public arml k;
    public aqcb l;
    public aqbc m;
    public arml n;
    private byte p = (byte) 2;

    private aqby() {
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
                return anxl.newMessageInfo(o, "\u0001\r\u0000\u0001\u0001\u0015\r\u0000\u0000\r\u0001Љ\u0000\u0002Љ\u0005\u0003Љ\u0007\u0004Љ\b\bЉ\f\u000bЉ\u000f\fЉ\u0006\u000fЉ\u0012\u0010Љ\u0002\u0011Љ\u0001\u0013Љ\u0004\u0014Љ\u0014\u0015Љ\u0003", new Object[]{"a", "b", "g", "i", "j", "k", "l", "h", "m", "d", "c", "f", "n", "e"});
            case 3:
                return new aqby();
            case 4:
                return new aqbx();
            case 5:
                return o;
            case 6:
                Object obj3 = q;
                if (obj3 == null) {
                    synchronized (aqby.class) {
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
        aqby aqby = new aqby();
        o = aqby;
        anxl.registerDefaultInstance(aqby.class, aqby);
    }
}
