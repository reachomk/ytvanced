package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.google.android.youtube.R;

/* renamed from: jmz */
public abstract class jmz extends akun implements akui {
    private final akvz a;
    public final ViewGroup b;
    public final akwy c;
    public RecyclerView d;
    public View e;
    public boolean f;
    public axef g;
    public boolean h;
    private final akpe i;
    private jnd j;
    private axeo k;
    private boolean l;
    private akpk m;
    private akpd n;
    private jnc o;

    public jmz(ViewGroup viewGroup, akwy akwy, akpe akpe, akvz akvz, aana aana, xci xci, xoi xoi, acvx acvx) {
        super(aana, xci, xoi, acvx);
        this.b = (ViewGroup) amqw.a((Object) viewGroup);
        this.a = (akvz) amqw.a((Object) akvz);
        this.c = (akwy) amqw.a((Object) akwy);
        this.i = (akpe) amqw.a((Object) akpe);
        akvz.a(axeo.class);
    }

    public void a(int i) {
    }

    /* Access modifiers changed, original: protected */
    public void a(akpd akpd) {
    }

    public abstract void a(akpk akpk, axeg axeg, boolean z);

    public abstract void b();

    public final void a(axeo axeo) {
        if (!amqq.a(this.k, axeo)) {
            this.k = (axeo) amqw.a((Object) axeo);
            if (this.f) {
                this.g = null;
                this.m = new akpk();
                b(axeo);
                this.n.a(this.m);
            } else if (this.l) {
                f();
            }
        }
    }

    public final void f() {
        if (!this.f) {
            if (this.k == null) {
                this.l = true;
                return;
            }
            this.e = this.b.findViewById(R.id.section_list_refresher);
            ((ViewStub) this.b.findViewById(R.id.drawer_stub)).inflate();
            this.d = (RecyclerView) this.b.findViewById(R.id.drawer_results);
            b();
            this.n = this.i.a((akpb) this.a.get());
            this.d.a(this.n);
            a(this.n);
            this.m = new akpk();
            this.n.a(this.m);
            this.o = new jnc();
            this.j = new jnd(this);
            this.n.a(this.j);
            b(this.k);
            this.f = true;
        }
    }

    private final void b(axeo axeo) {
        for (axem axem : axeo.a) {
            int i = axem.a;
            if (i == 106506504) {
                a(this.m, (axeg) axem.b, false);
            } else if (i == 117271479) {
                this.m.add((avit) axem.b);
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(axec axec, boolean z) {
        if (axec != null) {
            this.g = (axef) ((anxo) axec.toBuilder());
        }
        this.h = z;
    }

    /* Access modifiers changed, original: protected */
    public void a(akor akor, aknh aknh, int i) {
        Object valueOf = Boolean.valueOf(true);
        akor.a("is_drawer_context", valueOf);
        akor.a("avatar_selection_listener", this.j);
        akor.a("avatar_selection_controller", this.o);
        akor.a("sectionListController", this.c);
        akya.a(akor, this);
        if (i == 0) {
            akor.a("is_first_drawer_list", valueOf);
        }
    }

    public void a(axef axef) {
        jnc jnc = this.o;
        axef axef2 = this.g;
        if (axef2 != null) {
            jnb jnb = (jnb) jnc.a.get((anxl) axef2.build());
            if (jnb != null) {
                jnb.a((axec) ((anxl) axef2.build()), false);
            }
            axef2.a(false);
        }
        if (axef != null) {
            jnb jnb2 = (jnb) jnc.a.get((anxl) axef.build());
            if (jnb2 != null) {
                jnb2.a((axec) ((anxl) axef.build()), true);
            }
            axef.a(true);
        }
        this.g = axef;
        if (axef != null && axef.a().a == 60487319) {
            Object obj;
            this.c.f();
            akwy akwy = this.c;
            axee a = axef.a();
            if (a.a == 60487319) {
                obj = (awzv) a.b;
            } else {
                obj = awzv.d;
            }
            akwy.a(ajtj.a(obj));
        }
    }

    public final void a(awzv awzv) {
        a(ajtj.a(awzv));
    }
}
