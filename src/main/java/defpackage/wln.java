package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Map;

/* renamed from: wln */
final class wln implements OnClickListener {
    private final /* synthetic */ ajsn a;
    private final /* synthetic */ ajsh b;
    private final /* synthetic */ boolean c;
    private final /* synthetic */ acvx d;
    private final /* synthetic */ Map e;
    private final /* synthetic */ ImageView f;
    private final /* synthetic */ TextView g;
    private final /* synthetic */ Map h;
    private final /* synthetic */ ImageView i;
    private final /* synthetic */ wlm j;

    wln(wlm wlm, ajsn ajsn, ajsh ajsh, boolean z, acvx acvx, Map map, ImageView imageView, TextView textView, Map map2, ImageView imageView2) {
        this.j = wlm;
        this.a = ajsn;
        this.b = ajsh;
        this.c = z;
        this.d = acvx;
        this.e = map;
        this.f = imageView;
        this.g = textView;
        this.h = map2;
        this.i = imageView2;
    }

    public final void onClick(View view) {
        if (this.j.c.c()) {
            aphm aphm;
            aphy aphy = (aphy) ((anxo) this.j.b.a(this.a.g, this.b, this.c).toBuilder());
            aphy aphy2 = (aphy) ((anxo) this.j.b.b(this.a.g, this.b, this.c).toBuilder());
            boolean a = aphy2.a();
            if ((a && aphy2.d()) || (!a && aphy2.b())) {
                anxl e;
                if (a) {
                    e = aphy2.e();
                } else {
                    e = aphy2.c();
                }
                axfq axfq = (axfq) axfr.c.createBuilder();
                axfq.a(this.d.d());
                apxx apxx = (apxx) ((anxo) e.toBuilder());
                apxx.a(axft.b, (axfr) ((anxl) axfq.build()));
                apxu apxu = (apxu) ((anxl) apxx.build());
                if (a) {
                    aphy2.b(apxu);
                } else {
                    aphy2.a(apxu);
                }
                this.j.a.a(apxu, this.e);
            }
            aphy.a(false);
            aphy2.a(a ^ 1);
            aphv aphv = (aphv) ((anxl) aphy.build());
            aphv aphv2 = (aphv) ((anxl) aphy2.build());
            wlm.a(aphv, this.f, this.g, this.h);
            wlm.a(aphv2, this.i, this.h);
            ajsh ajsh = this.b;
            aphj aphj = ajsh.a;
            if (aphj != null) {
                aphm = (aphm) ((anxo) aphj.toBuilder());
                aphm.a(aphv);
                ajsh.a = (aphj) ((anxl) aphm.build());
            }
            ajsh = this.b;
            aphj = ajsh.c;
            if (aphj != null) {
                aphm = (aphm) ((anxo) aphj.toBuilder());
                aphm.a(aphv2);
                ajsh.c = (aphj) ((anxl) aphm.build());
            }
            this.j.b.a(this.a.g, this.b.e, aphv, aphv2);
            return;
        }
        this.j.d.a();
    }
}
