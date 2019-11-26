package com.google.android.apps.youtube.app.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.preference.Preference;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.youtube.R;
import defpackage.afpu;
import defpackage.afzi;
import defpackage.agwc;
import defpackage.bcaa;
import defpackage.jmd;
import defpackage.job;
import defpackage.oww;
import defpackage.xmc;
import defpackage.xrz;
import defpackage.xse;
import defpackage.xta;
import defpackage.xvd;

public class StorageBarPreference extends Preference {
    public afpu a;
    public bcaa b;
    public xmc c;
    public xta d;
    private Context e;
    private final boolean f;

    public StorageBarPreference(Context context) {
        super(context);
        this.e = context;
        this.f = false;
    }

    public StorageBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jmd.m);
        this.f = obtainStyledAttributes.getBoolean(jmd.n, false);
        obtainStyledAttributes.recycle();
    }

    public StorageBarPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jmd.m);
        this.f = obtainStyledAttributes.getBoolean(jmd.n, false);
        obtainStyledAttributes.recycle();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onBindView(View view) {
        oww e;
        long a;
        super.onBindView(view);
        ((job) xse.b(getContext())).a(this);
        if (this.a.a()) {
            afzi j = ((agwc) this.b.get()).b().j();
            if (this.f) {
                e = j.e();
            } else {
                e = j.d();
            }
        } else {
            e = null;
        }
        long e2 = this.c.e();
        long a2 = e != null ? xrz.a(e.d()) : 0;
        if (this.f) {
            a = xrz.a(e2);
        } else {
            a = xrz.a(xta.a());
        }
        ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.storage_bar);
        progressBar.setMax(1000);
        float f = (float) a2;
        progressBar.setProgress((int) ((1000.0f * f) / (f + ((float) a))));
        ((TextView) view.findViewById(R.id.storage_used)).setText(this.e.getResources().getString(R.string.pref_offline_storage_used, new Object[]{xvd.d(this.e.getResources(), a2)}));
        ((TextView) view.findViewById(R.id.storage_free)).setText(this.e.getResources().getString(R.string.pref_offline_storage_free, new Object[]{xvd.d(this.e.getResources(), a)}));
    }
}
