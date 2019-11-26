package defpackage;

/* renamed from: ashm */
public enum ashm implements anxv {
    CAMERA_UNKNOWN(0),
    CAMERA_NONE(1),
    CAMERA_BACK(2),
    CAMERA_FRONT(3),
    CAMERA_FRONT_AND_BACK(4);
    
    public final int f;

    public final int getNumber() {
        return this.f;
    }

    public static ashm a(int i) {
        if (i == 0) {
            return CAMERA_UNKNOWN;
        }
        if (i == 1) {
            return CAMERA_NONE;
        }
        if (i == 2) {
            return CAMERA_BACK;
        }
        if (i != 3) {
            return i != 4 ? null : CAMERA_FRONT_AND_BACK;
        } else {
            return CAMERA_FRONT;
        }
    }

    public static anxx a() {
        return ashp.a;
    }

    private ashm(int i) {
        this.f = i;
    }

    public final String toString() {
        return Integer.toString(this.f);
    }
}
