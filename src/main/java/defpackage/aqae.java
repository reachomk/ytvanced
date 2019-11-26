package defpackage;

/* renamed from: aqae */
public final class aqae extends anxl implements anzf {
    public static final aqae c;
    private static volatile anzq e;
    public int a;
    public apzy b;
    private byte d = (byte) 2;

    private aqae() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.d);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.d = b;
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001ᶳᶳ\u0001\u0000\u0000\u0001ᶳЉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new aqae();
            case 4:
                return new aqah();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (aqae.class) {
                        obj3 = e;
                        if (obj3 == null) {
                            obj3 = new anxn(c);
                            e = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aqae aqae = new aqae();
        c = aqae;
        anxl.registerDefaultInstance(aqae.class, aqae);
    }
}
