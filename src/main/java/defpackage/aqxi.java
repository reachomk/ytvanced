package defpackage;

/* renamed from: aqxi */
public final class aqxi extends anxl implements anzf {
    public static final aqxi i;
    private static volatile anzq k;
    public int a;
    public aygk b;
    public arml c;
    public arml d;
    public aqxg e;
    public axak f;
    public axak g;
    public anvu h = anvu.a;
    private byte j = (byte) 2;

    private aqxi() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.j = b;
                return null;
            case 2:
                return anxl.newMessageInfo(i, "\u0001\u0007\u0000\u0001\u0001\n\u0007\u0000\u0000\u0006\u0001Љ\u0001\u0002Љ\u0002\u0003Љ\u0004\u0005\n\u0007\bЉ\u0003\tЉ\u0005\nЉ\u0000", new Object[]{"a", "c", "d", "f", "h", "e", "g", "b"});
            case 3:
                return new aqxi();
            case 4:
                return new aqxh();
            case 5:
                return i;
            case 6:
                Object obj3 = k;
                if (obj3 == null) {
                    synchronized (aqxi.class) {
                        obj3 = k;
                        if (obj3 == null) {
                            obj3 = new anxn(i);
                            k = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aqxi aqxi = new aqxi();
        i = aqxi;
        anxl.registerDefaultInstance(aqxi.class, aqxi);
    }
}
