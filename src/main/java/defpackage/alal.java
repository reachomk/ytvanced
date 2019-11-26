package defpackage;

import android.util.SparseArray;

/* renamed from: alal */
final class alal extends SparseArray {
    alal() {
        append(0, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"});
        append(1, new String[]{"android.permission.CAMERA"});
        append(2, new String[]{"android.permission.RECORD_AUDIO"});
        append(3, new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"});
    }
}
