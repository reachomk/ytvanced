package com.google.android.apps.youtube.app.ui;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.preference.ListPreference;
import android.util.AttributeSet;
import defpackage.jod;

public class SubtitlesColorListPreference extends ListPreference {
    public Context a;
    public int[] b;

    public SubtitlesColorListPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = context;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onPrepareDialogBuilder(Builder builder) {
        builder.setAdapter(new jod(this, getContext(), getEntries(), findIndexOfValue(getSharedPreferences().getString(getKey(), Integer.toString(0)))), this);
        super.onPrepareDialogBuilder(builder);
    }
}
