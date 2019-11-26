package defpackage;

import android.util.SparseArray;

/* renamed from: acen */
final class acen extends SparseArray {
    acen() {
        put(1, "INIT");
        put(4, "SPEED_TEST");
        put(2, "CREATE_INGESTION_REQUEST");
        put(3, "CREATE_INGESTION_FAILED");
        put(5, "RECONNECT_INIT");
        put(6, "START_ENCODER");
        put(7, "START_REQUEST");
        put(8, "LIVE");
        put(9, "STOP_REQUEST");
        put(10, "STOP_FLUSH");
        put(11, "STOP_ENCODER");
        put(12, "DONE");
        put(13, "ERROR");
    }
}
