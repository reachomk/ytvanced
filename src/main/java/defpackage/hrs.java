package defpackage;

import android.support.v7.widget.RecyclerView;
import com.google.android.libraries.youtube.common.ui.LoadingFrameLayout;

/* renamed from: hrs */
public final class hrs implements akww, xcp {
    public final hso a;
    public final xci b;
    public final hnl c;
    public final hqa d;
    public final hng e;
    public final hkp f;
    public final CharSequence g;
    public final boolean h;
    public LoadingFrameLayout i;
    public RecyclerView j;
    public hsf k;
    public hrr l;

    public hrs(hso hso, xci xci, hnl hnl, hqa hqa, hng hng, akyd akyd, hkp hkp, CharSequence charSequence, boolean z) {
        this.a = hso;
        this.b = xci;
        this.c = hnl;
        this.d = hqa;
        this.e = hng;
        this.f = hkp;
        this.g = charSequence;
        this.h = z;
        if (akyd instanceof hrr) {
            this.l = (hrr) akyd;
        }
    }

    public final akyd E_() {
        throw null;
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{agky.class, aglk.class};
        } else if (i == 0) {
            this.k.H_();
            return null;
        } else if (i == 1) {
            this.k.a(false, "downloads_page_downloads_item_section_identifier");
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
