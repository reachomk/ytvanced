package com.google.android.libraries.youtube.offline.developer;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.youtube.R;
import defpackage.afpu;
import defpackage.agjb;
import defpackage.agjy;
import defpackage.agjz;
import defpackage.agka;
import defpackage.agkb;
import defpackage.agkc;
import defpackage.agkf;
import defpackage.aguh;
import defpackage.aguk;
import defpackage.agvz;
import defpackage.agwc;
import defpackage.bcaa;
import defpackage.xfc;
import defpackage.xsc;
import defpackage.xuu;
import java.util.concurrent.TimeUnit;

public class DebugOfflineResyncActivity extends Activity {
    public static final long a = TimeUnit.DAYS.toMillis(30);
    public TextView b;
    public xsc c;
    public afpu d;
    public bcaa e;
    public aguk f;
    public xuu g;
    public aguh h;
    public agvz i;
    private Handler j;

    /* Access modifiers changed, original: protected|final */
    public final void onCreate(Bundle bundle) {
        finish();
        super.onCreate(bundle);
        ((agjb) ((xfc) getApplication()).n()).pm().a(this);
        setContentView(R.layout.debug_offline_resync_layout);
        View findViewById = findViewById(R.id.offline_resync_debug_view);
        TextView textView = (TextView) findViewById(R.id.account_header);
        ((Button) findViewById(R.id.resync_button)).setOnClickListener(new agka(this));
        ((Button) findViewById(R.id.expire_button)).setOnClickListener(new agjz(this));
        ((Button) findViewById(R.id.expire_metadata_button)).setOnClickListener(new agkc(this));
        ((Button) findViewById(R.id.randomize_expiration_time_button)).setOnClickListener(new agjy(this));
        ((Button) findViewById(R.id.force_refresh_player_response_button)).setOnClickListener(new agkb(this));
        TextView textView2 = (TextView) findViewById(R.id.not_signed_in_error_view);
        if (this.d.a()) {
            CharSequence str;
            String valueOf = String.valueOf(this.d.c().a());
            String str2 = "Signed in as ";
            if (valueOf.length() == 0) {
                str = new String(str2);
            } else {
                str = str2.concat(valueOf);
            }
            textView.setText(str);
            this.i = ((agwc) this.e.get()).b();
        } else {
            findViewById.setVisibility(8);
            textView2.setVisibility(0);
        }
        this.b = (TextView) findViewById(R.id.logs_text_view);
        HandlerThread handlerThread = new HandlerThread("debugOfflineLogs");
        handlerThread.start();
        this.j = new Handler(handlerThread.getLooper(), new agkf(this));
    }

    /* Access modifiers changed, original: protected|final */
    public final void onPause() {
        super.onPause();
        this.j.removeMessages(1);
    }
}
