package defpackage;

/* renamed from: aqih */
public final class aqih extends anxl implements anzf {
    public static final aqih e;
    private static volatile anzq g;
    public int a;
    public aqij b;
    public aqif c;
    public aqil d;
    private byte f = (byte) 2;

    private aqih() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.f = b;
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001⮼⮿\u0003\u0000\u0000\u0003⮼Љ\u0002︣⮼Љ\u0001⮿Љ\u0000", new Object[]{"a", "d", "c", "b"});
            case 3:
                return new aqih();
            case 4:
                return new aqig();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (aqih.class) {
                        obj3 = g;
                        if (obj3 == null) {
                            obj3 = new anxn(e);
                            g = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aqih aqih = new aqih();
        e = aqih;
        anxl.registerDefaultInstance(aqih.class, aqih);
    }
}
