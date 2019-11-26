package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: iwq */
final class iwq extends iwo {
    public iwq(Context context, aaas aaas, akkq akkq, alax alax, akzb akzb, akvp akvp, est est, eur eur, ViewGroup viewGroup) {
        super(context, aaas, akkq, alax, akzb, akvp, est, eur, R.layout.watch_card_rich_header_horizontal_layout, viewGroup);
    }

    public final void a(aziq aziq) {
        apeb apeb;
        azhq[] azhqArr = (azhq[]) aziq.g.toArray(new azhq[0]);
        arml arml = null;
        if (azhqArr != null) {
            for (azhq azhq : azhqArr) {
                apeb = azhq != null ? azhq.a == 104364901 ? (apeb) azhq.b : apeb.e : null;
                if (apeb != null) {
                    break;
                }
            }
        }
        apeb = null;
        if (apeb == null || apeb.c.isEmpty()) {
            TextView textView = this.b;
            if ((aziq.a & 4) != 0) {
                arml = aziq.f;
                if (arml == null) {
                    arml = arml.f;
                }
            }
            xpr.a(textView, ajqy.a(arml));
        } else {
            xpr.a(this.b, false);
        }
        View findViewById = this.a.findViewById(R.id.avatar_container);
        cs csVar = (cs) this.d.getLayoutParams();
        cs csVar2 = (cs) findViewById.getLayoutParams();
        LayoutParams layoutParams = (LayoutParams) this.c.getLayoutParams();
        if (aklb.a(aziq.b == 5 ? (aygk) aziq.c : aygk.f)) {
            int a = azgk.a(aziq.l);
            if (a != 0 && a == 3) {
                layoutParams.width = this.e.getResources().getDimensionPixelOffset(R.dimen.watch_card_left_avatar_size);
                layoutParams.height = this.e.getResources().getDimensionPixelOffset(R.dimen.watch_card_left_avatar_size);
                csVar2.n = 0;
                csVar2.p = -1;
                csVar.n = -1;
                csVar.m = R.id.avatar_container;
                csVar.setMarginStart(this.e.getResources().getDimensionPixelOffset(R.dimen.watch_card_left_avatar_margin));
                this.c.setLayoutParams(layoutParams);
                findViewById.setLayoutParams(csVar2);
                this.d.setLayoutParams(csVar);
            }
        }
        layoutParams.width = this.e.getResources().getDimensionPixelOffset(R.dimen.watch_card_right_avatar_size);
        layoutParams.height = this.e.getResources().getDimensionPixelOffset(R.dimen.watch_card_right_avatar_size);
        csVar2.n = -1;
        csVar2.p = 0;
        csVar.n = 0;
        csVar.m = -1;
        csVar.setMarginStart(0);
        this.c.setLayoutParams(layoutParams);
        findViewById.setLayoutParams(csVar2);
        this.d.setLayoutParams(csVar);
    }
}
