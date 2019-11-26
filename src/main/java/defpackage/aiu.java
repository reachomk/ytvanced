package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* renamed from: aiu */
public final class aiu extends BaseAdapter {
    private int a = -1;
    private final /* synthetic */ ais b;

    public aiu(ais ais) {
        this.b = ais;
        a();
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final int getCount() {
        int size = this.b.b.l().size();
        return this.a >= 0 ? size - 1 : size;
    }

    /* renamed from: a */
    public final aja getItem(int i) {
        ArrayList l = this.b.b.l();
        int i2 = this.a;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (aja) l.get(i);
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            ais ais = this.b;
            view = ais.a.inflate(ais.d, viewGroup, false);
        }
        ((ajo) view).a((aja) getItem(i));
        return view;
    }

    private final void a() {
        aiw aiw = this.b.b;
        aja aja = aiw.i;
        if (aja != null) {
            ArrayList l = aiw.l();
            int size = l.size();
            int i = 0;
            while (i < size) {
                if (((aja) l.get(i)) != aja) {
                    i++;
                } else {
                    this.a = i;
                    return;
                }
            }
        }
        this.a = -1;
    }

    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
