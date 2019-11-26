package defpackage;

import android.graphics.Bitmap;
import java.util.Arrays;

/* renamed from: amco */
final class amco extends amct {
    private final String a;
    private final Bitmap b;
    private final byte[] c;

    public final String a() {
        return this.a;
    }

    public final Bitmap b() {
        return this.b;
    }

    public final byte[] c() {
        return this.c;
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String arrays = Arrays.toString(this.c);
        int length = String.valueOf(str).length();
        StringBuilder stringBuilder = new StringBuilder(((length + 75) + valueOf.length()) + String.valueOf(arrays).length());
        stringBuilder.append("UploadNotificationModel{frontendId=");
        stringBuilder.append(str);
        stringBuilder.append(", thumbnail=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", notificationEndpointData=");
        stringBuilder.append(arrays);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof amct) {
            amct amct = (amct) obj;
            if (this.a.equals(amct.a())) {
                Bitmap bitmap = this.b;
                if (bitmap == null ? amct.b() == null : bitmap.equals(amct.b())) {
                    if (Arrays.equals(this.c, amct instanceof amco ? ((amco) amct).c : amct.c())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        Bitmap bitmap = this.b;
        return ((hashCode ^ (bitmap != null ? bitmap.hashCode() : 0)) * 1000003) ^ Arrays.hashCode(this.c);
    }

    /* synthetic */ amco(String str, Bitmap bitmap, byte[] bArr) {
        this.a = str;
        this.b = bitmap;
        this.c = bArr;
    }
}
