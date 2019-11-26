package defpackage;

import android.content.Context;

/* renamed from: bxf */
public final class bxf extends bxe {
    public bxf(Context context) {
        this(context, "image_manager_disk_cache", 262144000);
    }

    public bxf(Context context, String str, long j) {
        super(new bxi(context, str), j);
    }
}
