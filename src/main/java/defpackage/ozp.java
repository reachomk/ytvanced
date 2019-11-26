package defpackage;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Parcel;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.io.Closeable;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* renamed from: ozp */
public final class ozp {
    public static final int a = VERSION.SDK_INT;
    public static final String b = Build.DEVICE;
    public static final String c = Build.MANUFACTURER;
    public static final String d = Build.MODEL;
    public static final String e;
    public static final byte[] f = new byte[0];
    private static final Pattern g = Pattern.compile("%([A-Fa-f0-9]{2})");
    private static final int[] h = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};

    public static long a(long j, long j2) {
        long j3 = j + j2;
        return ((j ^ j3) & (j2 ^ j3)) < 0 ? Long.MAX_VALUE : j3;
    }

    public static Object a(Object obj) {
        return obj;
    }

    public static boolean a(int i) {
        return i == 10 || i == 13;
    }

    public static boolean a(Uri uri) {
        String scheme = uri.getScheme();
        return TextUtils.isEmpty(scheme) || "file".equals(scheme);
    }

    public static Object[] a(Object[] objArr) {
        return objArr;
    }

    public static int b(int i) {
        return i != 8 ? i != 16 ? i != 24 ? i != 32 ? 0 : 1073741824 : aocf.UNSET_ENUM_VALUE : 2 : 3;
    }

    public static int b(long j, long j2) {
        int i;
        if (j < j2) {
            i = -1;
        } else if (j == j2) {
            return 0;
        } else {
            i = 1;
        }
        return i;
    }

    public static boolean c(int i) {
        return i == 3 || i == 2 || i == aocf.UNSET_ENUM_VALUE || i == 1073741824 || i == 4;
    }

    public static boolean d(int i) {
        return i == aocf.UNSET_ENUM_VALUE || i == 1073741824;
    }

    public static int f(int i) {
        switch (i) {
            case 1:
            case 12:
            case 14:
                return 3;
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            case 13:
                return 1;
            default:
                return 3;
        }
    }

    public static boolean a(Object obj, Object obj2) {
        boolean equals;
        if (obj != null) {
            equals = obj.equals(obj2);
        } else if (obj2 == null) {
            return true;
        } else {
            equals = false;
        }
        return equals;
    }

    public static void a(List list, int i, int i2) {
        if (i < 0 || i2 > list.size() || i > i2) {
            throw new IllegalArgumentException();
        } else if (i != i2) {
            list.subList(i, i2).clear();
        }
    }

    public static Object[] a(Object[] objArr, int i) {
        oxz.a(i <= objArr.length);
        return Arrays.copyOf(objArr, i);
    }

    public static Handler a(Looper looper, Callback callback) {
        return new Handler(looper, callback);
    }

    public static Looper a() {
        Looper myLooper = Looper.myLooper();
        return myLooper == null ? Looper.getMainLooper() : myLooper;
    }

    public static ExecutorService a(String str) {
        return Executors.newSingleThreadExecutor(new ozs(str));
    }

    public static void a(ovi ovi) {
        if (ovi != null) {
            try {
                ovi.a();
            } catch (IOException unused) {
            }
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static boolean a(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static void a(Parcel parcel, boolean z) {
        parcel.writeInt(z);
    }

    public static String b(String str) {
        if (str == null) {
            return null;
        }
        try {
            Locale locale;
            if (a < 21) {
                locale = new Locale(str);
            } else {
                locale = Locale.forLanguageTag(str);
            }
            int length = locale.getLanguage().length();
            String iSO3Language = locale.getISO3Language();
            if (iSO3Language.isEmpty()) {
                return ozp.d(str);
            }
            String valueOf = String.valueOf(ozp.a(locale).substring(length));
            return ozp.d(valueOf.length() == 0 ? new String(iSO3Language) : iSO3Language.concat(valueOf));
        } catch (MissingResourceException unused) {
            return ozp.d(str);
        }
    }

    public static String a(byte[] bArr) {
        return new String(bArr, Charset.forName("UTF-8"));
    }

    public static String a(byte[] bArr, int i, int i2) {
        return new String(bArr, i, i2, Charset.forName("UTF-8"));
    }

    public static byte[] c(String str) {
        return str.getBytes(Charset.forName("UTF-8"));
    }

    public static String[] a(String str, String str2) {
        return str.split(str2, -1);
    }

    public static String[] b(String str, String str2) {
        return str.split(str2, 2);
    }

    public static String d(String str) {
        return str != null ? str.toLowerCase(Locale.US) : null;
    }

    public static String e(String str) {
        return str != null ? str.toUpperCase(Locale.US) : null;
    }

    public static String a(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static int a(int i, int i2) {
        return ((i + i2) - 1) / i2;
    }

    public static int a(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i, i3));
    }

    public static long a(long j, long j2, long j3) {
        return Math.max(j2, Math.min(j, j3));
    }

    public static float a(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f, f3));
    }

    public static int a(long[] jArr, long j, boolean z) {
        int i;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch < 0) {
            i = -(binarySearch + 2);
        } else {
            while (true) {
                binarySearch--;
                if (binarySearch >= 0 && jArr[binarySearch] == j) {
                }
            }
            i = binarySearch + 1;
        }
        return z ? Math.max(0, i) : i;
    }

    public static int a(long[] jArr, long j, boolean z, boolean z2) {
        int i;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch < 0) {
            i = binarySearch ^ -1;
        } else {
            do {
                binarySearch++;
                if (binarySearch >= jArr.length) {
                    break;
                }
            } while (jArr[binarySearch] == j);
            i = z ? binarySearch - 1 : binarySearch;
        }
        return z2 ? Math.min(jArr.length - 1, i) : i;
    }

    public static long b(long j, long j2, long j3) {
        if (j3 >= j2 && j3 % j2 == 0) {
            return j / (j3 / j2);
        }
        if (j3 < j2 && j2 % j3 == 0) {
            return j * (j2 / j3);
        }
        double d = (double) j;
        double d2 = (double) j2;
        double d3 = (double) j3;
        Double.isNaN(d2);
        Double.isNaN(d3);
        d2 /= d3;
        Double.isNaN(d);
        return (long) (d * d2);
    }

    public static void a(long[] jArr, long j) {
        int i = 0;
        if (j >= 1000000 && j % 1000000 == 0) {
            j /= 1000000;
            while (i < jArr.length) {
                jArr[i] = jArr[i] / j;
                i++;
            }
        } else if (j < 1000000 && 1000000 % j == 0) {
            long j2 = 1000000 / j;
            while (i < jArr.length) {
                jArr[i] = jArr[i] * j2;
                i++;
            }
        } else {
            double d = (double) j;
            Double.isNaN(d);
            double d2 = 1000000.0d / d;
            while (i < jArr.length) {
                d = (double) jArr[i];
                Double.isNaN(d);
                jArr[i] = (long) (d * d2);
                i++;
            }
        }
    }

    public static long a(long j, float f) {
        if (f == 1.0f) {
            return j;
        }
        double d = (double) j;
        double d2 = (double) f;
        Double.isNaN(d);
        Double.isNaN(d2);
        return Math.round(d * d2);
    }

    public static long b(long j, float f) {
        if (f == 1.0f) {
            return j;
        }
        double d = (double) j;
        double d2 = (double) f;
        Double.isNaN(d);
        Double.isNaN(d2);
        return Math.round(d / d2);
    }

    public static long a(long j, oap oap, long j2, long j3) {
        if (oap.a.equals(oap)) {
            return j;
        }
        long j4 = oap.c;
        long j5 = j - j4;
        if (((j4 ^ j) & (j ^ j5)) < 0) {
            j5 = Long.MIN_VALUE;
        }
        j4 = ozp.a(j, oap.d);
        Object obj = null;
        Object obj2 = (j5 > j2 || j2 > j4) ? null : 1;
        if (j5 <= j3 && j3 <= j4) {
            obj = 1;
        }
        if (obj2 != null && obj != null) {
            return Math.abs(j2 - j) > Math.abs(j3 - j) ? j3 : j2;
        } else {
            if (obj2 == null) {
                return obj == null ? j5 : j3;
            } else {
                return j2;
            }
        }
    }

    public static int[] a(List list) {
        if (list == null) {
            return null;
        }
        int size = list.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = ((Integer) list.get(i)).intValue();
        }
        return iArr;
    }

    public static int f(String str) {
        int length = str.length();
        oxz.a(length <= 4);
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            i = (i << 8) | str.charAt(i2);
        }
        return i;
    }

    public static byte[] g(String str) {
        byte[] bArr = new byte[(str.length() / 2)];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = i + i;
            bArr[i] = (byte) ((Character.digit(str.charAt(i2), 16) << 4) + Character.digit(str.charAt(i2 + 1), 16));
        }
        return bArr;
    }

    public static String b(Object[] objArr) {
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        while (true) {
            int length = objArr.length;
            if (i >= length) {
                return stringBuilder.toString();
            }
            stringBuilder.append(objArr[i].getClass().getSimpleName());
            if (i < length - 1) {
                stringBuilder.append(", ");
            }
            i++;
        }
    }

    public static String a(Context context, String str) {
        Object obj;
        try {
            obj = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (NameNotFoundException unused) {
            obj = "?";
        }
        String str2 = VERSION.RELEASE;
        int length = String.valueOf(str).length();
        StringBuilder stringBuilder = new StringBuilder(((length + 38) + String.valueOf(obj).length()) + String.valueOf(str2).length());
        stringBuilder.append(str);
        stringBuilder.append("/");
        stringBuilder.append(obj);
        stringBuilder.append(" (Linux;Android ");
        stringBuilder.append(str2);
        stringBuilder.append(") ExoPlayerLib/2.10.1");
        return stringBuilder.toString();
    }

    public static String[] h(String str) {
        if (TextUtils.isEmpty(str)) {
            return new String[0];
        }
        return ozp.a(str.trim(), "(\\s*,\\s*)");
    }

    public static int e(int i) {
        switch (i) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                i = a;
                return (i >= 23 || i >= 21) ? 6396 : 0;
            default:
                return 0;
        }
    }

    public static int b(int i, int i2) {
        if (i == aocf.UNSET_ENUM_VALUE) {
            return i2 * 3;
        }
        if (i != 1073741824) {
            if (i == 2) {
                return i2 + i2;
            }
            if (i == 3) {
                return i2;
            }
            if (i != 4) {
                throw new IllegalArgumentException();
            }
        }
        return i2 << 2;
    }

    public static int g(int i) {
        switch (i) {
            case 0:
                return 16777216;
            case 1:
                return 3538944;
            case 2:
                return 13107200;
            case 3:
            case 4:
            case 5:
                return 131072;
            case 6:
                return 0;
            default:
                throw new IllegalArgumentException();
        }
    }

    public static String i(String str) {
        int i;
        int length = str.length();
        int i2 = 0;
        int i3 = 0;
        for (i = 0; i < length; i++) {
            if (str.charAt(i) == '%') {
                i3++;
            }
        }
        if (i3 != 0) {
            i = length - (i3 + i3);
            StringBuilder stringBuilder = new StringBuilder(i);
            Matcher matcher = g.matcher(str);
            while (i3 > 0 && matcher.find()) {
                int parseInt = Integer.parseInt(matcher.group(1), 16);
                stringBuilder.append(str, i2, matcher.start());
                stringBuilder.append((char) parseInt);
                i2 = matcher.end();
                i3--;
            }
            if (i2 < length) {
                stringBuilder.append(str, i2, length);
            }
            if (stringBuilder.length() != i) {
                return null;
            }
            str = stringBuilder.toString();
        }
        return str;
    }

    public static int a(byte[] bArr, int i) {
        int i2 = -1;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = h[(i2 >>> 24) ^ (bArr[i3] & 255)] ^ (i2 << 8);
        }
        return i2;
    }

    public static int a(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            return 0;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return 1;
        }
        int type = activeNetworkInfo.getType();
        if (type != 0) {
            if (type == 1) {
                return 2;
            }
            if (!(type == 4 || type == 5)) {
                if (type != 6) {
                    return type != 9 ? 8 : 7;
                } else {
                    return 5;
                }
            }
        }
        switch (activeNetworkInfo.getSubtype()) {
            case 1:
            case 2:
                return 3;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 17:
                return 4;
            case 13:
                return 5;
            case 18:
                return 2;
            default:
                return 6;
        }
    }

    public static String b(Context context) {
        if (context != null) {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null) {
                String networkCountryIso = telephonyManager.getNetworkCountryIso();
                if (!TextUtils.isEmpty(networkCountryIso)) {
                    return ozp.e(networkCountryIso);
                }
            }
        }
        return ozp.e(Locale.getDefault().getCountry());
    }

    public static boolean a(oza oza, oza oza2, Inflater inflater) {
        if (oza.b() > 0) {
            byte[] bArr = oza2.a;
            if (bArr.length < oza.b()) {
                int b = oza.b();
                bArr = new byte[(b + b)];
            }
            if (inflater == null) {
                inflater = new Inflater();
            }
            inflater.setInput(oza.a, oza.b, oza.b());
            int i = 0;
            while (true) {
                try {
                    int length = bArr.length;
                    i += inflater.inflate(bArr, i, length - i);
                    if (inflater.finished()) {
                        oza2.a(bArr, i);
                        inflater.reset();
                        return true;
                    } else if (inflater.needsDictionary()) {
                        break;
                    } else if (inflater.needsInput()) {
                        break;
                    } else if (i == length) {
                        bArr = Arrays.copyOf(bArr, length + length);
                    }
                } catch (DataFormatException unused) {
                    inflater.reset();
                } catch (Throwable th) {
                    inflater.reset();
                    throw th;
                }
            }
            inflater.reset();
            return false;
        }
        return false;
    }

    public static boolean c(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static String a(Locale locale) {
        if (a < 21) {
            return locale.toString();
        }
        return locale.toLanguageTag();
    }

    static {
        String str = b;
        String str2 = d;
        String str3 = c;
        int i = a;
        int length = String.valueOf(str).length();
        StringBuilder stringBuilder = new StringBuilder(((length + 17) + String.valueOf(str2).length()) + String.valueOf(str3).length());
        stringBuilder.append(str);
        str = ", ";
        stringBuilder.append(str);
        stringBuilder.append(str2);
        stringBuilder.append(str);
        stringBuilder.append(str3);
        stringBuilder.append(str);
        stringBuilder.append(i);
        e = stringBuilder.toString();
        Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
    }
}
