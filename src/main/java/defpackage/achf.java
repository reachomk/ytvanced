package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.WindowManager;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: achf */
public final class achf {
    private static final String a;
    private static final String b;
    private static achf c;
    private SparseArray d;
    private SparseArray e;
    private ache f;
    private final MediaCodecList g;

    public static achf a(Context context, SharedPreferences sharedPreferences) {
        amqw.a((Object) context);
        amqw.a((Object) sharedPreferences);
        MediaCodecList mediaCodecList = new MediaCodecList(0);
        if (c == null) {
            c = new achf(context.getApplicationContext(), sharedPreferences, mediaCodecList);
        }
        return c;
    }

    private static int b(int i) {
        return i * 1000000;
    }

    private static int c(int i) {
        return i * 1000;
    }

    public static int a(MediaFormat mediaFormat) {
        amqw.a((Object) mediaFormat);
        return mediaFormat.containsKey(a) ? mediaFormat.getInteger(a) : 0;
    }

    public static int b(MediaFormat mediaFormat) {
        amqw.a((Object) mediaFormat);
        String str = "bitrate";
        return mediaFormat.containsKey(str) ? mediaFormat.getInteger(str) : 0;
    }

    public static int c(MediaFormat mediaFormat) {
        amqw.a((Object) mediaFormat);
        return mediaFormat.containsKey(b) ? mediaFormat.getInteger(b) : 0;
    }

    public final boolean a(int i) {
        SparseArray sparseArray = this.d;
        if (!(sparseArray == null || sparseArray.get(i) == null || this.f == null)) {
            sparseArray = this.e;
            if (!(sparseArray == null || sparseArray.get(i) == null || this.f == null)) {
                return true;
            }
        }
        return false;
    }

    public final MediaFormat a(int i, boolean z) {
        achh achh;
        if (z) {
            achh = (achh) this.e.get(i);
        } else {
            achh = (achh) this.d.get(i);
        }
        if (achh == null) {
            return null;
        }
        MediaFormat a = achf.a(achh.a, true);
        achf.a(a, achh);
        return a;
    }

    public final MediaFormat a() {
        ache ache = this.f;
        if (ache == null) {
            return null;
        }
        MediaFormat a = achf.a(ache.a);
        achf.a(a, this.f);
        return a;
    }

    private achf(Context context, SharedPreferences sharedPreferences, MediaCodecList mediaCodecList) {
        SparseArray sparseArray;
        JSONObject jSONObject;
        SharedPreferences sharedPreferences2 = sharedPreferences;
        this.g = mediaCodecList;
        if (sharedPreferences2.getInt(":ENCODING_PROFILE_CACHE_VERSION", 12) == 13) {
            String string = sharedPreferences2.getString(":ENCODING_PROFILE_CACHE_VALUE", null);
            if (!TextUtils.isEmpty(string)) {
                ache ache;
                sparseArray = new SparseArray(4);
                SparseArray sparseArray2 = new SparseArray(4);
                try {
                    JSONObject jSONObject2 = new JSONObject(string);
                    jSONObject = jSONObject2.getJSONObject("OBJECT_KEY_AUDIO_PARAMS");
                    ache = new ache(jSONObject.getInt("OBJECT_KEY_MAX_BITRATE"), jSONObject.getBoolean("OBJECT_KEY_SPECIFY_PROFILE"));
                    ache.c = jSONObject.getInt("OBJECT_KEY_CHANNEL_COUNT");
                    ache.b = jSONObject.getInt("OBJECT_KEY_SAMPLE_RATE");
                    ache.e = true;
                    achf.a(sparseArray, jSONObject2.getJSONArray("OBJECT_KEY_VIDEO_LANDSCAPE_PARAMS_ARRAY"));
                    achf.a(sparseArray2, jSONObject2.getJSONArray("OBJECT_KEY_VIDEO_PORTRAIT_PARAMS_ARRAY"));
                } catch (JSONException e) {
                    Log.e("EncodingProfiles", "Could not extract encoding profiles from cache", e);
                    ache = null;
                }
                if (!(ache == null || sparseArray.size() == 0 || sparseArray2.size() == 0)) {
                    this.f = ache;
                    this.d = sparseArray;
                    this.e = sparseArray2;
                }
            }
        }
        if (this.f == null || this.d == null || this.e == null) {
            CharSequence jSONObject3;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getRealMetrics(displayMetrics);
            int max = Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels);
            int min = Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels);
            SparseArray sparseArray3 = new SparseArray(3);
            if (max >= 1920 && min >= 1080) {
                sparseArray3.put(1, new ArrayList(amul.a(new achh(1920, 1080, achf.c(1500), achf.b(4), true), new achh(1920, 1080, achf.c(1500), achf.b(4), false), new achh(1920, 1080, achf.c(1500), achf.b(3), true), new achh(1920, 1080, achf.c(1500), achf.b(3), false), new achh(1920, 1080, achf.c(1500), achf.b(2), false), new achh(1920, 1072, achf.c(1500), achf.b(4), true), new achh(1920, 1072, achf.c(1500), achf.b(4), false), new achh(1920, 1072, achf.c(1500), achf.b(3), true), new achh(1920, 1072, achf.c(1500), achf.b(3), false), new achh(1920, 1072, achf.c(1500), achf.b(2), false))));
            }
            if (max >= 1280 && min >= 720) {
                achh achh = r12;
                achh achh2 = new achh(1280, 720, achf.c(1100), achf.c(2500), true);
                achh achh3 = new achh(1280, 720, achf.c(1100), achf.c(2500), false);
                achh achh4 = r13;
                achh achh5 = new achh(1280, 720, achf.c(1100), achf.b(2), true);
                sparseArray3.put(2, new ArrayList(amul.a(achh, achh3, achh4, new achh(1280, 720, achf.c(1100), achf.b(2), false))));
            }
            if (max >= 856 && min >= 480) {
                sparseArray3.put(3, new ArrayList(amul.a(new achh(856, 480, achf.c(600), achf.c(1500), true), new achh(856, 480, achf.c(600), achf.c(1500), false), new achh(856, 480, achf.c(550), achf.c(1200), true), new achh(856, 480, achf.c(550), achf.c(1200), false), new achh(720, 480, achf.c(600), achf.c(1500), true), new achh(720, 480, achf.c(600), achf.c(1500), false), new achh(720, 480, achf.c(500), achf.c(1200), true), new achh(720, 480, achf.c(500), achf.c(1200), false), new achh(640, 480, achf.c(500), achf.c(1500), true), new achh(640, 480, achf.c(500), achf.c(1500), false), new achh(640, 480, achf.c(400), achf.c(1200), true), new achh(640, 480, achf.c(400), achf.c(1200), false), new achh(848, 480, achf.c(600), achf.c(1500), true), new achh(848, 480, achf.c(600), achf.c(1500), false), new achh(848, 480, achf.c(550), achf.c(1200), true), new achh(848, 480, achf.c(550), achf.c(1200), false))));
            }
            if (max >= 640 && min >= 360) {
                sparseArray3.put(4, new ArrayList(amul.a(new achh(640, 360, achf.c(300), achf.b(1), true), new achh(640, 360, achf.c(300), achf.b(1), false), new achh(640, 360, achf.c(300), achf.c(800), true), new achh(640, 360, achf.c(300), achf.c(800), false), new achh(480, 360, achf.c(300), achf.b(1), true), new achh(480, 360, achf.c(300), achf.b(1), false), new achh(480, 360, achf.c(300), achf.c(800), true), new achh(480, 360, achf.c(300), achf.c(800), false), new achh(640, 352, achf.c(300), achf.b(1), true), new achh(640, 352, achf.c(300), achf.b(1), false), new achh(640, 352, achf.c(300), achf.c(800), true), new achh(640, 352, achf.c(300), achf.c(800), false), new achh[0])));
            }
            if (max >= 428 && min >= 240) {
                sparseArray3.put(5, new ArrayList(amul.a(new achh(428, 240, achf.c(200), achf.c(700), true), new achh(428, 240, achf.c(200), achf.c(700), false), new achh(428, 240, achf.c(200), achf.c(650), true), new achh(428, 240, achf.c(200), achf.c(650), false), new achh(320, 240, achf.c(200), achf.c(700), true), new achh(320, 240, achf.c(200), achf.c(700), false), new achh(320, 240, achf.c(200), achf.c(650), true), new achh(320, 240, achf.c(200), achf.c(650), false), new achh(432, 240, achf.c(200), achf.c(700), true), new achh(432, 240, achf.c(200), achf.c(700), false), new achh(432, 240, achf.c(200), achf.c(650), true), new achh(432, 240, achf.c(200), achf.c(650), false), new achh[0])));
            }
            max = Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels);
            int max2 = Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels);
            sparseArray = new SparseArray(3);
            if (max >= 812 && max2 >= 1440) {
                sparseArray.put(1, new ArrayList(amul.a(new achh(812, 1440, achf.b(1), achf.b(3), true), new achh(812, 1440, achf.b(1), achf.b(3), false), new achh(812, 1440, achf.b(1), achf.b(2), true), new achh(812, 1440, achf.b(1), achf.b(2), false), new achh(812, 1440, achf.b(1), achf.c(1500), false), new achh(816, 1440, achf.b(1), achf.b(3), true), new achh(816, 1440, achf.b(1), achf.b(3), false), new achh(816, 1440, achf.b(1), achf.b(2), true), new achh(816, 1440, achf.b(1), achf.b(2), false), new achh(816, 1440, achf.b(1), achf.c(1500), false))));
            }
            if (max >= 608 && max2 >= 1080) {
                sparseArray.put(2, new ArrayList(amul.a(new achh(608, 1080, achf.c(750), achf.b(2), true), new achh(608, 1080, achf.c(750), achf.b(2), false), new achh(608, 1080, achf.c(750), achf.c(1500), true), new achh(608, 1080, achf.c(750), achf.c(1500), false), new achh(608, 1080, achf.c(750), achf.c(1100), false), new achh(608, 1072, achf.c(750), achf.b(2), true), new achh(608, 1072, achf.c(750), achf.b(2), false), new achh(608, 1072, achf.c(750), achf.c(1500), true), new achh(608, 1072, achf.c(750), achf.c(1500), false), new achh(608, 1072, achf.c(750), achf.c(1100), false))));
            }
            if (max >= 404 && max2 >= 720) {
                sparseArray.put(3, new ArrayList(amul.a(new achh(404, 720, achf.c(400), achf.b(1), true), new achh(404, 720, achf.c(400), achf.b(1), false), new achh(404, 720, achf.c(400), achf.c(800), true), new achh(404, 720, achf.c(400), achf.c(800), false), new achh(540, 720, achf.c(400), achf.b(1), true), new achh(540, 720, achf.c(400), achf.b(1), false), new achh(540, 720, achf.c(400), achf.c(800), true), new achh(540, 720, achf.c(400), achf.c(800), false), new achh(400, 720, achf.c(400), achf.b(1), true), new achh(400, 720, achf.c(400), achf.b(1), false), new achh(400, 720, achf.c(400), achf.c(800), true), new achh(400, 720, achf.c(400), achf.c(800), false), new achh[0])));
            }
            if (max >= 272 && max2 >= 480) {
                sparseArray.put(4, new ArrayList(amul.a(new achh(272, 480, achf.c(300), achf.c(700), false), new achh(272, 480, achf.c(300), achf.c(700), true), new achh(272, 480, achf.c(300), achf.c(650), false), new achh(272, 480, achf.c(300), achf.c(650), true), new achh(360, 480, achf.c(300), achf.c(700), true), new achh(360, 480, achf.c(300), achf.c(700), false), new achh(360, 480, achf.c(300), achf.c(650), true), new achh(360, 480, achf.c(300), achf.c(650), false))));
            }
            if (max >= 180 && max2 >= 240) {
                sparseArray.put(5, new ArrayList(amul.a(new achh(204, 360, achf.c(200), achf.c(600), true), new achh(204, 360, achf.c(200), achf.c(600), false), new achh(204, 360, achf.c(200), achf.c(550), true), new achh(204, 360, achf.c(200), achf.c(550), false), new achh(180, 240, achf.c(200), achf.c(600), true), new achh(180, 240, achf.c(200), achf.c(600), false), new achh(180, 240, achf.c(200), achf.c(550), true), new achh(180, 240, achf.c(200), achf.c(550), false), new achh(208, 368, achf.c(200), achf.c(600), true), new achh(208, 368, achf.c(200), achf.c(600), false), new achh(208, 368, achf.c(200), achf.c(550), true), new achh(208, 368, achf.c(200), achf.c(550), false), new achh[0])));
            }
            ArrayList arrayList = new ArrayList(amul.a(new ache(achf.c(128), true), new ache(achf.c(128), false), new ache(achf.c(64), true), new ache(achf.c(64), false)));
            MediaCodecInfo[] codecInfos = this.g.getCodecInfos();
            MediaFormat a = achf.a(true, false);
            MediaFormat a2 = achf.a(false, false);
            MediaFormat a3 = achf.a(true);
            MediaFormat a4 = achf.a(false);
            for (MediaCodecInfo mediaCodecInfo : codecInfos) {
                if (mediaCodecInfo.isEncoder()) {
                    String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                    if (achf.a(supportedTypes, "video/avc")) {
                        CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType("video/avc");
                        achf.a(capabilitiesForType, sparseArray3, a, a2);
                        achf.a(capabilitiesForType, sparseArray, a, a2);
                    }
                    if (achf.a(supportedTypes, "audio/mp4a-latm")) {
                        CodecCapabilities capabilitiesForType2 = mediaCodecInfo.getCapabilitiesForType("audio/mp4a-latm");
                        int size = arrayList.size();
                        for (int i = 0; i < size; i++) {
                            ache ache2 = (ache) arrayList.get(i);
                            MediaFormat mediaFormat = !ache2.a ? a4 : a3;
                            achf.a(mediaFormat, ache2);
                            if (capabilitiesForType2.isFormatSupported(mediaFormat)) {
                                ache2.e = true;
                            }
                        }
                    }
                }
            }
            int size2 = arrayList.size();
            for (max2 = 0; max2 < size2; max2++) {
                ache ache3 = (ache) arrayList.get(max2);
                if (ache3.e) {
                    this.f = ache3;
                    break;
                }
            }
            this.d = new SparseArray(4);
            achf.a(sparseArray3, this.d);
            this.e = new SparseArray(4);
            achf.a(sparseArray, this.e);
            Editor edit = sharedPreferences.edit();
            edit.remove(":ENCODING_PROFILE_CACHE_VERSION");
            edit.remove(":ENCODING_PROFILE_CACHE_VALUE");
            edit.apply();
            try {
                jSONObject = new JSONObject();
                ache ache4 = this.f;
                amqw.a(ache4.e);
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("OBJECT_KEY_CHANNEL_COUNT", ache4.c);
                jSONObject4.put("OBJECT_KEY_SAMPLE_RATE", ache4.b);
                jSONObject4.put("OBJECT_KEY_MAX_BITRATE", ache4.d);
                jSONObject4.put("OBJECT_KEY_SPECIFY_PROFILE", ache4.a);
                jSONObject.put("OBJECT_KEY_AUDIO_PARAMS", jSONObject4);
                jSONObject.put("OBJECT_KEY_VIDEO_LANDSCAPE_PARAMS_ARRAY", achf.a(this.d));
                jSONObject.put("OBJECT_KEY_VIDEO_PORTRAIT_PARAMS_ARRAY", achf.a(this.e));
                jSONObject3 = jSONObject.toString();
            } catch (Exception e2) {
                Log.e("EncodingProfiles", "Could not cache encoding profiles", e2);
                jSONObject3 = null;
            }
            if (!TextUtils.isEmpty(jSONObject3)) {
                edit.putInt(":ENCODING_PROFILE_CACHE_VERSION", 13);
                edit.putString(":ENCODING_PROFILE_CACHE_VALUE", jSONObject3);
                edit.apply();
            }
        }
    }

    private static void a(SparseArray sparseArray, SparseArray sparseArray2) {
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int keyAt = sparseArray.keyAt(i);
            ArrayList arrayList = (ArrayList) sparseArray.get(keyAt);
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                achh achh = (achh) arrayList.get(i2);
                if (achh.g) {
                    sparseArray2.put(keyAt, achh);
                    break;
                }
            }
        }
    }

    private static void a(SparseArray sparseArray, JSONArray jSONArray) {
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            int i2 = jSONObject.getInt("OBJECT_KEY_QUALITY");
            achh achh = new achh(jSONObject.getInt("OBJECT_KEY_WIDTH"), jSONObject.getInt("OBJECT_KEY_HEIGHT"), jSONObject.getInt("OBJECT_KEY_MIN_BITRATE"), jSONObject.getInt("OBJECT_KEY_MAX_BITRATE"), jSONObject.getBoolean("OBJECT_KEY_SPECIFY_PROFILE"));
            achh.g = true;
            sparseArray.put(i2, achh);
        }
    }

    private static JSONArray a(SparseArray sparseArray) {
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < sparseArray.size(); i++) {
            int keyAt = sparseArray.keyAt(i);
            achh achh = (achh) sparseArray.get(keyAt);
            amqw.a(achh.g);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("OBJECT_KEY_QUALITY", keyAt);
            jSONObject.put("OBJECT_KEY_WIDTH", achh.b);
            jSONObject.put("OBJECT_KEY_HEIGHT", achh.c);
            jSONObject.put("OBJECT_KEY_MIN_BITRATE", achh.d);
            jSONObject.put("OBJECT_KEY_MAX_BITRATE", achh.f);
            jSONObject.put("OBJECT_KEY_SPECIFY_PROFILE", achh.a);
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    private static void a(CodecCapabilities codecCapabilities, SparseArray sparseArray, MediaFormat mediaFormat, MediaFormat mediaFormat2) {
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ArrayList arrayList = (ArrayList) sparseArray.get(sparseArray.keyAt(i));
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                achh achh = (achh) arrayList.get(i2);
                MediaFormat mediaFormat3 = !achh.a ? mediaFormat2 : mediaFormat;
                achf.a(mediaFormat3, achh);
                if (codecCapabilities.isFormatSupported(mediaFormat3)) {
                    achh.g = true;
                }
            }
        }
    }

    private static boolean a(String[] strArr, String str) {
        for (CharSequence equals : strArr) {
            if (TextUtils.equals(equals, str)) {
                return true;
            }
        }
        return false;
    }

    private static void a(MediaFormat mediaFormat, ache ache) {
        mediaFormat.setInteger("bitrate", ache.d);
        long j = ((long) ache.b) * ((long) ache.c);
        mediaFormat.setInteger("max-input-size", (int) (((j + j) * 50) / 1000));
        mediaFormat.setInteger("channel-count", ache.c);
        mediaFormat.setInteger("channel-mask", ache.c == 1 ? 16 : 12);
        mediaFormat.setInteger("sample-rate", ache.b);
    }

    private static MediaFormat a(boolean z) {
        MediaFormat createAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", 0, 0);
        if (z) {
            createAudioFormat.setInteger("aac-profile", 2);
        }
        return createAudioFormat;
    }

    private static void a(MediaFormat mediaFormat, achh achh) {
        mediaFormat.setInteger("bitrate", achh.e);
        mediaFormat.setInteger("width", achh.b);
        mediaFormat.setInteger("height", achh.c);
        mediaFormat.setInteger(b, achh.f);
        mediaFormat.setInteger(a, achh.d);
    }

    private static MediaFormat a(boolean z, boolean z2) {
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", 0, 0);
        createVideoFormat.setInteger("color-format", 2130708361);
        createVideoFormat.setInteger("channel-count", 1);
        createVideoFormat.setInteger("i-frame-interval", 2);
        if (z2) {
            createVideoFormat.setInteger("frame-rate", 30);
        }
        if (z) {
            createVideoFormat.setInteger("profile", 32);
        }
        return createVideoFormat;
    }

    static {
        Class cls = achf.class;
        a = cls.getName().concat(":MEDIA_FORMAT_KEY_MIN_BITRATE");
        b = cls.getName().concat(":MEDIA_FORMAT_KEY_MAX_BITRATE");
    }
}
