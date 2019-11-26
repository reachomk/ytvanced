package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;

/* renamed from: aij */
public class aij implements ajj {
    public final Context a;
    public Context b;
    public aiw c;
    public final LayoutInflater d;
    public ajm e;
    public final int f = R.layout.abc_action_menu_layout;
    public final int g = R.layout.abc_action_menu_item_layout;
    public ajl h;

    public aij(Context context) {
        this.a = context;
        this.d = LayoutInflater.from(context);
    }

    public View a(aja aja, View view, ViewGroup viewGroup) {
        throw null;
    }

    public void a() {
        throw null;
    }

    public void a(aiw aiw, boolean z) {
        throw null;
    }

    public final void a(ajm ajm) {
        throw null;
    }

    public void a(Context context, aiw aiw) {
        throw null;
    }

    public final boolean a(aja aja) {
        return false;
    }

    public boolean b() {
        throw null;
    }

    public final boolean b(aja aja) {
        return false;
    }

    public boolean a(aju aju) {
        ajm ajm = this.e;
        if (ajm == null) {
            return false;
        }
        return ajm.a(aju);
    }
}
