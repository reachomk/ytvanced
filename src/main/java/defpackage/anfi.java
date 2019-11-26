package defpackage;

/* renamed from: anfi */
public final class anfi extends anxl implements anzf {
    public static final int ALLOW_CASTING_FIELD_NUMBER = 1;
    public static final int ALLOW_SCREENSHOT_FIELD_NUMBER = 3;
    public static final int ALLOW_SCREEN_RECORD_FIELD_NUMBER = 2;
    public static final anfi DEFAULT_INSTANCE;
    public static volatile anzq PARSER;
    public boolean allowCasting_;
    public boolean allowScreenRecord_;
    public boolean allowScreenshot_;
    public int bitField0_;

    static {
        anfi anfi = new anfi();
        DEFAULT_INSTANCE = anfi;
        anxl.registerDefaultInstance(anfi.class, anfi);
    }

    private anfi() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0007\u0000\u0002\u0007\u0001\u0003\u0007\u0002", new Object[]{"bitField0_", "allowCasting_", "allowScreenRecord_", "allowScreenshot_"});
            case 3:
                return new anfi();
            case 4:
                return new anfh();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Object obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (anfi.class) {
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
