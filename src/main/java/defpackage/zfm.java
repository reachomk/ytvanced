package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ProgressBar;
import com.google.android.youtube.R;

/* renamed from: zfm */
public final class zfm extends nf {
    public View Z;
    public akkl a;
    public ListView aa;
    public zgb ab;
    public String ac;
    public ads ad;
    public zfn ae;
    private Button af;
    public View b;
    public ProgressBar c;

    public final void b(Bundle bundle) {
        super.b(bundle);
        ((zfq) xse.a(M_())).a(this);
        if (bundle != null) {
            this.ac = bundle.getString("browse_params");
        }
        amqw.a(this.ac);
        this.ad = ((aej) p()).g();
        amqw.a(this.ad);
        zfn zfn = this.ae;
        if (zfn != null) {
            zfn.l();
        }
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.audio_swap_category_contents_selection, viewGroup, false);
        this.b = inflate.findViewById(R.id.audio_swap_loading_view);
        this.Z = this.b.findViewById(R.id.audio_swap_error_indicator);
        this.c = (ProgressBar) this.b.findViewById(R.id.audio_swap_loading_indicator);
        this.af = (Button) this.b.findViewById(R.id.audio_swap_retry_button);
        this.af.setOnClickListener(new zfl(this));
        this.aa = (ListView) inflate.findViewById(R.id.audio_swap_category_contents_selection_contents);
        amqw.a(this.b);
        amqw.a(this.Z);
        amqw.a(this.c);
        amqw.a(this.aa);
        f();
        W();
        return inflate;
    }

    public final void N_() {
        super.N_();
        zfn zfn = this.ae;
        if (zfn != null) {
            zfn.m();
        }
    }

    public final void f() {
        this.b.setVisibility(0);
        this.c.setVisibility(0);
        this.Z.setVisibility(8);
        this.aa.setVisibility(8);
    }

    public final void W() {
        nn p = p();
        zek zek = ((zey) p).o().a;
        String str = this.ac;
        zfo zfo = new zfo(this, p);
        aaps a = zek.a.a();
        a.g();
        a.c("FEaudio_tracks");
        a.d(xvd.a(str, (Object) ""));
        zek.a.a(a, new zej(zfo));
    }

    public final void e(Bundle bundle) {
        bundle.putString("browse_params", this.ac);
    }
}
