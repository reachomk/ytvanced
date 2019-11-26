package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: jwz */
public final class jwz extends akyg implements OnItemClickListener, hxs {
    private ArrayList Z;
    private ajis aa;
    private aigf ab;

    /* Access modifiers changed, original: protected|final */
    public final int W() {
        return 0;
    }

    /* Access modifiers changed, original: protected|final */
    public final OnItemClickListener Y() {
        return this;
    }

    public final void a(aigf aigf) {
        this.ab = aigf;
    }

    public final void a(List list) {
        this.Z = new ArrayList(list);
        ListAdapter listAdapter = this.aq;
        if (listAdapter != null) {
            ((akyj) listAdapter).notifyDataSetChanged();
        }
    }

    public final void a(ajis ajis) {
        this.aa = ajis;
    }

    public final void a(nn nnVar) {
        if (!F_() && !v()) {
            a(nnVar.f(), "SUBTITLE_MENU_BOTTOM_SHEET_FRAGMENT");
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final String X() {
        return q().getString(R.string.overflow_captions);
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a = super.a(layoutInflater, viewGroup, bundle);
        if (a != null) {
            View findViewById = a.findViewById(R.id.bottom_sheet_title);
            if (findViewById instanceof TextView) {
                ((TextView) findViewById).setTextColor(xwe.a(layoutInflater.getContext(), R.attr.ytTextPrimary));
            }
        }
        return a;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.ab.a(((jwm) ((akyj) this.aq).getItem(i)).a);
        dismiss();
    }

    public static jwz b(nn nnVar) {
        nf a = nnVar.f().a("SUBTITLE_MENU_BOTTOM_SHEET_FRAGMENT");
        if (a != null) {
            return (jwz) a;
        }
        return new jwz();
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ ListAdapter Z() {
        akyj akyj = new akyj(p(), X() == null);
        ArrayList arrayList = this.Z;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ajis ajis = (ajis) arrayList.get(i);
                jwm jwm = new jwm(M_(), ajis);
                jwm.a(ajis.equals(this.aa));
                akyj.add(jwm);
            }
        }
        return akyj;
    }
}
