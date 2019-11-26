package defpackage;

/* renamed from: aufw */
public final class aufw extends anxl implements anzf {
    public static final aufw g;
    private static volatile anzq i;
    public int a;
    public awzv b;
    public ayhc c;
    public atuj d;
    public auga e;
    public awgm f;
    private byte h = (byte) 2;

    private aufw() {
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
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001᳗䚮\u0005\u0000\u0000\u0001᳗Љ\u0000↊\t\u0001┤\t\u0002䔴\t\u0003䚮\t\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
            case 3:
                return new aufw();
            case 4:
                return new aufz();
            case 5:
                return g;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (aufw.class) {
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
        aufw aufw = new aufw();
        g = aufw;
        anxl.registerDefaultInstance(aufw.class, aufw);
    }
}
