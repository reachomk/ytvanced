package defpackage;

/* renamed from: auuu */
public final class auuu extends anxl implements anzf {
    public static final auuu g;
    private static volatile anzq i;
    public int a;
    public arml b;
    public arwf c;
    public anyd d = anxl.emptyProtobufList();
    public aphj e;
    public anvu f = anvu.a;
    private byte h = (byte) 2;

    private auuu() {
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
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\b\u0005\u0000\u0001\u0003\u0001Љ\u0000\u0002\t\u0001\u0005Л\u0006Љ\u0004\b\n\u0007", new Object[]{"a", "b", "c", "d", arml.class, "e", "f"});
            case 3:
                return new auuu();
            case 4:
                return new auut();
            case 5:
                return g;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (auuu.class) {
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
        auuu auuu = new auuu();
        g = auuu;
        anxl.registerDefaultInstance(auuu.class, auuu);
    }
}
