package defpackage;

import android.support.v7.view.menu.ListMenuItemView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import java.util.ArrayList;

/* renamed from: ait */
public final class ait extends BaseAdapter {
    public final aiw a;
    public boolean b;
    private int c = -1;
    private final boolean d;
    private final LayoutInflater e;
    private final int f;

    public ait(aiw aiw, LayoutInflater layoutInflater, boolean z, int i) {
        this.d = z;
        this.e = layoutInflater;
        this.a = aiw;
        this.f = i;
        a();
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final int getCount() {
        ArrayList l;
        if (this.d) {
            l = this.a.l();
        } else {
            l = this.a.j();
        }
        if (this.c < 0) {
            return l.size();
        }
        return l.size() - 1;
    }

    /* renamed from: a */
    public final aja getItem(int i) {
        ArrayList l;
        if (this.d) {
            l = this.a.l();
        } else {
            l = this.a.j();
        }
        int i2 = this.c;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (aja) l.get(i);
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.e.inflate(this.f, viewGroup, false);
        }
        int i2 = ((aja) getItem(i)).b;
        int i3 = i - 1;
        if (i3 < 0) {
            i3 = i2;
        } else {
            i3 = ((aja) getItem(i3)).b;
        }
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        Object obj = (this.a.c() && i2 != i3) ? 1 : null;
        ImageView imageView = listMenuItemView.b;
        if (imageView != null) {
            int i4 = 8;
            if (!(listMenuItemView.d || obj == null)) {
                i4 = 0;
            }
            imageView.setVisibility(i4);
        }
        ajo ajo = (ajo) view;
        if (this.b) {
            listMenuItemView.e = true;
            listMenuItemView.c = true;
        }
        ajo.a((aja) getItem(i));
        return view;
    }

    private final void a() {
        aiw aiw = this.a;
        aja aja = aiw.i;
        if (aja != null) {
            ArrayList l = aiw.l();
            int size = l.size();
            int i = 0;
            while (i < size) {
                if (((aja) l.get(i)) != aja) {
                    i++;
                } else {
                    this.c = i;
                    return;
                }
            }
        }
        this.c = -1;
    }

    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
