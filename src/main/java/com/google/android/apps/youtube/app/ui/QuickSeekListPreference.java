package com.google.android.apps.youtube.app.ui;

import android.content.Context;
import android.preference.ListPreference;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.youtube.R;

public class QuickSeekListPreference extends ListPreference {
    public QuickSeekListPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public QuickSeekListPreference(Context context) {
        super(context);
    }

    public final CharSequence getSummary() {
        CharSequence entry = getEntry();
        if (TextUtils.isEmpty(entry)) {
            return super.getSummary();
        }
        int parseInt = Integer.parseInt(entry.toString());
        return getContext().getResources().getQuantityString(R.plurals.quick_seek_x_second, parseInt, new Object[]{Integer.valueOf(parseInt)});
    }
}
