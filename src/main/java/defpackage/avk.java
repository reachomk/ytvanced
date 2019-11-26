package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: avk */
public abstract class avk extends avh {
    private final int a;
    public final int i;
    public final LayoutInflater j;

    @Deprecated
    public avk(Context context, int i) {
        super(context);
        this.a = i;
        this.i = i;
        this.j = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public View a(ViewGroup viewGroup) {
        throw null;
    }

    public final View b(ViewGroup viewGroup) {
        return this.j.inflate(this.a, viewGroup, false);
    }
}
