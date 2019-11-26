package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.RectF;
import android.net.Uri;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.util.TypedValue;
import android.view.Display;
import android.view.WindowManager;
import android.widget.Toast;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaTrack;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: sdh */
public final class sdh {
    public static final boolean a = true;
    private static final String b = sdf.a(sdh.class);

    private sdh() {
    }

    public static String a(int i) {
        return DateUtils.formatElapsedTime(((long) i) / 1000);
    }

    public static void a(Context context, int i) {
        Toast.makeText(context, context.getString(i), 1).show();
    }

    public static Uri a(MediaInfo mediaInfo, int i) {
        pjw pjw = mediaInfo.d;
        return (pjw != null && pjw.a.size() > i) ? ((pyb) pjw.a.get(i)).a : null;
    }

    public static Bundle a(MediaInfo mediaInfo) {
        Calendar calendar = null;
        if (mediaInfo == null) {
            return null;
        }
        pjw pjw = mediaInfo.d;
        Bundle bundle = new Bundle();
        String str = "com.google.android.gms.cast.metadata.TITLE";
        bundle.putString(str, pjw.a(str));
        str = "com.google.android.gms.cast.metadata.SUBTITLE";
        bundle.putString(str, pjw.a(str));
        str = "com.google.android.gms.cast.metadata.ALBUM_TITLE";
        bundle.putString(str, pjw.a(str));
        str = "com.google.android.gms.cast.metadata.ALBUM_ARTIST";
        bundle.putString(str, pjw.a(str));
        str = "com.google.android.gms.cast.metadata.COMPOSER";
        bundle.putString(str, pjw.a(str));
        str = "com.google.android.gms.cast.metadata.SERIES_TITLE";
        bundle.putString(str, pjw.a(str));
        str = "com.google.android.gms.cast.metadata.SEASON_NUMBER";
        bundle.putInt(str, pjw.b(str));
        str = "com.google.android.gms.cast.metadata.EPISODE_NUMBER";
        bundle.putInt(str, pjw.b(str));
        String str2 = "com.google.android.gms.cast.metadata.RELEASE_DATE";
        pjw.b(str2, 4);
        str = pjw.b.getString(str2);
        if (str != null) {
            calendar = qoj.a(str);
        }
        if (calendar != null) {
            bundle.putLong(str2, calendar.getTimeInMillis());
        }
        bundle.putInt("media-type", mediaInfo.d.c);
        bundle.putString("movie-urls", mediaInfo.a);
        String str3 = "com.google.android.gms.cast.metadata.STUDIO";
        bundle.putString(str3, pjw.a(str3));
        bundle.putString("content-type", mediaInfo.c);
        bundle.putInt("stream-type", mediaInfo.b);
        bundle.putLong("stream-duration", mediaInfo.e);
        if (!pjw.a.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (pyb pyb : pjw.a) {
                arrayList.add(pyb.a.toString());
            }
            bundle.putStringArrayList("images", arrayList);
        }
        JSONObject jSONObject = mediaInfo.k;
        if (jSONObject != null) {
            bundle.putString("custom-data", jSONObject.toString());
        }
        List list = mediaInfo.f;
        if (!(list == null || list.isEmpty())) {
            try {
                JSONArray jSONArray = new JSONArray();
                for (MediaTrack mediaTrack : mediaInfo.f) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("track-name", mediaTrack.e);
                    jSONObject2.put("track-custom-id", mediaTrack.c);
                    jSONObject2.put("track-id", mediaTrack.a);
                    jSONObject2.put("track-language", mediaTrack.f);
                    jSONObject2.put("track-type", mediaTrack.b);
                    int i = mediaTrack.g;
                    if (i != -1) {
                        jSONObject2.put("track-subtype", i);
                    }
                    JSONObject jSONObject3 = mediaTrack.h;
                    if (jSONObject3 != null) {
                        jSONObject2.put("track-custom-data", jSONObject3.toString());
                    }
                    jSONArray.put(jSONObject2);
                }
                bundle.putString("track-data", jSONArray.toString());
            } catch (JSONException e) {
                sdf.a(b, "mediaInfoToBundle(): Failed to convert Tracks data to json", e);
            }
        }
        return bundle;
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00e3 A:{SYNTHETIC, Splitter:B:25:0x00e3} */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0198  */
    public static com.google.android.gms.cast.MediaInfo a(android.os.Bundle r13) {
        /*
        r0 = 0;
        if (r13 == 0) goto L_0x01e3;
    L_0x0003:
        r1 = new pjw;
        r2 = "media-type";
        r2 = r13.getInt(r2);
        r1.<init>(r2);
        r2 = "com.google.android.gms.cast.metadata.SUBTITLE";
        r3 = r13.getString(r2);
        r1.a(r2, r3);
        r2 = "com.google.android.gms.cast.metadata.TITLE";
        r3 = r13.getString(r2);
        r1.a(r2, r3);
        r2 = "com.google.android.gms.cast.metadata.STUDIO";
        r3 = r13.getString(r2);
        r1.a(r2, r3);
        r2 = "com.google.android.gms.cast.metadata.ALBUM_ARTIST";
        r3 = r13.getString(r2);
        r1.a(r2, r3);
        r2 = "com.google.android.gms.cast.metadata.ALBUM_TITLE";
        r3 = r13.getString(r2);
        r1.a(r2, r3);
        r2 = "com.google.android.gms.cast.metadata.COMPOSER";
        r3 = r13.getString(r2);
        r1.a(r2, r3);
        r2 = "com.google.android.gms.cast.metadata.SERIES_TITLE";
        r3 = r13.getString(r2);
        r1.a(r2, r3);
        r2 = "com.google.android.gms.cast.metadata.SEASON_NUMBER";
        r3 = r13.getInt(r2);
        r1.a(r2, r3);
        r2 = "com.google.android.gms.cast.metadata.EPISODE_NUMBER";
        r3 = r13.getInt(r2);
        r1.a(r2, r3);
        r2 = "com.google.android.gms.cast.metadata.RELEASE_DATE";
        r3 = 0;
        r5 = r13.getLong(r2, r3);
        r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1));
        if (r7 <= 0) goto L_0x007f;
    L_0x006b:
        r7 = java.util.Calendar.getInstance();
        r7.setTimeInMillis(r5);
        r5 = 4;
        defpackage.pjw.b(r2, r5);
        r5 = r1.b;
        r6 = defpackage.qoj.a(r7);
        r5.putString(r2, r6);
    L_0x007f:
        r2 = "images";
        r2 = r13.getStringArrayList(r2);
        r5 = 0;
        if (r2 != 0) goto L_0x0089;
    L_0x0088:
        goto L_0x00ad;
    L_0x0089:
        r6 = r2.isEmpty();
        if (r6 != 0) goto L_0x00ad;
    L_0x008f:
        r6 = r2.size();
        r7 = 0;
    L_0x0094:
        if (r7 >= r6) goto L_0x00ad;
    L_0x0096:
        r8 = r2.get(r7);
        r8 = (java.lang.String) r8;
        r8 = android.net.Uri.parse(r8);
        r9 = new pyb;
        r9.<init>(r8);
        r8 = r1.a;
        r8.add(r9);
        r7 = r7 + 1;
        goto L_0x0094;
    L_0x00ad:
        r2 = "custom-data";
        r2 = r13.getString(r2);
        r6 = android.text.TextUtils.isEmpty(r2);
        if (r6 != 0) goto L_0x00da;
    L_0x00b9:
        r6 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x00bf }
        r6.<init>(r2);	 Catch:{ JSONException -> 0x00bf }
        goto L_0x00db;
    L_0x00bf:
        r6 = b;
        r2 = java.lang.String.valueOf(r2);
        r7 = "Failed to deserialize the custom data string: custom data= ";
        r8 = r2.length();
        if (r8 != 0) goto L_0x00d3;
    L_0x00cd:
        r2 = new java.lang.String;
        r2.<init>(r7);
        goto L_0x00d7;
    L_0x00d3:
        r2 = r7.concat(r2);
    L_0x00d7:
        defpackage.sdf.a(r6, r2);
    L_0x00da:
        r6 = r0;
    L_0x00db:
        r2 = "track-data";
        r7 = r13.getString(r2);
        if (r7 == 0) goto L_0x0181;
    L_0x00e3:
        r7 = new org.json.JSONArray;	 Catch:{ JSONException -> 0x0176 }
        r8 = r13.getString(r2);	 Catch:{ JSONException -> 0x0176 }
        r7.<init>(r8);	 Catch:{ JSONException -> 0x0176 }
        r8 = new java.util.ArrayList;	 Catch:{ JSONException -> 0x0176 }
        r8.<init>();	 Catch:{ JSONException -> 0x0176 }
        r0 = r7.length();	 Catch:{ JSONException -> 0x0174 }
        if (r0 <= 0) goto L_0x0182;
    L_0x00f7:
        r0 = r7.length();	 Catch:{ JSONException -> 0x0174 }
        if (r5 >= r0) goto L_0x0182;
    L_0x00fd:
        r0 = r7.get(r5);	 Catch:{ JSONException -> 0x0174 }
        r0 = (org.json.JSONObject) r0;	 Catch:{ JSONException -> 0x0174 }
        r9 = new pkb;	 Catch:{ JSONException -> 0x0174 }
        r10 = "track-id";
        r10 = r0.getLong(r10);	 Catch:{ JSONException -> 0x0174 }
        r12 = "track-type";
        r12 = r0.getInt(r12);	 Catch:{ JSONException -> 0x0174 }
        r9.<init>(r10, r12);	 Catch:{ JSONException -> 0x0174 }
        r10 = "track-name";
        r10 = r0.has(r10);	 Catch:{ JSONException -> 0x0174 }
        if (r10 == 0) goto L_0x0125;
    L_0x011c:
        r10 = "track-name";
        r10 = r0.getString(r10);	 Catch:{ JSONException -> 0x0174 }
        r9.b(r10);	 Catch:{ JSONException -> 0x0174 }
    L_0x0125:
        r10 = "track-subtype";
        r10 = r0.has(r10);	 Catch:{ JSONException -> 0x0174 }
        if (r10 == 0) goto L_0x0136;
    L_0x012d:
        r10 = "track-subtype";
        r10 = r0.getInt(r10);	 Catch:{ JSONException -> 0x0174 }
        r9.a(r10);	 Catch:{ JSONException -> 0x0174 }
    L_0x0136:
        r10 = "track-custom-id";
        r10 = r0.has(r10);	 Catch:{ JSONException -> 0x0174 }
        if (r10 == 0) goto L_0x0147;
    L_0x013e:
        r10 = "track-custom-id";
        r10 = r0.getString(r10);	 Catch:{ JSONException -> 0x0174 }
        r9.a(r10);	 Catch:{ JSONException -> 0x0174 }
    L_0x0147:
        r10 = "track-language";
        r10 = r0.has(r10);	 Catch:{ JSONException -> 0x0174 }
        if (r10 == 0) goto L_0x0159;
    L_0x014f:
        r10 = "track-language";
        r10 = r0.getString(r10);	 Catch:{ JSONException -> 0x0174 }
        r11 = r9.a;	 Catch:{ JSONException -> 0x0174 }
        r11.f = r10;	 Catch:{ JSONException -> 0x0174 }
    L_0x0159:
        r10 = r0.has(r2);	 Catch:{ JSONException -> 0x0174 }
        if (r10 == 0) goto L_0x016c;
    L_0x015f:
        r10 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x0174 }
        r0 = r0.getString(r2);	 Catch:{ JSONException -> 0x0174 }
        r10.<init>(r0);	 Catch:{ JSONException -> 0x0174 }
        r0 = r9.a;	 Catch:{ JSONException -> 0x0174 }
        r0.h = r10;	 Catch:{ JSONException -> 0x0174 }
    L_0x016c:
        r0 = r9.a;	 Catch:{ JSONException -> 0x0174 }
        r8.add(r0);	 Catch:{ JSONException -> 0x0174 }
        r5 = r5 + 1;
        goto L_0x00f7;
    L_0x0174:
        r0 = move-exception;
        goto L_0x0179;
    L_0x0176:
        r2 = move-exception;
        r8 = r0;
        r0 = r2;
    L_0x0179:
        r2 = b;
        r5 = "Failed to build media tracks from the wrapper bundle";
        defpackage.sdf.a(r2, r5, r0);
        goto L_0x0182;
    L_0x0181:
        r8 = r0;
    L_0x0182:
        r0 = new pjs;
        r2 = "movie-urls";
        r2 = r13.getString(r2);
        r0.<init>(r2);
        r2 = "stream-type";
        r2 = r13.getInt(r2);
        r5 = r0.a;
        r7 = -1;
        if (r2 < r7) goto L_0x01db;
    L_0x0198:
        r7 = 2;
        if (r2 > r7) goto L_0x01db;
    L_0x019b:
        r5.b = r2;
        r2 = "content-type";
        r2 = r13.getString(r2);
        r5 = r0.a;
        r5.c = r2;
        r5.d = r1;
        r5.k = r6;
        r5.f = r8;
        r1 = "stream-duration";
        r2 = r13.containsKey(r1);
        if (r2 == 0) goto L_0x01d8;
    L_0x01b5:
        r5 = r13.getLong(r1);
        r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1));
        if (r2 < 0) goto L_0x01d8;
    L_0x01bd:
        r1 = r13.getLong(r1);
        r13 = r0.a;
        r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));
        if (r5 >= 0) goto L_0x01d6;
    L_0x01c7:
        r3 = -1;
        r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));
        if (r5 != 0) goto L_0x01ce;
    L_0x01cd:
        goto L_0x01d6;
    L_0x01ce:
        r13 = new java.lang.IllegalArgumentException;
        r0 = "Invalid stream duration";
        r13.<init>(r0);
        throw r13;
    L_0x01d6:
        r13.e = r1;
    L_0x01d8:
        r13 = r0.a;
        return r13;
    L_0x01db:
        r13 = new java.lang.IllegalArgumentException;
        r0 = "invalid stream type";
        r13.<init>(r0);
        throw r13;
    L_0x01e3:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sdh.a(android.os.Bundle):com.google.android.gms.cast.MediaInfo");
    }

    public static String a(Context context) {
        WifiInfo connectionInfo = ((WifiManager) context.getSystemService("wifi")).getConnectionInfo();
        return connectionInfo != null ? connectionInfo.getSSID() : null;
    }

    public static Bitmap a(Bitmap bitmap, int i, int i2) {
        if (bitmap == null) {
            return null;
        }
        float f = (float) i2;
        float width = (float) bitmap.getWidth();
        float f2 = (float) i;
        float height = (float) bitmap.getHeight();
        float max = Math.max(f / width, f2 / height);
        width *= max;
        max *= height;
        f = (f - width) / 2.0f;
        f2 = (f2 - max) / 2.0f;
        RectF rectF = new RectF(f, f2, width + f, max + f2);
        Bitmap createBitmap = Bitmap.createBitmap(i2, i, bitmap.getConfig());
        new Canvas(createBitmap).drawBitmap(bitmap, null, rectF, null);
        return createBitmap;
    }

    public static int a(Context context, float f) {
        return (int) TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    public static String a(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException(String.valueOf(str2).concat(" cannot be null or empty"));
    }

    public static Point b(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return point;
    }
}
