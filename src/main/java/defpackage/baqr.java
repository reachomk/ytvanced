package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

/* renamed from: baqr */
public final class baqr implements barf {
    private final File a = new File(System.getProperty("java.io.tmpdir"));
    private final List b;

    public baqr() {
        if (!this.a.exists()) {
            this.a.mkdirs();
        }
        this.b = new ArrayList();
    }

    public final void a() {
        for (barg a : this.b) {
            try {
                a.a();
            } catch (Exception e) {
                baqk.d.log(Level.WARNING, "could not delete file ", e);
            }
        }
        this.b.clear();
    }

    public final barg b() {
        baqs baqs = new baqs(this.a);
        this.b.add(baqs);
        return baqs;
    }
}
