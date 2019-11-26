package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.LoadingFrameLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.SponsorshipConfirmCancelRendererOuterClass;

/* renamed from: wof */
public final class wof extends wmy {
    public final aaas b;
    public final LoadingFrameLayout c;
    public final wnk d;
    public final wnb e;
    private final wnw f;
    private final View g;
    private final TextView h;
    private final TextView i = ((TextView) this.g.findViewById(R.id.title));
    private final TextView j = ((TextView) this.g.findViewById(R.id.description));
    private axsa k;

    public wof(Context context, aaas aaas, wqp wqp, wny wny, wnb wnb, ViewGroup viewGroup, wnk wnk, wmp wmp) {
        super(wmp);
        this.d = (wnk) amqw.a((Object) wnk);
        this.b = new wnx(aaas, new woa(new woe(this)));
        this.e = wnb;
        this.g = LayoutInflater.from(context).inflate(R.layout.ypc_sponsorship_confirm_cancel_layout, viewGroup, false);
        this.f = wny.a(this.g);
        this.c = (LoadingFrameLayout) this.g.findViewById(R.id.confirm_button_container);
        this.c.b();
        this.h = (TextView) this.g.findViewById(R.id.confirm_button);
        this.g.findViewById(R.id.close_button).setOnClickListener(new woh(this));
        ((ViewGroup) this.g.findViewById(R.id.content)).addView(wnb.a);
        wqp.a(new woj(this));
    }

    public final View K_() {
        return this.g;
    }

    public final void b() {
        this.b.a(this.k.h, null);
    }

    public final /* bridge */ /* synthetic */ void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
    }

    public final /* bridge */ /* synthetic */ void a(akpb akpb) {
        super.a(akpb);
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        arml arml;
        axak axak;
        axsa axsa = (axsa) obj;
        super.a_(akor, axsa);
        this.k = axsa;
        anxp anxp = axsa.b;
        if (anxp == null) {
            anxp = axak.a;
        }
        anxr access$000 = anxl.checkIsLite(SponsorshipConfirmCancelRendererOuterClass.sponsorshipDialogHeaderRenderer);
        anxp.a(access$000);
        Object b = anxp.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        axsb axsb = (axsb) b;
        wnw wnw = this.f;
        aygk aygk = axsb.b;
        if (aygk == null) {
            aygk = aygk.f;
        }
        aygk aygk2 = axsb.d;
        if (aygk2 == null) {
            aygk2 = aygk.f;
        }
        aygk aygk3 = axsb.c;
        if (aygk3 == null) {
            aygk3 = aygk.f;
        }
        arwf arwf = axsb.e;
        if (arwf == null) {
            arwf = arwf.c;
        }
        wnw.a(aygk, aygk2, aygk3, arwf);
        TextView textView = this.i;
        if ((axsa.a & 2) != 0) {
            arml = axsa.c;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        textView.setText(ajqy.a(arml));
        textView = this.j;
        if ((axsa.a & 4) != 0) {
            arml = axsa.d;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        textView.setText(ajqy.a(arml));
        aphj aphj = axsa.f;
        if (aphj == null) {
            aphj = aphj.d;
        }
        aphg aphg = aphj.b;
        if (aphg == null) {
            aphg = aphg.s;
        }
        TextView textView2 = this.h;
        arml arml2 = aphg.g;
        if (arml2 == null) {
            arml2 = arml.f;
        }
        textView2.setText(ajqy.a(arml2));
        this.h.setOnClickListener(new wog(this, aphg, akor));
        if ((axsa.a & 8) != 0) {
            axak = axsa.e;
            if (axak == null) {
                axak = axak.a;
            }
        } else {
            axak = null;
        }
        arjw arjw = (arjw) ajzv.a(ajzv.a(axak), arjw.class);
        xpr.a(this.e.a, arjw != null);
        if (arjw != null) {
            this.e.a(arjw);
        }
        acvx acvx = akor.a;
        acvx.a(axsa.i.d(), null);
        acvx.a(aphg.r.d(), null);
        this.b.a(axsa.g, null);
    }
}
