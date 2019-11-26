package defpackage;

import com.youtube.android.libraries.elements.templates.EkoProcessor;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: ssz */
final /* synthetic */ class ssz implements bbnv {
    private final sta a;
    private final azwp b;

    ssz(sta sta, azwp azwp) {
        this.a = sta;
        this.b = azwp;
    }

    public final Object a(Object obj) {
        sta sta = this.a;
        azwp azwp = this.b;
        byte[] bArr = (byte[]) ((amqp) obj).a(sta.b);
        EkoProcessor a = EkoProcessor.a(azwp.c.d());
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            anuy a2 = a.a(bArr, byteArrayOutputStream);
            if (a2.b == 0) {
                sta.a.a(azwp.b, byteArrayOutputStream.toByteArray());
                return bblt.a();
            }
            String str = "Eko processor error: ";
            String valueOf = String.valueOf(a2.c);
            throw new sxf(valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
        } catch (IOException e) {
            throw new sxf("Invalid eko template", e);
        }
    }
}
