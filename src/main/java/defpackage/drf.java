package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: drf */
public final class drf implements akot {
    public aanv a;
    private final Context b;
    private final akkq c;
    private final acvx d;
    private final View e;
    private final TextView f = ((TextView) this.e.findViewById(R.id.name));
    private final TextView g = ((TextView) this.e.findViewById(R.id.byline));
    private final View h = this.e.findViewById(R.id.selection_checkmark);
    private final View i = this.e.findViewById(R.id.selection_highlight);
    private final ImageView j = ((ImageView) this.e.findViewById(R.id.thumbnail));

    public drf(Context context, akkq akkq, acvx acvx, uxy uxy) {
        amqw.a((Object) uxy);
        this.b = (Context) amqw.a((Object) context);
        this.c = (akkq) amqw.a((Object) akkq);
        this.d = (acvx) amqw.a((Object) acvx);
        this.e = LayoutInflater.from(context).inflate(R.layout.fusion_account_item, null);
        this.e.setOnClickListener(new dre(this, uxy));
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.e;
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        aanv aanv = (aanv) obj;
        this.d.a(aanv.l(), null);
        this.f.setText(aanv.a());
        Spanned c = aanv.c();
        if (TextUtils.isEmpty(c)) {
            this.g.setVisibility(8);
        } else {
            this.g.setText(c);
            this.g.setVisibility(0);
        }
        if (aanv.b() != null) {
            this.c.a(this.j, aanv.b().d());
        }
        if (aanv.d()) {
            this.e.setContentDescription(this.b.getString(R.string.account_switcher_selected_account_label, new Object[]{aanv.a()}));
            this.h.setVisibility(0);
            this.f.setTypeface(ajrc.ROBOTO_MEDIUM.a(this.b));
            this.i.setSelected(true);
        } else {
            this.e.setContentDescription(aanv.a());
            this.h.setVisibility(8);
            this.f.setTypeface(ajrc.ROBOTO_REGULAR.a(this.b));
            this.i.setSelected(false);
        }
        this.a = aanv;
    }
}
