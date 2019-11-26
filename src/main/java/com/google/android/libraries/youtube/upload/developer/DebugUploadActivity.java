package com.google.android.libraries.youtube.upload.developer;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import com.google.android.youtube.R;
import defpackage.alzk;
import defpackage.alzl;
import defpackage.alzm;
import defpackage.alzn;
import defpackage.alzo;
import defpackage.alzp;
import defpackage.alzq;
import defpackage.alzr;
import defpackage.alzs;
import defpackage.alzt;
import defpackage.alzu;
import defpackage.alzv;
import defpackage.alzw;
import defpackage.alzx;
import defpackage.alzy;
import defpackage.alzz;
import defpackage.amaa;
import defpackage.amac;
import defpackage.bbns;
import defpackage.bbnv;
import defpackage.xfc;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DebugUploadActivity extends Activity {
    public amac a;
    private final Map b = new HashMap();

    /* Access modifiers changed, original: protected|final */
    public final void onCreate(Bundle bundle) {
        finish();
        super.onCreate(bundle);
        ((alzk) ((xfc) getApplication()).n()).pn().a(this);
        setContentView(R.layout.debug_upload_layout);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.checkbox_list);
        linearLayout.addView(a("Force Cronet", alzm.a, alzl.a));
        linearLayout.addView(a("Force Cronet Async", alzu.a, alzt.a));
        linearLayout.addView(a("Force Cronet Quic", alzw.a, alzv.a));
        linearLayout.addView(a("Force Cronet Http2", alzy.a, alzx.a));
        linearLayout.addView(a("Force app camera", amaa.a, alzz.a));
        linearLayout.addView(a("Force fail all uploads", alzo.a, alzn.a));
        linearLayout.addView(a("Force Background Task", alzq.a, alzp.a));
        a();
        Button button = (Button) findViewById(R.id.upload_button);
        button.setText("Upload");
        button.setOnClickListener(new alzs(this));
    }

    public final void a() {
        for (Entry entry : this.b.entrySet()) {
            try {
                ((CheckBox) entry.getKey()).setChecked(((Boolean) ((bbnv) entry.getValue()).a(this.a)).booleanValue());
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    private final CheckBox a(String str, bbnv bbnv, bbns bbns) {
        CheckBox checkBox = new CheckBox(this);
        checkBox.setText(str);
        this.b.put(checkBox, bbnv);
        checkBox.setOnCheckedChangeListener(new alzr(this, bbns));
        return checkBox;
    }
}
