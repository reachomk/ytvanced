package defpackage;

/* renamed from: aqoh */
public final class aqoh extends anxl implements anzf {
    public static final aqoh e;
    private static volatile anzq g;
    public int a;
    public atuj b;
    public avkc c;
    public ayhc d;
    private byte f = (byte) 2;

    private aqoh() {
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
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001ᣑ┤\u0003\u0000\u0000\u0001ᣑЉ\u0001↊\t\u0002┤\t\u0000", new Object[]{"a", "c", "d", "b"});
            case 3:
                return new aqoh();
            case 4:
                return new aqog();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (aqoh.class) {
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
        aqoh aqoh = new aqoh();
        e = aqoh;
        anxl.registerDefaultInstance(aqoh.class, aqoh);
    }
}
