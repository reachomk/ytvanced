package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.youtube.R;

/* renamed from: wtt */
public final class wtt extends nd {
    public wua Z;
    public acwa aa;
    public aamj ab;
    private Context ac;
    private akcf ad;

    public static wtt a(akcf akcf) {
        wtt wtt = new wtt();
        Bundle bundle = new Bundle();
        bundle.putByteArray("transaction_response", aocf.toByteArray(akcf));
        wtt.f(bundle);
        return wtt;
    }

    public final void a(Context context) {
        super.a(context);
        this.ac = context;
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        ((wtu) xse.b(this.ac)).a(this);
        String str = "transaction_response";
        if (this.j.containsKey(str)) {
            this.ad = (akcf) this.ab.a(this.j.getByteArray(str), akcf.class);
        }
        a(0, (int) R.style.f349Sponsorships.FullScreen);
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.sponsorships_celebration_dialog_layout, viewGroup, false);
        ((ImageView) inflate.findViewById(R.id.close_button)).setOnClickListener(new wts(this));
        FrameLayout frameLayout = (FrameLayout) inflate.findViewById(R.id.celebration_view);
        axsl b = wqc.b(this.ad);
        if (b != null) {
            wua wua = this.Z;
            wtx wtx = new wtx((Context) wua.a(this.ac, 1), (wub) wua.a(new wtv(this), 2), (akzb) wua.a((akzb) wua.a.get(), 3), (aaas) wua.a((aaas) wua.b.get(), 4), (akkq) wua.a((akkq) wua.c.get(), 5));
            frameLayout.addView(wtx.a);
            akor akor = new akor();
            akor.a(this.aa.t());
            wtx.a_(akor, b);
        }
        return inflate;
    }
}
