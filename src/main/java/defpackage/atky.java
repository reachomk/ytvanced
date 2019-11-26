package defpackage;

/* renamed from: atky */
public enum atky implements anxv {
    PIXEL_FORMAT_ID_UNKNOWN(0),
    PIXEL_FORMAT_ID_YUV420P(1),
    PIXEL_FORMAT_ID_YUYV422(2),
    PIXEL_FORMAT_ID_RGB24(3),
    PIXEL_FORMAT_ID_BGR24(4);
    
    public final int f;

    public final int getNumber() {
        return this.f;
    }

    public static atky a(int i) {
        if (i == 0) {
            return PIXEL_FORMAT_ID_UNKNOWN;
        }
        if (i == 1) {
            return PIXEL_FORMAT_ID_YUV420P;
        }
        if (i == 2) {
            return PIXEL_FORMAT_ID_YUYV422;
        }
        if (i != 3) {
            return i != 4 ? null : PIXEL_FORMAT_ID_BGR24;
        } else {
            return PIXEL_FORMAT_ID_RGB24;
        }
    }

    public static anxx a() {
        return atkx.a;
    }

    private atky(int i) {
        this.f = i;
    }

    public final String toString() {
        return Integer.toString(this.f);
    }
}
