package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.youtube.R;

/* renamed from: iuh */
public final class iuh extends akpl {
    public final CardView a;
    private final Activity b;
    private final TextView c = ((TextView) amqw.a((TextView) this.a.findViewById(R.id.text)));
    private final akoj d;
    private final akvp e;
    private final float f;

    public iuh(Activity activity, aaas aaas, ViewGroup viewGroup, akvp akvp) {
        this.b = (Activity) amqw.a((Object) activity);
        this.f = (float) activity.getResources().getDimensionPixelSize(R.dimen.refinement_chip_elevation_size);
        this.e = (akvp) amqw.a((Object) akvp);
        this.a = (CardView) LayoutInflater.from(activity).inflate(R.layout.refinement_chip, viewGroup, false);
        CardView cardView = this.a;
        CardView.a.b(cardView.h, this.f);
        this.d = new akoj(aaas, this.a);
    }

    public final void a(akpb akpb) {
        this.d.a();
    }

    public final View K_() {
        return this.a;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void a(akor akor, Object obj) {
        apxu apxu;
        arml arml;
        awyz awyz = (awyz) obj;
        akoj akoj = this.d;
        acvx acvx = akor.a;
        if ((awyz.a & 4) != 0) {
            apxu = awyz.c;
            if (apxu == null) {
                apxu = apxu.d;
            }
        } else {
            apxu = null;
        }
        akoj.a(acvx, apxu, akor.b());
        awza awza = awyz.e;
        if (awza == null) {
            awza = awza.c;
        }
        int a = awzc.a(awza.b);
        if (a == 0 || a != 2) {
            this.c.setMaxWidth(this.b.getResources().getDimensionPixelSize(R.dimen.preview_card_refinement_chip_max_width));
        } else {
            this.c.setMaxWidth(this.b.getResources().getDimensionPixelSize(R.dimen.refinement_chip_normal_max_width));
        }
        if ((awyz.a & 8) == 0) {
            adl.a(this.c, 0, 0);
        } else {
            Context context = this.b;
            akvp akvp = this.e;
            arwf arwf = awyz.d;
            if (arwf == null) {
                arwf = arwf.c;
            }
            arwh a2 = arwh.a(arwf.b);
            if (a2 == null) {
                a2 = arwh.UNKNOWN;
            }
            Drawable a3 = ra.a(context, akvp.a(a2));
            st.a(a3, ra.c(this.b, R.color.quantum_vanillablue500));
            adl.a(this.c, a3, null, null);
        }
        TextView textView = this.c;
        if ((awyz.a & 1) != 0) {
            arml = awyz.b;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        textView.setText(ajqy.a(arml));
        this.c.getBackground().setAlpha(255);
        CardView.a.a(this.a.h);
        this.c.setCompoundDrawablePadding(6);
        this.c.setPadding(this.b.getResources().getDimensionPixelSize(R.dimen.refinement_chip_text_left_padding), this.b.getResources().getDimensionPixelSize(R.dimen.refinement_chip_text_top_bottom_padding), this.b.getResources().getDimensionPixelSize(R.dimen.refinement_chip_text_right_padding), this.b.getResources().getDimensionPixelSize(R.dimen.refinement_chip_text_top_bottom_padding));
        this.c.getLayoutParams().height = this.b.getResources().getDimensionPixelSize(R.dimen.refinement_chip_height);
        if (VERSION.SDK_INT >= 23) {
            this.c.setForeground(null);
        }
        this.c.setIncludeFontPadding(false);
    }
}
