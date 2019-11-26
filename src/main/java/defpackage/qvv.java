package defpackage;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

/* renamed from: qvv */
final class qvv {
    public static void a(qxu qxu) {
        rau.a(qvv.a(qxu.a().a()));
        qvv.a(qxu.a().b());
        if (qxu.aV_() != qxm.UNKNOWN_FORMAT) {
            qvb.a(qxu.b().a());
            return;
        }
        throw new GeneralSecurityException("unknown EC point format");
    }

    public static String a(qyh qyh) {
        int i = qvy.a[qyh.ordinal()];
        if (i == 1) {
            return "HmacSha1";
        }
        if (i == 2) {
            return "HmacSha256";
        }
        if (i == 3) {
            return "HmacSha512";
        }
        String valueOf = String.valueOf(qyh);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 27);
        stringBuilder.append("hash unsupported for HMAC: ");
        stringBuilder.append(valueOf);
        throw new NoSuchAlgorithmException(stringBuilder.toString());
    }

    public static int a(qyf qyf) {
        int i = qvy.b[qyf.ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                if (i == 3) {
                    return 3;
                }
                String valueOf = String.valueOf(qyf);
                StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 20);
                stringBuilder.append("unknown curve type: ");
                stringBuilder.append(valueOf);
                throw new GeneralSecurityException(stringBuilder.toString());
            }
        }
        return i2;
    }

    public static int a(qxm qxm) {
        int i = qvy.c[qxm.ordinal()];
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        String valueOf = String.valueOf(qxm);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 22);
        stringBuilder.append("unknown point format: ");
        stringBuilder.append(valueOf);
        throw new GeneralSecurityException(stringBuilder.toString());
    }
}
