package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: klm */
public final class klm implements akot {
    private final akou a;
    private final View b;
    private final TextView c = ((TextView) this.b.findViewById(R.id.title));
    private final TextView d = ((TextView) this.b.findViewById(R.id.contents));
    private final int e;
    private final int f;
    private final int g;

    public klm(Context context, flu flu) {
        this.a = flu;
        this.b = View.inflate(context, R.layout.stat_row_item, null);
        this.e = xwe.a(context, R.attr.ytTextPrimary, 0);
        this.f = xwe.a(context, R.attr.ytTextSecondary, 0);
        this.g = xwe.a(context, R.attr.ytTextDisabled, 0);
        flu.a(this.b);
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.a.a();
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        arml arml;
        axty axty = (axty) obj;
        TextView textView = this.c;
        if ((axty.a & 1) != 0) {
            arml = axty.b;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        textView.setText(ajqy.a(arml));
        textView = this.d;
        if ((axty.a & 2) != 0) {
            arml = axty.c;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        textView.setText(ajqy.a(arml));
        if ((axty.d ^ 1) == 0) {
            this.c.setTextColor(this.g);
            this.d.setTextColor(this.g);
        } else {
            this.c.setTextColor(this.e);
            this.d.setTextColor(this.f);
        }
        akor.a.a(axty.e.d(), null);
        this.a.a(akor);
    }
}
