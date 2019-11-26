package defpackage;

import java.io.File;
import java.io.FileNotFoundException;

/* renamed from: altz */
final /* synthetic */ class altz implements anij {
    private final altr a;
    private final altm b;

    altz(altr altr, altm altm) {
        this.a = altr;
        this.b = altm;
    }

    public final anjv a() {
        altr altr = this.a;
        altm altm = this.b;
        altr.a();
        File file = new File(altr.a, alud.a(altm));
        if (!file.exists() || !file.canRead()) {
            return anjf.a(null);
        }
        try {
            return anjf.a(anbk.b(file));
        } catch (FileNotFoundException unused) {
            return anjf.a(null);
        }
    }
}
