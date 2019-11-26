package defpackage;

import android.net.Uri;
import java.util.concurrent.Executor;

/* renamed from: ajcv */
public final class ajcv extends ajps {
    private final ajct a;
    private ajcr b;
    private String c;

    public ajcv(ajct ajct) {
        this.a = (ajct) amqw.a((Object) ajct);
    }

    public final void a(ahkn ahkn) {
        int ordinal = ahkn.a.ordinal();
        String str = null;
        ajcr ajcr;
        if (ordinal == 0) {
            this.c = null;
            ajcr = this.b;
            if (ajcr != null) {
                ajcr.f = true;
                Thread thread = ajcr.g;
                if (thread != null) {
                    thread.interrupt();
                }
                this.b = null;
            }
        } else if (ordinal == 5 || ordinal == 8) {
            aakj aakj;
            if (ahkn.a.a()) {
                aakj = ahkn.c;
            } else {
                aakj = ahkn.b;
            }
            if (aakj != null) {
                int i;
                aajs aajs = aakj.c;
                Uri parse = (aajs == null || aajs.b.g.isEmpty()) ? null : Uri.parse(aajs.b.g);
                awdg awdg = aakj.n().c;
                if ((awdg.b & 524288) != 0) {
                    apxl apxl = awdg.H;
                    if (apxl == null) {
                        apxl = apxl.c;
                    }
                    i = apxl.b;
                } else {
                    i = 0;
                }
                if (ahkn.c != null) {
                    str = ahkn.f;
                } else if (ahkn.b != null) {
                    str = ahkn.e;
                }
                String str2 = str;
                String b = aakj.b();
                String str3 = this.c;
                if (str3 == null || !str3.equals(b)) {
                    this.c = b;
                    ajct ajct = this.a;
                    this.b = new ajcr((Executor) ajct.a((Executor) ajct.a.get(), 1), (afhg) ajct.a((afhg) ajct.b.get(), 2), (ozb) ajct.a((ozb) ajct.c.get(), 3), parse, i, str2);
                    ajcr = this.b;
                    if (!(ajcr == null || ajcr.d == null)) {
                        ajcr.a.execute(new ajcq(ajcr));
                    }
                }
            }
        }
    }
}
