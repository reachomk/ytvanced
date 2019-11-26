package defpackage;

import android.app.assist.AssistContent;
import android.os.Bundle;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: mkn */
public abstract class mkn extends dvg {
    public alck ae;
    public ewi b_;
    public adgw bj;
    public adgp bk;
    public Handler bl;
    public hdk bm;
    public hdj bn;
    public kyu bo;
    public ados bp;
    public bcaa bq;
    public adah br;
    public adjs bs;
    public bcaa bt;
    private final List l = new ArrayList();
    public xci n;
    public zzf t;

    /* Access modifiers changed, original: protected */
    public bcaa a(adiw adiw) {
        throw null;
    }

    public abstract hco a(adow adow, adiw adiw, bcaa bcaa, adop adop);

    /* Access modifiers changed, original: protected */
    public fny v() {
        throw null;
    }

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        p().a(this.bm);
        adgp adgp = this.bk;
        r0 = new acwl[2];
        boolean z = false;
        r0[0] = acwl.d;
        r0[1] = acwl.aD;
        adgp.e = (acwa) amqw.a((Object) this);
        if (((acwl[]) amqw.a(r0)).length > 0) {
            z = true;
        }
        amqw.a(z);
        adgp.f = Arrays.asList(r0);
        this.bt = new mkm(this);
    }

    /* Access modifiers changed, original: protected */
    public void onStart() {
        super.onStart();
        this.bj.d();
        adgp adgp = this.bk;
        ((bbb) adgp.c.get()).a((baz) adgp.b.get(), adgp.d, 4);
        adgp.b();
        this.bn.a();
        this.n.a(this.bo);
        adpc adpc = this.bp.a;
        adpc.e.a(adpc.f, adpc.h, 4);
        if (!adpc.d.a().isEmpty()) {
            adpc.j.a();
        }
        adop adop = new adop(this);
        for (adiw adiw : adiw.values()) {
            bcaa a = a(adiw);
            if (a != null) {
                b(adow.CAST_TOOLTIP, adiw, a, adop);
                b(adow.CAST_TOOLTIP_REPRESSED, adiw, a, adop);
                a(adow.CAST_CLING, adiw, adop);
                a(adow.CAST_CLING_REPRESSED, adiw, adop);
                this.l.add(a(adow.CAST_SNACKBAR, adiw, a, adop));
                this.l.add(a(adow.CAST_SNACKBAR_REPRESSED, adiw, a, adop));
                for (Object a2 : this.l) {
                    this.n.a(a2);
                }
            }
        }
        this.bp.b();
        this.br.a();
        this.bs.f();
    }

    /* Access modifiers changed, original: protected */
    public void onPause() {
        if (!this.t.r()) {
            ados ados = this.bp;
            if (ados != null) {
                ados.a.a();
            }
        }
        super.onPause();
    }

    /* Access modifiers changed, original: protected */
    public void onStop() {
        this.bs.g();
        this.bp.c();
        this.bp.a();
        this.bj.e();
        this.n.b(this.bo);
        adgp adgp = this.bk;
        ((bbb) adgp.c.get()).a(adgp.d);
        adgp.a.b(adgp);
        this.bn.b();
        adpc adpc = this.bp.a;
        adpc.e.a(adpc.h);
        if (this.t.r()) {
            this.bp.a.a();
        }
        for (Object b : this.l) {
            this.n.b(b);
        }
        this.l.clear();
        super.onStop();
    }

    /* Access modifiers changed, original: protected */
    public void onDestroy() {
        this.bp.a();
        super.onDestroy();
    }

    public final void onProvideAssistContent(AssistContent assistContent) {
        super.onProvideAssistContent(assistContent);
        fny v = v();
        if (v != null) {
            String str = v.a;
            if (str != null) {
                assistContent.setStructuredData(str);
            }
            assistContent.setWebUri(v.b);
        }
    }

    private final void b(adow adow, adiw adiw, bcaa bcaa, adop adop) {
        this.bp.a(new hcs(adow, adiw, this, bcaa, adop, this.ae));
    }

    private final void a(adow adow, adiw adiw, adop adop) {
        this.bp.a(new hcl(adow, this.bo, adiw, this.b_, this.bl, adop));
    }
}
