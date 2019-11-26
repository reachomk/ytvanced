package defpackage;

/* renamed from: azal */
public enum azal implements anxv {
    DOWNLOAD_STATE_UNKNOWN(0),
    DOWNLOAD_STATE_NOT_DOWNLOADED(1),
    DOWNLOAD_STATE_PENDING_DOWNLOAD(2),
    DOWNLOAD_STATE_DOWNLOAD_IN_PROGRESS(3),
    DOWNLOAD_STATE_COMPLETE(4),
    DOWNLOAD_STATE_FAILED(5);
    
    public final int c;

    public final int getNumber() {
        return this.c;
    }

    public static azal a(int i) {
        if (i == 0) {
            return DOWNLOAD_STATE_UNKNOWN;
        }
        if (i == 1) {
            return DOWNLOAD_STATE_NOT_DOWNLOADED;
        }
        if (i == 2) {
            return DOWNLOAD_STATE_PENDING_DOWNLOAD;
        }
        if (i == 3) {
            return DOWNLOAD_STATE_DOWNLOAD_IN_PROGRESS;
        }
        if (i != 4) {
            return i != 5 ? null : DOWNLOAD_STATE_FAILED;
        } else {
            return DOWNLOAD_STATE_COMPLETE;
        }
    }

    public static anxx a() {
        return azao.a;
    }

    private azal(int i) {
        this.c = i;
    }

    public final String toString() {
        return Integer.toString(this.c);
    }
}
