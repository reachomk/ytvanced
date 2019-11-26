package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.vr.sdk.base.HeadsetSelector;
import com.google.vr.sdk.base.HeadsetSelector.HeadsetInfo;
import java.util.List;

/* renamed from: ahxp */
public final class ahxp {
    private static final HeadsetInfo a = HeadsetInfo.newInstance("Samsung", "Gear VR", "Samsung Gear VR", false);

    static List a(Context context, SharedPreferences sharedPreferences) {
        List recentHeadsetInfos = HeadsetSelector.getRecentHeadsetInfos(context);
        if (ahxt.a(context)) {
            if (a.equals(ahxp.b(context, sharedPreferences))) {
                recentHeadsetInfos.add(0, a);
            } else {
                recentHeadsetInfos.add(a);
            }
        }
        return recentHeadsetInfos;
    }

    static HeadsetInfo b(Context context, SharedPreferences sharedPreferences) {
        if (ahxt.a(context)) {
            if ("oculus_mobile".equals(sharedPreferences.getString("youtube.vr.selected_platform", "daydream"))) {
                return a;
            }
        }
        return HeadsetSelector.getCurrentHeadsetInfo(context);
    }

    static boolean a(Context context, SharedPreferences sharedPreferences, HeadsetInfo headsetInfo) {
        String str = "youtube.vr.selected_platform";
        if (ahxt.a(context) && a.equals(headsetInfo)) {
            sharedPreferences.edit().putString(str, "oculus_mobile").apply();
            return true;
        }
        sharedPreferences.edit().putString(str, "daydream").apply();
        return HeadsetSelector.selectHeadset(context, headsetInfo);
    }

    static int a(HeadsetInfo headsetInfo) {
        if (headsetInfo == null) {
            return 0;
        }
        if (a.equals(headsetInfo)) {
            return 3;
        }
        return headsetInfo.isCardboardViewer() ? 1 : 2;
    }
}
