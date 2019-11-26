package com.google.vr.sdk.base;

import android.net.Uri;
import android.net.Uri.Builder;
import android.util.Log;
import com.google.vr.sdk.proto.CardboardDevice$DeviceParams$VerticalAlignmentType;
import com.google.vr.sdk.proto.nano.CardboardDevice$DeviceParams;
import defpackage.aocf;

public class GvrViewerParams {
    public static final VerticalAlignmentType CARDBOARD_V1_VERTICAL_ALIGNMENT = VerticalAlignmentType.BOTTOM;
    public static final VerticalAlignmentType CARDBOARD_V2_2_VERTICAL_ALIGNMENT = VerticalAlignmentType.BOTTOM;
    public static final GvrViewerParams DEFAULT_PARAMS = new GvrViewerParams();
    public static final Uri URI_ORIGINAL_CARDBOARD_NFC;
    public static final Uri URI_ORIGINAL_CARDBOARD_QR_CODE;
    public Distortion distortion;
    public boolean hasMagnet;
    public float interLensDistance;
    public FieldOfView leftEyeMaxFov;
    public String model;
    public CardboardDevice$DeviceParams originalDeviceProto;
    public float screenToLensDistance;
    public String vendor;
    public VerticalAlignmentType verticalAlignment;
    public float verticalDistanceToLensCenter;

    public enum VerticalAlignmentType {
        BOTTOM(CardboardDevice$DeviceParams$VerticalAlignmentType.BOTTOM),
        CENTER(CardboardDevice$DeviceParams$VerticalAlignmentType.CENTER),
        TOP(CardboardDevice$DeviceParams$VerticalAlignmentType.TOP);
        
        public final CardboardDevice$DeviceParams$VerticalAlignmentType protoValue;

        private VerticalAlignmentType(CardboardDevice$DeviceParams$VerticalAlignmentType cardboardDevice$DeviceParams$VerticalAlignmentType) {
            this.protoValue = cardboardDevice$DeviceParams$VerticalAlignmentType;
        }

        /* Access modifiers changed, original: final */
        public final CardboardDevice$DeviceParams$VerticalAlignmentType toProtoValue() {
            return this.protoValue;
        }

        static VerticalAlignmentType fromProtoValue(CardboardDevice$DeviceParams$VerticalAlignmentType cardboardDevice$DeviceParams$VerticalAlignmentType) {
            for (VerticalAlignmentType verticalAlignmentType : values()) {
                if (verticalAlignmentType.protoValue == cardboardDevice$DeviceParams$VerticalAlignmentType) {
                    return verticalAlignmentType;
                }
            }
            Log.e("GvrViewerParams", String.format("Unknown alignment type from proto: %d", new Object[]{Integer.valueOf(cardboardDevice$DeviceParams$VerticalAlignmentType.getNumber())}));
            return BOTTOM;
        }
    }

    public GvrViewerParams() {
        setDefaultValues();
    }

    public GvrViewerParams(GvrViewerParams gvrViewerParams) {
        copyFrom(gvrViewerParams);
    }

    public GvrViewerParams(CardboardDevice$DeviceParams cardboardDevice$DeviceParams) {
        setDefaultValues();
        if (cardboardDevice$DeviceParams != null) {
            this.originalDeviceProto = (CardboardDevice$DeviceParams) cardboardDevice$DeviceParams.clone();
            this.vendor = cardboardDevice$DeviceParams.getVendor();
            this.model = cardboardDevice$DeviceParams.getModel();
            this.interLensDistance = cardboardDevice$DeviceParams.getInterLensDistance();
            this.verticalAlignment = VerticalAlignmentType.fromProtoValue(cardboardDevice$DeviceParams.getVerticalAlignment());
            this.verticalDistanceToLensCenter = cardboardDevice$DeviceParams.getTrayToLensDistance();
            this.screenToLensDistance = cardboardDevice$DeviceParams.getScreenToLensDistance();
            this.leftEyeMaxFov = FieldOfView.parseFromProtobuf(cardboardDevice$DeviceParams.leftEyeFieldOfViewAngles);
            if (this.leftEyeMaxFov == null) {
                this.leftEyeMaxFov = new FieldOfView();
            }
            this.distortion = Distortion.parseFromProtobuf(cardboardDevice$DeviceParams.distortionCoefficients);
            if (this.distortion == null) {
                this.distortion = new Distortion();
            }
            this.hasMagnet = cardboardDevice$DeviceParams.getHasMagnet();
        }
    }

    public static GvrViewerParams cardboardV2ViewerParams() {
        GvrViewerParams gvrViewerParams = new GvrViewerParams();
        gvrViewerParams.setToCardboardV2ViewerParams();
        return gvrViewerParams;
    }

    /* Access modifiers changed, original: 0000 */
    public byte[] toByteArray() {
        return aocf.toByteArray(toProtobuf());
    }

    public CardboardDevice$DeviceParams toProtobuf() {
        CardboardDevice$DeviceParams cardboardDevice$DeviceParams = this.originalDeviceProto;
        if (cardboardDevice$DeviceParams == null) {
            cardboardDevice$DeviceParams = new CardboardDevice$DeviceParams();
        } else {
            cardboardDevice$DeviceParams = (CardboardDevice$DeviceParams) cardboardDevice$DeviceParams.clone();
        }
        cardboardDevice$DeviceParams.setVendor(this.vendor);
        cardboardDevice$DeviceParams.setModel(this.model);
        cardboardDevice$DeviceParams.setInterLensDistance(this.interLensDistance);
        cardboardDevice$DeviceParams.setVerticalAlignment(this.verticalAlignment.toProtoValue());
        if (this.verticalAlignment == VerticalAlignmentType.CENTER) {
            cardboardDevice$DeviceParams.setTrayToLensDistance(0.035f);
        } else {
            cardboardDevice$DeviceParams.setTrayToLensDistance(this.verticalDistanceToLensCenter);
        }
        cardboardDevice$DeviceParams.setScreenToLensDistance(this.screenToLensDistance);
        cardboardDevice$DeviceParams.leftEyeFieldOfViewAngles = this.leftEyeMaxFov.toProtobuf();
        cardboardDevice$DeviceParams.distortionCoefficients = this.distortion.toProtobuf();
        if (this.hasMagnet) {
            cardboardDevice$DeviceParams.setHasMagnet(true);
        }
        return cardboardDevice$DeviceParams;
    }

    public String getModel() {
        return this.model;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof GvrViewerParams) {
            GvrViewerParams gvrViewerParams = (GvrViewerParams) obj;
            if (this.vendor.equals(gvrViewerParams.vendor) && this.model.equals(gvrViewerParams.model) && this.interLensDistance == gvrViewerParams.interLensDistance) {
                VerticalAlignmentType verticalAlignmentType = this.verticalAlignment;
                if (verticalAlignmentType == gvrViewerParams.verticalAlignment && ((verticalAlignmentType == VerticalAlignmentType.CENTER || this.verticalDistanceToLensCenter == gvrViewerParams.verticalDistanceToLensCenter) && this.screenToLensDistance == gvrViewerParams.screenToLensDistance && this.leftEyeMaxFov.equals(gvrViewerParams.leftEyeMaxFov) && this.distortion.equals(gvrViewerParams.distortion) && this.hasMagnet == gvrViewerParams.hasMagnet)) {
                    return aocf.messageNanoEquals(this.originalDeviceProto, gvrViewerParams.originalDeviceProto);
                }
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{\n");
        String str = this.vendor;
        StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(str).length() + 12);
        stringBuilder2.append("  vendor: ");
        stringBuilder2.append(str);
        str = ",\n";
        stringBuilder2.append(str);
        stringBuilder.append(stringBuilder2.toString());
        String str2 = this.model;
        StringBuilder stringBuilder3 = new StringBuilder(String.valueOf(str2).length() + 11);
        stringBuilder3.append("  model: ");
        stringBuilder3.append(str2);
        stringBuilder3.append(str);
        stringBuilder.append(stringBuilder3.toString());
        float f = this.interLensDistance;
        stringBuilder2 = new StringBuilder(40);
        stringBuilder2.append("  inter_lens_distance: ");
        stringBuilder2.append(f);
        stringBuilder2.append(str);
        stringBuilder.append(stringBuilder2.toString());
        str2 = String.valueOf(this.verticalAlignment);
        stringBuilder3 = new StringBuilder(str2.length() + 24);
        stringBuilder3.append("  vertical_alignment: ");
        stringBuilder3.append(str2);
        stringBuilder3.append(str);
        stringBuilder.append(stringBuilder3.toString());
        f = this.verticalDistanceToLensCenter;
        stringBuilder2 = new StringBuilder(53);
        stringBuilder2.append("  vertical_distance_to_lens_center: ");
        stringBuilder2.append(f);
        stringBuilder2.append(str);
        stringBuilder.append(stringBuilder2.toString());
        f = this.screenToLensDistance;
        stringBuilder2 = new StringBuilder(44);
        stringBuilder2.append("  screen_to_lens_distance: ");
        stringBuilder2.append(f);
        stringBuilder2.append(str);
        stringBuilder.append(stringBuilder2.toString());
        String str3 = "\n  ";
        String str4 = "\n";
        str2 = this.leftEyeMaxFov.toString().replace(str4, str3);
        StringBuilder stringBuilder4 = new StringBuilder(String.valueOf(str2).length() + 22);
        stringBuilder4.append("  left_eye_max_fov: ");
        stringBuilder4.append(str2);
        stringBuilder4.append(str);
        stringBuilder.append(stringBuilder4.toString());
        str2 = this.distortion.toString().replace(str4, str3);
        stringBuilder3 = new StringBuilder(String.valueOf(str2).length() + 16);
        stringBuilder3.append("  distortion: ");
        stringBuilder3.append(str2);
        stringBuilder3.append(str);
        stringBuilder.append(stringBuilder3.toString());
        boolean z = this.hasMagnet;
        stringBuilder2 = new StringBuilder(17);
        stringBuilder2.append("  magnet: ");
        stringBuilder2.append(z);
        stringBuilder2.append(str);
        stringBuilder.append(stringBuilder2.toString());
        stringBuilder.append("}\n");
        return stringBuilder.toString();
    }

    private void setDefaultValues() {
        setToCardboardV2ViewerParams();
        this.vendor = "Google, Inc.";
        this.model = "Default Cardboard";
    }

    private void setToCardboardV2ViewerParams() {
        this.vendor = "Google";
        this.model = "Cardboard";
        this.interLensDistance = 0.064f;
        this.verticalAlignment = CARDBOARD_V2_2_VERTICAL_ALIGNMENT;
        this.verticalDistanceToLensCenter = 0.035f;
        this.screenToLensDistance = 0.039f;
        this.leftEyeMaxFov = new FieldOfView();
        this.hasMagnet = false;
        this.distortion = new Distortion();
    }

    private void copyFrom(GvrViewerParams gvrViewerParams) {
        this.vendor = gvrViewerParams.vendor;
        this.model = gvrViewerParams.model;
        this.interLensDistance = gvrViewerParams.interLensDistance;
        this.verticalAlignment = gvrViewerParams.verticalAlignment;
        this.verticalDistanceToLensCenter = gvrViewerParams.verticalDistanceToLensCenter;
        this.screenToLensDistance = gvrViewerParams.screenToLensDistance;
        this.leftEyeMaxFov = new FieldOfView(gvrViewerParams.leftEyeMaxFov);
        this.hasMagnet = gvrViewerParams.hasMagnet;
        this.distortion = new Distortion(gvrViewerParams.distortion);
        this.originalDeviceProto = gvrViewerParams.originalDeviceProto;
    }

    static {
        String str = "cardboard";
        URI_ORIGINAL_CARDBOARD_NFC = new Builder().scheme(str).authority("v1.0.0").build();
        URI_ORIGINAL_CARDBOARD_QR_CODE = new Builder().scheme("http").authority("g.co").appendEncodedPath(str).build();
    }
}
