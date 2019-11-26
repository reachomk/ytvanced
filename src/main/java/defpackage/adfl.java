package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import com.google.android.youtube.R;
import java.util.List;

/* renamed from: adfl */
public final class adfl extends azf implements adgq {
    public OnItemClickListener a;
    public final xci b;
    public final tbq c;
    public final bcaa d;
    public final adfy e;
    private final adfs f;

    public adfl(Context context, adqc adqc, tbq tbq, boolean z, xci xci, bcaa bcaa, bcaa bcaa2, adfy adfy) {
        super(context, (byte) 0);
        this.f = new adfs(adqc, tbq, z, (adgq) this, bcaa2 != null ? (String) bcaa2.get() : null);
        this.c = tbq;
        this.b = xci;
        this.d = bcaa;
        this.e = adfy;
    }

    public final void a(List list) {
        this.f.a(list);
    }

    public final boolean a_(bbs bbs) {
        return a(bbs);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ListView listView = (ListView) findViewById(R.id.mr_chooser_list);
        if (listView != null) {
            this.a = listView.getOnItemClickListener();
            listView.setOnItemClickListener(new adfk(this));
        }
    }
}
