package defpackage;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.widget.TextView;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: scs */
public final class scs extends nd {
    public sap Z;
    public scw aa;
    public scw ab;
    private long[] ac = null;
    private MediaInfo ad;
    private final List ae = new ArrayList();
    private final List af = new ArrayList();
    private int ag = 0;
    private int ah = -1;

    public final Dialog a(Bundle bundle) {
        TextView textView;
        ListView listView;
        Builder builder = new Builder(p());
        View inflate = p().getLayoutInflater().inflate(R.layout.custom_tracks_dialog_layout, null);
        ListView listView2 = (ListView) inflate.findViewById(R.id.listview1);
        ListView listView3 = (ListView) inflate.findViewById(R.id.listview2);
        TextView textView2 = (TextView) inflate.findViewById(R.id.text_empty_message);
        TextView textView3 = (TextView) inflate.findViewById(R.id.audio_empty_message);
        List<MediaTrack> list = this.ad.f;
        this.af.clear();
        this.ae.clear();
        List list2 = this.ae;
        int i = 1;
        TextView textView4 = textView3;
        pkb pkb = new pkb(-1, 1);
        pkb.b(a((int) R.string.ccl_none));
        int i2 = 2;
        pkb.a(2);
        pkb.a("");
        list2.add(pkb.a);
        this.ag = 0;
        this.ah = -1;
        if (list != null) {
            int i3 = 0;
            int i4 = 1;
            for (MediaTrack mediaTrack : list) {
                int i5 = mediaTrack.b;
                long[] jArr;
                if (i5 == i) {
                    textView = textView2;
                    this.ae.add(mediaTrack);
                    jArr = this.ac;
                    if (jArr != null) {
                        int length = jArr.length;
                        int i6 = 0;
                        while (i6 < length) {
                            listView = listView2;
                            if (jArr[i6] == mediaTrack.a) {
                                this.ag = i4;
                            }
                            i6++;
                            listView2 = listView;
                        }
                    }
                    listView = listView2;
                    i4++;
                } else if (i5 != i2) {
                    listView = listView2;
                    textView = textView2;
                } else {
                    this.af.add(mediaTrack);
                    jArr = this.ac;
                    if (jArr != null) {
                        i2 = jArr.length;
                        i = 0;
                        while (i < i2) {
                            textView = textView2;
                            if (jArr[i] == mediaTrack.a) {
                                this.ah = i3;
                            }
                            i++;
                            textView2 = textView;
                        }
                    }
                    textView = textView2;
                    i3++;
                    listView = listView2;
                }
                listView2 = listView;
                textView2 = textView;
                i2 = 2;
                i = 1;
            }
        }
        listView = listView2;
        textView = textView2;
        this.aa = new scw(p(), this.ae, this.ag);
        this.ab = new scw(p(), this.af, this.ah);
        listView2 = listView;
        listView2.setAdapter(this.aa);
        listView3.setAdapter(this.ab);
        TabHost tabHost = (TabHost) inflate.findViewById(R.id.tabhost);
        tabHost.setup();
        TabSpec newTabSpec = tabHost.newTabSpec("tab1");
        List list3 = this.ae;
        if (list3 == null || list3.isEmpty()) {
            listView2.setVisibility(4);
            newTabSpec.setContent(R.id.text_empty_message);
        } else {
            textView.setVisibility(4);
            newTabSpec.setContent(R.id.listview1);
        }
        newTabSpec.setIndicator(a((int) R.string.ccl_caption_subtitles));
        tabHost.addTab(newTabSpec);
        TabSpec newTabSpec2 = tabHost.newTabSpec("tab2");
        List list4 = this.af;
        if (list4 == null || list4.isEmpty()) {
            listView3.setVisibility(4);
            newTabSpec2.setContent(R.id.audio_empty_message);
        } else {
            textView4.setVisibility(4);
            newTabSpec2.setContent(R.id.listview2);
        }
        newTabSpec2.setIndicator(a((int) R.string.ccl_caption_audio));
        tabHost.addTab(newTabSpec2);
        builder.setView(inflate).setPositiveButton(a((int) R.string.ccl_ok), new scx(this)).setNegativeButton(R.string.ccl_cancel, new scu(this)).setOnCancelListener(new scv(this));
        return builder.create();
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        w();
        this.ad = sdh.a(this.j.getBundle("media"));
        this.Z = sap.o();
        sap sap = this.Z;
        pka pka = sap.C;
        long[] jArr = null;
        if (!(pka == null || pka.c() == null)) {
            jArr = sap.C.c().j;
        }
        this.ac = jArr;
        List list = this.ad.f;
        if (list == null || list.isEmpty()) {
            sdh.a(p(), (int) R.string.ccl_caption_no_tracks_available);
            dismiss();
        }
    }

    public final void i() {
        Dialog dialog = this.c;
        if (dialog != null && this.E) {
            dialog.setDismissMessage(null);
        }
        super.i();
    }
}
