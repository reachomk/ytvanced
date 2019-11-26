package defpackage;

import com.google.android.youtube.R;

/* renamed from: ajjx */
public enum ajjx {
    VERY_SMALL(R.string.pref_subtitles_scale_very_small, 0.25f),
    SMALL(R.string.pref_subtitles_scale_small, 0.5f),
    NORMAL(R.string.pref_subtitles_scale_normal, 1.0f),
    LARGE(R.string.pref_subtitles_scale_large, 1.5f),
    VERY_LARGE(R.string.pref_subtitles_scale_very_large, 2.0f);
    
    public static String[] c;
    public static String[] d;
    public final int a;
    public final float b;

    private ajjx(int i, float f) {
        this.a = i;
        this.b = f;
    }

    public static float a() {
        return ajjx.values()[2].b;
    }
}
