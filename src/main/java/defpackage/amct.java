package defpackage;

import android.graphics.Bitmap;

/* renamed from: amct */
public abstract class amct {
    public abstract String a();

    public abstract Bitmap b();

    public abstract byte[] c();

    public static amcv a(String str) {
        amcn amcn = new amcn();
        if (str != null) {
            amcn.a = str;
            amcn.b = null;
            amcn.c = null;
            return amcn;
        }
        throw new NullPointerException("Null frontendId");
    }
}
