package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.RadioButton;
import com.google.android.youtube.R;

/* renamed from: wnc */
final class wnc implements OnCheckedChangeListener {
    public final View a;
    public final RadioButton b = ((RadioButton) this.a.findViewById(R.id.radio_button));
    public final CheckBox c = ((CheckBox) this.a.findViewById(R.id.checkbox));
    public final EditText d = ((EditText) this.a.findViewById(R.id.freeform_response));
    public CompoundButton e;
    public arjt f;
    public final /* synthetic */ wna g;

    public wnc(wna wna, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.g = wna;
        this.a = layoutInflater.inflate(R.layout.feedback_option, viewGroup, false);
        this.c.setOnCheckedChangeListener(this);
        this.b.setOnCheckedChangeListener(this);
    }

    public final void a(boolean z) {
        xpr.a(this.a, z);
    }

    private final void b(boolean z) {
        if (z != this.e.isChecked()) {
            this.e.setChecked(z);
        }
        if (this.f.e && z) {
            xpr.a(this.d, true);
            this.d.requestFocus();
        } else {
            xpr.a(this.d, false);
        }
        if (z) {
            this.g.c = this;
        }
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        wna wna = this.g;
        if (!wna.d.d) {
            wnc wnc = wna.c;
            if (wnc != null) {
                wnc.b(false);
            }
        }
        b(z);
    }
}
