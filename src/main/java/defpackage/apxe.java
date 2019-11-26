package defpackage;

/* renamed from: apxe */
public final class apxe extends anxl implements anzf {
    public static final apxe e;
    private static volatile anzq g;
    public int a;
    public axak b;
    public axak c;
    public axak d;
    private byte f = (byte) 2;

    private apxe() {
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
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0004\u0006\u0003\u0000\u0000\u0003\u0004Љ\u0001\u0005Љ\u0002\u0006Љ\u0003", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new apxe();
            case 4:
                return new apxd();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (apxe.class) {
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
        apxe apxe = new apxe();
        e = apxe;
        anxl.registerDefaultInstance(apxe.class, apxe);
    }
}
