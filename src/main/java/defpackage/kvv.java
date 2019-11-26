package defpackage;

import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.HashMap;

/* renamed from: kvv */
public final class kvv implements akot, fgz, fhn {
    public final aaas a;
    private final akot b;
    private final kqv c;
    private Object d;
    private foq e;

    public kvv(ffy ffy, aaas aaas, tpu tpu, dwk dwk) {
        this.b = ffy.a(true);
        this.a = (aaas) amqw.a((Object) aaas);
        this.c = new kqv(aaas, tpu, dwk, K_());
    }

    public final fhc b() {
        return null;
    }

    public final View K_() {
        return this.b.K_();
    }

    public final void a(akpb akpb) {
        this.b.a(akpb);
        this.c.a();
        this.e = null;
        this.d = null;
    }

    public final View a() {
        return ((fgz) this.b).a();
    }

    public final void a(boolean z) {
        ((fgz) this.b).a(z);
    }

    public final bblt a(int i) {
        akot akot = this.b;
        if (akot instanceof fhn) {
            return ((fhn) akot).a(i);
        }
        return bblt.a();
    }

    public final boolean a(fhn fhn) {
        if ((fhn instanceof kvv) && ((kvv) fhn).d == this.d) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        awtc awtc;
        ajzk ajzk = (ajzk) obj;
        this.d = ajzk;
        this.c.a(akor.a, ajzk, ajzk.e, ajzk.b, ajzk, ajzk.d, ajzk.c);
        aryi aryi = (aryi) ajzv.a(ajzk.a, aryi.class);
        this.e = fod.b(ajzk);
        this.b.a_(akor, this.e);
        aryg aryg = aryi.f;
        if (aryg == null) {
            aryg = aryg.c;
        }
        arye arye = aryg.b;
        if (arye == null) {
            arye = arye.u;
        }
        arya arya = arye.q;
        if (arya == null) {
            arya = arya.c;
        }
        TextView textView = null;
        if ((arya.a & 1) == 0) {
            awtc = null;
        } else {
            arya arya2 = arye.q;
            if (arya2 == null) {
                arya2 = arya.c;
            }
            awtc = arya2.b;
            if (awtc == null) {
                awtc = awtc.d;
            }
        }
        View findViewById = K_().findViewById(R.id.call_to_action);
        if (findViewById != null) {
            if (findViewById instanceof ViewStub) {
                textView = (TextView) ((ViewStub) findViewById).inflate();
            } else {
                textView = (TextView) findViewById;
            }
        }
        if (textView != null) {
            if (awtc != null) {
                int i = awtc.a;
                if (!((i & 1) == 0 || (i & 4) == 0)) {
                    arml arml = awtc.b;
                    if (arml == null) {
                        arml = arml.f;
                    }
                    textView.setText(ajqy.a(arml));
                    HashMap hashMap = new HashMap();
                    hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", awtc);
                    textView.setOnClickListener(new kvu(this, awtc, hashMap));
                    textView.setVisibility(0);
                    return;
                }
            }
            textView.setVisibility(8);
        }
    }
}
