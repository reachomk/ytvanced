package defpackage;

/* renamed from: awqk */
public enum awqk implements anxv {
    PROMOTED_SPARKLES_VIDEO_APP_CLICK_BEHAVIOR_TYPE_UNKNOWN(0),
    PROMOTED_SPARKLES_VIDEO_APP_CLICK_BEHAVIOR_TYPE_NOOP(1),
    PROMOTED_SPARKLES_VIDEO_APP_CLICK_BEHAVIOR_TYPE_PLAY_VIDEO_ON_WATCH_PAGE(2),
    PROMOTED_SPARKLES_VIDEO_APP_CLICK_BEHAVIOR_TYPE_OPEN_APP_INSTALL(3),
    PROMOTED_SPARKLES_VIDEO_APP_CLICK_BEHAVIOR_TYPE_OPEN_CHANNEL(4);
    
    private final int f;

    public final int getNumber() {
        return this.f;
    }

    public static awqk a(int i) {
        if (i == 0) {
            return PROMOTED_SPARKLES_VIDEO_APP_CLICK_BEHAVIOR_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return PROMOTED_SPARKLES_VIDEO_APP_CLICK_BEHAVIOR_TYPE_NOOP;
        }
        if (i == 2) {
            return PROMOTED_SPARKLES_VIDEO_APP_CLICK_BEHAVIOR_TYPE_PLAY_VIDEO_ON_WATCH_PAGE;
        }
        if (i != 3) {
            return i != 4 ? null : PROMOTED_SPARKLES_VIDEO_APP_CLICK_BEHAVIOR_TYPE_OPEN_CHANNEL;
        } else {
            return PROMOTED_SPARKLES_VIDEO_APP_CLICK_BEHAVIOR_TYPE_OPEN_APP_INSTALL;
        }
    }

    public static anxx a() {
        return awqn.a;
    }

    private awqk(int i) {
        this.f = i;
    }

    public final String toString() {
        return Integer.toString(this.f);
    }
}
