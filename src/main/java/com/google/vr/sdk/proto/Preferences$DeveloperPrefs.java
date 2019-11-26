package com.google.vr.sdk.proto;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxo;
import defpackage.anxu;
import defpackage.anxv;
import defpackage.anxx;
import defpackage.anxy;
import defpackage.anzf;
import defpackage.anzq;

public final class Preferences$DeveloperPrefs extends anxl implements anzf {
    public static final int ALLOW_AR_SESSION_UPDATE_FIELD_NUMBER = 17;
    public static final int CAPTURE_ENABLED_FIELD_NUMBER = 9;
    public static final Preferences$DeveloperPrefs DEFAULT_INSTANCE;
    public static final int DEPRECATED_GVR_PLATFORM_LIBRARY_ENABLED_FIELD_NUMBER = 7;
    public static final int DEPRECATED_HEAD_TRACKING_SERVICE_ENABLED_FIELD_NUMBER = 8;
    public static final int DEPRECATED_MOTOPHO_PATCH_ENABLED_FIELD_NUMBER = 3;
    public static final int DEVELOPER_LOGGING_ENABLED_FIELD_NUMBER = 4;
    public static final int FORCE_UNDISTORTED_RENDERING_FIELD_NUMBER = 5;
    public static final int FRAME_TRACKER_ENABLED_FIELD_NUMBER = 11;
    public static final int MOTOPHO_PATCH_MODE_FIELD_NUMBER = 12;
    public static final int OPENGL_KHR_DEBUG_ENABLED_FIELD_NUMBER = 14;
    public static volatile anzq PARSER = null;
    public static final int PERFORMANCE_HUD_ENABLED_FIELD_NUMBER = 6;
    public static final int PERFORMANCE_LOGGING_ACTIVATED_FIELD_NUMBER = 13;
    public static final int PERFORMANCE_MONITORING_ENABLED_FIELD_NUMBER = 1;
    public static final int PLAY_AREA_SETTINGS_FIELD_NUMBER = 16;
    public static final int SAFETY_CYLINDER_PARAMS_FIELD_NUMBER = 10;
    public static final int SENSOR_LOGGING_ENABLED_FIELD_NUMBER = 2;
    public static final int TRACKING_CONFIGURATION_PARAMS_FIELD_NUMBER = 15;
    public boolean allowArSessionUpdate_;
    public int bitField0_;
    public boolean captureEnabled_;
    public boolean dEPRECATEDGvrPlatformLibraryEnabled_;
    public boolean dEPRECATEDHeadTrackingServiceEnabled_;
    public boolean dEPRECATEDMotophoPatchEnabled_;
    public boolean developerLoggingEnabled_;
    public boolean forceUndistortedRendering_;
    public boolean frameTrackerEnabled_;
    public int motophoPatchMode_;
    public boolean openglKhrDebugEnabled_;
    public boolean performanceHudEnabled_;
    public boolean performanceLoggingActivated_;
    public boolean performanceMonitoringEnabled_;
    public Preferences$PlayAreaSettings playAreaSettings_;
    public Preferences$SafetyCylinderParams safetyCylinderParams_;
    public boolean sensorLoggingEnabled_;
    public Preferences$TrackingConfigurationParams trackingConfigurationParams_;

    public final class Builder extends anxo implements anzf {
        private Builder() {
            super(Preferences$DeveloperPrefs.DEFAULT_INSTANCE);
        }

        /* synthetic */ Builder(Preferences$1 preferences$1) {
            this();
        }
    }

    public enum MotophoPatchMode implements anxv {
        NONE(0),
        VELOCITY(1),
        IMPULSE(2);
        
        public static final int IMPULSE_VALUE = 2;
        public static final int NONE_VALUE = 0;
        public static final int VELOCITY_VALUE = 1;
        public static final anxy internalValueMap = null;
        public final int value;

        final class MotophoPatchModeVerifier implements anxx {
            public static final anxx INSTANCE = null;

            private MotophoPatchModeVerifier() {
            }

            public final boolean isInRange(int i) {
                return MotophoPatchMode.forNumber(i) != null;
            }

            static {
                INSTANCE = new MotophoPatchModeVerifier();
            }
        }

        public final String toString() {
            return Integer.toString(getNumber());
        }

        public final int getNumber() {
            return this.value;
        }

        public static MotophoPatchMode forNumber(int i) {
            if (i == 0) {
                return NONE;
            }
            if (i != 1) {
                return i != 2 ? null : IMPULSE;
            } else {
                return VELOCITY;
            }
        }

        public static anxx internalGetVerifier() {
            return MotophoPatchModeVerifier.INSTANCE;
        }

        private MotophoPatchMode(int i) {
            this.value = i;
        }

        static {
            internalValueMap = new anxy() {
                public MotophoPatchMode findValueByNumber(int i) {
                    return MotophoPatchMode.forNumber(i);
                }
            };
        }
    }

    private Preferences$DeveloperPrefs() {
    }

    public final boolean getOpenglKhrDebugEnabled() {
        return this.openglKhrDebugEnabled_;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0011\u0000\u0001\u0001\u0011\u0011\u0000\u0000\u0000\u0001\u0007\u0000\u0002\u0007\u0001\u0003\u0007\u0002\u0004\u0007\u0003\u0005\u0007\u0004\u0006\u0007\u0005\u0007\u0007\u0006\b\u0007\u0007\t\u0007\b\n\t\t\u000b\u0007\n\f\f\u000b\r\u0007\f\u000e\u0007\r\u000f\t\u000e\u0010\t\u000f\u0011\u0007\u0010", new Object[]{"bitField0_", "performanceMonitoringEnabled_", "sensorLoggingEnabled_", "dEPRECATEDMotophoPatchEnabled_", "developerLoggingEnabled_", "forceUndistortedRendering_", "performanceHudEnabled_", "dEPRECATEDGvrPlatformLibraryEnabled_", "dEPRECATEDHeadTrackingServiceEnabled_", "captureEnabled_", "safetyCylinderParams_", "frameTrackerEnabled_", "motophoPatchMode_", MotophoPatchMode.internalGetVerifier(), "performanceLoggingActivated_", "openglKhrDebugEnabled_", "trackingConfigurationParams_", "playAreaSettings_", "allowArSessionUpdate_"});
            case 3:
                return new Preferences$DeveloperPrefs();
            case 4:
                return new Builder();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Object obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (Preferences$DeveloperPrefs.class) {
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

    public static Preferences$DeveloperPrefs getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    static {
        Preferences$DeveloperPrefs preferences$DeveloperPrefs = new Preferences$DeveloperPrefs();
        DEFAULT_INSTANCE = preferences$DeveloperPrefs;
        anxl.registerDefaultInstance(Preferences$DeveloperPrefs.class, preferences$DeveloperPrefs);
    }
}
