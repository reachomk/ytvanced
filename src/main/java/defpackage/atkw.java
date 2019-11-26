package defpackage;

/* renamed from: atkw */
public enum atkw implements anxv {
    CONTAINER_ID_UNKNOWN(0),
    CONTAINER_ID_NONE(1),
    CONTAINER_ID_MP4(2),
    CONTAINER_ID_MATROSKA(3),
    CONTAINER_ID_WEBM(4);
    
    public final int f;

    public final int getNumber() {
        return this.f;
    }

    public static atkw a(int i) {
        if (i == 0) {
            return CONTAINER_ID_UNKNOWN;
        }
        if (i == 1) {
            return CONTAINER_ID_NONE;
        }
        if (i == 2) {
            return CONTAINER_ID_MP4;
        }
        if (i != 3) {
            return i != 4 ? null : CONTAINER_ID_WEBM;
        } else {
            return CONTAINER_ID_MATROSKA;
        }
    }

    public static anxx a() {
        return atkv.a;
    }

    private atkw(int i) {
        this.f = i;
    }

    public final String toString() {
        return Integer.toString(this.f);
    }
}
