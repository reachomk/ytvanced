package defpackage;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: akst */
public final class akst extends LinearLayout {
    public final TextView a = ((TextView) findViewById(R.id.title));
    public final ListView b = ((ListView) findViewById(R.id.content));
    public final TextView c;
    public final View d;
    public final CompoundButton e;
    public final TextView f;

    public akst(Context context) {
        super(context);
        setOrientation(1);
        LayoutInflater from = LayoutInflater.from(context);
        from.inflate(R.layout.report_form, this);
        View inflate = from.inflate(R.layout.report_form_legal_section, this.b, false);
        this.c = (TextView) inflate.findViewById(R.id.footer);
        this.d = inflate.findViewById(R.id.legal_checkbox_separator);
        this.e = (CompoundButton) inflate.findViewById(R.id.legal_checkbox);
        this.f = (TextView) inflate.findViewById(R.id.legal_description);
        this.b.addFooterView(inflate, null, false);
        this.f.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
