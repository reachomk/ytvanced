package defpackage;

import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.player.features.overlay.timebar.TimeBar;

/* renamed from: hea */
public final class hea extends aibc implements aecb {
    public final hdv a;
    public final bcaa b;
    public final xci c;
    public boolean d;
    public TimeBar e;
    public final aihk f = new aihk();
    public ImageView g;
    public TextView h;
    public aich i;
    public aibe j;
    public aeby k;
    public final adqf l;

    public hea(hdv hdv, bcaa bcaa, adqf adqf, xci xci) {
        this.a = (hdv) amqw.a((Object) hdv);
        this.b = (bcaa) amqw.a((Object) bcaa);
        this.l = (adqf) amqw.a((Object) adqf);
        this.c = (xci) amqw.a((Object) xci);
        aihk aihk = this.f;
        aihk.s = false;
        aihk.r = false;
    }

    public final void a(aibe aibe) {
        amqw.b(this.j == null, (Object) "Must not override an existing listener.");
        this.j = aibe;
    }

    public final void a(long j, long j2, long j3, long j4) {
        this.f.a(j, j2, j3, j4);
        if (this.d) {
            this.e.a(this.f);
            aeca aeca = (aeca) this.b.get();
            aeca.a(aeca.g.f().f().a(aeca.g.a() == 2 ? ((int) j3) - ((int) j) : -1));
            aeca.b(4);
        }
    }

    public final void au_() {
        this.f.g();
        if (this.d) {
            this.e.a(this.f);
        }
    }

    public final void a(aicd aicd) {
        aihq aihq = this.f;
        aihq.o = aicd.q;
        aihq.q = aicd.r;
        aihq.t = aicd.y;
        if (this.d) {
            this.e.a(aihq);
            this.e.setVisibility(!aicd.p ? 4 : 0);
        }
    }

    public final void a(aich aich) {
        amqw.a((Object) aich);
        boolean z = true;
        Object obj = (this.k.f() == null || this.k.f().d() != 1) ? null : 1;
        if (obj != null) {
            xpr.a(this.g, false);
        }
        if (!aich.equals(this.i)) {
            if (this.k.a() != 4) {
                z = false;
            }
            this.i = aich;
            this.a.a(aich, z);
            if (obj == null) {
                xpr.a(this.g, aich.i());
            }
        }
    }

    public final void a(int i, aeby aeby) {
        this.k = aeby;
        if (this.d && i == 0) {
            this.a.a(this.i, this.k.a() == 4);
        }
    }
}
