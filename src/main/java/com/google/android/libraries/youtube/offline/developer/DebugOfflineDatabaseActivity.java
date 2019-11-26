package com.google.android.libraries.youtube.offline.developer;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.youtube.R;
import defpackage.agjb;
import defpackage.agjv;
import defpackage.agkw;
import defpackage.agvz;
import defpackage.agwc;
import defpackage.xfc;

public class DebugOfflineDatabaseActivity extends Activity {
    public agwc a;

    /* Access modifiers changed, original: protected|final */
    public final void onCreate(Bundle bundle) {
        finish();
        super.onCreate(bundle);
        ((agjb) ((xfc) getApplication()).n()).pm().a(this);
        setContentView(R.layout.debug_offline_database_layout);
        TextView textView = (TextView) findViewById(R.id.text);
        Button button = (Button) findViewById(R.id.report_button);
        agvz b = this.a.b();
        int size = b.k().a().size();
        int size2 = b.k().c().size();
        int size3 = b.n().a().size();
        int size4 = b.o().a().size();
        StringBuilder stringBuilder = new StringBuilder(118);
        stringBuilder.append("Offline store overview:\n");
        stringBuilder.append(size);
        stringBuilder.append(" videos.\n");
        stringBuilder.append(size2);
        stringBuilder.append(" single videos.\n");
        stringBuilder.append(size3);
        stringBuilder.append(" playlists.\n");
        stringBuilder.append(size4);
        stringBuilder.append(" video lists.");
        textView.setText(stringBuilder.toString());
        button.setText("Generate report");
        button.setOnClickListener(new agjv(this));
        agkw.a(this);
    }
}
