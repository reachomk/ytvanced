package defpackage;

/* renamed from: apdr */
public final class apdr extends anxl implements anzf {
    public static final apdr f;
    private static volatile anzq h;
    public int a;
    public apdp b;
    public arml c;
    public apxu d;
    public apxu e;
    private byte g = (byte) 2;

    private apdr() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.g = b;
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0003\b\u0004\u0000\u0000\u0004\u0003Љ\u0002\u0004Љ\u0003\u0007Љ\u0004\bЉ\u0005", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new apdr();
            case 4:
                return new apdq();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (apdr.class) {
                        obj3 = h;
                        if (obj3 == null) {
                            obj3 = new anxn(f);
                            h = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        apdr apdr = new apdr();
        f = apdr;
        anxl.registerDefaultInstance(apdr.class, apdr);
    }
}
