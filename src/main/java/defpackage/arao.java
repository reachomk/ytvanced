package defpackage;

/* renamed from: arao */
public final class arao extends anxl implements anzf {
    public static final arao g;
    private static volatile anzq i;
    public int a;
    public arml b;
    public arml c;
    public arml d;
    public arml e;
    public apxu f;
    private byte h = (byte) 2;

    private arao() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.h = b;
                return null;
            case 2:
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0002\b\u0005\u0000\u0000\u0005\u0002Љ\u0004\u0005Љ\u0002\u0006Љ\u0003\u0007Љ\u0001\bЉ\u0000", new Object[]{"a", "f", "d", "e", "c", "b"});
            case 3:
                return new arao();
            case 4:
                return new aran();
            case 5:
                return g;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (arao.class) {
                        obj3 = i;
                        if (obj3 == null) {
                            obj3 = new anxn(g);
                            i = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        arao arao = new arao();
        g = arao;
        anxl.registerDefaultInstance(arao.class, arao);
    }
}
