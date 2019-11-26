package defpackage;

/* renamed from: aouh */
public enum aouh implements anxv {
    ANDROID_PLAY_STORE_ENDPOINT_INTENT_TYPE_UNKNOWN(0),
    ANDROID_PLAY_STORE_ENDPOINT_INTENT_TYPE_CLIENT_URL_PLAY_STORE(1),
    ANDROID_PLAY_STORE_ENDPOINT_INTENT_TYPE_FINSKY(2),
    ANDROID_PLAY_STORE_ENDPOINT_INTENT_TYPE_ALLEY_OOP(3);
    
    private final int e;

    public final int getNumber() {
        return this.e;
    }

    public static aouh a(int i) {
        if (i == 0) {
            return ANDROID_PLAY_STORE_ENDPOINT_INTENT_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return ANDROID_PLAY_STORE_ENDPOINT_INTENT_TYPE_CLIENT_URL_PLAY_STORE;
        }
        if (i != 2) {
            return i != 3 ? null : ANDROID_PLAY_STORE_ENDPOINT_INTENT_TYPE_ALLEY_OOP;
        } else {
            return ANDROID_PLAY_STORE_ENDPOINT_INTENT_TYPE_FINSKY;
        }
    }

    public static anxx a() {
        return aoug.a;
    }

    private aouh(int i) {
        this.e = i;
    }

    public final String toString() {
        return Integer.toString(this.e);
    }
}
