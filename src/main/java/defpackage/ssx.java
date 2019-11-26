package defpackage;

import com.youtube.android.libraries.elements.templates.EkoProcessor;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: ssx */
final /* synthetic */ class ssx implements bbnv {
    private final ssy a;
    private final azvx b;
    private final swg c;

    ssx(ssy ssy, azvx azvx, swg swg) {
        this.a = ssy;
        this.b = azvx;
        this.c = swg;
    }

    public final Object a(Object obj) {
        ssy ssy = this.a;
        azvx azvx = this.b;
        swg swg = this.c;
        byte[] bArr = (byte[]) ((amqp) obj).a(new byte[0]);
        azsb azsb = azvx.c;
        if (azsb == null) {
            azsb = azsb.a;
        }
        EkoProcessor a = EkoProcessor.a(azsb);
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            azwa azwa = (azwa) azwb.e.createBuilder();
            anvu a2 = anvu.a(bArr);
            azwa.copyOnWrite();
            azwb azwb = (azwb) azwa.instance;
            if (a2 != null) {
                azwb azwb2;
                azwb.a |= 1;
                azwb.b = a2;
                if (swg != null) {
                    amqp e = swg.e();
                    if (e.a()) {
                        azvl azvl = (azvl) e.b();
                        azwa.copyOnWrite();
                        azwb2 = (azwb) azwa.instance;
                        if (azvl != null) {
                            azwb2.c = azvl;
                            azwb2.a |= 2;
                        } else {
                            throw new NullPointerException();
                        }
                    }
                }
                azvz azvz = azvx.d;
                if (azvz == null) {
                    azvz = azvz.a;
                }
                azwa.copyOnWrite();
                azwb2 = (azwb) azwa.instance;
                if (azvz != null) {
                    azwb2.d = azvz;
                    azwb2.a |= 4;
                    anuy a3 = a.a(((azwb) ((anxl) azwa.build())).toByteArray(), byteArrayOutputStream);
                    if (a3.b == 0) {
                        ssy.a.a(azvx.b, byteArrayOutputStream.toByteArray());
                        return bblt.a();
                    }
                    String str = "Eko processor error: ";
                    String valueOf = String.valueOf(a3.c);
                    if (valueOf.length() == 0) {
                        valueOf = new String(str);
                    } else {
                        valueOf = str.concat(valueOf);
                    }
                    throw new sxf(valueOf);
                }
                throw new NullPointerException();
            }
            throw new NullPointerException();
        } catch (IOException e2) {
            throw new sxf("Invalid eko template", e2);
        }
    }
}
