package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.youtube.R;

/* renamed from: kxs */
public final class kxs extends kyc {
    private final Context a;
    private final kli b;
    private final ViewGroup f;
    private final bgx g;
    private klh h;
    private klh i;
    private klh j;

    public kxs(Context context, kli kli) {
        this.a = context;
        this.b = kli;
        this.f = new FrameLayout(context);
        bga bga = new bga();
        bga.a((int) R.id.channel_subscribers);
        bga.a((int) R.id.channel_subscribers_long);
        this.g = bga;
    }

    public final View K_() {
        return this.f;
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        klh klh;
        akat akat = (akat) this.d;
        akor akor = this.c;
        auuq auuq = akat.e;
        if (auuq != null && auuq.a == 65153809) {
            klh = this.j;
            if (klh == null) {
                this.j = this.b.a(LayoutInflater.from(this.a).inflate(R.layout.slim_owner_with_sponsorship, this.f, false));
                klh = this.j;
            }
        } else {
            klh = this.i;
            if (klh == null) {
                this.i = this.b.a(LayoutInflater.from(this.a).inflate(R.layout.slim_owner_default, this.f, false));
                klh = this.i;
            }
        }
        this.h = klh;
        this.h.a(akat, this.e.f, akor.a, (akxv) akor.a("sectionListController"));
        this.f.removeAllViews();
        this.f.addView(this.h.a);
    }

    /* Access modifiers changed, original: protected|final */
    public final void c() {
        bhf.a(this.f);
        klh klh = this.h;
        if (klh != null) {
            klh.c();
        }
        klh = this.i;
        if (klh != null) {
            klh.c();
        }
        klh = this.j;
        if (klh != null) {
            klh.c();
        }
    }

    public final void aD_() {
        bhf.a(this.f, this.g);
        akor akor = this.c;
        this.h.a((akat) this.d, this.e.f, akor.a, (akxv) akor.a("sectionListController"));
    }
}
