package defpackage;

/* renamed from: apir */
public final class apir extends anxl implements anzf {
    public static final apir e;
    private static volatile anzq g;
    public int a;
    public boolean b;
    public ayya c;
    public aoqr d;
    private byte f = (byte) 2;

    private apir() {
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
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0001\u0002\u0007\u0001\u0003\t\u0002\u0004Љ\u0003", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new apir();
            case 4:
                return new apiq();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (apir.class) {
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
        apir apir = new apir();
        e = apir;
        anxl.registerDefaultInstance(apir.class, apir);
    }
}
