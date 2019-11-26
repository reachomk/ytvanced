package defpackage;

import android.app.ActivityManager;
import android.content.Context;

/* renamed from: akll */
public final class akll implements akmi {
    private final int a;

    public akll(Context context, aort aort) {
        float f;
        boolean isLowRamDevice = ((ActivityManager) context.getSystemService("activity")).isLowRamDevice();
        if (isLowRamDevice) {
            f = aort.f;
        } else {
            f = aort.e;
        }
        if (f <= 0.0f) {
            f = !isLowRamDevice ? 4.0f : 2.5f;
        }
        bxl bxl = new bxl(context);
        bxl.h = 0;
        chw.a(true, "Bitmap pool screens must be greater than or equal to 0");
        bxl.e = 0.0f;
        bxl.a(f);
        this.a = bxl.a().b;
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.a;
    }
}
