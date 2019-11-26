package defpackage;

import android.support.v7.widget.RecyclerView;

/* renamed from: jzh */
final class jzh extends akwz {
    jzh(RecyclerView recyclerView, akpe akpe, akvz akvz, acwa acwa) {
        super(recyclerView, akpe, akvz, acwa);
    }

    public final /* synthetic */ void a(Object obj, akpk akpk) {
        ajsa ajsa = (ajsa) obj;
        aqto aqto = ajsa.c;
        if (aqto != null) {
            akpk.add(aqto);
            return;
        }
        ajwn ajwn = ajsa.b;
        if (ajwn != null) {
            akpk.add(ajwn);
        }
    }
}
