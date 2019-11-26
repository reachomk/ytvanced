package defpackage;

import android.content.Context;
import android.support.v7.view.menu.ExpandedMenuView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import com.google.android.youtube.R;

/* renamed from: ais */
public final class ais implements ajj, OnItemClickListener {
    public LayoutInflater a;
    public aiw b;
    public ExpandedMenuView c;
    public final int d = R.layout.abc_list_menu_item_layout;
    public ajm e;
    public aiu f;
    private Context g;

    public ais(Context context) {
        this.g = context;
        this.a = LayoutInflater.from(this.g);
    }

    public final void a(ajm ajm) {
        throw null;
    }

    public final boolean a(aja aja) {
        return false;
    }

    public final boolean b() {
        return false;
    }

    public final boolean b(aja aja) {
        return false;
    }

    public final void a(Context context, aiw aiw) {
        if (this.g != null) {
            this.g = context;
            if (this.a == null) {
                this.a = LayoutInflater.from(this.g);
            }
        }
        this.b = aiw;
        aiu aiu = this.f;
        if (aiu != null) {
            aiu.notifyDataSetChanged();
        }
    }

    public final ListAdapter c() {
        if (this.f == null) {
            this.f = new aiu(this);
        }
        return this.f;
    }

    public final void a() {
        aiu aiu = this.f;
        if (aiu != null) {
            aiu.notifyDataSetChanged();
        }
    }

    public final boolean a(aju aju) {
        if (!aju.hasVisibleItems()) {
            return false;
        }
        aix aix = new aix(aju);
        aiw aiw = aix.a;
        aeg aeg = new aeg(aiw.a);
        aix.c = new ais(aeg.a.a);
        ajj ajj = aix.c;
        ajj.e = aix;
        aix.a.a(ajj);
        ListAdapter c = aix.c.c();
        aeb aeb = aeg.a;
        aeb.n = c;
        aeb.o = aix;
        View view = aiw.g;
        if (view == null) {
            aeb.c = aiw.f;
            aeg.a(aiw.e);
        } else {
            aeb.e = view;
        }
        aeg.a.m = aix;
        aix.b = aeg.a();
        aix.b.setOnDismissListener(aix);
        LayoutParams attributes = aix.b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        aix.b.show();
        ajm ajm = this.e;
        if (ajm != null) {
            ajm.a(aju);
        }
        return true;
    }

    public final void a(aiw aiw, boolean z) {
        ajm ajm = this.e;
        if (ajm != null) {
            ajm.a(aiw, z);
        }
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.b.a((aja) this.f.getItem(i), (ajj) this, 0);
    }
}
