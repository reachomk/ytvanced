package defpackage;

import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnKeyListener;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListAdapter;

/* renamed from: aeb */
public final class aeb {
    public final Context a;
    public final LayoutInflater b;
    public Drawable c;
    public CharSequence d;
    public View e;
    public CharSequence f;
    public CharSequence g;
    public OnClickListener h;
    public CharSequence i;
    public OnClickListener j;
    public boolean k;
    public OnCancelListener l;
    public OnKeyListener m;
    public ListAdapter n;
    public OnClickListener o;
    public int p;
    public View q;
    public boolean r = false;
    public boolean s;
    public int t = -1;

    public aeb(Context context) {
        this.a = context;
        this.k = true;
        this.b = (LayoutInflater) context.getSystemService("layout_inflater");
    }
}
