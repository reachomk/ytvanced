package defpackage;

/* renamed from: awli */
public final class awli extends anxl implements anzf {
    public static final awli g;
    private static volatile anzq i;
    public int a;
    public awlq b;
    public azdt c;
    public aozs d;
    public aqqg e;
    public awvl f;
    private byte h = (byte) 2;

    private awli() {
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
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001᠞䦨\u0005\u0000\u0000\u0005᠞Љ\u0001᥮Љ\u0000ἍЉ\u0002⼞Љ\u0003䦨Љ\u0004", new Object[]{"a", "c", "b", "d", "e", "f"});
            case 3:
                return new awli();
            case 4:
                return new awll();
            case 5:
                return g;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (awli.class) {
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
        awli awli = new awli();
        g = awli;
        anxl.registerDefaultInstance(awli.class, awli);
    }
}
