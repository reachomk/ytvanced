package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: gqy */
public final class gqy implements TextWatcher, grr {
    public final Context a;
    public final grd b;
    public final grl c;
    public final EditText d;
    private final ImageButton e;
    private final ImageButton f;
    private final RecyclerView g;
    private final TextView h;

    public gqy(Context context, grq grq, ViewGroup viewGroup, grd grd, acvx acvx, ayvv ayvv, apxu apxu) {
        this.a = context;
        this.b = (grd) amqw.a((Object) grd);
        this.e = (ImageButton) viewGroup.findViewById(R.id.back_to_basic_settings_button);
        this.d = (EditText) viewGroup.findViewById(R.id.autocomplete_text);
        this.f = (ImageButton) viewGroup.findViewById(R.id.reset_autocomplete_button);
        this.g = (RecyclerView) viewGroup.findViewById(R.id.autocomplete_results);
        this.h = (TextView) viewGroup.findViewById(R.id.autocomplete_no_results_text);
        this.e.setOnClickListener(new grb(this));
        this.d.addTextChangedListener(this);
        this.f.setOnClickListener(new gra(this));
        this.c = grq.a(this, this.g, apxu, acvx, ayvv);
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void a(boolean z) {
        if (z) {
            CharSequence string;
            if (this.d.getText().length() > 0) {
                string = this.a.getString(R.string.user_mention_search_view_no_results_message);
            } else {
                string = this.a.getString(R.string.user_mention_search_view_results_box_hint);
            }
            a(string);
            return;
        }
        this.g.setVisibility(0);
        this.h.setVisibility(8);
    }

    public final void a(aywd aywd) {
        this.b.a(aywd);
        xpr.a(this.d);
        this.c.b();
    }

    public final void a(CharSequence charSequence) {
        this.h.setText(charSequence);
        this.g.setVisibility(8);
        this.h.setVisibility(0);
    }

    public final void afterTextChanged(Editable editable) {
        if (editable.length() == 0) {
            this.f.setVisibility(8);
        } else {
            this.f.setVisibility(0);
        }
        this.c.a(editable.toString());
    }
}
