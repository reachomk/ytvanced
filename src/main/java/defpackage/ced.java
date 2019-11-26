package defpackage;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import java.io.ByteArrayOutputStream;

/* renamed from: ced */
public final class ced implements ceh {
    private final CompressFormat a = CompressFormat.JPEG;
    private final int b = 100;

    public final bvw a(bvw bvw, bsq bsq) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) bvw.b()).compress(this.a, this.b, byteArrayOutputStream);
        bvw.d();
        return new cdg(byteArrayOutputStream.toByteArray());
    }
}
