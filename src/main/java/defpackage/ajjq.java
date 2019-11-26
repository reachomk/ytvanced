package defpackage;

import com.google.android.youtube.R;

/* renamed from: ajjq */
public enum ajjq {
    NONE(R.string.pref_subtitles_none, 0),
    UNIFORM(R.string.pref_subtitles_uniform, 1),
    DROP_SHADOW(R.string.pref_subtitles_drop_shadow, 2),
    RAISED(R.string.pref_subtitles_raised, 3),
    DEPRESSED(R.string.pref_subtitles_depressed, 4);
    
    public static String[] c;
    public static String[] d;
    public final int a;
    public final int b;

    private ajjq(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public static int a() {
        return ajjq.values()[0].b;
    }
}
