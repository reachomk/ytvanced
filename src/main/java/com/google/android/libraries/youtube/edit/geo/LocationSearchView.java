package com.google.android.libraries.youtube.edit.geo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import defpackage.ans;
import defpackage.xpr;
import defpackage.zqm;
import defpackage.zqq;
import defpackage.zqt;
import defpackage.zqu;
import defpackage.zqv;
import defpackage.zqw;
import java.util.Collections;
import java.util.List;

public final class LocationSearchView extends LinearLayout implements TextWatcher, zqq {
    public final EditText a = ((EditText) findViewById(R.id.autocomplete_text));
    public zqm b;
    private final ImageButton c = ((ImageButton) findViewById(R.id.back_to_basic_settings_button));
    private final ImageButton d = ((ImageButton) findViewById(R.id.reset_autocomplete_button));
    private final RecyclerView e = ((RecyclerView) findViewById(R.id.autocomplete_results));
    private final TextView f = ((TextView) findViewById(R.id.autocomplete_no_results_text));
    private final zqv g;

    public LocationSearchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater from = LayoutInflater.from(context);
        from.inflate(R.layout.edit_location_search_view, this);
        this.g = new zqv(from, new zqu(this));
        this.e.a(this.g);
        this.e.a(new ans());
        this.c.setOnClickListener(new zqt(this));
        this.a.addTextChangedListener(this);
        this.d.setOnClickListener(new zqw(this));
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void a(zqm zqm) {
        this.b = zqm;
        this.g.d = zqm;
    }

    public final void a() {
        if (!TextUtils.isEmpty(this.a.getText())) {
            a(Collections.emptyList());
            this.a.setText("");
        }
        this.a.requestFocus();
        xpr.b(this.a);
    }

    public final void a(List list) {
        zqv zqv = this.g;
        zqv.c = list;
        zqv.aa_();
        this.e.setVisibility(0);
        this.f.setVisibility(8);
    }

    public final void a(CharSequence charSequence) {
        this.f.setText(charSequence);
        this.e.setVisibility(8);
        this.f.setVisibility(0);
    }

    public final CharSequence b() {
        return this.a.getText();
    }

    public final void afterTextChanged(Editable editable) {
        zqm zqm = this.b;
        if (zqm != null) {
            zqm.c.filter(editable);
        }
        if (editable.length() == 0) {
            this.d.setVisibility(8);
        } else {
            this.d.setVisibility(0);
        }
    }
}
