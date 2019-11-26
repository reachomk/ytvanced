package defpackage;

/* renamed from: azqp */
public final class azqp extends anxl implements anzf {
    public static final azqp h;
    private static volatile anzq j;
    public int a;
    public azqf b;
    public azqj c;
    public azqb d;
    public anyd e = anxl.emptyProtobufList();
    public boolean f;
    public long g;
    private byte i = (byte) 2;

    private azqp() {
    }

    public final void a() {
        if (!this.e.a()) {
            this.e = anxl.mutableCopy(this.e);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.i = b;
                return null;
            case 2:
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001Љ\u0000\u0002\t\u0001\u0003\t\u0002\u0004\u001b\u0005\u0007\u0003\u0006\u0002\u0004", new Object[]{"a", "b", "c", "d", "e", azqr.class, "f", "g"});
            case 3:
                return new azqp();
            case 4:
                return new azqo();
            case 5:
                return h;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (azqp.class) {
                        obj3 = j;
                        if (obj3 == null) {
                            obj3 = new anxn(h);
                            j = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        azqp azqp = new azqp();
        h = azqp;
        anxl.registerDefaultInstance(azqp.class, azqp);
    }
}
