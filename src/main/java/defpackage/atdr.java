package defpackage;

/* renamed from: atdr */
public final class atdr extends anxl implements anzf {
    public static final atdr c;
    private static volatile anzq d;
    public int a = 0;
    public Object b;

    private atdr() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0001\u0000ﶞ㑃ﶞ㑃\u0001\u0000\u0000\u0000ﶞ㑃<\u0000", new Object[]{"b", "a", awaf.class});
            case 3:
                return new atdr();
            case 4:
                return new atdu();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (atdr.class) {
                        obj3 = d;
                        if (obj3 == null) {
                            obj3 = new anxn(c);
                            d = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        atdr atdr = new atdr();
        c = atdr;
        anxl.registerDefaultInstance(atdr.class, atdr);
    }
}
