package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: eqr */
final class eqr implements akot {
    private final Context a;
    private final akvp b;
    private final TextView c;

    eqr(Context context, akvp akvp) {
        this.a = (Context) amqw.a((Object) context);
        this.b = (akvp) amqw.a((Object) akvp);
        this.c = (TextView) View.inflate(context, 17367043, null);
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.c;
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        auvj auvj = (auvj) obj;
        this.c.setText(abmk.a(auvj));
        if (abmk.b(auvj) != null) {
            TextView textView = this.c;
            akvp akvp = this.b;
            arwh a = arwh.a(abmk.b(auvj).b);
            if (a == null) {
                a = arwh.UNKNOWN;
            }
            textView.setCompoundDrawablesWithIntrinsicBounds(akvp.a(a), 0, 0, 0);
            this.c.setCompoundDrawablePadding(this.a.getResources().getDimensionPixelOffset(R.dimen.innertube_menu_padding));
        }
    }
}
