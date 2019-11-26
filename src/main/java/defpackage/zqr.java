package defpackage;

import android.text.Spanned;
import android.widget.Filter;
import android.widget.Filter.FilterResults;
import com.google.protos.youtube.api.innertube.MobilePlaceResultRendererOuterClass;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: zqr */
public final class zqr extends Filter {
    public aukf a;
    private final aaxt b;
    private final zqq c;
    private Spanned d;

    public zqr(aaxt aaxt, zqq zqq) {
        this.b = aaxt;
        this.c = zqq;
    }

    /* Access modifiers changed, original: protected|final */
    public final FilterResults performFiltering(CharSequence charSequence) {
        FilterResults filterResults = new FilterResults();
        atbl atbl = (atbl) atbm.e.createBuilder();
        String charSequence2 = charSequence != null ? charSequence.toString() : "";
        atbl.copyOnWrite();
        atbm atbm = (atbm) atbl.instance;
        if (charSequence2 != null) {
            atbm.a |= 4;
            atbm.d = charSequence2;
            aukf aukf = this.a;
            if (aukf != null) {
                atbl.copyOnWrite();
                atbm = (atbm) atbl.instance;
                atbm.c = aukf;
                atbm.a |= 2;
            }
            arml arml = null;
            try {
                aaxt aaxt = this.b;
                aang aang = aaxt.a;
                aaxu aaxu = new aaxu(aaxt.c, aaxt.d.c(), atbl);
                aaxu.a(zzp.b);
                atbo atbo = (atbo) aang.b(aaxu);
                ArrayList arrayList = new ArrayList(atbo.c.size());
                for (axak axak : atbo.c) {
                    anxr access$000 = anxl.checkIsLite(MobilePlaceResultRendererOuterClass.mobilePlaceResultRenderer);
                    axak.a(access$000);
                    Object b = axak.h.b(access$000.d);
                    if (b == null) {
                        b = access$000.b;
                    } else {
                        b = access$000.a(b);
                    }
                    avas avas = (avas) b;
                    if ((avas.a & 2) != 0) {
                        arrayList.add(avas);
                    } else {
                        String valueOf = String.valueOf(avas.b);
                        String str = "Empty place received: ";
                        xtl.c(valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
                    }
                }
                filterResults.values = arrayList;
                filterResults.count = atbo.c.size();
                if ((atbo.a & 2) != 0) {
                    arml = atbo.d;
                    if (arml == null) {
                        arml = arml.f;
                    }
                }
                this.d = ajqy.a(arml);
                return filterResults;
            } catch (aanq e) {
                xtl.a("Failed to fetch autocomplete results.", e);
                this.d = null;
                return filterResults;
            }
        }
        throw new NullPointerException();
    }

    /* Access modifiers changed, original: protected|final */
    public final void publishResults(CharSequence charSequence, FilterResults filterResults) {
        if (filterResults.values != null) {
            List list = (ArrayList) filterResults.values;
            if (list.isEmpty()) {
                this.c.a(this.d);
                return;
            } else {
                this.c.a(list);
                return;
            }
        }
        this.c.a(Collections.emptyList());
    }
}
