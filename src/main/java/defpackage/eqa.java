package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;

/* renamed from: eqa */
public final class eqa implements akot {
    private final vcx a;
    private final View b;

    eqa(Context context, ViewGroup viewGroup, vcx vcx) {
        this.a = vcx;
        this.b = LayoutInflater.from(context).inflate(R.layout.watch_metadata_companion_cards, viewGroup, false);
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.b;
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        vcw vcw = (vcw) amqw.a(this.a.a);
        View view = this.b;
        vcw.m = view;
        vcw.n = akor;
        vdb vdb = vcw.d;
        if (vdb != null) {
            vdb.a(view, akor);
        }
    }
}
