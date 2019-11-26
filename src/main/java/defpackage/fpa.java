package defpackage;

import com.google.android.youtube.R;

/* renamed from: fpa */
public enum fpa {
    PUBLIC(R.string.video_privacy_public),
    UNLISTED(R.string.video_privacy_unlisted),
    PRIVATE(R.string.video_privacy_private);
    
    public final int d;

    public static fpa a(String str) {
        return (fpa) Enum.valueOf(fpa.class, str);
    }

    private fpa(int i) {
        this.d = i;
    }
}
