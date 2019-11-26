package com.google.vr.sdk.base;

import android.content.Context;
import android.util.Log;
import com.google.vr.ndk.base.DaydreamApi;
import com.google.vr.ndk.base.DaydreamUtils;
import com.google.vr.sdk.proto.nano.CardboardDevice$DeviceParams;
import com.google.vr.sdk.proto.nano.CardboardDevice$DeviceParamsList;
import defpackage.bahi;
import defpackage.bahk;
import java.util.ArrayList;
import java.util.List;

public class HeadsetSelector {
    public static final HeadsetInfo DEFAULT_HEADSET_INFO = new HeadsetInfo(GvrViewerParams.cardboardV2ViewerParams().toProtobuf());

    public final class HeadsetInfo {
        public final boolean cardboardViewer;
        public final CardboardDevice$DeviceParams deviceParam;
        public final String displayName;
        public final String uniqueKey;

        private HeadsetInfo(CardboardDevice$DeviceParams cardboardDevice$DeviceParams) {
            this(cardboardDevice$DeviceParams, DaydreamUtils.getDeviceParamsDisplayedName(cardboardDevice$DeviceParams), DaydreamUtils.isDaydreamViewer(cardboardDevice$DeviceParams) ^ 1);
        }

        private HeadsetInfo(CardboardDevice$DeviceParams cardboardDevice$DeviceParams, String str, boolean z) {
            this.deviceParam = cardboardDevice$DeviceParams;
            this.uniqueKey = HeadsetSelector.getHeadsetParamsKey(cardboardDevice$DeviceParams);
            this.displayName = str;
            this.cardboardViewer = z;
        }

        public static HeadsetInfo newInstance(String str, String str2, String str3, boolean z) {
            CardboardDevice$DeviceParams cardboardDevice$DeviceParams = new CardboardDevice$DeviceParams();
            cardboardDevice$DeviceParams.setVendor(str);
            cardboardDevice$DeviceParams.setModel(str2);
            return new HeadsetInfo(cardboardDevice$DeviceParams, str3, false);
        }

        public final String getDisplayName() {
            return this.displayName;
        }

        public final boolean isCardboardViewer() {
            return this.cardboardViewer;
        }

        private final boolean equalsDeviceParam(CardboardDevice$DeviceParams cardboardDevice$DeviceParams) {
            return this.uniqueKey.equalsIgnoreCase(HeadsetSelector.getHeadsetParamsKey(cardboardDevice$DeviceParams));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HeadsetInfo)) {
                return false;
            }
            return this.uniqueKey.equalsIgnoreCase(((HeadsetInfo) obj).uniqueKey);
        }

        public final int hashCode() {
            return this.uniqueKey.hashCode();
        }
    }

    public static List getRecentHeadsetInfos(Context context) {
        ArrayList arrayList = new ArrayList();
        CardboardDevice$DeviceParamsList recentHeadsets = DaydreamApi.getRecentHeadsets(context);
        if (recentHeadsets != null) {
            if (r2 > 0) {
                for (CardboardDevice$DeviceParams headsetInfo : recentHeadsets.params) {
                    arrayList.add(new HeadsetInfo(headsetInfo));
                }
            }
        }
        if (arrayList.isEmpty() || (arrayList.size() == 1 && !((HeadsetInfo) arrayList.get(0)).isCardboardViewer())) {
            arrayList.add(DEFAULT_HEADSET_INFO);
        }
        return arrayList;
    }

    public static HeadsetInfo getCurrentHeadsetInfo(Context context) {
        bahi a = bahk.a(context);
        HeadsetInfo headsetInfo = DEFAULT_HEADSET_INFO;
        try {
            CardboardDevice$DeviceParams a2 = a.a();
            if (a2 != null) {
                headsetInfo = new HeadsetInfo(a2);
            }
            a.e();
        } catch (Exception e) {
            Log.e("HeadsetSelector", "Error when retrieving current headset", e);
            a.e();
        } catch (Throwable th) {
            a.e();
            throw th;
        }
        return headsetInfo;
    }

    public static boolean selectHeadset(Context context, HeadsetInfo headsetInfo) {
        boolean z = false;
        if (headsetInfo == null) {
            return false;
        }
        bahi a = bahk.a(context);
        try {
            CardboardDevice$DeviceParamsList b = a.b();
            if (b != null) {
                if (r2 > 0) {
                    for (CardboardDevice$DeviceParams cardboardDevice$DeviceParams : b.params) {
                        if (headsetInfo.equalsDeviceParam(cardboardDevice$DeviceParams)) {
                            boolean a2 = a.a(cardboardDevice$DeviceParams);
                            a.e();
                            return a2;
                        }
                    }
                }
            }
            if (headsetInfo.equals(DEFAULT_HEADSET_INFO) && a.a(DEFAULT_HEADSET_INFO.deviceParam)) {
                z = true;
            }
            a.e();
            return z;
        } catch (Exception e) {
            Log.e("HeadsetSelector", "Error when updating the selected headset", e);
            a.e();
            return false;
        } catch (Throwable th) {
            a.e();
            throw th;
        }
    }

    private static String getHeadsetParamsKey(CardboardDevice$DeviceParams cardboardDevice$DeviceParams) {
        String vendor = cardboardDevice$DeviceParams.getVendor();
        String model = cardboardDevice$DeviceParams.getModel();
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(vendor).length() + 1) + String.valueOf(model).length());
        stringBuilder.append(vendor);
        stringBuilder.append("_");
        stringBuilder.append(model);
        return stringBuilder.toString();
    }
}
