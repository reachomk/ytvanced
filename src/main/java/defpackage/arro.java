package defpackage;

/* renamed from: arro */
public final class arro extends anxl implements anzf {
    public static final arro d;
    private static volatile anzq f;
    public int a;
    public aysl b;
    public ayxf c;
    private byte e = (byte) 2;

    private arro() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.e = b;
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001︿Ḗ㔱\u0002\u0000\u0000\u0002︿ḖЉ\u0001㔱Љ\u0002", new Object[]{"a", "b", "c"});
            case 3:
                return new arro();
            case 4:
                return new arrn();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (arro.class) {
                        obj3 = f;
                        if (obj3 == null) {
                            obj3 = new anxn(d);
                            f = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        arro arro = new arro();
        d = arro;
        anxl.registerDefaultInstance(arro.class, arro);
    }
}
