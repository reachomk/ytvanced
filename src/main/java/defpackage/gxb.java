package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.youtube.common.ui.LoadingFrameLayout;
import com.google.android.youtube.R;

/* renamed from: gxb */
public final class gxb extends fja {
    public xoi ae;
    public xci af;
    public fna ag;
    public afpu ah;
    public akkq ai;
    public abfm aj;
    public aaas ak;
    public ezq al;
    public akpe am;
    public String an;
    public awkb ao;
    public LoadingFrameLayout ap;
    public jlq aq;
    public ezz c;

    public static fiw b(String str) {
        Bundle b = fiw.b();
        b.putString("playlist_id", str);
        return new fiw(gxb.class, b);
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        ((gxc) xse.a(this.a)).a(this);
        this.an = this.j.getString("playlist_id");
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.ap = (LoadingFrameLayout) layoutInflater.inflate(R.layout.playlist_editor_collaboration_section_fragment, viewGroup, false);
        this.ap.a(new gxa(this));
        this.aq = new jlq(this.a, this.ak, this.am, this.an, this.ap, this.ag, this.ai, t());
        c(this.an);
        return this.ap;
    }

    public final void W_() {
        super.W_();
        this.af.a(this.aq);
    }

    public final void B() {
        super.B();
        if (!this.ah.a()) {
            this.ac.a(false);
        }
    }

    public final void N_() {
        super.N_();
        this.af.b(this.aq);
    }

    public final ezz W() {
        if (this.c == null) {
            this.c = f();
        }
        return this.c;
    }

    public final ezz f() {
        CharSequence charSequence;
        awkb awkb = this.ao;
        if (awkb == null) {
            charSequence = "";
        } else {
            arml arml = awkb.b;
            if (arml == null) {
                arml = arml.f;
            }
            charSequence = ajqy.a(arml);
        }
        faf i = this.ab.i();
        i.a = charSequence;
        i.a(amwp.a);
        return i.a();
    }

    public final void c(String str) {
        aaml b = this.aj.b();
        b.c(str);
        b.a(zzp.b);
        this.ap.a();
        this.aj.a(b, new gxd(this));
    }
}
