package com.google.vr.sdk.proto;

import defpackage.anxv;
import defpackage.anxx;
import defpackage.anxy;

public enum Preferences$ControllerConfigurationType implements anxv {
    GVR_CONTROLLER_CONFIGURATION_UNKNOWN(0),
    GVR_CONTROLLER_CONFIGURATION_UNSUPPORTED(1),
    GVR_CONTROLLER_CONFIGURATION_3DOF_1(2),
    GVR_CONTROLLER_CONFIGURATION_6DOF_2(3),
    GVR_CONTROLLER_CONFIGURATION_6DOF_2_RESERVED(4);
    
    public static final int GVR_CONTROLLER_CONFIGURATION_3DOF_1_VALUE = 2;
    public static final int GVR_CONTROLLER_CONFIGURATION_6DOF_2_RESERVED_VALUE = 4;
    public static final int GVR_CONTROLLER_CONFIGURATION_6DOF_2_VALUE = 3;
    public static final int GVR_CONTROLLER_CONFIGURATION_UNKNOWN_VALUE = 0;
    public static final int GVR_CONTROLLER_CONFIGURATION_UNSUPPORTED_VALUE = 1;
    public static final anxy internalValueMap = null;
    public final int value;

    final class ControllerConfigurationTypeVerifier implements anxx {
        public static final anxx INSTANCE = null;

        private ControllerConfigurationTypeVerifier() {
        }

        public final boolean isInRange(int i) {
            return Preferences$ControllerConfigurationType.forNumber(i) != null;
        }

        static {
            INSTANCE = new ControllerConfigurationTypeVerifier();
        }
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }

    public final int getNumber() {
        return this.value;
    }

    public static Preferences$ControllerConfigurationType forNumber(int i) {
        if (i == 0) {
            return GVR_CONTROLLER_CONFIGURATION_UNKNOWN;
        }
        if (i == 1) {
            return GVR_CONTROLLER_CONFIGURATION_UNSUPPORTED;
        }
        if (i == 2) {
            return GVR_CONTROLLER_CONFIGURATION_3DOF_1;
        }
        if (i != 3) {
            return i != 4 ? null : GVR_CONTROLLER_CONFIGURATION_6DOF_2_RESERVED;
        } else {
            return GVR_CONTROLLER_CONFIGURATION_6DOF_2;
        }
    }

    public static anxx internalGetVerifier() {
        return ControllerConfigurationTypeVerifier.INSTANCE;
    }

    private Preferences$ControllerConfigurationType(int i) {
        this.value = i;
    }

    static {
        internalValueMap = new anxy() {
            public Preferences$ControllerConfigurationType findValueByNumber(int i) {
                return Preferences$ControllerConfigurationType.forNumber(i);
            }
        };
    }
}
