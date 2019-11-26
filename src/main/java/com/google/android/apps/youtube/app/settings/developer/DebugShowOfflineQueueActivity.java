package com.google.android.apps.youtube.app.settings.developer;

import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.youtube.R;
import defpackage.afkq;
import defpackage.aknw;
import defpackage.akoc;
import defpackage.akoe;
import defpackage.akpk;
import defpackage.dvg;
import defpackage.dvk;
import defpackage.jcg;
import defpackage.jdj;
import defpackage.jdk;
import defpackage.nkg;
import defpackage.xfc;

public class DebugShowOfflineQueueActivity extends dvg {
    public afkq l;
    public akoe m;
    public TextView n;
    public akpk o;
    private ListView p;
    private AsyncTask q;

    /* Access modifiers changed, original: protected|final */
    public final void onCreate(Bundle bundle) {
        finish();
        super.onCreate(bundle);
        setContentView((int) R.layout.debug_show_offline_queue_layout);
        aknw aknw = new aknw();
        aknw.a(nkg.class, new jdk(this));
        akoc a = this.m.a(aknw);
        this.o = new akpk();
        a.a(this.o);
        this.p = (ListView) findViewById(R.id.list);
        this.n = (TextView) findViewById(16908292);
        this.p.setAdapter(a);
        this.q = new jdj(this);
    }

    /* Access modifiers changed, original: protected|final */
    public final void l() {
        ((jcg) ((xfc) getApplication()).n()).a(new dvk(this)).a(this);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onResume() {
        super.onResume();
        this.q.execute(new Void[]{null});
        g().a((CharSequence) "Show offline queue");
        this.n.setVisibility(0);
        this.n.setText("Loading...");
    }
}
