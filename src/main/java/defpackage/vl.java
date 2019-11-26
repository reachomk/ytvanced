package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;

/* renamed from: vl */
public final class vl {
    private final Bundle a;

    public vl() {
        this.a = new Bundle();
    }

    public vl(vj vjVar) {
        this.a = new Bundle(vjVar.b);
        wq.a(this.a);
    }

    public vl(vj vjVar, int i) {
        this(vjVar);
        for (String str : this.a.keySet()) {
            Object obj = this.a.get(str);
            if (obj instanceof Bitmap) {
                Bitmap bitmap = (Bitmap) obj;
                if (bitmap.getHeight() > i || bitmap.getWidth() > i) {
                    float f = (float) i;
                    f = Math.min(f / ((float) bitmap.getWidth()), f / ((float) bitmap.getHeight()));
                    a(str, Bitmap.createScaledBitmap(bitmap, (int) (((float) bitmap.getWidth()) * f), (int) (((float) bitmap.getHeight()) * f), true));
                }
            }
        }
    }

    public final vl a(String str, String str2) {
        if (!vj.a.containsKey(str) || ((Integer) vj.a.get(str)).intValue() == 1) {
            this.a.putCharSequence(str, str2);
            return this;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("The ");
        stringBuilder.append(str);
        stringBuilder.append(" key cannot be used to put a String");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public final vl a(String str, long j) {
        if (!vj.a.containsKey(str) || ((Integer) vj.a.get(str)).intValue() == 0) {
            this.a.putLong(str, j);
            return this;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("The ");
        stringBuilder.append(str);
        stringBuilder.append(" key cannot be used to put a long");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public final vl a(String str, Bitmap bitmap) {
        if (!vj.a.containsKey(str) || ((Integer) vj.a.get(str)).intValue() == 2) {
            this.a.putParcelable(str, bitmap);
            return this;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("The ");
        stringBuilder.append(str);
        stringBuilder.append(" key cannot be used to put a Bitmap");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public final vj a() {
        return new vj(this.a);
    }
}
