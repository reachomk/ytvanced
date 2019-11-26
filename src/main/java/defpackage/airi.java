package defpackage;

/* renamed from: airi */
public enum airi {
    NEW,
    PLAYBACK_PENDING,
    PLAYBACK_LOADED,
    PLAYBACK_INTERRUPTED,
    INTERSTITIAL_REQUESTED,
    INTERSTITIAL_PLAYING,
    READY,
    VIDEO_REQUESTED,
    VIDEO_PLAYING,
    ENDED;

    public final boolean a(airi airi) {
        return ordinal() >= airi.ordinal();
    }

    public final boolean a(airi... airiArr) {
        for (airi airi : airiArr) {
            if (this == airi) {
                return true;
            }
        }
        return false;
    }

    public final boolean a() {
        return a(INTERSTITIAL_REQUESTED, INTERSTITIAL_PLAYING);
    }

    public final boolean b() {
        return a(PLAYBACK_INTERRUPTED) || a();
    }

    public final boolean c() {
        return a(INTERSTITIAL_REQUESTED, VIDEO_REQUESTED, PLAYBACK_PENDING);
    }

    public final boolean d() {
        return a(INTERSTITIAL_PLAYING, VIDEO_PLAYING);
    }

    public final boolean e() {
        return d() || c();
    }

    public final boolean f() {
        return a(VIDEO_REQUESTED, VIDEO_PLAYING);
    }
}
