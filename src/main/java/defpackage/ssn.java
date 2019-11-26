package defpackage;

import com.youtube.android.libraries.elements.templates.EkoProcessor;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: ssn */
final /* synthetic */ class ssn implements bbnv {
    private final ssl a;
    private final EkoProcessor b;
    private final swg c;

    ssn(ssl ssl, EkoProcessor ekoProcessor, swg swg) {
        this.a = ssl;
        this.b = ekoProcessor;
        this.c = swg;
    }

    public final Object a(Object obj) {
        ssl ssl = this.a;
        EkoProcessor ekoProcessor = this.b;
        swg swg = this.c;
        sxq sxq = (sxq) obj;
        swf swf = (swf) ssl.a.get();
        try {
            OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            anuy a = ekoProcessor.a(sts.a(sxq).a, byteArrayOutputStream);
            if (a.b == 0) {
                return swf.a((azsr) anxl.parseFrom(azsr.a, byteArrayOutputStream.toByteArray(), anxa.c()), swg);
            }
            String str = "Eko processor error: ";
            String valueOf = String.valueOf(a.c);
            throw new sxf(valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
        } catch (IOException e) {
            throw new sxf("Invalid eko template", e);
        }
    }
}
