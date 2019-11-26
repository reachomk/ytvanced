package defpackage;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/* renamed from: amji */
final class amji implements amjj {
    private final amdl a;
    private final amev b;
    private final File c;

    amji(amdl amdl, amev amev, File file) {
        this.a = amdl;
        this.b = amev;
        this.c = file;
    }

    public final amey a() {
        amdl amdl = this.a;
        if (amdl != null) {
            int a = amdo.a(amdl.b);
            if (a != 0 && a == 6) {
                boolean z = true;
                amqw.b((this.a.a & 2) != 0);
                File file = new File(this.a.c);
                byte[] bArr = new byte[((int) file.length())];
                anaz.a(new BufferedInputStream(new FileInputStream(file)), bArr, bArr.length);
                InputStream a2 = this.b.a(this.c);
                uli d = ulf.d();
                d.a = 4;
                amdl amdl2 = this.a;
                d.b = amdl2.f;
                d.c = amdl2.d;
                d.d = bArr;
                ulf a3 = d.a();
                if (a3.b() > a3.a()) {
                    z = false;
                }
                amqw.a(z);
                return new amey(new ulx(new uma(a2, a3.a(), (long) a3.c().length), a3.b(), a3.c()), a2.b());
            }
        }
        return this.b.a(this.c);
    }
}
