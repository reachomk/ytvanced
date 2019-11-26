package defpackage;

/* renamed from: aytx */
public enum aytx implements anxv {
    UPLOAD_FLOW_SOURCE_UNKNOWN(0),
    UPLOAD_FLOW_SOURCE_YOUTUBE_APP_GALLERY(1),
    UPLOAD_FLOW_SOURCE_YOUTUBE_APP_IN_APP_CAMERA(2),
    UPLOAD_FLOW_SOURCE_YOUTUBE_APP_SYSTEM_CAMERA(3),
    UPLOAD_FLOW_SOURCE_YOUTUBE_APP_INTERNAL(4),
    UPLOAD_FLOW_SOURCE_EXTERNAL(5),
    UPLOAD_FLOW_SOURCE_EXTERNAL_YTGO(64);
    
    public final int g;

    public final int getNumber() {
        return this.g;
    }

    public static aytx a(int i) {
        if (i == 0) {
            return UPLOAD_FLOW_SOURCE_UNKNOWN;
        }
        if (i == 1) {
            return UPLOAD_FLOW_SOURCE_YOUTUBE_APP_GALLERY;
        }
        if (i == 2) {
            return UPLOAD_FLOW_SOURCE_YOUTUBE_APP_IN_APP_CAMERA;
        }
        if (i == 3) {
            return UPLOAD_FLOW_SOURCE_YOUTUBE_APP_SYSTEM_CAMERA;
        }
        if (i == 4) {
            return UPLOAD_FLOW_SOURCE_YOUTUBE_APP_INTERNAL;
        }
        if (i != 5) {
            return i != 64 ? null : UPLOAD_FLOW_SOURCE_EXTERNAL_YTGO;
        } else {
            return UPLOAD_FLOW_SOURCE_EXTERNAL;
        }
    }

    public static anxx a() {
        return ayua.a;
    }

    private aytx(int i) {
        this.g = i;
    }

    public final String toString() {
        return Integer.toString(this.g);
    }
}
