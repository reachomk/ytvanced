package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: syt */
public final class syt {
    public static boolean a(bapc bapc, anrc anrc, int i, syw syw) {
        baoz baoz = new baoz();
        int i2 = 0;
        while (i2 < bapc.a()) {
            bapc.a(baoz, i2);
            if (baoz.a() != i) {
                i2++;
            } else {
                syw.a(baoz.c(), anrc);
                return true;
            }
        }
        return false;
    }

    public static azsr a(baoz baoz) {
        if (baoz == null) {
            return null;
        }
        if (baoz.d() == 0) {
            return azsr.a;
        }
        if (baoz.d() == 2) {
            byte[] bArr = new byte[baoz.b()];
            baoz.c().get(bArr);
            try {
                OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                anwm a = anwm.a(byteArrayOutputStream);
                a.a(baoz.a(), bArr);
                a.i();
                return (azsr) anxl.parseFrom(azsr.a, byteArrayOutputStream.toByteArray(), anxa.c());
            } catch (anyg e) {
                throw new sxf("Failed to create wrapper Command", e);
            } catch (IOException e2) {
                throw new sxf("Failed to compose wireformat Command", e2);
            }
        }
        throw new sxf("Unexpected Command serialization format. Are you running PbToFb with extension whitelist?");
    }
}
