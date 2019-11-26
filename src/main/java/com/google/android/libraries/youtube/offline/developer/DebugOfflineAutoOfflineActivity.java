package com.google.android.libraries.youtube.offline.developer;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.youtube.R;
import defpackage.afpu;
import defpackage.afym;
import defpackage.agjb;
import defpackage.agju;
import defpackage.agwc;
import defpackage.xfc;

public class DebugOfflineAutoOfflineActivity extends Activity {
    public afpu a;
    public afym b;
    public agwc c;

    /* Access modifiers changed, original: protected|final */
    public final void onCreate(Bundle bundle) {
        finish();
        super.onCreate(bundle);
        ((agjb) ((xfc) getApplication()).n()).pm().a(this);
        setContentView(R.layout.debug_offline_auto_offline);
        View findViewById = findViewById(R.id.offline_auto_offline_debug_view);
        TextView textView = (TextView) findViewById(R.id.account_header);
        ((Button) findViewById(R.id.sync_now_button)).setOnClickListener(new agju(this));
        TextView textView2 = (TextView) findViewById(R.id.not_signed_in_error_view);
        if (this.a.a()) {
            String valueOf = String.valueOf(this.a.c().a());
            String str = "Signed in as ";
            textView.setText(valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
            return;
        }
        findViewById.setVisibility(8);
        textView2.setVisibility(0);
    }
}
