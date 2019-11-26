package com.google.android.apps.youtube.app.settings;

import android.content.Context;
import android.preference.SwitchPreference;
import android.util.AttributeSet;

public class YouTubeSwitchPreference extends SwitchPreference {
    public YouTubeSwitchPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public YouTubeSwitchPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16843629);
    }

    public YouTubeSwitchPreference(Context context) {
        this(context, null);
    }
}
