package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: sts */
public final class sts {
    private static final sts b = new sts(stj.a);
    public final byte[] a;

    public static sts a(sxq sxq) {
        try {
            anwf a = anwf.a(sxq.b);
            if (a.u()) {
                return b;
            }
            a.a();
            return new sts(a.m());
        } catch (IOException e) {
            throw new sxf("Error reading extension from model", e);
        }
    }

    public final sxq a(int i) {
        try {
            OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            anwm a = anwm.a(byteArrayOutputStream);
            a.a(i, this.a);
            a.i();
            return new sxq(byteArrayOutputStream.toByteArray());
        } catch (IOException e) {
            throw new sxf("Error adding extension to model", e);
        }
    }

    public sts(byte[] bArr) {
        this.a = bArr;
    }
}
