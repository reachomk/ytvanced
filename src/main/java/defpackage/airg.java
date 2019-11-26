package defpackage;

/* renamed from: airg */
public final class airg {
    public static /* synthetic */ String a(int i) {
        switch (i) {
            case 1:
                return "NEW";
            case 2:
                return "VIDEO_LOADING";
            case 3:
                return "VIDEO_PLAYBACK_ERROR";
            case 4:
                return "VIDEO_PLAYBACK_LOADED";
            case 5:
                return "VIDEO_WATCH_LOADED";
            case 6:
                return "SEQUENCE_EMPTY";
            default:
                return "null";
        }
    }

    public static boolean a(int i, int i2) {
        return i + -1 >= i2 + -1;
    }

    public static boolean a(int i, int... iArr) {
        for (int i2 : iArr) {
            if (i == i2) {
                return true;
            }
        }
        return false;
    }
}
