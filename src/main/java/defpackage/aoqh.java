package defpackage;

/* renamed from: aoqh */
public enum aoqh implements anxv {
    ANDROID_ADS_DEBOUNCE_ENDPOINT_TYPE_UNKNOWN(0),
    ANDROID_ADS_DEBOUNCE_ENDPOINT_TYPE_APP_INSTALL(1),
    ANDROID_ADS_DEBOUNCE_ENDPOINT_TYPE_URL(2),
    ANDROID_ADS_DEBOUNCE_ENDPOINT_TYPE_APP_DEEP_LINK(3);
    
    public final int e;

    public final int getNumber() {
        return this.e;
    }

    public static aoqh a(int i) {
        if (i == 0) {
            return ANDROID_ADS_DEBOUNCE_ENDPOINT_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return ANDROID_ADS_DEBOUNCE_ENDPOINT_TYPE_APP_INSTALL;
        }
        if (i != 2) {
            return i != 3 ? null : ANDROID_ADS_DEBOUNCE_ENDPOINT_TYPE_APP_DEEP_LINK;
        } else {
            return ANDROID_ADS_DEBOUNCE_ENDPOINT_TYPE_URL;
        }
    }

    public static anxx a() {
        return aoqg.a;
    }

    private aoqh(int i) {
        this.e = i;
    }

    public final String toString() {
        return Integer.toString(this.e);
    }
}
