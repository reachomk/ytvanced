package defpackage;

/* renamed from: aytw */
public enum aytw implements anxv {
    UPLOAD_FEATURE_UNKNOWN(0),
    UPLOAD_FEATURE_STREAMING(2),
    UPLOAD_FEATURE_PHOTO(3),
    UPLOAD_FEATURE_LOCAL_TRANSCODE_REQUIRED(4),
    UPLOAD_FEATURE_NO_STORAGE_PERMISSION(5);
    
    public final int c;

    public final int getNumber() {
        return this.c;
    }

    public static aytw a(int i) {
        if (i == 0) {
            return UPLOAD_FEATURE_UNKNOWN;
        }
        if (i == 2) {
            return UPLOAD_FEATURE_STREAMING;
        }
        if (i == 3) {
            return UPLOAD_FEATURE_PHOTO;
        }
        if (i != 4) {
            return i != 5 ? null : UPLOAD_FEATURE_NO_STORAGE_PERMISSION;
        } else {
            return UPLOAD_FEATURE_LOCAL_TRANSCODE_REQUIRED;
        }
    }

    public static anxx a() {
        return aytv.a;
    }

    private aytw(int i) {
        this.c = i;
    }

    public final String toString() {
        return Integer.toString(this.c);
    }
}
