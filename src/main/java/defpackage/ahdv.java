package defpackage;

import android.net.Uri.Builder;
import java.io.IOException;

/* renamed from: ahdv */
public final class ahdv implements ahdx {
    private final ovi a;
    private final ahdy b;

    public ahdv(ovi ovi, ahdy ahdy) {
        this.a = ovi;
        this.b = ahdy;
    }

    public final byte[] a(String str, arlv arlv) {
        arlv arlv2 = arlv;
        String str2 = "Failed to close data source";
        long j = 0;
        if (arlv2.o > 0) {
            try {
                this.a.a(new ovm(new Builder().build(), 0, arlv2.o, aeey.a(str, arlv2.c, arlv2.r, arlv2.n)));
                byte[] bArr = new byte[1048576];
                while (j < arlv2.o) {
                    ahdy ahdy = this.b;
                    int i = 1048576;
                    int i2 = 0;
                    while (i > 0) {
                        int a = this.a.a(bArr, i2, i);
                        if (a == -1) {
                            break;
                        }
                        i2 += a;
                        i -= a;
                    }
                    ahdy.a(bArr, i2);
                    j += (long) i2;
                }
                byte[] a2 = this.b.a();
                try {
                    this.a.a();
                } catch (IOException e) {
                    xtl.a(str2, e);
                }
                return a2;
            } catch (IOException e2) {
                String valueOf = String.valueOf(e2);
                StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 28);
                stringBuilder.append("Failed to read byte stream: ");
                stringBuilder.append(valueOf);
                xtl.c(stringBuilder.toString());
                try {
                    this.a.a();
                } catch (IOException e3) {
                    xtl.a(str2, e3);
                }
                return null;
            } catch (Throwable e32) {
                Throwable th = e32;
                try {
                    this.a.a();
                } catch (IOException e322) {
                    xtl.a(str2, e322);
                }
            }
        } else {
            xtl.d("Trying to compute hash on stream of length 0, ignoring.");
            return null;
        }
    }
}
