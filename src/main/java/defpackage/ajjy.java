package defpackage;

import com.google.android.youtube.R;

/* renamed from: ajjy */
public enum ajjy {
    WHITE_ON_BLACK(R.string.pref_subtitles_style_white_on_black, 0),
    BLACK_ON_WHITE(R.string.pref_subtitles_style_black_on_white, 1),
    YELLOW_ON_BLACK(R.string.pref_subtitles_style_yellow_on_black, 2),
    YELLOW_ON_BLUE(R.string.pref_subtitles_style_yellow_on_blue, 3),
    CUSTOM(R.string.pref_subtitles_style_custom, 4);
    
    public static String[] h;
    public static String[] i;
    public final int f;
    public final int g;

    private ajjy(int i, int i2) {
        this.f = i;
        this.g = i2;
    }
}
