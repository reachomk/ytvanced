package defpackage;

/* renamed from: arcu */
public final class arcu extends anxl implements anzf {
    public static final arcu e;
    private static volatile anzq g;
    public int a;
    public apxu b;
    public axak c;
    public axak d;
    private byte f = (byte) 2;

    private arcu() {
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
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0005\u0007\u0003\u0000\u0000\u0003\u0005Љ\u0002\u0006Љ\u0003\u0007Љ\u0001", new Object[]{"a", "c", "d", "b"});
            case 3:
                return new arcu();
            case 4:
                return new arct();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (arcu.class) {
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
        arcu arcu = new arcu();
        e = arcu;
        anxl.registerDefaultInstance(arcu.class, arcu);
    }
}
