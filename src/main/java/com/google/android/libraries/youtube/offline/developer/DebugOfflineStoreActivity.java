package com.google.android.libraries.youtube.offline.developer;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.CheckBox;
import com.google.android.youtube.R;
import defpackage.agjb;
import defpackage.agkl;
import defpackage.xfc;

public class DebugOfflineStoreActivity extends Activity {
    public SharedPreferences a;

    /* Access modifiers changed, original: protected|final */
    public final void onCreate(Bundle bundle) {
        finish();
        super.onCreate(bundle);
        ((agjb) ((xfc) getApplication()).n()).pm().a(this);
        setContentView(R.layout.debug_offline_store_layout);
        CheckBox checkBox = (CheckBox) findViewById(R.id.enable_noop_offline_store);
        checkBox.setChecked(this.a.getBoolean("debug_noop_offline_store", false));
        checkBox.setOnCheckedChangeListener(new agkl(this, checkBox));
    }
}
