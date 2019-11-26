package defpackage;

/* renamed from: auev */
public final class auev extends anxl implements anzf {
    public static final auev g;
    private static volatile anzq i;
    public int a;
    public long b;
    public long c;
    public long d;
    public auet e;
    public arml f;
    private byte h = (byte) 2;

    private auev() {
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
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0002\u0001\u0002\u0000\u0002\u0002\u0001\u0005Љ\u0005\u0006\u0002\u0004\u0007Љ\u0006", new Object[]{"a", "b", "c", "e", "d", "f"});
            case 3:
                return new auev();
            case 4:
                return new auey();
            case 5:
                return g;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (auev.class) {
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
        auev auev = new auev();
        g = auev;
        anxl.registerDefaultInstance(auev.class, auev);
    }
}
