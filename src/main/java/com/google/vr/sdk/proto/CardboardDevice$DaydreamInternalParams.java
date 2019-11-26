package com.google.vr.sdk.proto;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxo;
import defpackage.anxu;
import defpackage.anyd;
import defpackage.anzf;
import defpackage.anzq;
import java.util.List;

public final class CardboardDevice$DaydreamInternalParams extends anxl implements anzf {
    public static final int ALIGNMENT_MARKERS_FIELD_NUMBER = 2;
    public static final int CLAMP_DISTORTION_TO_MAXIMUM_FIELD_OF_VIEW_FIELD_NUMBER = 8;
    public static final int CLIP_FIELD_OF_VIEW_TO_DISPLAY_FIELD_NUMBER = 7;
    public static final CardboardDevice$DaydreamInternalParams DEFAULT_INSTANCE;
    public static final int DISTORTION_MESH_RESOLUTION_FIELD_NUMBER = 6;
    public static volatile anzq PARSER = null;
    public static final int SENSOR_ORIENTATION_INDEPENDENT_OF_DISPLAY_FIELD_NUMBER = 4;
    public static final int USE_ROTATIONAL_ALIGNMENT_CORRECTION_FIELD_NUMBER = 3;
    public static final int VERSION_FIELD_NUMBER = 1;
    public static final int VIGNETTE_PARAMS_FIELD_NUMBER = 5;
    public anyd alignmentMarkers_ = anxl.emptyProtobufList();
    public int bitField0_;
    public boolean clampDistortionToMaximumFieldOfView_;
    public boolean clipFieldOfViewToDisplay_ = true;
    public int distortionMeshResolution_ = 40;
    public boolean sensorOrientationIndependentOfDisplay_;
    public boolean useRotationalAlignmentCorrection_;
    public int version_;
    public CardboardDevice$VignetteParams vignetteParams_;

    public final class Builder extends anxo implements anzf {
        private Builder() {
            super(CardboardDevice$DaydreamInternalParams.DEFAULT_INSTANCE);
        }

        /* synthetic */ Builder(CardboardDevice$1 cardboardDevice$1) {
            this();
        }
    }

    private CardboardDevice$DaydreamInternalParams() {
    }

    public final List getAlignmentMarkersList() {
        return this.alignmentMarkers_;
    }

    public final int getAlignmentMarkersCount() {
        return this.alignmentMarkers_.size();
    }

    public final boolean getUseRotationalAlignmentCorrection() {
        return this.useRotationalAlignmentCorrection_;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u0004\u0000\u0002\u001b\u0003\u0007\u0001\u0004\u0007\u0002\u0005\t\u0003\u0006\u0004\u0004\u0007\u0007\u0005\b\u0007\u0006", new Object[]{"bitField0_", "version_", "alignmentMarkers_", CardboardDevice$ScreenAlignmentMarker.class, "useRotationalAlignmentCorrection_", "sensorOrientationIndependentOfDisplay_", "vignetteParams_", "distortionMeshResolution_", "clipFieldOfViewToDisplay_", "clampDistortionToMaximumFieldOfView_"});
            case 3:
                return new CardboardDevice$DaydreamInternalParams();
            case 4:
                return new Builder();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Object obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (CardboardDevice$DaydreamInternalParams.class) {
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

    public static anzq parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    static {
        CardboardDevice$DaydreamInternalParams cardboardDevice$DaydreamInternalParams = new CardboardDevice$DaydreamInternalParams();
        DEFAULT_INSTANCE = cardboardDevice$DaydreamInternalParams;
        anxl.registerDefaultInstance(CardboardDevice$DaydreamInternalParams.class, cardboardDevice$DaydreamInternalParams);
    }
}
