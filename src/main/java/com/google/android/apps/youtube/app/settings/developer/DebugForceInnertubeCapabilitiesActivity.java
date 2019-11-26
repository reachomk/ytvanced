package com.google.android.apps.youtube.app.settings.developer;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import com.google.android.youtube.R;
import defpackage.dvg;
import defpackage.dvk;
import defpackage.jcg;
import defpackage.jch;
import defpackage.jci;
import defpackage.jcj;
import defpackage.jck;
import defpackage.jcl;
import defpackage.jcm;
import defpackage.jcn;
import defpackage.jco;
import defpackage.jcq;
import defpackage.jcr;
import defpackage.jct;
import defpackage.jcu;
import defpackage.jdm;
import defpackage.xfc;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class DebugForceInnertubeCapabilitiesActivity extends dvg {
    public jcu l;
    public CheckBox m;
    public jco n;
    public List o;
    public jcl p;
    private final Context q = this;
    private LinearLayout r;
    private Button s;
    private Button t;

    /* Access modifiers changed, original: protected|final */
    public final void onCreate(Bundle bundle) {
        finish();
        super.onCreate(bundle);
        setContentView((int) R.layout.debug_force_innertube_capabilities);
        this.o = new ArrayList();
        this.n = new jco(this.q, this.o);
        this.m = (CheckBox) findViewById(R.id.enable_debug_force_capability);
        findViewById(R.id.capability_list_scroll_view);
        this.r = (LinearLayout) findViewById(R.id.capability_list);
        this.s = (Button) findViewById(R.id.add_capability);
        this.t = (Button) findViewById(R.id.clear_capability);
        new jcr(this.r).a(this.n);
        this.m.setOnClickListener(new jci(this));
        this.s.setOnClickListener(new jch(this));
        this.t.setOnClickListener(new jck(this));
        this.p = new jcj(this);
        jcu jcu = this.l;
        if (!jdm.a && jcu.a()) {
            jdm.a = true;
            jdm.b = new ConcurrentHashMap();
            ArrayList arrayList = new ArrayList();
            arrayList = new ArrayList();
        }
        if (jdm.a) {
            String[] strArr;
            jco jco = this.n;
            if (jdm.a) {
                if (jdm.c == null) {
                    jdm.c = (String[]) jdm.b.keySet().toArray(new String[jdm.b.keySet().size()]);
                }
                strArr = jdm.c;
            } else {
                strArr = null;
            }
            jco.a = strArr;
        }
        n();
    }

    /* Access modifiers changed, original: protected|final */
    public final void l() {
        ((jcg) ((xfc) getApplication()).n()).a(new dvk(this)).a(this);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onResume() {
        super.onResume();
        this.m.setChecked(this.l.a());
        n();
    }

    public final void n() {
        if (jdm.a) {
            this.o.clear();
            String str = "";
            String str2 = "debugForceInnertubeCapabilityForcedCapabilities";
            Map a = jcu.a(this.l.b.getString(str2, str));
            for (String str3 : (String[]) a.keySet().toArray(new String[a.keySet().size()])) {
                jcm jcm = new jcm(this.p, this);
                this.o.add(jcm);
                jcm.a(str3);
                jcm.a();
                jcu jcu = this.l;
                String[] strArr = jcu.a;
                Map map = (Map) jcu.a(jcu.b.getString(str2, str)).get(str3);
                if (map != null) {
                    strArr = (String[]) map.keySet().toArray(new String[map.keySet().size()]);
                }
                for (Object obj : strArr) {
                    Map map2 = (Map) jcu.a(this.l.b.getString(str2, str)).get(str3);
                    Boolean bool = map2 != null ? (Boolean) map2.get(obj) : null;
                    if (bool != null) {
                        jcq jcq = new jcq(jcm, bool.booleanValue());
                        jcm.b.add(jcq);
                        jcq.a(obj);
                        jcq.a();
                    }
                }
            }
            this.n.notifyDataSetChanged();
        }
        if (this.m.isChecked() && !jdm.a) {
            new Builder(this).setMessage("Capability caches not initialized. Restart app?").setPositiveButton("Restart", new jct(this)).setNegativeButton(17039360, null).show();
        }
        boolean z = jdm.a && this.m.isChecked();
        this.r.setEnabled(z);
        int childCount = this.r.getChildCount();
        for (int i = 0; i < childCount; i++) {
            ((jcn) this.r.getChildAt(i).getTag()).a(z);
        }
        this.s.setEnabled(z);
        this.t.setEnabled(z);
    }

    public final void a(jcm jcm, jcq jcq) {
        jcu jcu = this.l;
        String str = jcm.d;
        String str2 = jcq.c;
        String str3 = "debugForceInnertubeCapabilityForcedCapabilities";
        Map a = jcu.a(jcu.b.getString(str3, ""));
        Map map = (Map) a.get(str);
        if (map != null) {
            map.remove(str2);
            if (map.size() == 0) {
                a.remove(str);
            }
        }
        jcu.a(str3, jcu.a(a));
    }
}
