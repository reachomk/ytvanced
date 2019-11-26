package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: aksy */
final class aksy implements OnClickListener {
    public final TextView a;
    public final Spinner b;
    public final RadioButton c;
    public final View d;
    public final /* synthetic */ aksz e;

    public aksy(aksz aksz, View view) {
        this.e = aksz;
        this.c = (RadioButton) view.findViewById(R.id.report_form_top_level_radio);
        this.a = (TextView) view.findViewById(R.id.report_form_top_level_text);
        this.b = (Spinner) view.findViewById(R.id.report_form_top_level_spinner);
        this.d = view.findViewById(R.id.report_form_top_level_separator);
    }

    public final void onClick(View view) {
        RadioButton radioButton = this.c;
        radioButton.setChecked(radioButton.isChecked() ^ 1);
        if (this.c.isChecked()) {
            this.e.a((avug) this.c.getTag());
        } else {
            this.e.a(null);
        }
    }
}
