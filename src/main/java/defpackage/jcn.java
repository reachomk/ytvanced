package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: jcn */
public final class jcn implements TextWatcher, OnClickListener, OnItemClickListener {
    public final jcr a = new jcr(this.e);
    public final AutoCompleteTextView b = ((AutoCompleteTextView) this.j.findViewById(R.id.capability_name));
    public final Button c = ((Button) this.j.findViewById(R.id.clear_capability));
    public final TextView d = ((TextView) this.j.findViewById(R.id.features_label));
    public final LinearLayout e = ((LinearLayout) this.j.findViewById(R.id.feature_list));
    public final Button f = ((Button) this.j.findViewById(R.id.add_supported_feature));
    public final Button g = ((Button) this.j.findViewById(R.id.add_disabled_feature));
    public jcm h;
    private final ArrayAdapter i;
    private final View j;
    private final ImageView k = ((ImageView) this.j.findViewById(R.id.remove));

    public jcn(View view, String[] strArr) {
        this.j = (View) amqw.a((Object) view);
        this.i = new ArrayAdapter(view.getContext(), R.layout.menu_dropdown_item, strArr);
        this.k.setOnClickListener(this);
        this.b.addTextChangedListener(this);
        this.b.setOnItemClickListener(this);
        this.b.setAdapter(this.i);
        this.c.setOnClickListener(this);
        this.f.setOnClickListener(this);
        this.g.setOnClickListener(this);
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void a(boolean z) {
        this.f.setEnabled(z);
        this.g.setEnabled(z);
    }

    public final void onClick(View view) {
        jcm jcm;
        if (view == this.k) {
            jcm = this.h;
            if (jcm != null) {
                jcm.a.a(jcm);
            }
        } else if (view == this.c) {
            this.b.setText("");
        } else if (view == this.f) {
            jcm = this.h;
            if (jcm != null) {
                jcm.a(true);
            }
        } else if (view == this.g) {
            jcm = this.h;
            if (jcm != null) {
                jcm.a(false);
            }
        }
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.h.a();
        a();
    }

    public final void a() {
        this.b.setFocusable(false);
        this.b.setEnabled(false);
        this.c.setEnabled(false);
        this.c.setVisibility(8);
        this.d.setVisibility(0);
        this.e.setVisibility(0);
        this.f.setVisibility(0);
        this.g.setVisibility(0);
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        jcm jcm = this.h;
        if (jcm != null) {
            jcm.a(this.b.getText().toString());
        }
    }
}
