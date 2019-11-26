package defpackage;

import android.text.Spanned;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;

/* renamed from: kpp */
public final class kpp {
    public final kqv a;
    public final kpq b;
    public View c;
    public apxu d;
    public apxu e;
    private final ViewStub f;
    private TextView g;
    private TextView h;
    private TextView i;

    public kpp(kqv kqv, ViewStub viewStub, kpq kpq) {
        this.a = (kqv) amqw.a((Object) kqv);
        this.b = (kpq) amqw.a((Object) kpq);
        this.f = viewStub;
    }

    public final void a(acvx acvx, aviq aviq) {
        aphg aphg;
        apxu apxu;
        amqw.a((Object) acvx);
        amqw.a((Object) aviq);
        if (this.c == null) {
            this.c = this.f.inflate();
            this.g = (TextView) this.c.findViewById(R.id.notification_text);
            this.h = (TextView) this.c.findViewById(R.id.undo_button);
            this.i = (TextView) this.c.findViewById(R.id.ad_settings_button);
            this.h.setOnClickListener(new kpo(this));
            this.i.setOnClickListener(new kpr(this));
        }
        apxu apxu2 = null;
        acvx.a(aviq.f.d(), null);
        anxp anxp = aviq.c;
        if (anxp == null) {
            anxp = axak.a;
        }
        anxr access$000 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
        anxp.a(access$000);
        Object b = anxp.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        aphg aphg2 = (aphg) b;
        if ((aviq.a & 4) != 0) {
            anxp anxp2 = aviq.d;
            if (anxp2 == null) {
                anxp2 = axak.a;
            }
            anxr access$0002 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
            anxp2.a(access$0002);
            Object b2 = anxp2.h.b(access$0002.d);
            if (b2 == null) {
                b2 = access$0002.b;
            } else {
                b2 = access$0002.a(b2);
            }
            aphg = (aphg) b2;
        } else {
            aphg = null;
        }
        if (aphg2 == null || (aphg2.a & 2048) == 0) {
            apxu = null;
        } else {
            apxu = aphg2.l;
            if (apxu == null) {
                apxu = apxu.d;
            }
        }
        this.d = apxu;
        if (!(aphg == null || (aphg.a & 4096) == 0)) {
            apxu2 = aphg.m;
            if (apxu2 == null) {
                apxu2 = apxu.d;
            }
        }
        this.e = apxu2;
        arml arml = aviq.b;
        if (arml == null) {
            arml = arml.f;
        }
        CharSequence a = ajqy.a(arml);
        CharSequence a2 = kpp.a(aphg2);
        CharSequence a3 = kpp.a(aphg);
        xpr.a(this.g, a);
        xpr.a(this.h, a2);
        xpr.a(this.i, a3);
    }

    private static Spanned a(aphg aphg) {
        arml arml = null;
        if (aphg == null) {
            return null;
        }
        if ((aphg.a & 128) != 0) {
            arml = aphg.g;
            if (arml == null) {
                arml = arml.f;
            }
        }
        return ajqy.a(arml);
    }
}
