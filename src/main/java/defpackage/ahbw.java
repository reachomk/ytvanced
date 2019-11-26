package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Checkable;
import com.google.android.libraries.youtube.offline.ui.NonScrollableListView;
import java.util.List;

/* renamed from: ahbw */
public final class ahbw extends ahcl implements OnItemClickListener {
    private final NonScrollableListView a;
    private int b = -1;

    public final void a(List list) {
        setNotifyOnChange(false);
        clear();
        addAll(list);
        notifyDataSetChanged();
        a(-1);
    }

    public final avsi a() {
        int i = this.b;
        if (i != -1) {
            agqa agqa = (agqa) getItem(i);
            if (agqa != null) {
                return agqa.e;
            }
        }
        return avsi.UNKNOWN_FORMAT_TYPE;
    }

    public final boolean a(avsi avsi) {
        int count = getCount();
        for (int i = 0; i < count; i++) {
            agqa agqa = (agqa) getItem(i);
            if (agqa != null && agqa.e == avsi) {
                a(i);
                return true;
            }
        }
        return false;
    }

    public final void a(int i) {
        this.b = i;
        int i2 = 0;
        while (i2 < this.a.getChildCount()) {
            View childAt = this.a.getChildAt(i2);
            if (childAt instanceof Checkable) {
                ((Checkable) childAt).setChecked(i2 == i);
            }
            i2++;
        }
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        if (this.b != i) {
            a(i);
        }
    }

    /* synthetic */ ahbw(Context context, NonScrollableListView nonScrollableListView) {
        super(context, null);
        this.a = (NonScrollableListView) amqw.a((Object) nonScrollableListView);
        this.a.b = this;
    }
}
