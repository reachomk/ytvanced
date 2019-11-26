package defpackage;

import com.google.android.youtube.R;
import java.util.List;

/* renamed from: sck */
final class sck extends sbr {
    private final /* synthetic */ scf a;

    public final void c() {
        this.a.ac.a();
    }

    public final void c(int i) {
        this.a.ac.a();
    }

    public final void l() {
        try {
            scf scf = this.a;
            scf.b = scf.c.v();
            this.a.W();
            this.a.X();
        } catch (sbt | sbv e) {
            sdf.a(scf.a, "Failed to update the metadata due to network issues", e);
        }
    }

    public final void d(int i) {
        if (i != 0) {
            sdh.a(this.a.p(), (int) R.string.ccl_failed_to_load_media);
            this.a.ac.a();
        }
    }

    public final void a(int i, int i2) {
        String.valueOf(this.a.a(i)).length();
        if (i2 == 2100 || i2 == 2102) {
            sdh.a(this.a.p(), i);
            this.a.ac.a();
        }
    }

    public final void m() {
        this.a.Y();
    }

    public final void a(List list, pjy pjy) {
        int i;
        int i2 = 0;
        if (list == null) {
            i = 0;
        } else {
            i2 = list.size();
            i = list.indexOf(pjy);
        }
        this.a.ac.b(i2, i);
    }

    public final void b() {
        this.a.ac.a(false);
    }

    public final void g() {
        this.a.ac.a(true);
    }

    /* synthetic */ sck(scf scf) {
        this.a = scf;
    }
}
