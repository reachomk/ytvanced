package defpackage;

import com.google.android.apps.youtube.app.settings.SubtitlesLegacyPrefsFragment;

/* renamed from: jcd */
public final class jcd implements Runnable {
    private final /* synthetic */ SubtitlesLegacyPrefsFragment a;

    public jcd(SubtitlesLegacyPrefsFragment subtitlesLegacyPrefsFragment) {
        this.a = subtitlesLegacyPrefsFragment;
    }

    public final void run() {
        this.a.a();
        this.a.a.setVisibility(0);
    }
}
