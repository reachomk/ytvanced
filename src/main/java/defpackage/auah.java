package defpackage;

/* renamed from: auah */
public final class auah extends anxl implements anzf {
    public static final auah g;
    private static volatile anzq i;
    public int a;
    public arml b;
    public apxu c;
    public arml d;
    public apxu e;
    public anvu f = anvu.a;
    private byte h = (byte) 2;

    private auah() {
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
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0004\u0001Љ\u0000\u0002Љ\u0002\u0003Љ\u0003\u0005\n\u0005\u0007Љ\u0001", new Object[]{"a", "b", "d", "e", "f", "c"});
            case 3:
                return new auah();
            case 4:
                return new auak();
            case 5:
                return g;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (auah.class) {
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
        auah auah = new auah();
        g = auah;
        anxl.registerDefaultInstance(auah.class, auah);
    }
}
