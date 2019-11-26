package defpackage;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: alod */
public final class alod implements akot {
    public final aaas a;
    private final View b;
    private final TextView c = ((TextView) this.b.findViewById(R.id.title));
    private final TextView d = ((TextView) this.b.findViewById(R.id.add_contacts_button));
    private final aloe e;
    private final int f;

    public alod(Context context, aaas aaas, aloe aloe) {
        this.b = View.inflate(context, R.layout.share_panel_title_v15, null);
        this.a = (aaas) amqw.a((Object) aaas);
        this.e = (aloe) amqw.a((Object) aloe);
        this.f = context.getResources().getDimensionPixelSize(R.dimen.share_panel_title_padding);
    }

    public final View K_() {
        return this.b;
    }

    public final void a(akpb akpb) {
        this.d.setVisibility(8);
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        arml arml;
        aymg aymg = (aymg) obj;
        TextView textView = this.c;
        arml arml2 = null;
        if ((aymg.a & 1) != 0) {
            arml = aymg.b;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        textView.setText(ajqy.a(arml));
        textView = this.d;
        if ((aymg.a & 2) != 0) {
            arml2 = aymg.c;
            if (arml2 == null) {
                arml2 = arml.f;
            }
        }
        xpr.a(textView, aabb.a(arml2, this.a, false));
        this.d.setOnClickListener(new aloc(this, aymg));
        this.d.setMovementMethod(LinkMovementMethod.getInstance());
        this.d.setHighlightColor(0);
        View view;
        int i;
        if (this.e.b()) {
            view = this.b;
            i = this.f;
            view.setPadding(i, i, i, 0);
            alpf.a(this.b, false);
            return;
        }
        view = this.b;
        i = this.f;
        view.setPadding(i, i, i, i);
        alpf.a(this.b, true);
    }
}
