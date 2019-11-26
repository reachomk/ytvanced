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
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: jcs */
public final class jcs implements TextWatcher, OnClickListener, OnItemClickListener {
    public final ArrayAdapter a;
    public final TextView b = ((TextView) this.f.findViewById(R.id.feature_description));
    public final AutoCompleteTextView c = ((AutoCompleteTextView) this.f.findViewById(R.id.feature_name));
    public final Button d = ((Button) this.f.findViewById(R.id.clear_feature_name));
    public jcq e;
    private final View f;
    private final ImageView g = ((ImageView) this.f.findViewById(R.id.remove));

    public jcs(View view) {
        this.f = (View) amqw.a((Object) view);
        this.a = new ArrayAdapter(view.getContext(), R.layout.menu_dropdown_item);
        this.g.setOnClickListener(this);
        this.c.addTextChangedListener(this);
        this.c.setOnItemClickListener(this);
        this.c.setAdapter(this.a);
        this.d.setOnClickListener(this);
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onClick(View view) {
        if (view == this.g) {
            jcq jcq = this.e;
            if (jcq != null) {
                jcm jcm = jcq.a;
                jcm.b.remove(jcq);
                jcm.c.notifyDataSetChanged();
                if (jcq.d) {
                    jcm.a.b(jcm, jcq);
                }
            }
        } else if (view == this.d) {
            this.c.setText("");
        }
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.e.a();
        a();
    }

    public final void a() {
        this.c.setEnabled(false);
        this.c.setFocusable(false);
        this.d.setEnabled(false);
        this.d.setVisibility(8);
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        jcq jcq = this.e;
        if (jcq != null) {
            jcq.a(this.c.getText().toString());
        }
    }
}
