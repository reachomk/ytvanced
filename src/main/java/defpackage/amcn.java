package defpackage;

import android.graphics.Bitmap;

/* renamed from: amcn */
final class amcn extends amcv {
    public String a;
    public Bitmap b;
    public byte[] c;

    amcn() {
    }

    public final amcv a(Bitmap bitmap) {
        this.b = bitmap;
        return this;
    }

    public final amcv a(byte[] bArr) {
        this.c = bArr;
        return this;
    }

    public final amct a() {
        String str = "";
        if (this.a == null) {
            str = str.concat(" frontendId");
        }
        if (str.isEmpty()) {
            return new amco(this.a, this.b, this.c);
        }
        String str2 = "Missing required properties:";
        if (str.length() == 0) {
            str = new String(str2);
        } else {
            str = str2.concat(str);
        }
        throw new IllegalStateException(str);
    }
}
