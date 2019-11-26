package defpackage;

import com.youtube.android.libraries.elements.templates.UnifiedTemplateResolver;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: suo */
final class suo implements syf {
    private final byte[] a;
    private final byte[] b;
    private final /* synthetic */ sum c;

    public suo(sum sum, byte[] bArr, byte[] bArr2) {
        this.c = sum;
        this.a = bArr;
        this.b = bArr2;
    }

    public final bdhc a(sxq sxq) {
        try {
            OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            anuy a = ((UnifiedTemplateResolver) this.c.a.a()).a(this.a, suh.a(this.c.b, sxq), this.b, byteArrayOutputStream, this.c.c);
            int i = a.b;
            if (i == 0) {
                return bdhc.a(byteArrayOutputStream.toByteArray());
            }
            String str = a.c;
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 52);
            stringBuilder.append("UnifiedTemplateResolver returned error ");
            stringBuilder.append(i);
            stringBuilder.append(": ");
            stringBuilder.append(str);
            throw new sxf(stringBuilder.toString());
        } catch (IOException e) {
            throw new sxf("Error resolving template with UnifiedTemplateResolver", e);
        }
    }
}
