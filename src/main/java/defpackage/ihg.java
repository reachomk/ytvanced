package defpackage;

import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.RelativeLayout.LayoutParams;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ElementRendererOuterClass;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: ihg */
public final class ihg implements ihv, vdo {
    public final ihu a;
    public long b;
    public boolean c;
    private final bcud d;
    private final waw e;
    private final eif f;
    private final acvx g;
    private vdp h;
    private CountDownTimer i;

    public ihg(ihu ihu, bcud bcud, waw waw, eif eif, acvx acvx) {
        this.a = (ihu) amqw.a((Object) ihu);
        this.d = (bcud) amqw.a((Object) bcud);
        this.e = (waw) amqw.a((Object) waw);
        this.f = (eif) amqw.a((Object) eif);
        this.g = (acvx) amqw.a((Object) acvx);
        d();
    }

    public final boolean a(vdp vdp) {
        if (vdp.a().m() != null) {
            d();
            this.h = vdp;
            aolc m = vdp.a().m();
            int a = aola.a(m.e);
            if (a != 0 && a == 2 && this.f.c().d()) {
                a(vra.AUTO_SKIPPED_ON_ENTER);
                return false;
            }
            anxp anxp = m.d;
            if (anxp == null) {
                anxp = axak.a;
            }
            anxr access$000 = anxl.checkIsLite(ElementRendererOuterClass.elementRenderer);
            anxp.a(access$000);
            if (anxp.h.a(access$000.d)) {
                this.c = m.f;
                this.b = TimeUnit.SECONDS.toMillis((long) m.c);
                b();
                if ((m.a & 64) != 0) {
                    ihu ihu = this.a;
                    aole aole = m.g;
                    if (aole == null) {
                        aole = aole.d;
                    }
                    ihu.l = aole;
                }
                anxp anxp2 = m.d;
                if (anxp2 == null) {
                    anxp2 = axak.a;
                }
                anxr access$0002 = anxl.checkIsLite(ElementRendererOuterClass.elementRenderer);
                anxp2.a(access$0002);
                Object b = anxp2.h.b(access$0002.d);
                if (b == null) {
                    b = access$0002.b;
                } else {
                    b = access$0002.a(b);
                }
                arbs arbs = (arbs) b;
                this.d.e_(aiui.ENABLE);
                akor akor = new akor();
                akor.a(new HashMap());
                akor.a(this.g);
                ihu ihu2 = this.a;
                if (ihu2.g == null) {
                    ihu2.g = (ViewGroup) LayoutInflater.from(ihu2.getContext()).inflate(R.layout.ad_endcap_elements_overlay, ihu2);
                    ihu2.h = (ViewGroup) ihu2.g.findViewById(R.id.ad_endcap_elements_overlay);
                    ihu2.i = ihu2.g.findViewById(R.id.skip_ad_button);
                    LayoutParams layoutParams = (LayoutParams) ihu2.i.getLayoutParams();
                    layoutParams.bottomMargin += ihu2.c;
                    ihu2.i.setOnClickListener(new iht(ihu2));
                    ihu2.i.setOnTouchListener(new ihw(ihu2));
                }
                ihu2.e = arbs;
                ((akdk) ihu2.a.get()).b(ihu2.e);
                ihu2.f = ((akdk) ihu2.a.get()).b(ihu2.e);
                ihu2.h.addView(ihu2.b.K_(), 0);
                ihu2.b.a_(akor, ihu2.f);
                ihu2.g.setVisibility(0);
                ihu2.h.setVisibility(0);
                ihu2.i.setVisibility(0);
                ihu2.d();
                return true;
            }
        }
        return false;
    }

    public final void a() {
        d();
    }

    public final void a(int i, int i2) {
        this.e.a(i, i2);
        a(vra.USER_SKIPPED);
    }

    public final void a(vra vra) {
        vdp vdp = this.h;
        if (vdp != null) {
            vdp.a(vra);
        }
        d();
    }

    private final void d() {
        c();
        this.b = 0;
        this.a.setVisibility(8);
        this.a.c();
        this.h = null;
        this.d.e_(aiui.DISABLE);
    }

    public final void b() {
        this.i = new ihf(this, this.b).start();
    }

    public final void c() {
        CountDownTimer countDownTimer = this.i;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.i = null;
        }
    }
}
