package com.google.android.libraries.youtube.offline.developer;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import com.google.android.youtube.R;
import defpackage.afpu;
import defpackage.agjb;
import defpackage.agkt;
import defpackage.agku;
import defpackage.agwc;
import defpackage.xfc;

public class DebugOfflineVideosActivity extends Activity {
    public agwc a;
    public afpu b;
    public SharedPreferences c;

    /* Access modifiers changed, original: protected|final */
    public final void onCreate(Bundle bundle) {
        finish();
        super.onCreate(bundle);
        ((agjb) ((xfc) getApplication()).n()).pm().a(this);
        setContentView(R.layout.debug_offline_videos_layout);
        View findViewById = findViewById(R.id.offline_video_debug_view);
        TextView textView = (TextView) findViewById(R.id.account_header);
        Button button = (Button) findViewById(R.id.retry_single_videos_button);
        TextView textView2 = (TextView) findViewById(R.id.not_signed_in_error_view);
        CheckBox checkBox = (CheckBox) findViewById(R.id.enable_retry_check);
        checkBox.setChecked(this.c.getBoolean("debug_offline_transfer_retry", false));
        checkBox.setOnCheckedChangeListener(new agku(this, checkBox));
        if (this.b.a()) {
            CharSequence str;
            String valueOf = String.valueOf(this.b.c().a());
            String str2 = "Signed in as ";
            if (valueOf.length() == 0) {
                str = new String(str2);
            } else {
                str = str2.concat(valueOf);
            }
            textView.setText(str);
            button.setOnClickListener(new agkt(this.a.b()));
            return;
        }
        findViewById.setVisibility(8);
        textView2.setVisibility(0);
    }
}
