package defpackage;

/* renamed from: aufl */
public final class aufl extends anxl implements anzf {
    public static final aufl g;
    private static volatile anzq i;
    public int a;
    public String b = "";
    public anyd c = anxl.emptyProtobufList();
    public axak d;
    public anvu e = anvu.a;
    public arml f;
    private byte h = (byte) 2;

    private aufl() {
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
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0003\u0001\b\u0000\u0002Л\u0003Љ\u0001\u0005\n\u0003\u0006Љ\u0004", new Object[]{"a", "b", "c", axak.class, "d", "e", "f"});
            case 3:
                return new aufl();
            case 4:
                return new aufn();
            case 5:
                return g;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (aufl.class) {
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
        aufl aufl = new aufl();
        g = aufl;
        anxl.registerDefaultInstance(aufl.class, aufl);
    }
}
