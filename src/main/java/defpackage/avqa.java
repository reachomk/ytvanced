package defpackage;

/* renamed from: avqa */
public final class avqa extends anxl implements anzf {
    public static final avqa c;
    private static volatile anzq e;
    public int a = 0;
    public Object b;
    private byte d = (byte) 2;

    private avqa() {
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
                return anxl.newMessageInfo(c, "\u0001\u0003\u0001\u0000ﱃ᥯⨅\u0003\u0000\u0000\u0003ﱃ᥯м\u0000Ẑм\u0000⨅м\u0000", new Object[]{"b", "a", aqwx.class, aqhy.class, ayvi.class});
            case 3:
                return new avqa();
            case 4:
                return new avpz();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (avqa.class) {
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
        avqa avqa = new avqa();
        c = avqa;
        anxl.registerDefaultInstance(avqa.class, avqa);
    }
}
