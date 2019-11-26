package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.view.View;

/* renamed from: vvs */
public final class vvs implements ajan, vva {
    public final aigp a;
    public Bitmap b;
    public boolean c;
    public boolean d;
    public boolean e;
    private final akkq f;
    private final wxg g = wxl.a(new Handler(), new vvw(this));
    private wxi h;
    private Uri i;

    public vvs(aigp aigp, akkq akkq) {
        this.a = (aigp) amqw.a((Object) aigp);
        this.f = (akkq) amqw.a((Object) akkq);
    }

    public final long e() {
        return 1;
    }

    public final void a() {
        this.i = null;
        this.b = null;
        wxi wxi = this.h;
        if (wxi != null) {
            wxi.a();
            this.h = null;
        }
        this.a.at_();
    }

    public final void b() {
        if (this.c && (this.d || this.e)) {
            Bitmap bitmap = this.b;
            if (bitmap == null && this.i != null && this.h == null) {
                this.h = wxi.a(this.g);
                this.f.b(this.i, this.h);
            } else {
                this.a.a(bitmap);
            }
            this.a.af_();
            return;
        }
        this.a.ag_();
    }

    public final void a(aoiu aoiu) {
        aygk aygk;
        amqw.a((Object) aoiu);
        aoiw aoiw = aoiu.j;
        if (aoiw == null) {
            aoiw = aoiw.c;
        }
        if ((aoiw.a & 1) == 0) {
            aygk = null;
        } else {
            aoiw aoiw2 = aoiu.j;
            if (aoiw2 == null) {
                aoiw2 = aoiw.c;
            }
            aygg aygg = aoiw2.b;
            if (aygg == null) {
                aygg = aygg.c;
            }
            aygk = aygg.b;
            if (aygk == null) {
                aygk = aygk.f;
            }
        }
        a(aygk);
    }

    public final bcuo[] a(ajam ajam) {
        return new bcuo[]{ajam.Q().a.a(new vvv(this)), ajam.P().a.a(new vvu(this)), ajam.P().b.a(new vvx(this))};
    }

    public final void a(aygk aygk) {
        if (aygk != null) {
            aigp aigp = this.a;
            View a = aigp instanceof aiub ? ((aiub) aigp).a() : null;
            Uri c = aklb.c(aygk, a != null ? a.getWidth() : 480, a != null ? a.getHeight() : 320);
            if (c == null || !c.equals(this.i)) {
                a();
            }
            this.i = c;
        }
        b();
    }
}
