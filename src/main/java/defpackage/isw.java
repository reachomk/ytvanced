package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.google.android.youtube.R;

/* renamed from: isw */
public final class isw extends epp {
    private final Context d;
    private final akou e;
    private final akoj f;

    public isw(Context context, akkq akkq, flu flu, akop akop) {
        super(context, akkq, R.layout.channel_card_item);
        this.d = (Context) amqw.a((Object) context);
        this.e = (akou) amqw.a((Object) flu);
        flu.a(this.a);
        this.f = akop.a(flu);
    }

    public final View K_() {
        return this.e.a();
    }

    public final void a(akpb akpb) {
        this.f.a();
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        apxu apxu;
        aygk aygk;
        arml arml;
        apkw apkw = (apkw) obj;
        LayoutParams layoutParams = K_().getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = this.d.getResources().getDimensionPixelSize(R.dimen.channel_card_width);
            K_().setLayoutParams(layoutParams);
        }
        akoj akoj = this.f;
        acvx acvx = akor.a;
        arml arml2 = null;
        if ((apkw.a & 8) != 0) {
            apxu = apkw.e;
            if (apxu == null) {
                apxu = apxu.d;
            }
        } else {
            apxu = null;
        }
        akoj.a(acvx, apxu, akor.b());
        akor.a.a(apkw.f.d(), null);
        if ((apkw.a & 1) != 0) {
            aygk = apkw.b;
            if (aygk == null) {
                aygk = aygk.f;
            }
        } else {
            aygk = null;
        }
        a(aygk);
        if ((apkw.a & 2) != 0) {
            arml = apkw.c;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        a(ajqy.a(arml));
        if ((apkw.a & 4) != 0) {
            arml2 = apkw.d;
            if (arml2 == null) {
                arml2 = arml.f;
            }
        }
        b(ajqy.a(arml2));
        this.e.a(akor);
    }
}
