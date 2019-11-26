package com.google.android.libraries.youtube.offline.developer;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.youtube.R;
import defpackage.aahv;
import defpackage.afpu;
import defpackage.afzi;
import defpackage.agjb;
import defpackage.agkm;
import defpackage.agkn;
import defpackage.agkp;
import defpackage.agkq;
import defpackage.agks;
import defpackage.agkw;
import defpackage.agql;
import defpackage.agvz;
import defpackage.agwc;
import defpackage.ahcy;
import defpackage.ahdj;
import defpackage.bcaa;
import defpackage.ovm;
import defpackage.ovw;
import defpackage.oww;
import defpackage.oxc;
import defpackage.oxy;
import defpackage.xfc;
import defpackage.xsf;
import defpackage.xtl;
import java.io.File;
import java.security.Key;
import java.util.List;

public class DebugOfflineStreamsActivity extends Activity {
    public Key a;
    public xsf b;
    public bcaa c;
    public ahdj d;
    public afpu e;

    /* Access modifiers changed, original: protected|final */
    public final void onCreate(Bundle bundle) {
        finish();
        super.onCreate(bundle);
        ((agjb) ((xfc) getApplication()).n()).pm().a(this);
        setContentView(R.layout.debug_offline_streams_layout);
        View findViewById = findViewById(R.id.offline_streams_debug_view);
        TextView textView = (TextView) findViewById(R.id.not_signed_in_error_view);
        if (this.e.a()) {
            String valueOf;
            String str;
            TextView textView2 = (TextView) findViewById(R.id.encryption_key_text);
            textView = (TextView) findViewById(R.id.encryption_key_text2);
            TextView textView3 = (TextView) findViewById(R.id.streams_dir_text);
            Button button = (Button) findViewById(R.id.report_button);
            Button button2 = (Button) findViewById(R.id.verify_streams_button);
            Button button3 = (Button) findViewById(R.id.force_stream_corrupt_button);
            TextView textView4 = (TextView) findViewById(R.id.force_audio_itag_text);
            EditText editText = (EditText) findViewById(R.id.force_audio_itag_input);
            TextView textView5 = (TextView) findViewById(R.id.force_video_itag_text);
            EditText editText2 = (EditText) findViewById(R.id.force_video_itag_input);
            String valueOf2 = String.valueOf(Base64.encodeToString(this.a.getEncoded(), 0));
            String str2 = "Encryption key (base64 encoded): ";
            textView2.setText(valueOf2.length() == 0 ? new String(str2) : str2.concat(valueOf2));
            SharedPreferences sharedPreferences = getSharedPreferences("youtube", 0);
            if (sharedPreferences.contains("downloads_encryption_key")) {
                valueOf = String.valueOf(Base64.encodeToString(this.b.a(sharedPreferences).getEncoded(), 0));
                String str3 = "Alternate encryption key from 12.23 Dogfood: ";
                textView.setText(valueOf.length() == 0 ? new String(str3) : str3.concat(valueOf));
            } else {
                textView.setText("No alternate encryption key found");
            }
            afzi j = ((agwc) this.c.get()).b().j();
            File c = j != null ? j.c() : null;
            if (c != null) {
                valueOf = String.valueOf(c.getAbsolutePath());
                str = "Offline cache: ";
                textView3.setText(valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
            } else {
                textView3.setText("Offline cache not found.");
            }
            button.setText("Generate report");
            button.setOnClickListener(new agkn(this));
            button2.setText("Verify streams now");
            button2.setOnClickListener(new agkm(this));
            button3.setText("Set all streams as corrupt");
            button3.setOnClickListener(new agkp(this));
            ahcy ahcy = (ahcy) this.d;
            int i = aahv.a;
            StringBuilder stringBuilder = new StringBuilder(54);
            stringBuilder.append("Force fixed audio itag (set to ");
            stringBuilder.append(i);
            str = " to disable)";
            stringBuilder.append(str);
            textView4.setText(stringBuilder.toString());
            int i2 = ahcy.a;
            StringBuilder stringBuilder2 = new StringBuilder(11);
            stringBuilder2.append(i2);
            editText.setText(stringBuilder2.toString());
            i2 = aahv.a;
            stringBuilder2 = new StringBuilder(54);
            stringBuilder2.append("Force fixed video itag (set to ");
            stringBuilder2.append(i2);
            stringBuilder2.append(str);
            textView5.setText(stringBuilder2.toString());
            i = ahcy.b;
            stringBuilder = new StringBuilder(11);
            stringBuilder.append(i);
            editText2.setText(stringBuilder.toString());
            editText.addTextChangedListener(new agkq(ahcy));
            editText2.addTextChangedListener(new agks(ahcy));
            agkw.a(this);
            return;
        }
        findViewById.setVisibility(8);
        textView.setVisibility(0);
    }

    public final void a(StringBuilder stringBuilder, agvz agvz, agql agql) {
        StringBuilder stringBuilder2 = stringBuilder;
        String w = agql.w();
        StringBuilder stringBuilder3 = new StringBuilder(String.valueOf(w).length() + 11);
        stringBuilder3.append("Cachekey: ");
        stringBuilder3.append(w);
        String str = "\n";
        stringBuilder3.append(str);
        stringBuilder2.append(stringBuilder3.toString());
        int d = agql.d();
        stringBuilder3 = new StringBuilder(27);
        stringBuilder3.append("Stream status: ");
        stringBuilder3.append(d);
        stringBuilder3.append(str);
        stringBuilder2.append(stringBuilder3.toString());
        for (oww oww : (List) agvz.j().get()) {
            if (oww.c().contains(agql.w())) {
                String w2 = agql.w();
                oxy oxy = new oxy(this.a.getEncoded(), new oxc(oww, null, new ovw(), null, 4, null));
                byte[] bArr = new byte[100];
                try {
                    oxy.a(new ovm(null, 0, 100, w2));
                    oxy.a(bArr, 0, 100);
                    stringBuilder2.append("First 100 bytes:\n");
                    int i = 0;
                    for (int i2 = 0; i2 < 100; i2++) {
                        byte b = bArr[i2];
                        i++;
                        StringBuilder stringBuilder4 = new StringBuilder(12);
                        stringBuilder4.append(b);
                        stringBuilder4.append(" ");
                        stringBuilder2.append(stringBuilder4.toString());
                        if (i == 10) {
                            stringBuilder2.append(str);
                            i = 0;
                        }
                    }
                    stringBuilder2.append(str);
                } catch (Exception e) {
                    StringBuilder stringBuilder5 = new StringBuilder(String.valueOf(w2).length() + 36);
                    stringBuilder5.append("Couldn't read from data source for ");
                    stringBuilder5.append(w2);
                    stringBuilder5.append(str);
                    xtl.a(stringBuilder5.toString(), e);
                }
            }
        }
    }
}
