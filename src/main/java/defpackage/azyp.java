package defpackage;

import java.io.InputStream;

/* renamed from: azyp */
public final class azyp {
    public final int a;
    public final azyn b;
    public final InputStream c;

    public azyp(int i, azyn azyn, InputStream inputStream) {
        this.a = i;
        this.b = azyn;
        this.c = inputStream;
    }

    public final String a() {
        Object str;
        String b = this.b.b("X-GUploader-UploadID");
        int i = this.a;
        String valueOf = String.valueOf(this.b);
        if (b != null) {
            String str2 = "\n Upload id: ";
            str = b.length() == 0 ? new String(str2) : str2.concat(b);
        } else {
            str = "\n No upload id.";
        }
        StringBuilder stringBuilder = new StringBuilder((valueOf.length() + 30) + String.valueOf(str).length());
        stringBuilder.append("HttpResponse:\n   ");
        stringBuilder.append(i);
        stringBuilder.append("  ");
        stringBuilder.append(valueOf);
        stringBuilder.append(str);
        return stringBuilder.toString();
    }
}
