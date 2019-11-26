package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.MdxPairingEndpointOuterClass;
import java.util.List;

/* renamed from: aduo */
public final class aduo {
    public adur a;
    public adqc b;
    public nn c;
    public nf d;
    public final ArrayAdapter e;

    public aduo(ListView listView, acvx acvx) {
        Context context = listView.getContext();
        LayoutInflater from = LayoutInflater.from(context);
        apxx apxx = (apxx) apxu.d.createBuilder();
        apxx.a(MdxPairingEndpointOuterClass.mdxPairingEndpoint, autr.a);
        acvx.a(acwl.z, (apxu) ((anxl) apxx.build()), null);
        listView.setDividerHeight(0);
        listView.addHeaderView(from.inflate(R.layout.mdx_delete_tv_codes_header, listView, false));
        this.e = new adut(context, new adun(this, acvx), acvx);
        listView.setAdapter(this.e);
    }

    public final void a() {
        if (this.d != null) {
            nn nnVar = this.c;
            if (nnVar != null) {
                nd ndVar = (nd) nnVar.f().a("confirmRemoveDialog");
                if (ndVar != null) {
                    ndVar.a(this.d);
                }
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void b() {
        List c = this.b.c();
        this.e.clear();
        this.e.addAll(c);
    }
}
