package defpackage;

/* renamed from: anfg */
public final class anfg extends anxl implements anzf {
    public static final anfg DEFAULT_INSTANCE;
    public static volatile anzq PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    public int bitField0_;
    public String version_ = "";

    static {
        anfg anfg = new anfg();
        DEFAULT_INSTANCE = anfg;
        anxl.registerDefaultInstance(anfg.class, anfg);
    }

    private anfg() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\b\u0000", new Object[]{"bitField0_", "version_"});
            case 3:
                return new anfg();
            case 4:
                return new anff();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Object obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (anfg.class) {
                        obj3 = PARSER;
                        if (obj3 == null) {
                            obj3 = new anxn(DEFAULT_INSTANCE);
                            PARSER = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
