package defpackage;

/* renamed from: anfa */
public final class anfa extends anxl implements anzf {
    public static final int ADDITIONAL_AHARDWAREBUFFER_USAGE_FIELD_NUMBER = 6;
    public static final int BACK_RGB16_WITH_BGR16_FIELD_NUMBER = 7;
    public static final int BLACK_BOOST_FIELD_NUMBER = 3;
    public static final int COMPOSITOR_DRAWS_FLANGE_FIELD_NUMBER = 8;
    public static final anfa DEFAULT_INSTANCE;
    public static final int DISPLAY_LATENCY_MICROS_FIELD_NUMBER = 2;
    public static final int FLAGS_FIELD_NUMBER = 1;
    public static volatile anzq PARSER = null;
    public static final int SCANOUT_OFFSET_MICROS_FIELD_NUMBER = 9;
    public static final int SCHEDULING_SLACK_MICROS_FIELD_NUMBER = 10;
    public static final int STRIPS_PER_FRAME_FIELD_NUMBER = 5;
    public static final int VSYNC_GRACE_PERIOD_MICROS_FIELD_NUMBER = 4;
    public long additionalAhardwarebufferUsage_;
    public boolean backRgb16WithBgr16_;
    public int bitField0_;
    public long blackBoost_;
    public boolean compositorDrawsFlange_;
    public long displayLatencyMicros_;
    public long flags_;
    public long scanoutOffsetMicros_;
    public long schedulingSlackMicros_;
    public long stripsPerFrame_;
    public long vsyncGracePeriodMicros_;

    static {
        anfa anfa = new anfa();
        DEFAULT_INSTANCE = anfa;
        anxl.registerDefaultInstance(anfa.class, anfa);
    }

    private anfa() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(DEFAULT_INSTANCE, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001\u0002\u0000\u0002\u0002\u0001\u0003\u0002\u0002\u0004\u0002\u0003\u0005\u0002\u0004\u0006\u0002\u0005\u0007\u0007\u0006\b\u0007\u0007\t\u0002\b\n\u0002\t", new Object[]{"bitField0_", "flags_", "displayLatencyMicros_", "blackBoost_", "vsyncGracePeriodMicros_", "stripsPerFrame_", "additionalAhardwarebufferUsage_", "backRgb16WithBgr16_", "compositorDrawsFlange_", "scanoutOffsetMicros_", "schedulingSlackMicros_"});
            case 3:
                return new anfa();
            case 4:
                return new anez();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Object obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (anfa.class) {
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
