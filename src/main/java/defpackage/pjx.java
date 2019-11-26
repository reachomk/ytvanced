package defpackage;

import com.google.android.gms.cast.MediaInfo;
import org.json.JSONObject;

/* renamed from: pjx */
public final class pjx {
    private final pjy a;

    public pjx(MediaInfo mediaInfo) {
        this.a = new pjy(mediaInfo);
    }

    public pjx(JSONObject jSONObject) {
        this.a = new pjy(jSONObject);
    }

    public final pjy a() {
        pjy pjy = this.a;
        if (pjy.a == null) {
            throw new IllegalArgumentException("media cannot be null.");
        } else if (Double.isNaN(pjy.c) || pjy.c < 0.0d) {
            throw new IllegalArgumentException("startTime cannot be negative or NaN.");
        } else if (Double.isNaN(pjy.d)) {
            throw new IllegalArgumentException("playbackDuration cannot be NaN.");
        } else if (!Double.isNaN(pjy.e) && pjy.e >= 0.0d) {
            return this.a;
        } else {
            throw new IllegalArgumentException("preloadTime cannot be negative or Nan.");
        }
    }
}
