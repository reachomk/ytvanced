package defpackage;

import android.util.SparseArray;

/* renamed from: agqf */
public enum agqf {
    DELETED(-1),
    COMPLETE(0),
    ACTIVE(1),
    FAILED_UNKNOWN(2),
    NO_STORAGE_ERROR(3),
    DISK_IO_ERROR(4),
    NETWORK_READ_ERROR(5),
    CANNOT_OFFLINE(6),
    PAUSED(7),
    STREAM_DOWNLOAD_PENDING(8),
    REQUIRES_CONTENT_VERIFICATION(9),
    CONTENT_VERIFICATION_FAILED(10),
    STREAM_CORRUPT(11),
    METADATA_ONLY(12),
    STREAMS_OUT_OF_DATE(13);
    
    private static final SparseArray q = null;
    public final int p;

    private agqf(int i) {
        this.p = i;
    }

    public final boolean a() {
        return (this == PAUSED || this == ACTIVE) ? false : true;
    }

    public static agqf a(int i) {
        return (agqf) q.get(i);
    }

    static {
        q = new SparseArray();
        agqf[] values = agqf.values();
        int length = values.length;
        int i;
        while (i < length) {
            agqf agqf = values[i];
            q.put(agqf.p, agqf);
            i++;
        }
    }
}
