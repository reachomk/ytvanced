package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.LoadingFrameLayout;
import com.google.android.youtube.R;

/* renamed from: wne */
public final class wne extends wmy {
    public final aaas b;
    public final LoadingFrameLayout c = ((LoadingFrameLayout) this.f.findViewById(R.id.confirm_button_container));
    public final wnk d;
    private final wnw e;
    private final View f;
    private final View g;
    private final TextView h;
    private final won i;
    private final won j;
    private aumo k;

    public wne(Context context, aaas aaas, wqp wqp, wop wop, wny wny, ViewGroup viewGroup, wnk wnk, wmp wmp) {
        super(wmp);
        this.d = (wnk) amqw.a((Object) wnk);
        this.b = new wnx(aaas, new woa(new wnd(this)));
        this.f = LayoutInflater.from(context).inflate(R.layout.ypc_manage_membership_with_perks_layout, viewGroup, false);
        this.e = wny.a(this.f);
        this.c.b();
        this.h = (TextView) this.f.findViewById(R.id.confirm_button);
        this.g = this.f.findViewById(R.id.close_button);
        this.g.setOnClickListener(new wng(this));
        this.i = wop.a(this.b, this.f.findViewById(R.id.yt_perks));
        this.j = wop.a(this.b, this.f.findViewById(R.id.custom_perks));
        wqp.a(new wni(this));
    }

    public final View K_() {
        return this.f;
    }

    public final void b() {
        this.b.a(this.k.n, null);
    }

    public final /* bridge */ /* synthetic */ void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
    }

    public final /* bridge */ /* synthetic */ void a(akpb akpb) {
        super.a(akpb);
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        axak axak;
        aumo aumo = (aumo) obj;
        super.a_(akor, aumo);
        this.k = aumo;
        wnw wnw = this.e;
        aygk aygk = aumo.i;
        if (aygk == null) {
            aygk = aygk.f;
        }
        aygk aygk2 = aumo.d;
        if (aygk2 == null) {
            aygk2 = aygk.f;
        }
        aygk aygk3 = aumo.c;
        if (aygk3 == null) {
            aygk3 = aygk.f;
        }
        arwf arwf = aumo.e;
        if (arwf == null) {
            arwf = arwf.c;
        }
        wnw.a(aygk, aygk2, aygk3, arwf);
        View view = this.g;
        aphj aphj = aumo.h;
        if (aphj == null) {
            aphj = aphj.d;
        }
        wnw.a(view, aphj);
        aphj aphj2 = aumo.g;
        if (aphj2 == null) {
            aphj2 = aphj.d;
        }
        aphg aphg = aphj2.b;
        if (aphg == null) {
            aphg = aphg.s;
        }
        TextView textView = this.h;
        arml arml = aphg.g;
        if (arml == null) {
            arml = arml.f;
        }
        textView.setText(ajqy.a(arml));
        this.h.setOnClickListener(new wnf(this, aphg, akor));
        won won = this.i;
        if ((aumo.a & 256) != 0) {
            axak = aumo.j;
            if (axak == null) {
                axak = axak.a;
            }
        } else {
            axak = null;
        }
        wnw.a(akor, won, ajzv.a(axak));
        won = this.j;
        if ((aumo.a & 512) != 0) {
            axak = aumo.k;
            if (axak == null) {
                axak = axak.a;
            }
        } else {
            axak = null;
        }
        wnw.a(akor, won, ajzv.a(axak));
        acvx acvx = akor.a;
        acvx.a(aumo.o.d(), null);
        acvx.a(aphg.r.d(), null);
        this.b.a(aumo.m, null);
    }
}
