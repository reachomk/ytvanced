package defpackage;

/* renamed from: ardq */
public final class ardq extends anxl implements anzf {
    public static final ardq d;
    private static volatile anzq f;
    public int a;
    public ardu b;
    public ards c;
    private byte e = (byte) 2;

    private ardq() {
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
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001ᜈᜈ\u0002\u0000\u0000\u0002ᜈЉ\u0001ᜈЉ\u0000", new Object[]{"a", "c", "b"});
            case 3:
                return new ardq();
            case 4:
                return new ardp();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (ardq.class) {
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
        ardq ardq = new ardq();
        d = ardq;
        anxl.registerDefaultInstance(ardq.class, ardq);
    }
}
