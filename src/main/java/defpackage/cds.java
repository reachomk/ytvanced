package defpackage;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;

/* renamed from: cds */
public final class cds implements bsc {
    private final bwd a;
    private final bwb b;

    public cds(bwd bwd, bwb bwb) {
        this.a = bwd;
        this.b = bwb;
    }

    public final Bitmap a(int i, int i2, Config config) {
        return this.a.b(i, i2, config);
    }

    public final void a(Bitmap bitmap) {
        this.a.a(bitmap);
    }

    public final byte[] a(int i) {
        bwb bwb = this.b;
        if (bwb != null) {
            return (byte[]) bwb.a(i, byte[].class);
        }
        return new byte[i];
    }

    public final void a(byte[] bArr) {
        bwb bwb = this.b;
        if (bwb != null) {
            bwb.b(bArr);
        }
    }

    public final int[] b(int i) {
        bwb bwb = this.b;
        if (bwb != null) {
            return (int[]) bwb.a(i, int[].class);
        }
        return new int[i];
    }

    public final void a(int[] iArr) {
        bwb bwb = this.b;
        if (bwb != null) {
            bwb.b(iArr);
        }
    }
}
