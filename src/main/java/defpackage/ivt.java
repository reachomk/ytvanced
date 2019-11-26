package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import com.google.android.youtube.R;

/* renamed from: ivt */
public final class ivt implements akot {
    private final Context a;
    private final akpb b;
    private final LinearLayout c;
    private akot d;
    private akot e;
    private akot f;

    public ivt(Context context, akpb akpb) {
        this.a = context;
        this.b = akpb;
        this.c = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.watch_card_header_hero_layout, null, false);
    }

    public final View K_() {
        return this.c;
    }

    public final void a(akpb akpb) {
        this.c.removeAllViews();
        akot akot = this.d;
        if (akot != null) {
            akot.a(akpb);
            akpb.a(this.d.K_());
            this.d = null;
        }
        akot = this.e;
        if (akot != null) {
            akot.a(akpb);
            akpb.a(this.e.K_());
            this.e = null;
        }
        akot = this.f;
        if (akot != null) {
            akot.a(akpb);
            akpb.a(this.f.K_());
            this.f = null;
        }
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        iux iux = (iux) obj;
        this.c.removeAllViews();
        azhy azhy = iux.a;
        Object obj2 = (azhy == null || azhy.a != 117928329) ? null : (aziq) azhy.b;
        if (obj2 != null) {
            this.d = akoz.a(this.b, obj2, null);
            akot akot = this.d;
            if (akot != null) {
                akot.K_().setId(R.id.card_header);
                this.c.addView(this.d.K_());
                this.d.a_(akor, obj2);
                akoz.a(this.d.K_(), this.d, this.b.a(obj2));
            }
        }
        azhs azhs = iux.b;
        obj2 = (azhs == null || azhs.a != 122710540) ? null : (azia) azhs.b;
        obj = (azhs == null || azhs.a != 132989167) ? null : (axtn) azhs.b;
        if (obj2 != null) {
            this.e = akoz.a(this.b, obj2, null);
            akot akot2 = this.e;
            if (akot2 != null) {
                akot2.K_().setId(R.id.watch_card_hero);
                this.c.addView(this.e.K_(), new LayoutParams(-2, -1));
                this.e.a_(akor, obj2);
                akoz.a(this.e.K_(), this.e, this.b.a(obj2));
            }
        } else if (obj != null) {
            this.f = akoz.a(this.b, obj, null);
            akot akot3 = this.f;
            if (akot3 != null) {
                akot3.K_().setId(R.id.watch_card_hero);
                this.c.addView(this.f.K_());
                this.f.a_(akor, obj);
                akoz.a(this.f.K_(), this.f, this.b.a(obj));
            }
        }
        View findViewById = this.c.findViewById(R.id.card_header);
        View findViewById2 = this.c.findViewById(R.id.watch_card_hero);
        LinearLayout.LayoutParams layoutParams;
        if (xss.b(this.a)) {
            this.c.setOrientation(0);
            float f = 0.5f;
            if (findViewById != null) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) findViewById.getLayoutParams();
                layoutParams2.weight = !xss.e(this.a) ? 0.4f : 0.5f;
                layoutParams2.width = 0;
                layoutParams2.height = -1;
                findViewById.setLayoutParams(layoutParams2);
            }
            if (findViewById2 != null) {
                layoutParams = (LinearLayout.LayoutParams) findViewById2.getLayoutParams();
                if (!xss.e(this.a)) {
                    f = 0.6f;
                }
                layoutParams.weight = f;
                layoutParams.width = 0;
                findViewById2.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        this.c.setOrientation(1);
        if (findViewById != null) {
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) findViewById.getLayoutParams();
            layoutParams3.weight = 0.0f;
            layoutParams3.width = -1;
            layoutParams3.height = -2;
            findViewById.setLayoutParams(layoutParams3);
        }
        if (findViewById2 != null) {
            layoutParams = (LinearLayout.LayoutParams) findViewById2.getLayoutParams();
            layoutParams.weight = 0.0f;
            layoutParams.width = -1;
            findViewById2.setLayoutParams(layoutParams);
        }
    }
}
