package defpackage;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ahax */
public final class ahax {
    public final Context a;
    public final Builder b;
    public final aaas c;
    public final akkl d;
    public View e;
    public ImageView f;
    public ImageView g;
    public akle h;
    public akle i;
    public TextView j;
    public TextView k;
    public AlertDialog l;
    public TextView m;
    public TextView n;
    public aphg o;
    public aphg p;
    public acvx q;

    protected ahax(Context context, Builder builder, aaas aaas, akkl akkl) {
        this.a = context;
        this.b = builder;
        this.c = aaas;
        this.d = akkl;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(aphg aphg) {
        if (aphg != null) {
            apxu apxu = aphg.m;
            if (apxu == null) {
                apxu = apxu.d;
            }
            if (apxu != null) {
                anxr access$000 = anxl.checkIsLite(avjd.b);
                apxu.a(access$000);
                if (!apxu.h.a(access$000.d)) {
                    apxu = this.q.a(apxu);
                }
                this.c.a(apxu, null);
            }
            if ((aphg.a & 2048) != 0) {
                Map hashMap = new HashMap();
                hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", aphg);
                aaas aaas = this.c;
                apxu apxu2 = aphg.l;
                if (apxu2 == null) {
                    apxu2 = apxu.d;
                }
                aaas.a(apxu2, hashMap);
                acvx acvx = this.q;
                apxu apxu3 = aphg.l;
                if (apxu3 == null) {
                    apxu3 = apxu.d;
                }
                acvx.a(3, new acvs(apxu3.b), null);
            }
        }
    }

    public final void a(aphg aphg, TextView textView, OnClickListener onClickListener) {
        if (aphg != null) {
            arml arml;
            if ((aphg.a & 128) != 0) {
                arml = aphg.g;
                if (arml == null) {
                    arml = arml.f;
                }
            } else {
                arml = null;
            }
            CharSequence a = ajqy.a(arml);
            xpr.a(textView, a);
            aodx aodx = aphg.q;
            if (aodx == null) {
                aodx = aodx.c;
            }
            if ((aodx.a & 1) != 0) {
                aodx aodx2 = aphg.q;
                if (aodx2 == null) {
                    aodx2 = aodx.c;
                }
                aodv aodv = aodx2.b;
                if (aodv == null) {
                    aodv = aodv.c;
                }
                a = aodv.b;
            }
            textView.setContentDescription(a);
            textView.setOnClickListener(onClickListener);
            this.q.a(aphg.r.d(), null);
            return;
        }
        xpr.a((View) textView, false);
    }

    public static void a(aaas aaas, ayvi ayvi) {
        if (ayvi.j.size() != 0) {
            for (apxu apxu : ayvi.j) {
                Map hashMap = new HashMap();
                hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", ayvi);
                aaas.a(apxu, hashMap);
            }
        }
    }
}
