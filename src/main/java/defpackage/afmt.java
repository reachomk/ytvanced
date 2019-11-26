package defpackage;

import android.content.SharedPreferences;
import android.net.Uri;

/* renamed from: afmt */
public enum afmt {
    PRODUCTION("https://youtubei.googleapis.com"),
    STAGING("https://green-youtubei.sandbox.googleapis.com"),
    RELEASE("https://release-youtubei.sandbox.googleapis.com"),
    TEST("https://test-youtubei.sandbox.googleapis.com"),
    CAMI("http://cami-youtubei.sandbox.googleapis.com"),
    uYTFE("https://uytfe.sandbox.google.com"),
    PPG("http://127.0.0.1:8787");
    
    private final Uri h;

    public static int a() {
        return 0;
    }

    private afmt(String str) {
        this.h = Uri.parse(str);
    }

    /* Access modifiers changed, original: final */
    public final Uri a(SharedPreferences sharedPreferences) {
        return equals(PPG) ? Uri.parse(sharedPreferences.getString("PPGHost", "http://127.0.0.1:8787")) : this.h;
    }

    public static afmt b(SharedPreferences sharedPreferences) {
        amqw.a((Object) sharedPreferences);
        String string = sharedPreferences.getString("ApiaryHostSelection", afmt.values()[0].toString());
        try {
            return (afmt) Enum.valueOf(afmt.class, string);
        } catch (IllegalArgumentException unused) {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(string).length() + 93);
            stringBuilder.append("Bogus value in shared preferences for key ApiaryHostSelection value ");
            stringBuilder.append(string);
            stringBuilder.append(" returning default value.");
            xtl.c(stringBuilder.toString());
            return afmt.values()[0];
        }
    }
}
