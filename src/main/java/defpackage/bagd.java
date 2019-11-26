package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.Size;
import android.view.Display;
import android.view.Display.Mode;
import com.google.vr.sdk.proto.Display$DisplayParams;
import com.google.vr.sdk.proto.Display.DisplayParams.Builder;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: bagd */
public final class bagd {
    private static final String a = bagd.class.getSimpleName();
    private static ArrayList b = null;
    private static final List c;

    private bagd() {
    }

    public static Display$DisplayParams a(Context context) {
        bagc bagc;
        ArrayList arrayList;
        Builder newBuilder = Display$DisplayParams.newBuilder();
        List list = c;
        String str = Build.MANUFACTURER;
        String str2 = Build.DEVICE;
        String str3 = Build.MODEL;
        String str4 = Build.HARDWARE;
        String a = bagd.a(str2);
        Iterator it = list.iterator();
        do {
            arrayList = null;
            if (it.hasNext()) {
                bagc = (bagc) it.next();
                if (bagc.a(str, str2, str3, str4)) {
                    break;
                }
            } else {
                return null;
            }
        } while (!bagc.a(str, a, str3, str4));
        r1 = new Object[7];
        int i = 0;
        r1[0] = bagc.a;
        r1[1] = bagc.b;
        r1[2] = bagc.c;
        r1[3] = bagc.d;
        r1[4] = bagc.e;
        r1[5] = bagc.f;
        r1[6] = bagc.g;
        String.format("Found override: {MANUFACTURER=%s, DEVICE=%s, MODEL=%s, HARDWARE=%s} : x_ppi=%f, y_ppi=%f, bottom_bezel_height=%f)", r1);
        Float f = bagc.e;
        if (f != null) {
            newBuilder.setXPpi(f.floatValue());
        }
        f = bagc.f;
        if (f != null) {
            newBuilder.setYPpi(f.floatValue());
        }
        f = bagc.g;
        if (f != null) {
            newBuilder.setBottomBezelHeight(f.floatValue());
        }
        if ("samsung".equals(Build.MANUFACTURER) && VERSION.SDK_INT >= 23) {
            Display a2 = bafh.a(context);
            DisplayMetrics a3 = bafh.a(a2);
            int i2 = a3.widthPixels;
            if (a2 != null) {
                arrayList = b;
                if (arrayList == null) {
                    b = new ArrayList();
                    Mode[] supportedModes = a2.getSupportedModes();
                    if (supportedModes != null) {
                        for (Mode mode : supportedModes) {
                            b.add(new Size(mode.getPhysicalWidth(), mode.getPhysicalHeight()));
                        }
                    }
                    arrayList = b;
                }
            }
            if (arrayList != null) {
                int size = arrayList.size();
                while (i < size) {
                    Size size2 = (Size) arrayList.get(i);
                    i2 = Math.max(i2, Math.max(size2.getWidth(), size2.getHeight()));
                    i++;
                }
                if (a3.widthPixels != i2) {
                    float f2 = ((float) a3.widthPixels) / ((float) i2);
                    StringBuilder stringBuilder = new StringBuilder(61);
                    stringBuilder.append("Non-native screen resolution; scaling DPI by: ");
                    stringBuilder.append(f2);
                    stringBuilder.toString();
                    newBuilder.setXPpi(newBuilder.getXPpi() * f2);
                    newBuilder.setYPpi(newBuilder.getYPpi() * f2);
                }
            }
        }
        return (Display$DisplayParams) ((anxl) newBuilder.build());
    }

    private static String a(String str) {
        try {
            int length = MessageDigest.getInstance("SHA-1").digest(str.getBytes()).length;
            StringBuilder stringBuilder = new StringBuilder(length + length);
            for (int i = 0; i < length; i++) {
                stringBuilder.append(String.format("%02x", new Object[]{Byte.valueOf(r0[i])}));
            }
            return stringBuilder.toString();
        } catch (GeneralSecurityException unused) {
            Log.e(a, "SHA-256 is missing");
            return str;
        }
    }

    static {
        bagc[] bagcArr = new bagc[31];
        bagcArr[0] = new bagc("Micromax", null, "4560MMX", null, 217.0f, 217.0f);
        bagcArr[1] = new bagc("HTC", "endeavoru", "HTC One X", null, 312.0f, 312.0f);
        bagcArr[2] = new bagc("samsung", null, "SM-G920P", null, 575.0f, 575.0f);
        bagcArr[3] = new bagc("samsung", null, "SM-G930", null, 581.0f, 580.0f);
        bagcArr[4] = new bagc("samsung", null, "SM-G9300", null, 581.0f, 580.0f);
        bagcArr[5] = new bagc("samsung", null, "SM-G930A", null, 581.0f, 580.0f);
        bagcArr[6] = new bagc("samsung", null, "SM-G930F", null, 581.0f, 580.0f);
        bagcArr[7] = new bagc("samsung", null, "SM-G930P", null, 581.0f, 580.0f);
        bagcArr[8] = new bagc("samsung", null, "SM-G930R4", null, 581.0f, 580.0f);
        bagcArr[9] = new bagc("samsung", null, "SM-G930T", null, 581.0f, 580.0f);
        bagcArr[10] = new bagc("samsung", null, "SM-G930V", null, 581.0f, 580.0f);
        bagcArr[11] = new bagc("samsung", null, "SM-G930W8", null, 581.0f, 580.0f);
        bagcArr[12] = new bagc("samsung", null, "SM-N915FY", null, 541.0f, 541.0f);
        bagcArr[13] = new bagc("samsung", null, "SM-N915A", null, 541.0f, 541.0f);
        bagcArr[14] = new bagc("samsung", null, "SM-N915T", null, 541.0f, 541.0f);
        bagcArr[15] = new bagc("samsung", null, "SM-N915K", null, 541.0f, 541.0f);
        bagcArr[16] = new bagc("samsung", null, "SM-N915T", null, 541.0f, 541.0f);
        bagcArr[17] = new bagc("samsung", null, "SM-N915G", null, 541.0f, 541.0f);
        bagcArr[18] = new bagc("samsung", null, "SM-N915D", null, 541.0f, 541.0f);
        bagcArr[19] = new bagc("BLU", "BLU", "Studio 5.0 HD LTE", "qcom", 294.0f, 294.0f);
        bagcArr[20] = new bagc("OnePlus", "A0001", "A0001", "bacon", 401.0f, 401.0f);
        bagcArr[21] = new bagc("THL", "THL", "thl 5000", "mt6592", 441.0f, 441.0f);
        Float valueOf = Float.valueOf(441.74f);
        Float valueOf2 = Float.valueOf(0.004f);
        bagcArr[22] = new bagc("Google", "sailfish", "Pixel", "sailfish", valueOf, valueOf, valueOf2);
        Float valueOf3 = Float.valueOf(537.57f);
        bagcArr[23] = new bagc("Google", "marlin", "Pixel XL", "marlin", valueOf3, valueOf3, valueOf2);
        bagcArr[24] = new bagc("Google", "walleye", null, "walleye", valueOf, valueOf, valueOf2);
        bagcArr[25] = new bagc("Google", "taimen", null, "taimen", null, null, Float.valueOf(0.0046f));
        Float valueOf4 = Float.valueOf(522.63f);
        valueOf = Float.valueOf(0.0038f);
        bagcArr[26] = new bagc("Google", "21c8b5470a64adbb25bc84316cbc449361d86839", null, null, valueOf4, valueOf4, valueOf);
        Float f = valueOf;
        bagcArr[27] = new bagc("Google", "6e2c7e24b7c7eae9fc94882c9f31befa00594872", null, null, null, null, f);
        bagcArr[28] = new bagc("LGE", "joan", null, "joan", null, null, f);
        bagcArr[29] = new bagc("LGE", "e44046539bb5b584279553ca6eacca937c8e16cf", null, null, null, null, f);
        bagcArr[30] = new bagc("Lenovo", "vega", null, "vega", 537.388f, 537.882f);
        c = Arrays.asList(bagcArr);
    }
}
