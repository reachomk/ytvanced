package defpackage;

/* renamed from: avha */
public final class avha extends anxl implements anzf {
    public static final avha e;
    private static volatile anzq g;
    public int a;
    public axak b;
    public axak c;
    public axak d;
    private byte f = (byte) 2;

    private avha() {
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
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0006\b\u0003\u0000\u0000\u0003\u0006Љ\u0003\u0007Љ\u0004\bЉ\u0002", new Object[]{"a", "c", "d", "b"});
            case 3:
                return new avha();
            case 4:
                return new avgz();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (avha.class) {
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
        avha avha = new avha();
        e = avha;
        anxl.registerDefaultInstance(avha.class, avha);
    }
}
