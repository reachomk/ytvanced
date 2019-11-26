package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.extensions.reel.videoeffects.fragment.StickerCatalogRecyclerView;
import com.google.android.youtube.R;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/* renamed from: gil */
public final class gil extends nf {
    public gid a;
    public boolean b;
    public StickerCatalogRecyclerView c;

    public final void b(Bundle bundle) {
        super.b(bundle);
        nf nfVar = this.y;
        Class cls = gin.class;
        Object[] objArr = new Object[2];
        objArr[0] = nfVar != null ? nfVar.y : null;
        objArr[1] = p();
        ((gin) xtx.a(cls, objArr)).n().a(this);
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.sticker_page_fragment, viewGroup, false);
        this.c = (StickerCatalogRecyclerView) inflate.findViewById(R.id.sticker_page);
        this.c.a(this.a);
        amqw.a((Object) this);
        return inflate;
    }

    public final void a(List list) {
        gid gid = this.a;
        gid.e.clear();
        gid.e.addAll((Collection) amqw.a((Object) list));
        gjm gjm = gid.g;
        if (gjm.a != null) {
            amqw.a((Object) list);
            HashSet hashSet = new HashSet();
            for (axak a : list) {
                Uri a2 = gjh.a(a);
                Object a3 = a2 != null ? zjz.a(a2.getLastPathSegment()) : null;
                if (a3 != null) {
                    hashSet.add(a3);
                }
            }
            gjm.c.execute(new gjo(gjm, hashSet));
        }
        if (list.isEmpty()) {
            gig gig = gid.i;
            if (gig != null) {
                gig.g(false);
            }
        }
        this.a.aa_();
        this.b = true;
    }

    public final void d(int i) {
        this.c.T.a(i);
        gid gid = this.a;
        amqw.a(i > 0);
        gid.j = i;
        gid.f.f = i - 1;
    }

    public final void f() {
        this.c.e(0);
    }

    public final void e(Bundle bundle) {
        this.a.d.removeCallbacksAndMessages(gid.c);
    }
}
