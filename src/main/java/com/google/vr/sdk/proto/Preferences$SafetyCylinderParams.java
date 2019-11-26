package com.google.vr.sdk.proto;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxo;
import defpackage.anxu;
import defpackage.anya;
import defpackage.anzf;
import defpackage.anzq;

public final class Preferences$SafetyCylinderParams extends anxl implements anzf {
    public static final int ANCHOR_WARNING_DISTANCE_FIELD_NUMBER = 8;
    public static final int COLLISION_SPHERE_RADIUS_FIELD_NUMBER = 1;
    public static final Preferences$SafetyCylinderParams DEFAULT_INSTANCE;
    public static final int ENTER_EVENT_RADIUS_FIELD_NUMBER = 6;
    public static final int EXIT_EVENT_RADIUS_FIELD_NUMBER = 7;
    public static final int GRAPHICS_ENABLED_FIELD_NUMBER = 9;
    public static final int INNER_FOG_COLOR_FIELD_NUMBER = 4;
    public static final int INNER_RADIUS_FIELD_NUMBER = 2;
    public static final int OUTER_FOG_COLOR_FIELD_NUMBER = 5;
    public static final int OUTER_RADIUS_FIELD_NUMBER = 3;
    public static volatile anzq PARSER;
    public float anchorWarningDistance_;
    public int bitField0_;
    public float collisionSphereRadius_;
    public float enterEventRadius_;
    public float exitEventRadius_;
    public boolean graphicsEnabled_ = true;
    public anya innerFogColor_ = anxl.emptyFloatList();
    public float innerRadius_;
    public anya outerFogColor_ = anxl.emptyFloatList();
    public float outerRadius_;

    public final class Builder extends anxo implements anzf {
        private Builder() {
            super(Preferences$SafetyCylinderParams.DEFAULT_INSTANCE);
        }

        /* synthetic */ Builder(Preferences$1 preferences$1) {
            this();
        }
    }

    private Preferences$SafetyCylinderParams() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0000\u0001\u0001\u0000\u0002\u0001\u0001\u0003\u0001\u0002\u0004\u0013\u0005\u0013\u0006\u0001\u0003\u0007\u0001\u0004\b\u0001\u0005\t\u0007\u0006", new Object[]{"bitField0_", "collisionSphereRadius_", "innerRadius_", "outerRadius_", "innerFogColor_", "outerFogColor_", "enterEventRadius_", "exitEventRadius_", "anchorWarningDistance_", "graphicsEnabled_"});
            case 3:
                return new Preferences$SafetyCylinderParams();
            case 4:
                return new Builder();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Object obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (Preferences$SafetyCylinderParams.class) {
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

    static {
        Preferences$SafetyCylinderParams preferences$SafetyCylinderParams = new Preferences$SafetyCylinderParams();
        DEFAULT_INSTANCE = preferences$SafetyCylinderParams;
        anxl.registerDefaultInstance(Preferences$SafetyCylinderParams.class, preferences$SafetyCylinderParams);
    }
}
