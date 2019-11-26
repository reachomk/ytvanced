package defpackage;

/* renamed from: avac */
public final class avac extends anxl implements anzf {
    public static final avac u;
    private static volatile anzq w;
    public int a;
    public aygk b;
    public avaa c;
    public axak d;
    public auzy e;
    public auzw f;
    public auzw g;
    public auzs h;
    public auzo i;
    public auzu j;
    public axak k;
    public axak l;
    public auzq m;
    public axak n;
    public axak o;
    public axak p;
    public axak q;
    public axak r;
    public boolean s;
    public axak t;
    private byte v = (byte) 2;

    private avac() {
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
                return anxl.newMessageInfo(u, "\u0001\u0013\u0000\u0001\u0001\u0014\u0013\u0000\u0000\u0012\u0001Љ\u0000\u0002Љ\u0001\u0003Љ\u0003\u0004Љ\u0004\u0005Љ\u0005\u0006Љ\u0006\u0007Љ\u0007\bЉ\b\tЉ\u000b\nЉ\f\fЉ\u000e\rЉ\u000f\u000eЉ\r\u000fЉ\u0010\u0010Љ\u0002\u0011Љ\t\u0012Љ\n\u0013\u0007\u0011\u0014Љ\u0012", new Object[]{"a", "b", "c", "e", "f", "g", "h", "i", "j", "m", "n", "p", "q", "o", "r", "d", "k", "l", "s", "t"});
            case 3:
                return new avac();
            case 4:
                return new avaf();
            case 5:
                return u;
            case 6:
                Object obj3 = w;
                if (obj3 == null) {
                    synchronized (avac.class) {
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
        avac avac = new avac();
        u = avac;
        anxl.registerDefaultInstance(avac.class, avac);
    }
}
