package defpackage;

/* renamed from: anex */
public final class anex extends anxl implements anzf {
    public static final int ALLOW_DYNAMIC_JAVA_LIBRARY_LOADING_FIELD_NUMBER = 11;
    public static final int ALLOW_DYNAMIC_LIBRARY_LOADING_FIELD_NUMBER = 4;
    public static final int ALLOW_HIGH_PRIORITY_APP_RENDER_THREAD_FIELD_NUMBER = 22;
    public static final int ALLOW_PASSTHROUGH_FIELD_NUMBER = 21;
    public static final int ALLOW_VRCORE_COMPOSITING_FIELD_NUMBER = 14;
    public static final int ALLOW_VRCORE_HEAD_TRACKING_FIELD_NUMBER = 13;
    public static final int ASYNC_REPROJECTION_CONFIG_FIELD_NUMBER = 7;
    public static final int CPU_LATE_LATCHING_ENABLED_FIELD_NUMBER = 5;
    public static final int DAYDREAM_IMAGE_ALIGNMENT_ENABLED_FIELD_NUMBER = 1;
    public static final int DAYDREAM_IMAGE_ALIGNMENT_FIELD_NUMBER = 6;
    public static final anex DEFAULT_INSTANCE;
    public static final int DIM_UI_LAYER_FIELD_NUMBER = 19;
    public static final int DISALLOW_MULTIVIEW_FIELD_NUMBER = 18;
    public static final int ENABLE_FORCED_TRACKING_COMPAT_FIELD_NUMBER = 16;
    public static volatile anzq PARSER = null;
    public static final int PERFORMANCE_OVERLAY_INFO_FIELD_NUMBER = 15;
    public static final int SCREEN_CAPTURE_CONFIG_FIELD_NUMBER = 17;
    public static final int TOUCH_OVERLAY_ENABLED_FIELD_NUMBER = 12;
    public static final int USE_DEVICE_IDLE_DETECTION_FIELD_NUMBER = 9;
    public static final int USE_DIRECT_MODE_SENSORS_FIELD_NUMBER = 20;
    public static final int USE_MAGNETOMETER_IN_SENSOR_FUSION_FIELD_NUMBER = 3;
    public static final int USE_ONLINE_MAGNETOMETER_CALIBRATION_FIELD_NUMBER = 8;
    public static final int USE_STATIONARY_BIAS_CORRECTION_FIELD_NUMBER = 10;
    public static final int USE_SYSTEM_CLOCK_FOR_SENSOR_TIMESTAMPS_FIELD_NUMBER = 2;
    public boolean allowDynamicJavaLibraryLoading_;
    public boolean allowDynamicLibraryLoading_;
    public boolean allowHighPriorityAppRenderThread_;
    public boolean allowPassthrough_;
    public boolean allowVrcoreCompositing_;
    public boolean allowVrcoreHeadTracking_;
    public anfa asyncReprojectionConfig_;
    public int bitField0_;
    public boolean cpuLateLatchingEnabled_;
    public boolean daydreamImageAlignmentEnabled_;
    public int daydreamImageAlignment_;
    public boolean dimUiLayer_;
    public boolean disallowMultiview_;
    public boolean enableForcedTrackingCompat_;
    public anfg performanceOverlayInfo_;
    public anfi screenCaptureConfig_;
    public boolean touchOverlayEnabled_;
    public boolean useDeviceIdleDetection_;
    public boolean useDirectModeSensors_;
    public boolean useMagnetometerInSensorFusion_;
    public boolean useOnlineMagnetometerCalibration_;
    public boolean useStationaryBiasCorrection_;
    public boolean useSystemClockForSensorTimestamps_;

    static {
        anex anex = new anex();
        DEFAULT_INSTANCE = anex;
        anxl.registerDefaultInstance(anex.class, anex);
    }

    private anex() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0016\u0000\u0001\u0001\u0016\u0016\u0000\u0000\u0000\u0001\u0007\u0000\u0002\u0007\u0001\u0003\u0007\u0002\u0004\u0007\u0003\u0005\u0007\u0004\u0006\f\u0005\u0007\t\u0006\b\u0007\u0007\t\u0007\b\n\u0007\t\u000b\u0007\n\f\u0007\u000b\r\u0007\f\u000e\u0007\r\u000f\t\u000e\u0010\u0007\u000f\u0011\t\u0010\u0012\u0007\u0011\u0013\u0007\u0012\u0014\u0007\u0013\u0015\u0007\u0014\u0016\u0007\u0015", new Object[]{"bitField0_", "daydreamImageAlignmentEnabled_", "useSystemClockForSensorTimestamps_", "useMagnetometerInSensorFusion_", "allowDynamicLibraryLoading_", "cpuLateLatchingEnabled_", "daydreamImageAlignment_", anfb.a(), "asyncReprojectionConfig_", "useOnlineMagnetometerCalibration_", "useDeviceIdleDetection_", "useStationaryBiasCorrection_", "allowDynamicJavaLibraryLoading_", "touchOverlayEnabled_", "allowVrcoreHeadTracking_", "allowVrcoreCompositing_", "performanceOverlayInfo_", "enableForcedTrackingCompat_", "screenCaptureConfig_", "disallowMultiview_", "dimUiLayer_", "useDirectModeSensors_", "allowPassthrough_", "allowHighPriorityAppRenderThread_"});
            case 3:
                return new anex();
            case 4:
                return new anfc();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Object obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (anex.class) {
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
