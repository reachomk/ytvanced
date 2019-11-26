package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings.Secure;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.WindowManager;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.UUID;

@qlp
/* renamed from: qmh */
public final class qmh {
    public static final Handler a = new Handler(Looper.getMainLooper());
    private static final String b = pbh.class.getName();
    private static final String c = pbj.class.getName();
    private static final String d = pbz.class.getName();
    private static final String e = pcc.class.getName();
    private static final String f = peh.class.getName();
    private static final String g = pbe.class.getName();

    public static void a(HttpURLConnection httpURLConnection) {
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setInstanceFollowRedirects(true);
        httpURLConnection.setReadTimeout(60000);
        httpURLConnection.setUseCaches(false);
    }

    public static int a(Context context, int i) {
        return qmh.a(context.getResources().getDisplayMetrics(), i);
    }

    public static int a(DisplayMetrics displayMetrics, int i) {
        return (int) TypedValue.applyDimension(1, (float) i, displayMetrics);
    }

    public static String a(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        String string = contentResolver != null ? Secure.getString(contentResolver, "android_id") : null;
        if (string == null || qmh.a()) {
            string = "emulator";
        }
        return qmh.a(string);
    }

    public static boolean a() {
        return Build.DEVICE.startsWith("generic");
    }

    public static boolean b() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    private static String a(String str) {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest.getInstance("MD5").update(str.getBytes());
                str = String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, r2.digest())});
                return str;
            } catch (NoSuchAlgorithmException unused) {
                i++;
            } catch (ArithmeticException unused2) {
                return null;
            }
        }
        return null;
    }

    public static boolean b(Context context) {
        return psh.b(context, 12451000) == 0;
    }

    public static boolean c(Context context) {
        if (context.getResources().getConfiguration().orientation == 2) {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            if (((int) (((float) displayMetrics.heightPixels) / displayMetrics.density)) < 600) {
                return true;
            }
        }
        return false;
    }

    public static boolean d(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        defaultDisplay.getRealMetrics(displayMetrics);
        int i = displayMetrics.heightPixels;
        int i2 = displayMetrics.widthPixels;
        defaultDisplay.getMetrics(displayMetrics);
        return displayMetrics.heightPixels == i && displayMetrics.widthPixels == i2;
    }

    public static int e(Context context) {
        int identifier = context.getResources().getIdentifier("navigation_bar_width", "dimen", "android");
        return identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : 0;
    }

    public static String a(StackTraceElement[] stackTraceElementArr, String str) {
        int i;
        String str2;
        int i2 = 0;
        while (true) {
            i = i2 + 1;
            if (i >= stackTraceElementArr.length) {
                str2 = null;
                break;
            }
            StackTraceElement stackTraceElement = stackTraceElementArr[i2];
            String className = stackTraceElement.getClassName();
            if (!("loadAd".equalsIgnoreCase(stackTraceElement.getMethodName()) && (b.equalsIgnoreCase(className) || c.equalsIgnoreCase(className) || d.equalsIgnoreCase(className) || e.equalsIgnoreCase(className) || f.equalsIgnoreCase(className) || g.equalsIgnoreCase(className)))) {
                i2 = i;
            }
        }
        str2 = stackTraceElementArr[i].getClassName();
        if (str != null) {
            String str3 = ".";
            StringTokenizer stringTokenizer = new StringTokenizer(str, str3);
            StringBuilder stringBuilder = new StringBuilder();
            if (stringTokenizer.hasMoreElements()) {
                CharSequence str4;
                stringBuilder.append(stringTokenizer.nextToken());
                int i3 = 2;
                while (true) {
                    int i4 = i3 - 1;
                    if (i3 <= 0 || !stringTokenizer.hasMoreElements()) {
                        str4 = stringBuilder.toString();
                    } else {
                        stringBuilder.append(str3);
                        stringBuilder.append(stringTokenizer.nextToken());
                        i3 = i4;
                    }
                }
                str4 = stringBuilder.toString();
            }
            if (!(str2 == null || str2.contains(str4))) {
                return str2;
            }
        }
        return null;
    }

    public static String c() {
        UUID randomUUID = UUID.randomUUID();
        byte[] toByteArray = BigInteger.valueOf(randomUUID.getLeastSignificantBits()).toByteArray();
        byte[] toByteArray2 = BigInteger.valueOf(randomUUID.getMostSignificantBits()).toByteArray();
        String bigInteger = new BigInteger(1, toByteArray).toString();
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                instance.update(toByteArray);
                instance.update(toByteArray2);
                byte[] bArr = new byte[8];
                System.arraycopy(instance.digest(), 0, bArr, 0, 8);
                bigInteger = new BigInteger(1, bArr).toString();
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return bigInteger;
    }

    /* JADX WARNING: Missing block: B:16:0x0078, code skipped:
            if (r11 == null) goto L_0x0093;
     */
    public static java.lang.Throwable a(java.lang.Throwable r14) {
        /*
        r0 = defpackage.roe.b;
        r1 = defpackage.rlj.d();
        r0 = r1.a(r0);
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 != 0) goto L_0x00e1;
    L_0x0012:
        r0 = new java.util.LinkedList;
        r0.<init>();
    L_0x0017:
        if (r14 == 0) goto L_0x0021;
    L_0x0019:
        r0.push(r14);
        r14 = r14.getCause();
        goto L_0x0017;
    L_0x0021:
        r14 = 0;
    L_0x0022:
        r1 = r0.isEmpty();
        if (r1 != 0) goto L_0x00e1;
    L_0x0028:
        r1 = r0.pop();
        r1 = (java.lang.Throwable) r1;
        r2 = r1.getStackTrace();
        r3 = new java.util.ArrayList;
        r3.<init>();
        r4 = new java.lang.StackTraceElement;
        r5 = r1.getClass();
        r5 = r5.getName();
        r6 = 1;
        r7 = "<filtered>";
        r4.<init>(r5, r7, r7, r6);
        r3.add(r4);
        r4 = r2.length;
        r5 = 0;
        r8 = 0;
        r9 = 0;
    L_0x004e:
        if (r8 >= r4) goto L_0x00bc;
    L_0x0050:
        r10 = r2[r8];
        r11 = r10.getClassName();
        r12 = android.text.TextUtils.isEmpty(r11);
        if (r12 != 0) goto L_0x0093;
    L_0x005c:
        r12 = defpackage.roe.c;
        r13 = defpackage.rlj.d();
        r12 = r13.a(r12);
        r12 = (java.lang.String) r12;
        r12 = r11.startsWith(r12);
        if (r12 != 0) goto L_0x008e;
    L_0x006e:
        r12 = java.lang.Class.forName(r11);	 Catch:{ Exception -> 0x007b }
        r13 = defpackage.qlp.class;
        r11 = r12.isAnnotationPresent(r13);	 Catch:{ Exception -> 0x007b }
        if (r11 != 0) goto L_0x008e;
    L_0x007a:
        goto L_0x0093;
        r12 = "Fail to check class type for class ";
        r13 = r11.length();
        if (r13 != 0) goto L_0x008a;
    L_0x0084:
        r11 = new java.lang.String;
        r11.<init>(r12);
        goto L_0x0093;
    L_0x008a:
        r12.concat(r11);
        goto L_0x0093;
    L_0x008e:
        r3.add(r10);
        r9 = 1;
        goto L_0x00b9;
    L_0x0093:
        r11 = r10.getClassName();
        r12 = android.text.TextUtils.isEmpty(r11);
        if (r12 != 0) goto L_0x00b1;
    L_0x009d:
        r12 = "android.";
        r12 = r11.startsWith(r12);
        if (r12 != 0) goto L_0x00ad;
    L_0x00a5:
        r12 = "java.";
        r11 = r11.startsWith(r12);
        if (r11 == 0) goto L_0x00b1;
    L_0x00ad:
        r3.add(r10);
        goto L_0x00b9;
    L_0x00b1:
        r10 = new java.lang.StackTraceElement;
        r10.<init>(r7, r7, r7, r6);
        r3.add(r10);
    L_0x00b9:
        r8 = r8 + 1;
        goto L_0x004e;
    L_0x00bc:
        if (r9 == 0) goto L_0x0022;
    L_0x00be:
        if (r14 != 0) goto L_0x00ca;
    L_0x00c0:
        r14 = new java.lang.Throwable;
        r1 = r1.getMessage();
        r14.<init>(r1);
        goto L_0x00d4;
    L_0x00ca:
        r2 = new java.lang.Throwable;
        r1 = r1.getMessage();
        r2.<init>(r1, r14);
        r14 = r2;
    L_0x00d4:
        r1 = new java.lang.StackTraceElement[r5];
        r1 = r3.toArray(r1);
        r1 = (java.lang.StackTraceElement[]) r1;
        r14.setStackTrace(r1);
        goto L_0x0022;
    L_0x00e1:
        return r14;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qmh.a(java.lang.Throwable):java.lang.Throwable");
    }
}
